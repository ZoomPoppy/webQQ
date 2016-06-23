package com.wm.homework.Entity;

import com.wm.homework.Constant.MessageType;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by zz on 2016-06-24.
 */
@Entity
@Table(name = "message_cache")
public class MessageCache {

    @Column
    private User targetUser;

    @Column
    private User sourceUser;

    @Enumerated(EnumType.STRING)
    private MessageType messageType;

    @Column
    private Date sendDate;

    /**
     * 消息类型，
     * 如果是IMAGE，FILE 那么存的是在服务器上存储的路径
     * 如果是text,那么直接存储文本数据
     */
    @Lob
    private String message;

    public User getTargetUser() {
        return targetUser;
    }

    public void setTargetUser(User targetUser) {
        this.targetUser = targetUser;
    }

    public User getSourceUser() {
        return sourceUser;
    }

    public void setSourceUser(User sourceUser) {
        this.sourceUser = sourceUser;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

