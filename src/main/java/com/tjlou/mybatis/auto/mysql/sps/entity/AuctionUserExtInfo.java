package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 拍卖-用户拓展表
 * </p>
 *
 * @author Gaby
 * @since 2020-04-07
 */
@TableName("auction_user_ext_info")
public class AuctionUserExtInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 用户标识
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 静默登录token
     */
    private String token;
    /**
     * 聊天是否连接
     */
    @TableField("dialog_connect")
    private Integer dialogConnect;
    /**
     * 1-限制上拍  2-限制出价
     */
    @TableField("limit_type")
    private Integer limitType;


    public Long getId() {
        return id;
    }

    public AuctionUserExtInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public AuctionUserExtInfo setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public String getToken() {
        return token;
    }

    public AuctionUserExtInfo setToken(String token) {
        if (token != null)
            token = token.trim();
        this.token = token;
        return this;
    }

    public Integer getDialogConnect() {
        return dialogConnect;
    }

    public AuctionUserExtInfo setDialogConnect(Integer dialogConnect) {
        this.dialogConnect = dialogConnect;
        return this;
    }

    public Integer getLimitType() {
        return limitType;
    }

    public AuctionUserExtInfo setLimitType(Integer limitType) {
        this.limitType = limitType;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_user_ext_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 用户标识
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 静默登录token
     */
    public static final String TOKEN = "token";

    /**
     * 聊天是否连接
     */
    public static final String DIALOG_CONNECT = "dialog_connect";

    /**
     * 1-限制上拍  2-限制出价
     */
    public static final String LIMIT_TYPE = "limit_type";


    @Override
    public AuctionUserExtInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

