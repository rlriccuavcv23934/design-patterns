package com.ydlclass.decorator;

/**
 * @author it楠老师
 * @createTime 2023-05-23
 */
public class ConcreteComponent implements Component{
    @Override
    public void operation() {
        System.out.println("这是未被包装的原始类");
    }
}
