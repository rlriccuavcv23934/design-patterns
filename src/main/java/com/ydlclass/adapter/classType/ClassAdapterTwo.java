package com.ydlclass.adapter.classType;

/**
 * 使用继承来实现适配的能力
 * @author it楠老师
 * @createTime 2023-05-24
 */
public class ClassAdapterTwo extends AdapteeTwo implements Target {
    @Override
    public void request() {
        super.specificRequest();
    }
}
