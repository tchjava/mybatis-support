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
 * 出价信息表
 * </p>
 *
 * @author Gaby
 * @since 2020-06-05
 */
@TableName("auction_bid_info")
public class AuctionBidInfo implements Serializable, IEntity {


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
     * 拍品实例标识
     */
    @TableField("product_instance_id")
    private Long productInstanceId;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 出价价格
     */
    @TableField("bid_price")
    private Long bidPrice;
    /**
     * 来源ip
     */
    private String ip;


    public Long getId() {
        return id;
    }

    public AuctionBidInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public AuctionBidInfo setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Long getProductInstanceId() {
        return productInstanceId;
    }

    public AuctionBidInfo setProductInstanceId(Long productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public AuctionBidInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Long getBidPrice() {
        return bidPrice;
    }

    public AuctionBidInfo setBidPrice(Long bidPrice) {
        this.bidPrice = bidPrice;
        return this;
    }

    public String getIp() {
        return ip;
    }

    public AuctionBidInfo setIp(String ip) {
        if (ip != null)
            ip = ip.trim();
        this.ip = ip;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_bid_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 所属用户
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 拍品实例标识
     */
    public static final String PRODUCT_INSTANCE_ID = "product_instance_id";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 出价价格
     */
    public static final String BID_PRICE = "bid_price";

    /**
     * 来源ip
     */
    public static final String IP = "ip";


    @Override
    public AuctionBidInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

