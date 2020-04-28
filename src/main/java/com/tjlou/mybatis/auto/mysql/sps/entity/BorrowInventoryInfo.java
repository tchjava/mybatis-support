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
 * 直播借货清单信息表
 * </p>
 *
 * @author Gaby
 * @since 2020-04-28
 */
@TableName("borrow_inventory_info")
public class BorrowInventoryInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 用户标识
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 快递单号
     */
    @TableField("shipping_num")
    private String shippingNum;
    /**
     * 快递编码
     */
    @TableField("shipping_code")
    private String shippingCode;
    /**
     * 快递名称
     */
    @TableField("shipping_name")
    private String shippingName;
    /**
     * 收货人
     */
    private String receiver;
    /**
     * 收货人邮政编码
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
     * 修改时间
     */
    @TableField("modify_time")
    private Date modifyTime;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
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
     * 退回时间
     */
    @TableField("return_time")
    private Date returnTime;
    /**
     * 总价 (单位:分)
     */
    private Long total;
    /**
     * 总数量
     */
    private Integer num;
    /**
     * 交易方式 1-在线交易  2-送货上门
     */
    @TableField("transaction_type")
    private Integer transactionType;
    /**
     * 状态 4-已发货 8-已确认 16-已退回 64-退货中 128-平台退回
     */
    private Integer status;
    /**
     * 站点店铺
     */
    @TableField("supplier_id")
    private Long supplierId;


    public Long getId() {
        return id;
    }

    public BorrowInventoryInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public BorrowInventoryInfo setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public String getShippingNum() {
        return shippingNum;
    }

    public BorrowInventoryInfo setShippingNum(String shippingNum) {
        if (shippingNum != null)
            shippingNum = shippingNum.trim();
        this.shippingNum = shippingNum;
        return this;
    }

    public String getShippingCode() {
        return shippingCode;
    }

    public BorrowInventoryInfo setShippingCode(String shippingCode) {
        if (shippingCode != null)
            shippingCode = shippingCode.trim();
        this.shippingCode = shippingCode;
        return this;
    }

    public String getShippingName() {
        return shippingName;
    }

    public BorrowInventoryInfo setShippingName(String shippingName) {
        if (shippingName != null)
            shippingName = shippingName.trim();
        this.shippingName = shippingName;
        return this;
    }

    public String getReceiver() {
        return receiver;
    }

    public BorrowInventoryInfo setReceiver(String receiver) {
        if (receiver != null)
            receiver = receiver.trim();
        this.receiver = receiver;
        return this;
    }

    public String getReceiverCode() {
        return receiverCode;
    }

    public BorrowInventoryInfo setReceiverCode(String receiverCode) {
        if (receiverCode != null)
            receiverCode = receiverCode.trim();
        this.receiverCode = receiverCode;
        return this;
    }

    public String getReceiverMobile() {
        return receiverMobile;
    }

    public BorrowInventoryInfo setReceiverMobile(String receiverMobile) {
        if (receiverMobile != null)
            receiverMobile = receiverMobile.trim();
        this.receiverMobile = receiverMobile;
        return this;
    }

    public String getReceiverAreaName() {
        return receiverAreaName;
    }

    public BorrowInventoryInfo setReceiverAreaName(String receiverAreaName) {
        if (receiverAreaName != null)
            receiverAreaName = receiverAreaName.trim();
        this.receiverAreaName = receiverAreaName;
        return this;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public BorrowInventoryInfo setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public BorrowInventoryInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getConsignTime() {
        return consignTime;
    }

    public BorrowInventoryInfo setConsignTime(Date consignTime) {
        this.consignTime = consignTime;
        return this;
    }

    public Date getEndTime() {
        return endTime;
    }

    public BorrowInventoryInfo setEndTime(Date endTime) {
        this.endTime = endTime;
        return this;
    }

    public Date getCloseTime() {
        return closeTime;
    }

    public BorrowInventoryInfo setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
        return this;
    }

    public Date getReturnTime() {
        return returnTime;
    }

    public BorrowInventoryInfo setReturnTime(Date returnTime) {
        this.returnTime = returnTime;
        return this;
    }

    public Long getTotal() {
        return total;
    }

    public BorrowInventoryInfo setTotal(Long total) {
        this.total = total;
        return this;
    }

    public Integer getNum() {
        return num;
    }

    public BorrowInventoryInfo setNum(Integer num) {
        this.num = num;
        return this;
    }

    public Integer getTransactionType() {
        return transactionType;
    }

    public BorrowInventoryInfo setTransactionType(Integer transactionType) {
        this.transactionType = transactionType;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public BorrowInventoryInfo setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public BorrowInventoryInfo setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "borrow_inventory_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 用户标识
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 快递单号
     */
    public static final String SHIPPING_NUM = "shipping_num";

    /**
     * 快递编码
     */
    public static final String SHIPPING_CODE = "shipping_code";

    /**
     * 快递名称
     */
    public static final String SHIPPING_NAME = "shipping_name";

    /**
     * 收货人
     */
    public static final String RECEIVER = "receiver";

    /**
     * 收货人邮政编码
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
     * 修改时间
     */
    public static final String MODIFY_TIME = "modify_time";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

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
     * 退回时间
     */
    public static final String RETURN_TIME = "return_time";

    /**
     * 总价 (单位:分)
     */
    public static final String TOTAL = "total";

    /**
     * 总数量
     */
    public static final String NUM = "num";

    /**
     * 交易方式 1-在线交易  2-送货上门
     */
    public static final String TRANSACTION_TYPE = "transaction_type";

    /**
     * 状态 4-已发货 8-已确认 16-已退回 64-退货中 128-平台退回
     */
    public static final String STATUS = "status";

    /**
     * 站点店铺
     */
    public static final String SUPPLIER_ID = "supplier_id";


    @Override
    public BorrowInventoryInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

