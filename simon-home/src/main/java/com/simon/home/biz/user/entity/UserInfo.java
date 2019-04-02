package com.simon.home.biz.user.entity;

import com.simon.home.biz.common.entity.BaseEntity;
import com.simon.home.biz.common.enums.UserStatus;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "USER_INFO", uniqueConstraints = @UniqueConstraint(columnNames = {"USER_ID"}))
public class UserInfo extends BaseEntity {

    /**
     * USER_ID
     */
    @Id
    @Column(name = "USER_ID")
    private String userId;

    /**
     * 用户名
     */
    @Column(name = "USER_NAME")
    private String userName;

    /**
     * 密码
     */
    @Column(name = "PASSWORD")
    private String password;

    /**
     * 随机加盐值
     */
    @Column(name = "RANDOM_SALT_VALUE")
    private String randomSaltValue;

    /**
     * 用户状态
     */
    @Enumerated(EnumType.STRING)
    @Column(length = 1,nullable = false)
    private UserStatus userStatus;

    /**
     * 用户电话
     */
    @Column(name = "USER_PHONE")
    private String userPhone;

    /**
     * 上次的密码
     */
    @Column(name = "LAST_PASSWORD")
    private String lastPassword;

    /**
     * 用户姓名
     */
    @Column(name = "ID_NAME")
    private String idName;
}
