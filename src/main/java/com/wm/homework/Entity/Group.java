package com.wm.homework.Entity;

import javax.persistence.*;

/**
 * Created by zz on 2016-06-24.
 */

/**
 * 用户分组，每个用户的分组信息-
 */
@Entity
@Table(name = "group")
public class Group extends IdEntity{

    @ManyToOne
    @JoinColumn(name = "User")
    private User user;

    @Column
    private String groupName;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
