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
 * 鉴定订单信息表
 * </p>
 *
 * @author Gaby
 * @since 2020-09-29
 */
@TableName("auction_check_up_info")
public class AuctionCheckUpInfo implements Serializable, IEntity {


    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 订单标识
     */
    @TableField("order_id")
    private Long orderId;
    /**
     * 订单号
     */
    @TableField("order_code")
    private String orderCode;
    /**
     * 鉴定单号
     */
    @TableField("check_order")
    private String checkOrder;
    /**
     * 鉴定时间
     */
    @TableField("check_time")
    private Date checkTime;
    /**
     * 鉴定状态 1-申请鉴定  2-已发出  4-已完成  8-已退回
     */
    @TableField("check_status")
    private Long checkStatus;
    /**
     * 鉴定服务费(单位:分)
     */
    @TableField("check_up_price")
    private Long checkUpPrice;
    /**
     * 鉴定服务费是否已退回
     */
    @TableField("check_refund")
    private Integer checkRefund;
    /**
     * 退回方式   1-卖家承担    2-鉴定费用买家承担  3.鉴定费用平台承担
     */
    @TableField("return_mode")
    private Integer returnMode;
    /**
     * 退回类型  1-直接退款 2-退款退货
     */
    @TableField("return_type")
    private Integer returnType;
    /**
     * 置前发货时间
     */
    @TableField("prefix_consign_time")
    private Date prefixConsignTime;
    /**
     * 置后发货时间
     */
    @TableField("suffix_consign_time")
    private Date suffixConsignTime;
    /**
     * 置前快递单号
     */
    @TableField("prefix_shipping_num")
    private String prefixShippingNum;
    /**
     * 置前快递名称
     */
    @TableField("prefix_shipping_name")
    private String prefixShippingName;
    /**
     * 置前快递编码
     */
    @TableField("prefix_shipping_code")
    private String prefixShippingCode;
    /**
     * 置后快递单号
     */
    @TableField("suffix_shipping_num")
    private String suffixShippingNum;
    /**
     * 置后快递名称
     */
    @TableField("suffix_shipping_name")
    private String suffixShippingName;
    /**
     * 置后快递编码
     */
    @TableField("suffix_shipping_code")
    private String suffixShippingCode;
    /**
     * 退回时间
     */
    @TableField("return_time")
    private Date returnTime;


    public Long getId() {
        return id;
    }

    public AuctionCheckUpInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getOrderId() {
        return orderId;
    }

    public AuctionCheckUpInfo setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public AuctionCheckUpInfo setOrderCode(String orderCode) {
        if (orderCode != null)
            orderCode = orderCode.trim();
        this.orderCode = orderCode;
        return this;
    }

    public String getCheckOrder() {
        return checkOrder;
    }

    public AuctionCheckUpInfo setCheckOrder(String checkOrder) {
        if (checkOrder != null)
            checkOrder = checkOrder.trim();
        this.checkOrder = checkOrder;
        return this;
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public AuctionCheckUpInfo setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
        return this;
    }

    public Long getCheckStatus() {
        return checkStatus;
    }

    public AuctionCheckUpInfo setCheckStatus(Long checkStatus) {
        this.checkStatus = checkStatus;
        return this;
    }

    public Long getCheckUpPrice() {
        return checkUpPrice;
    }

    public AuctionCheckUpInfo setCheckUpPrice(Long checkUpPrice) {
        this.checkUpPrice = checkUpPrice;
        return this;
    }

    public Integer getCheckRefund() {
        return checkRefund;
    }

    public AuctionCheckUpInfo setCheckRefund(Integer checkRefund) {
        this.checkRefund = checkRefund;
        return this;
    }

    public Integer getReturnMode() {
        return returnMode;
    }

    public AuctionCheckUpInfo setReturnMode(Integer returnMode) {
        this.returnMode = returnMode;
        return this;
    }

    public Integer getReturnType() {
        return returnType;
    }

    public AuctionCheckUpInfo setReturnType(Integer returnType) {
        this.returnType = returnType;
        return this;
    }

    public Date getPrefixConsignTime() {
        return prefixConsignTime;
    }

    public AuctionCheckUpInfo setPrefixConsignTime(Date prefixConsignTime) {
        this.prefixConsignTime = prefixConsignTime;
        return this;
    }

    public Date getSuffixConsignTime() {
        return suffixConsignTime;
    }

    public AuctionCheckUpInfo setSuffixConsignTime(Date suffixConsignTime) {
        this.suffixConsignTime = suffixConsignTime;
        return this;
    }

