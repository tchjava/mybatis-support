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
 * 借货清单退回记录
 * </p>
 *
 * @author Gaby
 * @since 2020-04-29
 */
@TableName("borrow_back_log")
public class BorrowBackLog implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 清单标识
     */
    @TableField("inventory_id")
    private Long inventoryId;
    /**
     * 状态 1-申请退回 2-已退回 4-拒绝退回 8-申请关闭
     */
    private Integer status;
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
     * 申请时间
     */
    @TableField("application_time")
    private Date applicationTime;
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
     * 配送方式 1-在线交易 2-送货上门
     */
    @TableField("transaction_type")
    private Integer transactionType;
    /**
     * 备注
     */
    private String comment;
    /**
     * 申请次数
     */
    @TableField("application_num")
    private Integer applicationNum;


    public Long getId() {
        return id;
    }

    public BorrowBackLog setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getInventoryId() {
        return inventoryId;
    }

    public BorrowBackLog setInventoryId(Long inventoryId) {
        this.inventoryId = inventoryId;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public BorrowBackLog setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public BorrowBackLog setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public BorrowBackLog setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }

    public Date getApplicationTime() {
        return applicationTime;
    }

    public BorrowBackLog setApplicationTime(Date applicationTime) {
        this.applicationTime = applicationTime;
        return this;
    }

    public String getShippingName() {
        return shippingName;
    }

    public BorrowBackLog setShippingName(String shippingName) {
        if (shippingName != null)
            shippingName = shippingName.trim();
        this.shippingName = shippingName;
        return this;
    }

    public String getShippingCode() {
        return shippingCode;
    }

    public BorrowBackLog setShippingCode(String shippingCode) {
        if (shippingCode != null)
            shippingCode = shippingCode.trim();
        this.shippingCode = shippingCode;
        return this;
    }

    public String getShippingNum() {
        return shippingNum;
    }

    public BorrowBackLog setShippingNum(String shippingNum) {
        if (shippingNum != null)
            shippingNum = shippingNum.trim();
        this.shippingNum = shippingNum;
        return this;
    }

    public Integer getTransactionType() {
        return transactionType;
    }

    public BorrowBackLog setTransactionType(Integer transactionType) {
        this.transactionType = transactionType;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public BorrowBackLog setComment(String comment) {
        if (comment != null)
            comment = comment.trim();
        this.comment = comment;
        return this;
    }

    public Integer getApplicationNum() {
        return applicationNum;
    }

    public BorrowBackLog setApplicationNum(Integer applicationNum) {
        this.applicationNum = applicationNum;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "borrow_back_log";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 清单标识
     */
    public static final String INVENTORY_ID = "inventory_id";

    /**
     * 状态 1-申请退回 2-已退回 4-拒绝退回 8-申请关闭
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
     * 申请时间
     */
    public static final String APPLICATION_TIME = "application_time";

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
     * 配送方式 1-在线交易 2-送货上门
     */
    public static final String TRANSACTION_TYPE = "transaction_type";

    /**
     * 备注
     */
    public static final String COMMENT = "comment";

    /**
     * 申请次数
     */
    public static final String APPLICATION_NUM = "application_num";


    @Override
    public BorrowBackLog pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

