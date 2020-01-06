package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 后台帐号信息表
 * </p>
 *
 * @author Gaby
 * @since 2020-01-06
 */
@TableName("manage_account_info")
public class ManageAccountInfo implements Serializable, IEntity {


    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 所属平台
     */
    @TableField("app_id")
    private Long appId;
    /**
     * 帐号标识
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 帐号
     */
    private String account;
    /**
     * 登录密码
     */
    private String pwd;
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
    /**
     * 状态 00A-有效   00B-禁用 00Z-失效
     */
    private String status;
    /**
     * 后台昵称
     */
    private String nickname;


    public Long getId() {
        return id;
    }

    public ManageAccountInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getAppId() {
        return appId;
    }

    public ManageAccountInfo setAppId(Long appId) {
        this.appId = appId;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public ManageAccountInfo setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public String getAccount() {
        return account;
    }

    public ManageAccountInfo setAccount(String account) {
        if (account != null)
            account = account.trim();
        this.account = account;
        return this;
    }

    public String getPwd() {
        return pwd;
    }

    public ManageAccountInfo setPwd(String pwd) {
        if (pwd != null)
            pwd = pwd.trim();
        this.pwd = pwd;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public ManageAccountInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public ManageAccountInfo setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public ManageAccountInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    public String getNickname() {
        return nickname;
    }

    public ManageAccountInfo setNickname(String nickname) {
        if (nickname != null)
            nickname = nickname.trim();
        this.nickname = nickname;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "manage_account_info";
    public static final String ID = "id";

    /**
     * 所属平台
     */
    public static final String APP_ID = "app_id";

    /**
     * 帐号标识
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 帐号
     */
    public static final String ACCOUNT = "account";

    /**
     * 登录密码
     */
    public static final String PWD = "pwd";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 修改时间
     */
    public static final String MODIFY_TIME = "modify_time";

    /**
     * 状态 00A-有效   00B-禁用 00Z-失效
     */
    public static final String STATUS = "status";

    /**
     * 后台昵称
     */
    public static final String NICKNAME = "nickname";


    @Override
    public ManageAccountInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

