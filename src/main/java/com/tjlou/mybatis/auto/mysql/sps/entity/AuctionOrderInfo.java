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
 * 拍卖-订单表
 * </p>
 *
 * @author Gaby
 * @since 2020-06-26
 */
@TableName("auction_order_info")
public class AuctionOrderInfo implements Serializable, IEntity {

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 实付金额(单位:分) 20007 表示 200元7分
     */
    private Long payment;
    /**
     * 订单编号
     */
    @TableField("order_code")
    private String orderCode;
    /**
     * 买家用户标识
     */
    @TableField("seller_account_id")
    private Long sellerAccountId;
    /**
     * 卖家用户标识
     */
    @TableField("buyer_account_id")
    private Long buyerAccountId;
    /**
     * 支付类型 0-当面交易  1-微信支付 2-余额支付
     */
    @TableField("pay_type")
    private Integer payType;
    /**
     * 邮费 (单位:分)
     */
    @TableField("post_fee")
    private Long postFee;
    /**
     * 状态 1-待付款  2-已付款 4-已发货  8-交易成功 16-交易关闭  32-已评价  64-售后 128- 退款导致关闭
     */
    private Long status;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 修改时间
     */
    @TableField("modify_time")
    private Date modifyTime;
    /**
     * 支付时间
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
     * 关闭时间
     */
    @TableField("close_time")
    private Date closeTime;
    /**
     * 退款关闭时间
     */
    @TableField("return_close_time")
    private Date returnCloseTime;
    /**
     * 失效时间
     */
    private Date expire;
    /**
     * 快递名称
     */
    @TableField("shipping_name")
    private String shippingName;
    /**
     * 快递编码
     */
    @TableField("shipping_code")
    private String shippingCode;
    /**
     * 快递单号
     */
    @TableField("shipping_num")
    private String shippingNum;
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
     * 评价次数
     */
    @TableField("buyer_rate")
    private Integer buyerRate;
    /**
     * 地址修改次数
     */
    @TableField("address_update")
    private Integer addressUpdate;
    /**
     * 发货人电话
     */
    @TableField("sender_mobile")
    private String senderMobile;
    /**
     * 发货人邮编
     */
    @TableField("sender_code")
    private String senderCode;
    /**
     * 发货人
     */
    private String sender;
    /**
     * 发货收货地址
     */
    @TableField("sender_area_name")
    private String senderAreaName;
    /**
     * 收货编码
     */
    @TableField("receiver_code")
    private String receiverCode;
    /**
     * 收货人电话
     */
    @TableField("receiver_mobile")
    private String receiverMobile;
    /**
     * 收货人
     */
    private String receiver;
    /**
     * 收货地址
     */
    @TableField("receiver_area_name")
    private String receiverAreaName;
    /**
     * 取消原因
     */
    @TableField("cancel_reason")
    private String cancelReason;
    /**
     * 物流修改次数
     */
    @TableField("express_update")
    private Integer expressUpdate;
    /**
     * 物流状态  0-待确认  1-异常  2-已确认
     */
    @TableField("express_error")
    private Integer expressError;
    /**
     * 业务单号 用来合并付款使用
     */
    @TableField("trade_no")
    private String tradeNo;
    /**
     * 配送方式  1-快递包邮  2-快递运费 4-到付 8-当面交易
     */
    @TableField("distribute_type")
    private Integer distributeType;
    /**
     * 订单类型 1-普通订单
     */
    @TableField("order_type")
    private Integer orderType;
    /**
     * 延迟收货时间
     */
    @TableField("delay_end_time")
    private Date delayEndTime;

    public Long getId() {
        return id;
    }

    public AuctionOrderInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getPayment() {
        return payment;
    }

    public AuctionOrderInfo setPayment(Long payment) {
        this.payment = payment;
        return this;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public AuctionOrderInfo setOrderCode(String orderCode) {
        if (orderCode != null)
            orderCode = orderCode.trim();
        this.orderCode = orderCode;
        return this;
    }

    public Long getSellerAccountId() {
        return sellerAccountId;
    }

    public AuctionOrderInfo setSellerAccountId(Long sellerAccountId) {
        this.sellerAccountId = sellerAccountId;
        return this;
    }

    public Long getBuyerAccountId() {
        return buyerAccountId;
    }

    public AuctionOrderInfo setBuyerAccountId(Long buyerAccountId) {
        this.buyerAccountId = buyerAccountId;
        return this;
    }

    public Integer getPayType() {
        return payType;
    }

    public AuctionOrderInfo setPayType(Integer payType) {
        this.payType = payType;
        return this;
    }

    public Long getPostFee() {
        return postFee;
    }

    public AuctionOrderInfo setPostFee(Long postFee) {
        this.postFee = postFee;
        return this;
    }

    public Long getStatus() {
        return status;
    }

    public AuctionOrderInfo setStatus(Long status) {
        this.status = status;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public AuctionOrderInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public AuctionOrderInfo setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public AuctionOrderInfo setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
        return this;
    }

    public Date getConsignTime() {
        return consignTime;
    }

    public AuctionOrderInfo setConsignTime(Date consignTime) {
        this.consignTime = consignTime;
        return this;
    }

    public Date getEndTime() {
        return endTime;
    }

    public AuctionOrderInfo setEndTime(Date endTime) {
        this.endTime = endTime;
        return this;
    }

    public Date getCloseTime() {
        return closeTime;
    }

    public AuctionOrderInfo setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
        return this;
    }

