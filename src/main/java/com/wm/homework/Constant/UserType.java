package com.wm.homework.Constant;

/**
 * Created by zz on 2016-06-20.
 */
public enum UserType {
    MANAGER("管理员"),USER("用户");
    private final String description;
    private UserType(String description){
        this.description = description;
    }
    @Override
    public String toString() {
         return description;
    }
    public String getIndexPageView(){
        return description+"index";
    }
}
