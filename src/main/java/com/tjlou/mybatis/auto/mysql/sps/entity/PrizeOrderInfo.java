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
 * 奖品订单表
 * </p>
 *
 * @author Gaby
 * @since 2019-12-03
 */
@TableName("prize_order_info")
public class PrizeOrderInfo implements Serializable, IEntity {


    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 订单编号
     */
    @TableField("order_code")
    private String orderCode;
    /**
     * 商户标识
     */
    @TableField("supplier_id")
    private Long supplierId;
    /**
     * 买家标识
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 实付价格
     */
    private Integer payment;
    /**
     * 1-待付款  2-已付款 4-已发货 8-交易成功  16-交易关闭 32-已评价
     */
    private Integer status;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 更新时间
     */
    @TableField("update_time")
    private Date updateTime;
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
    @TableField("close_time")
    private Date closeTime;
    /**
     * 物流名称
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
    @TableField("shipping_no")
    private String shippingNo;
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
     * 买家是否已评价
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
     * 发货人手机号
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
     * 发货人地址
     */
    @TableField("sender_area_name")
    private String senderAreaName;
    /**
     * 奖品标识
     */
    @TableField("prize_goods_id")
    private Long prizeGoodsId;
    /**
     * 奖品价格
     */
    @TableField("prize_goods_price")
    private Integer prizeGoodsPrice;
    /**
     * 奖品数量
     */
    @TableField("prize_num")
    private Integer prizeNum;
    /**
     * 抽奖标识
     */
    @TableField("prize_log_id")
    private Long prizeLogId;
    /**
     * 修改单号次数
     */
    @TableField("express_update")
    private Integer expressUpdate;


    public Long getId() {
        return id;
    }

