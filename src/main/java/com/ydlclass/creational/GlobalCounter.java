package com.ydlclass.creational;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author it楠老师
 * @createTime 2023-05-08
 */
public enum GlobalCounter {
    INSTANCE;
    private AtomicLong atomicLong = new AtomicLong(0);

    public Long getNumber(){
        return atomicLong.getAndIncrement();
    }

}
