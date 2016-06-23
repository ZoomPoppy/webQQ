package com.wm.homework.Entity;

import javax.persistence.*;

/**
 * Created by zz on 2016-06-24.
 */

/**
 * 用来记录用户 的好友信息，
 * 包括是谁的好友，使用外键
 * 以及分组，在该用户的哪一个组
 */
@Entity
@Table(name = "friend")
public class Friend extends IdEntity{

    @ManyToOne
    @JoinColumn(name = "User")
    private User user;

    @Column
    private Long id;

    @Column
    private String group;
}
