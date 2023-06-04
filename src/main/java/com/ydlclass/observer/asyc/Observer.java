package com.ydlclass.observer.asyc;

/**
 * @author it楠老师
 * @createTime 2023-05-30
 */
public interface Observer {

    /**
     * 更新新的温度
     * @param newTemperature 更新的温度
     */
    void update(float newTemperature);

}
