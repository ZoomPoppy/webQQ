package com.wm.homework.Constant;

/**
 * Created by zz on 2016-06-24.
 */
public enum  MessageType {
    TEXT("text"),FILE("file"),IMAGE("image");

    private final String description;

    private MessageType(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
