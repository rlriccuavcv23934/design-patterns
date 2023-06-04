package com.ydlclass.abstractFactory.product.impl;

import com.ydlclass.abstractFactory.product.AbstractTextResource;

import java.io.InputStream;

/**
 * @author it楠老师
 * @createTime 2023-05-10
 */
public class ClasspathTestResource extends AbstractTextResource {

    public ClasspathTestResource() {
    }

    public ClasspathTestResource(String url) {
        super(url);
    }

    @Override
    public InputStream getInputStream() {
        return null;
    }
}
