package com.wm.homework.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by zz on 2016-06-23.
 */

/**
 * 管理员账号 数据库表结构
 */
@Entity
@Table(name = "manager")
public class Manager extends IdEntity {

    @Column
    private String name;

    // TODO: 2016-06-23 存储加密密码
    @Column
    private String password;

    @Column
    private Date createDate;

    @Column
    private Date lastUpdate;

    @Column
    private Date lastLogin;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }
}