    public Date getReturnCloseTime() {
        return returnCloseTime;
    }

    public AuctionOrderInfo setReturnCloseTime(Date returnCloseTime) {
        this.returnCloseTime = returnCloseTime;
        return this;
    }

    public Date getExpire() {
        return expire;
    }

    public AuctionOrderInfo setExpire(Date expire) {
        this.expire = expire;
        return this;
    }

    public String getShippingName() {
        return shippingName;
    }

    public AuctionOrderInfo setShippingName(String shippingName) {
        if (shippingName != null)
            shippingName = shippingName.trim();
        this.shippingName = shippingName;
        return this;
    }

    public String getShippingCode() {
        return shippingCode;
    }

    public AuctionOrderInfo setShippingCode(String shippingCode) {
        if (shippingCode != null)
            shippingCode = shippingCode.trim();
        this.shippingCode = shippingCode;
        return this;
    }

    public String getShippingNum() {
        return shippingNum;
    }

    public AuctionOrderInfo setShippingNum(String shippingNum) {
        if (shippingNum != null)
            shippingNum = shippingNum.trim();
        this.shippingNum = shippingNum;
        return this;
    }

    public String getBuyerMessage() {
        return buyerMessage;
    }

    public AuctionOrderInfo setBuyerMessage(String buyerMessage) {
        if (buyerMessage != null)
            buyerMessage = buyerMessage.trim();
        this.buyerMessage = buyerMessage;
        return this;
    }

    public String getBuyerNick() {
        return buyerNick;
    }

    public AuctionOrderInfo setBuyerNick(String buyerNick) {
        if (buyerNick != null)
            buyerNick = buyerNick.trim();
        this.buyerNick = buyerNick;
        return this;
    }

    public Integer getBuyerRate() {
        return buyerRate;
    }

    public AuctionOrderInfo setBuyerRate(Integer buyerRate) {
        this.buyerRate = buyerRate;
        return this;
    }

    public Integer getAddressUpdate() {
        return addressUpdate;
    }

    public AuctionOrderInfo setAddressUpdate(Integer addressUpdate) {
        this.addressUpdate = addressUpdate;
        return this;
    }

    public String getSenderMobile() {
        return senderMobile;
    }

    public AuctionOrderInfo setSenderMobile(String senderMobile) {
        if (senderMobile != null)
            senderMobile = senderMobile.trim();
        this.senderMobile = senderMobile;
        return this;
    }

    public String getSenderCode() {
        return senderCode;
    }

    public AuctionOrderInfo setSenderCode(String senderCode) {
        if (senderCode != null)
            senderCode = senderCode.trim();
        this.senderCode = senderCode;
        return this;
    }

    public String getSender() {
        return sender;
    }

    public AuctionOrderInfo setSender(String sender) {
        if (sender != null)
            sender = sender.trim();
        this.sender = sender;
        return this;
    }

    public String getSenderAreaName() {
        return senderAreaName;
    }

    public AuctionOrderInfo setSenderAreaName(String senderAreaName) {
        if (senderAreaName != null)
            senderAreaName = senderAreaName.trim();
        this.senderAreaName = senderAreaName;
        return this;
    }

    public String getReceiverCode() {
        return receiverCode;
    }

    public AuctionOrderInfo setReceiverCode(String receiverCode) {
        if (receiverCode != null)
            receiverCode = receiverCode.trim();
        this.receiverCode = receiverCode;
        return this;
    }

    public String getReceiverMobile() {
        return receiverMobile;
    }

    public AuctionOrderInfo setReceiverMobile(String receiverMobile) {
        if (receiverMobile != null)
            receiverMobile = receiverMobile.trim();
        this.receiverMobile = receiverMobile;
        return this;
    }

    public String getReceiver() {
        return receiver;
    }

    public AuctionOrderInfo setReceiver(String receiver) {
        if (receiver != null)
            receiver = receiver.trim();
        this.receiver = receiver;
        return this;
    }

    public String getReceiverAreaName() {
        return receiverAreaName;
    }

    public AuctionOrderInfo setReceiverAreaName(String receiverAreaName) {
        if (receiverAreaName != null)
            receiverAreaName = receiverAreaName.trim();
        this.receiverAreaName = receiverAreaName;
        return this;
    }

    public String getCancelReason() {
        return cancelReason;
    }

