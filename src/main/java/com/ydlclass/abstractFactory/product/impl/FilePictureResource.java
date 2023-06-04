package com.ydlclass.abstractFactory.product.impl;

import com.ydlclass.abstractFactory.product.AbstractPictureResource;

import java.io.InputStream;

/**
 * @author it楠老师
 * @createTime 2023-05-10
 */
public class FilePictureResource extends AbstractPictureResource {

    public FilePictureResource() {
    }

    public FilePictureResource(String url) {
        super(url);
    }

    @Override
    public InputStream getInputStream() {
        return null;
    }
}
