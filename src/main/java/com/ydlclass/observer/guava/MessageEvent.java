package com.ydlclass.observer.guava;

/**
 * @author it楠老师
 * @createTime 2023-05-31
 */
public class MessageEvent {
    private String message;

    public MessageEvent(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
