package com.ydlclass.observer.spring;

import org.springframework.context.ApplicationEvent;

/**
 * @author it楠老师
 * @createTime 2023-05-31
 */
public class TemperatureChangeApplicationEvent extends ApplicationEvent {

    public TemperatureChangeApplicationEvent(Float newTemperature) {
        super(newTemperature);
    }
}
