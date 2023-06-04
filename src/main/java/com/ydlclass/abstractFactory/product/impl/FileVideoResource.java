package com.ydlclass.abstractFactory.product.impl;

import com.ydlclass.abstractFactory.product.AbstractVideoResource;

import java.io.InputStream;

/**
 * @author it楠老师
 * @createTime 2023-05-10
 */
public class FileVideoResource extends AbstractVideoResource {

    public FileVideoResource() {
    }

    public FileVideoResource(String url) {
        super(url);
    }

    @Override
    public InputStream getInputStream() {
        return null;
    }
}
