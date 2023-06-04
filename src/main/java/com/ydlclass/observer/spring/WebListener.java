package com.ydlclass.observer.spring;

import org.springframework.context.ApplicationListener;

/**
 * @author it楠老师
 * @createTime 2023-05-31
 */
public class WebListener implements ApplicationListener<TemperatureChangeApplicationEvent> {
    @Override
    public void onApplicationEvent(TemperatureChangeApplicationEvent event) {
        System.out.println("web -->温度发生了该表--》" + event.getSource());
    }
}
