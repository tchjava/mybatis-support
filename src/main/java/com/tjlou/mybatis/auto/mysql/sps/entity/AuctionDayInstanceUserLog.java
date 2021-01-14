package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 天天竞拍记录表
 * </p>
 *
 * @author Gaby
 * @since 2021-01-14
 */
@TableName("auction_day_instance_user_log")
public class AuctionDayInstanceUserLog implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 所属实例
     */
    @TableField("instance_id")
    private Long instanceId;
    /**
     * 所属用户
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 状态  1-正在竞拍  2-竞拍成功 4-竞拍失败
     */
    private Integer status;
    /**
     * 状态说明
     */
    @TableField("status_name")
    private String statusName;
    /**
     * 最新的出价价格
     */
    @TableField("newest_price")
    private Long newestPrice;
    /**
     * 出价次数
     */
    @TableField("bid_num")
    private Integer bidNum;


    public Long getId() {
        return id;
    }

    public AuctionDayInstanceUserLog setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getInstanceId() {
        return instanceId;
    }

    public AuctionDayInstanceUserLog setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public AuctionDayInstanceUserLog setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public AuctionDayInstanceUserLog setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public String getStatusName() {
        return statusName;
    }

    public AuctionDayInstanceUserLog setStatusName(String statusName) {
        if (statusName != null)
            statusName = statusName.trim();
        this.statusName = statusName;
        return this;
    }

    public Long getNewestPrice() {
        return newestPrice;
    }

    public AuctionDayInstanceUserLog setNewestPrice(Long newestPrice) {
        this.newestPrice = newestPrice;
        return this;
    }

    public Integer getBidNum() {
        return bidNum;
    }

    public AuctionDayInstanceUserLog setBidNum(Integer bidNum) {
        this.bidNum = bidNum;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_day_instance_user_log";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 所属实例
     */
    public static final String INSTANCE_ID = "instance_id";

    /**
     * 所属用户
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 状态  1-正在竞拍  2-竞拍成功 4-竞拍失败
     */
    public static final String STATUS = "status";

    /**
     * 状态说明
     */
    public static final String STATUSNAME = "statusName";

    /**
     * 最新的出价价格
     */
    public static final String NEWEST_PRICE = "newest_price";

    /**
     * 出价次数
     */
    public static final String BID_NUM = "bid_num";


    @Override
    public AuctionDayInstanceUserLog pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