    public AuctionOrderInfo setCancelReason(String cancelReason) {
        if (cancelReason != null)
            cancelReason = cancelReason.trim();
        this.cancelReason = cancelReason;
        return this;
    }

    public Integer getExpressUpdate() {
        return expressUpdate;
    }

    public AuctionOrderInfo setExpressUpdate(Integer expressUpdate) {
        this.expressUpdate = expressUpdate;
        return this;
    }

    public Integer getExpressError() {
        return expressError;
    }

    public AuctionOrderInfo setExpressError(Integer expressError) {
        this.expressError = expressError;
        return this;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public AuctionOrderInfo setTradeNo(String tradeNo) {
        if (tradeNo != null)
            tradeNo = tradeNo.trim();
        this.tradeNo = tradeNo;
        return this;
    }

    public Integer getDistributeType() {
        return distributeType;
    }

    public AuctionOrderInfo setDistributeType(Integer distributeType) {
        this.distributeType = distributeType;
        return this;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public AuctionOrderInfo setOrderType(Integer orderType) {
        this.orderType = orderType;
        return this;
    }

    public Date getDelayEndTime() {
        return delayEndTime;
    }

    public AuctionOrderInfo setDelayEndTime(Date delayEndTime) {
        this.delayEndTime = delayEndTime;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_order_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 实付金额(单位:分) 20007 表示 200元7分
     */
    public static final String PAYMENT = "payment";

    /**
     * 订单编号
     */
    public static final String ORDER_CODE = "order_code";

    /**
     * 买家用户标识
     */
    public static final String SELLER_ACCOUNT_ID = "seller_account_id";

    /**
     * 卖家用户标识
     */
    public static final String BUYER_ACCOUNT_ID = "buyer_account_id";

    /**
     * 支付类型 0-当面交易  1-微信支付 2-余额支付
     */
    public static final String PAY_TYPE = "pay_type";

    /**
     * 邮费 (单位:分)
     */
    public static final String POST_FEE = "post_fee";

    /**
     * 状态 1-待付款  2-已付款 4-已发货  8-交易成功 16-交易关闭  32-已评价  64-售后 128- 退款导致关闭
     */
    public static final String STATUS = "status";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 修改时间
     */
    public static final String MODIFY_TIME = "modify_time";

    /**
     * 支付时间
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
     * 关闭时间
     */
    public static final String CLOSE_TIME = "close_time";

    /**
     * 退款关闭时间
     */
    public static final String RETURN_CLOSE_TIME = "return_close_time";

    /**
     * 失效时间
     */
    public static final String EXPIRE = "expire";

    /**
     * 快递名称
     */
    public static final String SHIPPING_NAME = "shipping_name";

    /**
     * 快递编码
     */
    public static final String SHIPPING_CODE = "shipping_code";

    /**
     * 快递单号
     */
    public static final String SHIPPING_NUM = "shipping_num";

    /**
     * 买家留言
     */
    public static final String BUYER_MESSAGE = "buyer_message";

    /**
     * 买家昵称
     */
    public static final String BUYER_NICK = "buyer_nick";

    /**
     * 评价次数
     */
    public static final String BUYER_RATE = "buyer_rate";

    /**
     * 地址修改次数
     */
    public static final String ADDRESS_UPDATE = "address_update";

    /**
     * 发货人电话
     */
    public static final String SENDER_MOBILE = "sender_mobile";

    /**
     * 发货人邮编
     */
    public static final String SENDER_CODE = "sender_code";

    /**
     * 发货人
     */
    public static final String SENDER = "sender";

    /**
     * 发货收货地址
     */
    public static final String SENDER_AREA_NAME = "sender_area_name";

    /**
     * 收货编码
     */
    public static final String RECEIVER_CODE = "receiver_code";

    /**
     * 收货人电话
     */
    public static final String RECEIVER_MOBILE = "receiver_mobile";

    /**
     * 收货人
     */
    public static final String RECEIVER = "receiver";

    /**
     * 收货地址
     */
    public static final String RECEIVER_AREA_NAME = "receiver_area_name";

    /**
     * 取消原因
     */
    public static final String CANCEL_REASON = "cancel_reason";

    /**
     * 物流修改次数
     */
    public static final String EXPRESS_UPDATE = "express_update";

    /**
     * 物流状态  0-待确认  1-异常  2-已确认
     */
    public static final String EXPRESS_ERROR = "express_error";

    /**
     * 业务单号 用来合并付款使用
     */
    public static final String TRADE_NO = "trade_no";

    /**
     * 配送方式  1-快递包邮  2-快递运费 4-到付 8-当面交易
     */
    public static final String DISTRIBUTE_TYPE = "distribute_type";

    /**
     * 订单类型 1-普通订单
     */
    public static final String ORDER_TYPE = "order_type";

    /**
     * 延迟收货时间
     */
    public static final String DELAY_END_TIME = "delay_end_time";

    @Override
    public AuctionOrderInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

