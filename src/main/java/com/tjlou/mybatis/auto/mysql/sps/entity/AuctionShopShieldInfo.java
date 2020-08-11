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
 * 拍卖店铺屏蔽表
 * </p>
 *
 * @author Gaby
 * @since 2020-08-11
 */
@TableName("auction_shop_shield_info")
public class AuctionShopShieldInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 屏蔽类型 1-首页热门
     */
    @TableField("shield_type")
    private Long shieldType;
    /**
     * 所属用户
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 创建事件
     */
    @TableField("create_time")
    private Date createTime;


    public Long getId() {
        return id;
    }

    public AuctionShopShieldInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getShieldType() {
        return shieldType;
    }

    public AuctionShopShieldInfo setShieldType(Long shieldType) {
        this.shieldType = shieldType;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public AuctionShopShieldInfo setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public AuctionShopShieldInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_shop_shield_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 屏蔽类型 1-首页热门
     */
    public static final String SHIELD_TYPE = "shield_type";

    /**
     * 所属用户
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 创建事件
     */
    public static final String CREATE_TIME = "create_time";


    @Override
    public AuctionShopShieldInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

