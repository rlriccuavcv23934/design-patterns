package com.ydlclass.state.tv;

/**
 * @author it楠老师
 * @createTime 2023-06-03
 */
public interface TVState {

    void turnOn();
    void turnOff();
    void adjustVolume(int volume);

}
