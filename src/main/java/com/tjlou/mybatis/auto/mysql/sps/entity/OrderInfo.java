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
 * 订单信息表
 * </p>
 *
 * @author Gaby
 * @since 2019-11-25
 */
@TableName("order_info")
public class OrderInfo implements Serializable, IEntity {


    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 实付金额 单位:分 20007 表示200元7分
     */
    private Integer payment;
    /**
     * 订单编号 前四位供货商ID(0填充)+12位(日期)+4位用户标识(0填充)+4位随机值
     */
    @TableField("order_code")
    private String orderCode;
    /**
     * 供货商标识
     */
    @TableField("supplier_id")
    private Long supplierId;
    /**
     * 用户标识
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 支付类型 1-在线支付 2-余额支付
     */
    @TableField("payment_type")
    private String paymentType;
    /**
     * 邮费 单位:分
     */
    @TableField("post_fee")
    private Integer postFee;
    /**
     * 状态 1-待付款  2-已付款 4-已发货 8-交易成功  16-交易关闭 32-已评价 64-退款中
     */
    private Integer status;
    /**
     * 订单创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 订单更新时间
     */
    @TableField("update_time")
    private Date updateTime;
    /**
     * 付款时间
     */
    @TableField("payment_time")
    private Date paymentTime;
    /**
     * 发货时间
     */
    @TableField("consign_time")
    private Date consignTime;
    /**
     * 交易成功时间
     */
    @TableField("end_time")
    private Date endTime;
    /**
     * 交易关闭时间
     */
    @TableField("colse_time")
    private Date colseTime;
    /**
     * 物流名称
     */
    @TableField("shipping_name")
    private String shippingName;
    /**
     * 快递编码
     */
    @TableField("express_code")
    private String expressCode;
    /**
     * 物流单号
     */
    @TableField("shipping_code")
    private String shippingCode;
    /**
     * 买家留言
     */
    @TableField("buyer_message")
    private String buyerMessage;
    /**
     * 买家昵称
     */
    @TableField("buyer_nick")
    private String buyerNick;
    /**
     * 买家是否评价
     */
    @TableField("buyer_rate")
    private String buyerRate;
    /**
     * 买家是否修改过地址
     */
    @TableField("buyer_update")
    private String buyerUpdate;
    /**
     * 收货人手机号
     */
    @TableField("receiver_mobile")
    private String receiverMobile;
    /**
     * 收货人邮编
     */
    @TableField("receiver_code")
    private String receiverCode;
    /**
     * 收货人
     */
    private String receiver;
    /**
     * 收货人地址
     */
    @TableField("receiver_area_name")
    private String receiverAreaName;
    /**
     * 过期时间，定期清理
     */
    private Date expire;
    /**
     * 订单来源 1-微信小程序
     */
    @TableField("source_type")
    private String sourceType;
    /**
     * 发件人手机号
     */
    @TableField("sender_mobile")
    private String senderMobile;
    /**
     * 发件人邮编
     */
    @TableField("sender_code")
    private String senderCode;
    /**
     * 发件人
     */
    private String sender;
    /**
     * 发件人地址
     */
    @TableField("sender_area_name")
    private String senderAreaName;
    /**
     * 代理
     */
    private Long agent;
    /**
     * 取消原因
     */
    @TableField("cancel_reason")
    private String cancelReason;


    public Long getId() {
        return id;
    }

    public OrderInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Integer getPayment() {
        return payment;
    }

