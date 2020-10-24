package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 拍卖-发布-保证金配置表
 * </p>
 *
 * @author Gaby
 * @since 2020-10-24
 */
@TableName("auction_publish_ensure_info")
public class AuctionPublishEnsureInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 所属用户
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 是否开启  1-开启 0-不开启
     */
    private Integer enable;
    /**
     * 保证金金额(单位:分)
     */
    @TableField("ensure_money")
    private Long ensureMoney;


    public Long getId() {
        return id;
    }

    public AuctionPublishEnsureInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public AuctionPublishEnsureInfo setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Integer getEnable() {
        return enable;
    }

    public AuctionPublishEnsureInfo setEnable(Integer enable) {
        this.enable = enable;
        return this;
    }

    public Long getEnsureMoney() {
        return ensureMoney;
    }

    public AuctionPublishEnsureInfo setEnsureMoney(Long ensureMoney) {
        this.ensureMoney = ensureMoney;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_publish_ensure_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 所属用户
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 是否开启  1-开启 0-不开启
     */
    public static final String ENABLE = "enable";

    /**
     * 保证金金额(单位:分)
     */
    public static final String ENSURE_MONEY = "ensure_money";


    @Override
    public AuctionPublishEnsureInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

