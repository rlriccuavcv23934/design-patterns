package com.ydlclass.factoryMethod2.resourceFactory;

import com.ydlclass.factoryMethod2.product.AbstractResource;

/**
 * IResourceFactory
 * @author it楠老师
 * @createTime 2023-05-09
 */
public interface IResourceLoader {
    AbstractResource load(String url);
}
