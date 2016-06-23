package com.wm.homework.Entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by zz on 2016-06-19.
 */

/**
 * 用户表结构
 */
@Entity
@Table(name = "user")
public class User extends IdEntity{

    @Column
    private String userName;

    @Column
    private String passWord;

    @Column
    private String nickName;

    @Column
    private String address;

    @Column
    private Date createDate;

    @Column
    private Date lastLogin;

    @Enumerated(EnumType.STRING)
    private Sex sex;

    @Column
    private int age;

    @Column
    private Date birthday;


    private enum Sex{
        MAN("男"),WOMAN("女");
        private final String description;
        private Sex(String description){
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
