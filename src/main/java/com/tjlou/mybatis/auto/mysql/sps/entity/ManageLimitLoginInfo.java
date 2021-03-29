package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 后台限制登录信息表
 * </p>
 *
 * @author Gaby
 * @since 2021-03-29
 */
@TableName("manage_limit_login_info")
public class ManageLimitLoginInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 帐号
     */
    private String account;
    /**
     * 错误次数
     */
    @TableField("error_num")
    private Integer errorNum;


    public Long getId() {
        return id;
    }

    public ManageLimitLoginInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getAccount() {
        return account;
    }

    public ManageLimitLoginInfo setAccount(String account) {
        if (account != null)
            account = account.trim();
        this.account = account;
        return this;
    }

    public Integer getErrorNum() {
        return errorNum;
    }

    public ManageLimitLoginInfo setErrorNum(Integer errorNum) {
        this.errorNum = errorNum;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "manage_limit_login_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 帐号
     */
    public static final String ACCOUNT = "account";

    /**
     * 错误次数
     */
    public static final String ERROR_NUM = "error_num";


    @Override
    public ManageLimitLoginInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