    public OrderInfo setPayment(Integer payment) {
        this.payment = payment;
        return this;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public OrderInfo setOrderCode(String orderCode) {
        if (orderCode != null)
            orderCode = orderCode.trim();
        this.orderCode = orderCode;
        return this;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public OrderInfo setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public OrderInfo setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public OrderInfo setPaymentType(String paymentType) {
        if (paymentType != null)
            paymentType = paymentType.trim();
        this.paymentType = paymentType;
        return this;
    }

    public Integer getPostFee() {
        return postFee;
    }

    public OrderInfo setPostFee(Integer postFee) {
        this.postFee = postFee;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public OrderInfo setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public OrderInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public OrderInfo setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public OrderInfo setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
        return this;
    }

    public Date getConsignTime() {
        return consignTime;
    }

    public OrderInfo setConsignTime(Date consignTime) {
        this.consignTime = consignTime;
        return this;
    }

    public Date getEndTime() {
        return endTime;
    }

    public OrderInfo setEndTime(Date endTime) {
        this.endTime = endTime;
        return this;
    }

    public Date getColseTime() {
        return colseTime;
    }

    public OrderInfo setColseTime(Date colseTime) {
        this.colseTime = colseTime;
        return this;
    }

    public String getShippingName() {
        return shippingName;
    }

    public OrderInfo setShippingName(String shippingName) {
        if (shippingName != null)
            shippingName = shippingName.trim();
        this.shippingName = shippingName;
        return this;
    }

    public String getExpressCode() {
        return expressCode;
    }

    public OrderInfo setExpressCode(String expressCode) {
        if (expressCode != null)
            expressCode = expressCode.trim();
        this.expressCode = expressCode;
        return this;
    }

    public String getShippingCode() {
        return shippingCode;
    }

    public OrderInfo setShippingCode(String shippingCode) {
        if (shippingCode != null)
            shippingCode = shippingCode.trim();
        this.shippingCode = shippingCode;
        return this;
    }

    public String getBuyerMessage() {
        return buyerMessage;
    }

    public OrderInfo setBuyerMessage(String buyerMessage) {
        if (buyerMessage != null)
            buyerMessage = buyerMessage.trim();
        this.buyerMessage = buyerMessage;
        return this;
    }

    public String getBuyerNick() {
        return buyerNick;
    }

    public OrderInfo setBuyerNick(String buyerNick) {
        if (buyerNick != null)
            buyerNick = buyerNick.trim();
        this.buyerNick = buyerNick;
        return this;
    }

    public String getBuyerRate() {
        return buyerRate;
    }

    public OrderInfo setBuyerRate(String buyerRate) {
        if (buyerRate != null)
            buyerRate = buyerRate.trim();
        this.buyerRate = buyerRate;
        return this;
    }

    public String getBuyerUpdate() {
        return buyerUpdate;
    }

    public OrderInfo setBuyerUpdate(String buyerUpdate) {
        if (buyerUpdate != null)
            buyerUpdate = buyerUpdate.trim();
        this.buyerUpdate = buyerUpdate;
        return this;
    }

    public String getReceiverMobile() {
        return receiverMobile;
    }

    public OrderInfo setReceiverMobile(String receiverMobile) {
        if (receiverMobile != null)
            receiverMobile = receiverMobile.trim();
        this.receiverMobile = receiverMobile;
        return this;
    }

    public String getReceiverCode() {
        return receiverCode;
    }

    public OrderInfo setReceiverCode(String receiverCode) {
        if (receiverCode != null)
            receiverCode = receiverCode.trim();
        this.receiverCode = receiverCode;
        return this;
    }

    public String getReceiver() {
        return receiver;
    }

    public OrderInfo setReceiver(String receiver) {
        if (receiver != null)
            receiver = receiver.trim();
        this.receiver = receiver;
        return this;
    }

    public String getReceiverAreaName() {
        return receiverAreaName;
    }

    public OrderInfo setReceiverAreaName(String receiverAreaName) {
        if (receiverAreaName != null)
            receiverAreaName = receiverAreaName.trim();
        this.receiverAreaName = receiverAreaName;
        return this;
    }

    public Date getExpire() {
        return expire;
    }

    public OrderInfo setExpire(Date expire) {
        this.expire = expire;
        return this;
    }

    public String getSourceType() {
        return sourceType;
    }

    public OrderInfo setSourceType(String sourceType) {
        if (sourceType != null)
            sourceType = sourceType.trim();
        this.sourceType = sourceType;
        return this;
    }

    public String getSenderMobile() {
        return senderMobile;
    }

    public OrderInfo setSenderMobile(String senderMobile) {
        if (senderMobile != null)
            senderMobile = senderMobile.trim();
        this.senderMobile = senderMobile;
        return this;
    }

    public String getSenderCode() {
        return senderCode;
    }

    public OrderInfo setSenderCode(String senderCode) {
        if (senderCode != null)
            senderCode = senderCode.trim();
        this.senderCode = senderCode;
        return this;
    }

    public String getSender() {
        return sender;
    }

    public OrderInfo setSender(String sender) {
        if (sender != null)
            sender = sender.trim();
        this.sender = sender;
        return this;
    }

    public String getSenderAreaName() {
        return senderAreaName;
    }

    public OrderInfo setSenderAreaName(String senderAreaName) {
        if (senderAreaName != null)
            senderAreaName = senderAreaName.trim();
        this.senderAreaName = senderAreaName;
        return this;
    }

    public Long getAgent() {
        return agent;
    }

    public OrderInfo setAgent(Long agent) {
        this.agent = agent;
        return this;
    }

    public String getCancelReason() {
        return cancelReason;
    }

    public OrderInfo setCancelReason(String cancelReason) {
        if (cancelReason != null)
            cancelReason = cancelReason.trim();
        this.cancelReason = cancelReason;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "order_info";
    public static final String ID = "id";

    /**
     * 实付金额 单位:分 20007 表示200元7分
     */
    public static final String PAYMENT = "payment";

    /**
     * 订单编号 前四位供货商ID(0填充)+12位(日期)+4位用户标识(0填充)+4位随机值
     */
    public static final String ORDER_CODE = "order_code";

    /**
     * 供货商标识
     */
    public static final String SUPPLIER_ID = "supplier_id";

    /**
     * 用户标识
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 支付类型 1-在线支付 2-余额支付
     */
    public static final String PAYMENT_TYPE = "payment_type";

    /**
     * 邮费 单位:分
     */
    public static final String POST_FEE = "post_fee";

    /**
     * 状态 1-待付款  2-已付款 4-已发货 8-交易成功  16-交易关闭 32-已评价 64-退款中
     */
    public static final String STATUS = "status";

    /**
     * 订单创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 订单更新时间
     */
    public static final String UPDATE_TIME = "update_time";

    /**
     * 付款时间
     */
    public static final String PAYMENT_TIME = "payment_time";

    /**
     * 发货时间
     */
    public static final String CONSIGN_TIME = "consign_time";

    /**
     * 交易成功时间
     */
    public static final String END_TIME = "end_time";

    /**
     * 交易关闭时间
     */
    public static final String COLSE_TIME = "colse_time";

    /**
     * 物流名称
     */
    public static final String SHIPPING_NAME = "shipping_name";

    /**
     * 快递编码
     */
    public static final String EXPRESS_CODE = "express_code";

    /**
     * 物流单号
     */
    public static final String SHIPPING_CODE = "shipping_code";

    /**
     * 买家留言
     */
    public static final String BUYER_MESSAGE = "buyer_message";

    /**
     * 买家昵称
     */
    public static final String BUYER_NICK = "buyer_nick";

    /**
     * 买家是否评价
     */
    public static final String BUYER_RATE = "buyer_rate";

    /**
     * 买家是否修改过地址
     */
    public static final String BUYER_UPDATE = "buyer_update";

    /**
     * 收货人手机号
     */
    public static final String RECEIVER_MOBILE = "receiver_mobile";

    /**
     * 收货人邮编
     */
    public static final String RECEIVER_CODE = "receiver_code";

    /**
     * 收货人
     */
    public static final String RECEIVER = "receiver";

    /**
     * 收货人地址
     */
    public static final String RECEIVER_AREA_NAME = "receiver_area_name";

    /**
     * 过期时间，定期清理
     */
    public static final String EXPIRE = "expire";

    /**
     * 订单来源 1-微信小程序
     */
    public static final String SOURCE_TYPE = "source_type";

    /**
     * 发件人手机号
     */
    public static final String SENDER_MOBILE = "sender_mobile";

    /**
     * 发件人邮编
     */
    public static final String SENDER_CODE = "sender_code";

    /**
     * 发件人
     */
    public static final String SENDER = "sender";

    /**
     * 发件人地址
     */
    public static final String SENDER_AREA_NAME = "sender_area_name";

    /**
     * 代理
     */
    public static final String AGENT = "agent";

    /**
     * 取消原因
     */
    public static final String CANCEL_REASON = "cancel_reason";


    @Override
    public OrderInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

