package com.gaby.mybatis.auto.stu.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.gaby.mybatis.base.entity.IEntity;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 用户账号表
 * </p>
 *
 * @author Gaby
 * @since 2019-04-19
 */
@TableName("user_account_info")
public class UserAccountInfo implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 帐号
     */
    private String account;
    /**
     * 密码
     */
    private String pwd;
    /**
     * 真实名称
     */
    private String username;
    /**
     * 昵称
     */
    private String nickname;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 性别
     */
    private String gender;
    /**
     * 爱好
     */
    private String hobby;
    /**
     * 状态 00A-生效 00Z-失效 00B-停用
     */
    private String status;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 修改时间
     */
    @TableField("modify_time")
    private Date modifyTime;

    public Long getId() {
        return id;
    }

    public UserAccountInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getAccount() {
        return account;
    }

    public UserAccountInfo setAccount(String account) {
        if (account != null)
            account = account.trim();
        this.account = account;
        return this;
    }

    public String getPwd() {
        return pwd;
    }

    public UserAccountInfo setPwd(String pwd) {
        if (pwd != null)
            pwd = pwd.trim();
        this.pwd = pwd;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public UserAccountInfo setUsername(String username) {
        if (username != null)
            username = username.trim();
        this.username = username;
        return this;
    }

    public String getNickname() {
        return nickname;
    }

    public UserAccountInfo setNickname(String nickname) {
        if (nickname != null)
            nickname = nickname.trim();
        this.nickname = nickname;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserAccountInfo setEmail(String email) {
        if (email != null)
            email = email.trim();
        this.email = email;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public UserAccountInfo setGender(String gender) {
        if (gender != null)
            gender = gender.trim();
        this.gender = gender;
        return this;
    }

    public String getHobby() {
        return hobby;
    }

    public UserAccountInfo setHobby(String hobby) {
        if (hobby != null)
            hobby = hobby.trim();
        this.hobby = hobby;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public UserAccountInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public UserAccountInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public UserAccountInfo setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "user_account_info";
    public static final String ID = "id";

    /**
     * 帐号
     */
    public static final String ACCOUNT = "account";

    /**
     * 密码
     */
    public static final String PWD = "pwd";

    /**
     * 真实名称
     */
    public static final String USERNAME = "username";

    /**
     * 昵称
     */
    public static final String NICKNAME = "nickname";

    /**
     * 邮箱
     */
    public static final String EMAIL = "email";

    /**
     * 性别
     */
    public static final String GENDER = "gender";

    /**
     * 爱好
     */
    public static final String HOBBY = "hobby";

    /**
     * 状态 00A-生效 00Z-失效 00B-停用
     */
    public static final String STATUS = "status";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 修改时间
     */
    public static final String MODIFY_TIME = "modify_time";

    @Override
    public UserAccountInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

