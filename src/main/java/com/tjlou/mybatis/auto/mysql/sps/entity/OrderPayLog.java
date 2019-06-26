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
 * 支付日志表
 * </p>
 *
 * @author Gaby
 * @since 2019-06-26
 */
@TableName("order_pay_log")
public class OrderPayLog implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 支付订单号
     */
    @TableField("order_code")
    private String orderCode;
    /**
     * 支付金额
     */
    @TableField("total_fee")
    private Integer totalFee;
    /**
     * 用户标识
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 交易号码
     */
    @TableField("transaction_id")
    private String transactionId;
    /**
     * 交易状态
     */
    @TableField("trade_status")
    private String tradeStatus;
    /**
     * 订单列表(预留)
     */
    @TableField("order_list")
    private String orderList;
    /**
     * 支付类型
     */
    @TableField("pay_type")
    private String payType;
    /**
     * 支付时间
     */
    @TableField("pay_time")
    private Date payTime;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;

    public Long getId() {
        return id;
    }

    public OrderPayLog setId(Long id) {
        this.id = id;
        return this;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public OrderPayLog setOrderCode(String orderCode) {
        if (orderCode != null)
            orderCode = orderCode.trim();
        this.orderCode = orderCode;
        return this;
    }

    public Integer getTotalFee() {
        return totalFee;
    }

    public OrderPayLog setTotalFee(Integer totalFee) {
        this.totalFee = totalFee;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public OrderPayLog setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public OrderPayLog setTransactionId(String transactionId) {
        if (transactionId != null)
            transactionId = transactionId.trim();
        this.transactionId = transactionId;
        return this;
    }

    public String getTradeStatus() {
        return tradeStatus;
    }

    public OrderPayLog setTradeStatus(String tradeStatus) {
        if (tradeStatus != null)
            tradeStatus = tradeStatus.trim();
        this.tradeStatus = tradeStatus;
        return this;
    }

    public String getOrderList() {
        return orderList;
    }

    public OrderPayLog setOrderList(String orderList) {
        if (orderList != null)
            orderList = orderList.trim();
        this.orderList = orderList;
        return this;
    }

    public String getPayType() {
        return payType;
    }

    public OrderPayLog setPayType(String payType) {
        if (payType != null)
            payType = payType.trim();
        this.payType = payType;
        return this;
    }

    public Date getPayTime() {
        return payTime;
    }

    public OrderPayLog setPayTime(Date payTime) {
        this.payTime = payTime;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public OrderPayLog setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "order_pay_log";
    public static final String ID = "id";

    /**
     * 支付订单号
     */
    public static final String ORDER_CODE = "order_code";

    /**
     * 支付金额
     */
    public static final String TOTAL_FEE = "total_fee";

    /**
     * 用户标识
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 交易号码
     */
    public static final String TRANSACTION_ID = "transaction_id";

    /**
     * 交易状态
     */
    public static final String TRADE_STATUS = "trade_status";

    /**
     * 订单列表(预留)
     */
    public static final String ORDER_LIST = "order_list";

    /**
     * 支付类型
     */
    public static final String PAY_TYPE = "pay_type";

    /**
     * 支付时间
     */
    public static final String PAY_TIME = "pay_time";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    @Override
    public OrderPayLog pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

