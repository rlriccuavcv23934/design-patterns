package com.ydlclass.mediator;

/**
 * 中介者类
 * @author it楠老师
 * @createTime 2023-06-04
 */
public interface Mediator {

    void send(String msg,Colleague colleague);

}
