package com.ydlclass.factoryMethod.resourceFactory;

import com.ydlclass.simpleFactory.Resource;

/**
 * IResourceFactory
 * @author it楠老师
 * @createTime 2023-05-09
 */
public interface IResourceLoader {
    Resource load(String url);
}
