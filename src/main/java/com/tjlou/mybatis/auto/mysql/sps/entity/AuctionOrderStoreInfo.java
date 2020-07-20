package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 拍卖订单仓库关联表
 * </p>
 *
 * @author Gaby
 * @since 2020-07-20
 */
@TableName("auction_order_store_info")
public class AuctionOrderStoreInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 拍卖订单标识
     */
    @TableField("auction_order_id")
    private Long auctionOrderId;
    /**
     * 仓库订单标识
     */
    @TableField("store_order_id")
    private Long storeOrderId;
    /**
     * 订单令牌
     */
    @TableField("order_token")
    private String orderToken;
    /**
     * 状态  00A-已支付  00B-待支付    00Z-失效
     */
    private String status;


    public Long getId() {
        return id;
    }

    public AuctionOrderStoreInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getAuctionOrderId() {
        return auctionOrderId;
    }

    public AuctionOrderStoreInfo setAuctionOrderId(Long auctionOrderId) {
        this.auctionOrderId = auctionOrderId;
        return this;
    }

    public Long getStoreOrderId() {
        return storeOrderId;
    }

    public AuctionOrderStoreInfo setStoreOrderId(Long storeOrderId) {
        this.storeOrderId = storeOrderId;
        return this;
    }

    public String getOrderToken() {
        return orderToken;
    }

    public AuctionOrderStoreInfo setOrderToken(String orderToken) {
        if (orderToken != null)
            orderToken = orderToken.trim();
        this.orderToken = orderToken;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public AuctionOrderStoreInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_order_store_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 拍卖订单标识
     */
    public static final String AUCTION_ORDER_ID = "auction_order_id";

    /**
     * 仓库订单标识
     */
    public static final String STORE_ORDER_ID = "store_order_id";

    /**
     * 订单令牌
     */
    public static final String ORDER_TOKEN = "order_token";

    /**
     * 状态  00A-已支付  00B-待支付    00Z-失效
     */
    public static final String STATUS = "status";


    @Override
    public AuctionOrderStoreInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

