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
 * 拍卖-日活记录
 * </p>
 *
 * @author Gaby
 * @since 2020-12-05
 */
@TableName("auction_day_activities_log")
public class AuctionDayActivitiesLog implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 客户端
     */
    private Integer client;
    /**
     * 所属用户
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;


    public Long getId() {
        return id;
    }

    public AuctionDayActivitiesLog setId(Long id) {
        this.id = id;
        return this;
    }

    public Integer getClient() {
        return client;
    }

    public AuctionDayActivitiesLog setClient(Integer client) {
        this.client = client;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public AuctionDayActivitiesLog setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public AuctionDayActivitiesLog setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_day_activities_log";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 客户端
     */
    public static final String CLIENT = "client";

    /**
     * 所属用户
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";


    @Override
    public AuctionDayActivitiesLog pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

