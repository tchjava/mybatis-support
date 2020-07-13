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
 * 拍卖-支付日志表
 * </p>
 *
 * @author Gaby
 * @since 2020-07-13
 */
@TableName("auction_pay_log_info")
public class AuctionPayLogInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 主体标识
     */
    @TableField("body_id")
    private Long bodyId;
    /**
     * 主体类型    1-订单  2-拍品
     */
    @TableField("body_type")
    private Integer bodyType;
    /**
     * 业务流水号
     */
    @TableField("trade_no")
    private String tradeNo;
    /**
     * 状态   00A-已支付   00B-待支付   00Z-失效
     */
    private String status;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 支付类型  1-微信支付  2-余额支付
     */
    @TableField("pay_type")
    private Integer payType;


    public Long getId() {
        return id;
    }

    public AuctionPayLogInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getBodyId() {
        return bodyId;
    }

    public AuctionPayLogInfo setBodyId(Long bodyId) {
        this.bodyId = bodyId;
        return this;
    }

    public Integer getBodyType() {
        return bodyType;
    }

    public AuctionPayLogInfo setBodyType(Integer bodyType) {
        this.bodyType = bodyType;
        return this;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public AuctionPayLogInfo setTradeNo(String tradeNo) {
        if (tradeNo != null)
            tradeNo = tradeNo.trim();
        this.tradeNo = tradeNo;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public AuctionPayLogInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public AuctionPayLogInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Integer getPayType() {
        return payType;
    }

    public AuctionPayLogInfo setPayType(Integer payType) {
        this.payType = payType;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_pay_log_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 主体标识
     */
    public static final String BODY_ID = "body_id";

    /**
     * 主体类型    1-订单  2-拍品
     */
    public static final String BODY_TYPE = "body_type";

    /**
     * 业务流水号
     */
    public static final String TRADE_NO = "trade_no";

    /**
     * 状态   00A-已支付   00B-待支付   00Z-失效
     */
    public static final String STATUS = "status";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 支付类型  1-微信支付  2-余额支付
     */
    public static final String PAY_TYPE = "pay_type";


    @Override
    public AuctionPayLogInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

