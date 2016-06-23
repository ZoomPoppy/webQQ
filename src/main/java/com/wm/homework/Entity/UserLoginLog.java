package com.wm.homework.Entity;

/**
 * Created by zz on 2016-06-24.
 */

import com.wm.homework.Constant.UserType;

import javax.persistence.*;
import java.util.Date;

/**
 * 用来记录登陆日志
 *
 */
@Entity
@Table(name = "login_log")
public class UserLoginLog extends IdEntity{

    @Column
    private Long loginId;

    @Column
    private Date loginDate;

    @Column
    private Date loginOutDate;

    @Enumerated(EnumType.STRING)
    private UserType userType;

    public Long getLoginId() {
        return loginId;
    }

    public void setLoginId(Long loginId) {
        this.loginId = loginId;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    public Date getLoginOutDate() {
        return loginOutDate;
    }

    public void setLoginOutDate(Date loginOutDate) {
        this.loginOutDate = loginOutDate;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }
}