    public String getPrefixShippingNum() {
        return prefixShippingNum;
    }

    public AuctionCheckUpInfo setPrefixShippingNum(String prefixShippingNum) {
        if (prefixShippingNum != null)
            prefixShippingNum = prefixShippingNum.trim();
        this.prefixShippingNum = prefixShippingNum;
        return this;
    }

    public String getPrefixShippingName() {
        return prefixShippingName;
    }

    public AuctionCheckUpInfo setPrefixShippingName(String prefixShippingName) {
        if (prefixShippingName != null)
            prefixShippingName = prefixShippingName.trim();
        this.prefixShippingName = prefixShippingName;
        return this;
    }

    public String getPrefixShippingCode() {
        return prefixShippingCode;
    }

    public AuctionCheckUpInfo setPrefixShippingCode(String prefixShippingCode) {
        if (prefixShippingCode != null)
            prefixShippingCode = prefixShippingCode.trim();
        this.prefixShippingCode = prefixShippingCode;
        return this;
    }

    public String getSuffixShippingNum() {
        return suffixShippingNum;
    }

    public AuctionCheckUpInfo setSuffixShippingNum(String suffixShippingNum) {
        if (suffixShippingNum != null)
            suffixShippingNum = suffixShippingNum.trim();
        this.suffixShippingNum = suffixShippingNum;
        return this;
    }

    public String getSuffixShippingName() {
        return suffixShippingName;
    }

    public AuctionCheckUpInfo setSuffixShippingName(String suffixShippingName) {
        if (suffixShippingName != null)
            suffixShippingName = suffixShippingName.trim();
        this.suffixShippingName = suffixShippingName;
        return this;
    }

    public String getSuffixShippingCode() {
        return suffixShippingCode;
    }

    public AuctionCheckUpInfo setSuffixShippingCode(String suffixShippingCode) {
        if (suffixShippingCode != null)
            suffixShippingCode = suffixShippingCode.trim();
        this.suffixShippingCode = suffixShippingCode;
        return this;
    }

    public Date getReturnTime() {
        return returnTime;
    }

    public AuctionCheckUpInfo setReturnTime(Date returnTime) {
        this.returnTime = returnTime;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_check_up_info";
    public static final String ID = "id";

    /**
     * 订单标识
     */
    public static final String ORDER_ID = "order_id";

    /**
     * 订单号
     */
    public static final String ORDER_CODE = "order_code";

    /**
     * 鉴定单号
     */
    public static final String CHECK_ORDER = "check_order";

    /**
     * 鉴定时间
     */
    public static final String CHECK_TIME = "check_time";

    /**
     * 鉴定状态 1-申请鉴定  2-已发出  4-已完成  8-已退回
     */
    public static final String CHECK_STATUS = "check_status";

    /**
     * 鉴定服务费(单位:分)
     */
    public static final String CHECK_UP_PRICE = "check_up_price";

    /**
     * 鉴定服务费是否已退回
     */
    public static final String CHECK_REFUND = "check_refund";

    /**
     * 退回方式   1-卖家承担    2-鉴定费用买家承担  3.鉴定费用平台承担
     */
    public static final String RETURN_MODE = "return_mode";

    /**
     * 退回类型  1-直接退款 2-退款退货
     */
    public static final String RETURN_TYPE = "return_type";

    /**
     * 置前发货时间
     */
    public static final String PREFIX_CONSIGN_TIME = "prefix_consign_time";

    /**
     * 置后发货时间
     */
    public static final String SUFFIX_CONSIGN_TIME = "suffix_consign_time";

    /**
     * 置前快递单号
     */
    public static final String PREFIX_SHIPPING_NUM = "prefix_shipping_num";

    /**
     * 置前快递名称
     */
    public static final String PREFIX_SHIPPING_NAME = "prefix_shipping_name";

    /**
     * 置前快递编码
     */
    public static final String PREFIX_SHIPPING_CODE = "prefix_shipping_code";

    /**
     * 置后快递单号
     */
    public static final String SUFFIX_SHIPPING_NUM = "suffix_shipping_num";

    /**
     * 置后快递名称
     */
    public static final String SUFFIX_SHIPPING_NAME = "suffix_shipping_name";

    /**
     * 置后快递编码
     */
    public static final String SUFFIX_SHIPPING_CODE = "suffix_shipping_code";

    /**
     * 退回时间
     */
    public static final String RETURN_TIME = "return_time";


    @Override
    public AuctionCheckUpInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

