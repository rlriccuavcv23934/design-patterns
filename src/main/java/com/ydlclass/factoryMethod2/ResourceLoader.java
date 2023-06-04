package com.ydlclass.factoryMethod2;

import com.ydlclass.factoryMethod2.product.AbstractResource;
import com.ydlclass.factoryMethod2.resourceFactory.IResourceLoader;
import com.ydlclass.simpleFactory.ResourceLoadException;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @author it楠老师
 * @createTime 2023-05-09
 */
public class ResourceLoader {

//    private IResourceLoader resourceLoader;
//
    private static Map<String, IResourceLoader> resourceLoaderCache = new HashMap<>(8);

    // 版本二
//    static {
//        resourceLoaderCache.put("http",new HttpResourceLoader());
//        resourceLoaderCache.put("file",new FileResourceLoader());
//        resourceLoaderCache.put("classpath",new ClassPathResourceLoader());
//        resourceLoaderCache.put("default",new DefaultResourceLoader());
//    }

    // 版本三、终极版本  加载配置文件到缓存
    // 1、完全满足开闭原则，当需要扩充需求时，只需要新增实现和修改配置文件，不需要修改一行代码
    // 2、资源可以缓存吗？假如每次获取的资源也是一样的，那缓存资源有必要吗
    static {
        InputStream inputStream = Thread.currentThread().getContextClassLoader()
                .getResourceAsStream("resourceLoader2.properties");
        Properties properties = new Properties();
        try {
            properties.load(inputStream);
            for (Map.Entry<Object,Object> entry : properties.entrySet()){
                String key = entry.getKey().toString();
                Class<?> clazz = Class.forName(entry.getValue().toString());
                IResourceLoader loader = (IResourceLoader) clazz.getConstructor().newInstance();
                resourceLoaderCache.put(key,loader);
            }
        } catch (IOException | ClassNotFoundException | NoSuchMethodException | InstantiationException |
                 IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     *
     * @param url file://   http://  classpath://  ftp://
     * @return 资源类
     */
    public AbstractResource load(String url){

        // 1、根据url获取前缀
        String prefix = getPrefix(url);

        // 2、根据前缀选择不同的工厂，生产独自的产品
        // 版本一
//        if("http".equals(prefix)){
//            resourceLoader = new HttpResourceLoader();
//        } else if ("file".equals(prefix)) {
//            resourceLoader = new FileResourceLoader();
//        } else if ("classpath".equals(prefix)) {
//            resourceLoader = new ClassPathResourceLoader()
//        } else {
//            resourceLoader = new DefaultResourceLoader();
//        }

        // 版本二和三
        return resourceLoaderCache.get(prefix).load(url);
    }

    private String getPrefix(String url) {
        if(url == null || "".equals(url) || !url.contains(":")){
            throw new ResourceLoadException("如果的资源url不合法.");
        }
        String[] split = url.split(":");
        return split[0];
    }

}
