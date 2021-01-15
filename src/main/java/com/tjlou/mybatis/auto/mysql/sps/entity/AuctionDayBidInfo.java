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
 * 天天竞拍实例出价信息表
 * </p>
 *
 * @author Gaby
 * @since 2021-01-15
 */
@TableName("auction_day_bid_info")
public class AuctionDayBidInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 出价人
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 所属实例
     */
    @TableField("instance_id")
    private Long instanceId;
    /**
     * 出价价格
     */
    @TableField("bid_price")
    private Long bidPrice;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;


    public Long getId() {
        return id;
    }

    public AuctionDayBidInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public AuctionDayBidInfo setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Long getInstanceId() {
        return instanceId;
    }

    public AuctionDayBidInfo setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public Long getBidPrice() {
        return bidPrice;
    }

    public AuctionDayBidInfo setBidPrice(Long bidPrice) {
        this.bidPrice = bidPrice;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public AuctionDayBidInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_day_bid_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 出价人
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 所属实例
     */
    public static final String INSTANCE_ID = "instance_id";

    /**
     * 出价价格
     */
    public static final String BID_PRICE = "bid_price";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";


    @Override
    public AuctionDayBidInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

