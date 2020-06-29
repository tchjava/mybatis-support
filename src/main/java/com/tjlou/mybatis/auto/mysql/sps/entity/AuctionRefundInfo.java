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
 * 拍卖-退款信息表
 * </p>
 *
 * @author Gaby
 * @since 2020-06-27
 */
@TableName("auction_refund_info")
public class AuctionRefundInfo implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 退款单号
     */
    @TableField("refund_code")
    private String refundCode;
    /**
     * 订单标识
     */
    @TableField("order_id")
    private Long orderId;
    /**
     * 退款金额 单位:分
     */
    private Long money;
    /**
     * 退款类型  1-退款 2-退货退款
     */
    private Integer type;
    /**
     * 状态 1-申请退款 2-同意退货 4-买家已发货 8-退款成功 16-拒绝 32-失效 64-介入中 128-平台拒绝
     */
    private Integer status;
    /**
     * 申请次数
     */
    @TableField("application_num")
    private Integer applicationNum;
    /**
     * 是否平台介入
     */
    private Integer intervene;
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
     * 申请退款时间
     */
    @TableField("refund_time")
    private Date refundTime;
    /**
     * 同意退货时间
     */
    @TableField("agree_return_time")
    private Date agreeReturnTime;
    /**
     * 退款成功时间
     */
    @TableField("end_time")
    private Date endTime;
    /**
     * 平台判定生效时间
     */
    @TableField("judge_time")
    private Date judgeTime;
    /**
     * 物流编码
     */
    @TableField("shipping_code")
    private String shippingCode;
    /**
     * 物流名称
     */
    @TableField("shipping_name")
    private String shippingName;
    /**
     * 物流单号
     */
    @TableField("shipping_num")
    private String shippingNum;
    /**
     * 退货时间
     */
    @TableField("return_time")
    private Date returnTime;
    /**
     * 收货时间
     */
    @TableField("receive_time")
    private Date receiveTime;
    /**
     * 收货人
     */
    private String receiver;
    /**
     * 收货人邮编
     */
    @TableField("receiver_code")
    private String receiverCode;
    /**
     * 收货人手机号
     */
    @TableField("receiver_mobile")
    private String receiverMobile;
    /**
     * 收货人地址
     */
    @TableField("receiver_area_name")
    private String receiverAreaName;
    /**
     * 发件人
     */
    private String sender;
    /**
     * 发件人邮编
     */
    @TableField("sender_code")
    private String senderCode;
    /**
     * 发件人手机号
     */
    @TableField("sender_mobile")
    private String senderMobile;
    /**
     * 发件人地址
     */
    @TableField("sender_area_name")
    private String senderAreaName;
    /**
     * 退款说明
     */
    private String comment;
    /**
     * 退款凭证
     */
    private String credence;
    /**
     * 退款原因
     */
    @TableField("refund_reason")
    private String refundReason;
    /**
     * 订单单号
     */
    @TableField("order_code")
    private String orderCode;

    public Long getId() {
        return id;
    }

    public AuctionRefundInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getRefundCode() {
        return refundCode;
    }

    public AuctionRefundInfo setRefundCode(String refundCode) {
        if (refundCode != null)
            refundCode = refundCode.trim();
        this.refundCode = refundCode;
        return this;
    }

    public Long getOrderId() {
        return orderId;
    }

    public AuctionRefundInfo setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }

    public Long getMoney() {
        return money;
    }

    public AuctionRefundInfo setMoney(Long money) {
        this.money = money;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public AuctionRefundInfo setType(Integer type) {
        this.type = type;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public AuctionRefundInfo setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public Integer getApplicationNum() {
        return applicationNum;
    }

    public AuctionRefundInfo setApplicationNum(Integer applicationNum) {
        this.applicationNum = applicationNum;
        return this;
    }

    public Integer getIntervene() {
        return intervene;
    }

    public AuctionRefundInfo setIntervene(Integer intervene) {
        this.intervene = intervene;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public AuctionRefundInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public AuctionRefundInfo setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }

    public Date getRefundTime() {
        return refundTime;
    }

    public AuctionRefundInfo setRefundTime(Date refundTime) {
        this.refundTime = refundTime;
        return this;
    }

    public Date getAgreeReturnTime() {
        return agreeReturnTime;
    }

    public AuctionRefundInfo setAgreeReturnTime(Date agreeReturnTime) {
        this.agreeReturnTime = agreeReturnTime;
        return this;
    }

    public Date getEndTime() {
        return endTime;
    }

    public AuctionRefundInfo setEndTime(Date endTime) {
        this.endTime = endTime;
        return this;
    }

    public Date getJudgeTime() {
        return judgeTime;
    }

    public AuctionRefundInfo setJudgeTime(Date judgeTime) {
        this.judgeTime = judgeTime;
        return this;
    }

    public String getShippingCode() {
        return shippingCode;
    }

    public AuctionRefundInfo setShippingCode(String shippingCode) {
        if (shippingCode != null)
            shippingCode = shippingCode.trim();
        this.shippingCode = shippingCode;
        return this;
    }

    public String getShippingName() {
        return shippingName;
    }

    public AuctionRefundInfo setShippingName(String shippingName) {
        if (shippingName != null)
            shippingName = shippingName.trim();
        this.shippingName = shippingName;
        return this;
    }

    public String getShippingNum() {
        return shippingNum;
    }

    public AuctionRefundInfo setShippingNum(String shippingNum) {
        if (shippingNum != null)
            shippingNum = shippingNum.trim();
        this.shippingNum = shippingNum;
        return this;
    }

    public Date getReturnTime() {
        return returnTime;
    }

    public AuctionRefundInfo setReturnTime(Date returnTime) {
        this.returnTime = returnTime;
        return this;
    }

    public Date getReceiveTime() {
        return receiveTime;
    }

    public AuctionRefundInfo setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
        return this;
    }

    public String getReceiver() {
        return receiver;
    }

    public AuctionRefundInfo setReceiver(String receiver) {
        if (receiver != null)
            receiver = receiver.trim();
        this.receiver = receiver;
        return this;
    }

    public String getReceiverCode() {
        return receiverCode;
    }

    public AuctionRefundInfo setReceiverCode(String receiverCode) {
        if (receiverCode != null)
            receiverCode = receiverCode.trim();
        this.receiverCode = receiverCode;
        return this;
    }

    public String getReceiverMobile() {
        return receiverMobile;
    }

    public AuctionRefundInfo setReceiverMobile(String receiverMobile) {
        if (receiverMobile != null)
            receiverMobile = receiverMobile.trim();
        this.receiverMobile = receiverMobile;
        return this;
    }

    public String getReceiverAreaName() {
        return receiverAreaName;
    }

    public AuctionRefundInfo setReceiverAreaName(String receiverAreaName) {
        if (receiverAreaName != null)
            receiverAreaName = receiverAreaName.trim();
        this.receiverAreaName = receiverAreaName;
        return this;
    }

    public String getSender() {
        return sender;
    }

    public AuctionRefundInfo setSender(String sender) {
        if (sender != null)
            sender = sender.trim();
        this.sender = sender;
        return this;
    }

    public String getSenderCode() {
        return senderCode;
    }

    public AuctionRefundInfo setSenderCode(String senderCode) {
        if (senderCode != null)
            senderCode = senderCode.trim();
        this.senderCode = senderCode;
        return this;
    }

    public String getSenderMobile() {
        return senderMobile;
    }

    public AuctionRefundInfo setSenderMobile(String senderMobile) {
        if (senderMobile != null)
            senderMobile = senderMobile.trim();
        this.senderMobile = senderMobile;
        return this;
    }

    public String getSenderAreaName() {
        return senderAreaName;
    }

    public AuctionRefundInfo setSenderAreaName(String senderAreaName) {
        if (senderAreaName != null)
            senderAreaName = senderAreaName.trim();
        this.senderAreaName = senderAreaName;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public AuctionRefundInfo setComment(String comment) {
        if (comment != null)
            comment = comment.trim();
        this.comment = comment;
        return this;
    }

    public String getCredence() {
        return credence;
    }

    public AuctionRefundInfo setCredence(String credence) {
        if (credence != null)
            credence = credence.trim();
        this.credence = credence;
        return this;
    }

    public String getRefundReason() {
        return refundReason;
    }

    public AuctionRefundInfo setRefundReason(String refundReason) {
        if (refundReason != null)
            refundReason = refundReason.trim();
        this.refundReason = refundReason;
        return this;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public AuctionRefundInfo setOrderCode(String orderCode) {
        if (orderCode != null)
            orderCode = orderCode.trim();
        this.orderCode = orderCode;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_refund_info";
    public static final String ID = "id";

    /**
     * 退款单号
     */
    public static final String REFUND_CODE = "refund_code";

    /**
     * 订单标识
     */
    public static final String ORDER_ID = "order_id";

    /**
     * 退款金额 单位:分
     */
    public static final String MONEY = "money";

    /**
     * 退款类型  1-退款 2-退货退款
     */
    public static final String TYPE = "type";

    /**
     * 状态 1-申请退款 2-同意退货 4-买家已发货 8-退款成功 16-拒绝 32-失效 64-介入中 128-平台拒绝
     */
    public static final String STATUS = "status";

    /**
     * 申请次数
     */
    public static final String APPLICATION_NUM = "application_num";

    /**
     * 是否平台介入
     */
    public static final String INTERVENE = "intervene";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 修改时间
     */
    public static final String MODIFY_TIME = "modify_time";

    /**
     * 申请退款时间
     */
    public static final String REFUND_TIME = "refund_time";

    /**
     * 同意退货时间
     */
    public static final String AGREE_RETURN_TIME = "agree_return_time";

    /**
     * 退款成功时间
     */
    public static final String END_TIME = "end_time";

    /**
     * 平台判定生效时间
     */
    public static final String JUDGE_TIME = "judge_time";

    /**
     * 物流编码
     */
    public static final String SHIPPING_CODE = "shipping_code";

    /**
     * 物流名称
     */
    public static final String SHIPPING_NAME = "shipping_name";

    /**
     * 物流单号
     */
    public static final String SHIPPING_NUM = "shipping_num";

    /**
     * 退货时间
     */
    public static final String RETURN_TIME = "return_time";

    /**
     * 收货时间
     */
    public static final String RECEIVE_TIME = "receive_time";

    /**
     * 收货人
     */
    public static final String RECEIVER = "receiver";

    /**
     * 收货人邮编
     */
    public static final String RECEIVER_CODE = "receiver_code";

    /**
     * 收货人手机号
     */
    public static final String RECEIVER_MOBILE = "receiver_mobile";

    /**
     * 收货人地址
     */
    public static final String RECEIVER_AREA_NAME = "receiver_area_name";

    /**
     * 发件人
     */
    public static final String SENDER = "sender";

    /**
     * 发件人邮编
     */
    public static final String SENDER_CODE = "sender_code";

    /**
     * 发件人手机号
     */
    public static final String SENDER_MOBILE = "sender_mobile";

    /**
     * 发件人地址
     */
    public static final String SENDER_AREA_NAME = "sender_area_name";

    /**
     * 退款说明
     */
    public static final String COMMENT = "comment";

    /**
     * 退款凭证
     */
    public static final String CREDENCE = "credence";

    /**
     * 退款原因
     */
    public static final String REFUND_REASON = "refund_reason";

    /**
     * 订单单号
     */
    public static final String ORDER_CODE = "order_code";

    @Override
    public AuctionRefundInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}