    public PrizeOrderInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public PrizeOrderInfo setOrderCode(String orderCode) {
        if (orderCode != null)
            orderCode = orderCode.trim();
        this.orderCode = orderCode;
        return this;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public PrizeOrderInfo setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public PrizeOrderInfo setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Integer getPayment() {
        return payment;
    }

    public PrizeOrderInfo setPayment(Integer payment) {
        this.payment = payment;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public PrizeOrderInfo setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public PrizeOrderInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public PrizeOrderInfo setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public Date getConsignTime() {
        return consignTime;
    }

    public PrizeOrderInfo setConsignTime(Date consignTime) {
        this.consignTime = consignTime;
        return this;
    }

    public Date getEndTime() {
        return endTime;
    }

    public PrizeOrderInfo setEndTime(Date endTime) {
        this.endTime = endTime;
        return this;
    }

    public Date getCloseTime() {
        return closeTime;
    }

    public PrizeOrderInfo setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
        return this;
    }

    public String getShippingName() {
        return shippingName;
    }

    public PrizeOrderInfo setShippingName(String shippingName) {
        if (shippingName != null)
            shippingName = shippingName.trim();
        this.shippingName = shippingName;
        return this;
    }

    public String getShippingCode() {
        return shippingCode;
    }

    public PrizeOrderInfo setShippingCode(String shippingCode) {
        if (shippingCode != null)
            shippingCode = shippingCode.trim();
        this.shippingCode = shippingCode;
        return this;
    }

    public String getShippingNo() {
        return shippingNo;
    }

    public PrizeOrderInfo setShippingNo(String shippingNo) {
        if (shippingNo != null)
            shippingNo = shippingNo.trim();
        this.shippingNo = shippingNo;
        return this;
    }

    public String getBuyerMessage() {
        return buyerMessage;
    }

    public PrizeOrderInfo setBuyerMessage(String buyerMessage) {
        if (buyerMessage != null)
            buyerMessage = buyerMessage.trim();
        this.buyerMessage = buyerMessage;
        return this;
    }

    public String getBuyerNick() {
        return buyerNick;
    }

    public PrizeOrderInfo setBuyerNick(String buyerNick) {
        if (buyerNick != null)
            buyerNick = buyerNick.trim();
        this.buyerNick = buyerNick;
        return this;
    }

    public String getBuyerRate() {
        return buyerRate;
    }

    public PrizeOrderInfo setBuyerRate(String buyerRate) {
        if (buyerRate != null)
            buyerRate = buyerRate.trim();
        this.buyerRate = buyerRate;
        return this;
    }

    public String getBuyerUpdate() {
        return buyerUpdate;
    }

    public PrizeOrderInfo setBuyerUpdate(String buyerUpdate) {
        if (buyerUpdate != null)
            buyerUpdate = buyerUpdate.trim();
        this.buyerUpdate = buyerUpdate;
        return this;
    }

    public String getReceiverMobile() {
        return receiverMobile;
    }

    public PrizeOrderInfo setReceiverMobile(String receiverMobile) {
        if (receiverMobile != null)
            receiverMobile = receiverMobile.trim();
        this.receiverMobile = receiverMobile;
        return this;
    }

    public String getReceiverCode() {
        return receiverCode;
    }

    public PrizeOrderInfo setReceiverCode(String receiverCode) {
        if (receiverCode != null)
            receiverCode = receiverCode.trim();
        this.receiverCode = receiverCode;
        return this;
    }

    public String getReceiver() {
        return receiver;
    }

    public PrizeOrderInfo setReceiver(String receiver) {
        if (receiver != null)
            receiver = receiver.trim();
        this.receiver = receiver;
        return this;
    }

    public String getReceiverAreaName() {
        return receiverAreaName;
    }

    public PrizeOrderInfo setReceiverAreaName(String receiverAreaName) {
        if (receiverAreaName != null)
            receiverAreaName = receiverAreaName.trim();
        this.receiverAreaName = receiverAreaName;
        return this;
    }

    public String getSenderMobile() {
        return senderMobile;
    }

    public PrizeOrderInfo setSenderMobile(String senderMobile) {
        if (senderMobile != null)
            senderMobile = senderMobile.trim();
        this.senderMobile = senderMobile;
        return this;
    }

    public String getSenderCode() {
        return senderCode;
    }

    public PrizeOrderInfo setSenderCode(String senderCode) {
        if (senderCode != null)
            senderCode = senderCode.trim();
        this.senderCode = senderCode;
        return this;
    }

    public String getSender() {
        return sender;
    }

    public PrizeOrderInfo setSender(String sender) {
        if (sender != null)
            sender = sender.trim();
        this.sender = sender;
        return this;
    }

    public String getSenderAreaName() {
        return senderAreaName;
    }

    public PrizeOrderInfo setSenderAreaName(String senderAreaName) {
        if (senderAreaName != null)
            senderAreaName = senderAreaName.trim();
        this.senderAreaName = senderAreaName;
        return this;
    }

    public Long getPrizeGoodsId() {
        return prizeGoodsId;
    }

    public PrizeOrderInfo setPrizeGoodsId(Long prizeGoodsId) {
        this.prizeGoodsId = prizeGoodsId;
        return this;
    }

    public Integer getPrizeGoodsPrice() {
        return prizeGoodsPrice;
    }

    public PrizeOrderInfo setPrizeGoodsPrice(Integer prizeGoodsPrice) {
        this.prizeGoodsPrice = prizeGoodsPrice;
        return this;
    }

    public Integer getPrizeNum() {
        return prizeNum;
    }

    public PrizeOrderInfo setPrizeNum(Integer prizeNum) {
        this.prizeNum = prizeNum;
        return this;
    }

    public Long getPrizeLogId() {
        return prizeLogId;
    }

    public PrizeOrderInfo setPrizeLogId(Long prizeLogId) {
        this.prizeLogId = prizeLogId;
        return this;
    }

    public Integer getExpressUpdate() {
        return expressUpdate;
    }

    public PrizeOrderInfo setExpressUpdate(Integer expressUpdate) {
        this.expressUpdate = expressUpdate;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "prize_order_info";
    public static final String ID = "id";

    /**
     * 订单编号
     */
    public static final String ORDER_CODE = "order_code";

    /**
     * 商户标识
     */
    public static final String SUPPLIER_ID = "supplier_id";

    /**
     * 买家标识
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 实付价格
     */
    public static final String PAYMENT = "payment";

    /**
     * 1-待付款  2-已付款 4-已发货 8-交易成功  16-交易关闭 32-已评价
     */
    public static final String STATUS = "status";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 更新时间
     */
    public static final String UPDATE_TIME = "update_time";

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
    public static final String CLOSE_TIME = "close_time";

    /**
     * 物流名称
     */
    public static final String SHIPPING_NAME = "shipping_name";

    /**
     * 快递编码
     */
    public static final String SHIPPING_CODE = "shipping_code";

    /**
     * 快递单号
     */
    public static final String SHIPPING_NO = "shipping_no";

    /**
     * 买家留言
     */
    public static final String BUYER_MESSAGE = "buyer_message";

    /**
     * 买家昵称
     */
    public static final String BUYER_NICK = "buyer_nick";

    /**
     * 买家是否已评价
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
     * 发货人手机号
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
     * 发货人地址
     */
    public static final String SENDER_AREA_NAME = "sender_area_name";

    /**
     * 奖品标识
     */
    public static final String PRIZE_GOODS_ID = "prize_goods_id";

    /**
     * 奖品价格
     */
    public static final String PRIZE_GOODS_PRICE = "prize_goods_price";

    /**
     * 奖品数量
     */
    public static final String PRIZE_NUM = "prize_num";

    /**
     * 抽奖标识
     */
    public static final String PRIZE_LOG_ID = "prize_log_id";

    /**
     * 修改单号次数
     */
    public static final String EXPRESS_UPDATE = "express_update";


    @Override
    public PrizeOrderInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

