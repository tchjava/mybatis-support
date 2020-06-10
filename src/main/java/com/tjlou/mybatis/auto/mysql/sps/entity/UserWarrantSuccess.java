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
 * 拍卖-保证金缴纳成功记录表
 * </p>
 *
 * @author Gaby
 * @since 2020-06-10
 */
@TableName("user_warrant_success")
public class UserWarrantSuccess implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 保证金标识
     */
    @TableField("warrant_id")
    private Long warrantId;
    /**
     * 用户标识
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 剩余金额 单位：分
     */
    private Long balance;
    /**
     * 单笔金额 单位：分
     */
    private Long total;
    /**
     * 支付类型 1-微信支付 2-余额支付
     */
    @TableField("pay_type")
    private Integer payType;
    /**
     * 提现次数
     */
    @TableField("thaw_num")
    private Integer thawNum;
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
     * 状态 00A-有效 00B-提现中 00C-已提现  00Z-失效
     */
    private String status;
    /**
     * 交易号
     */
    @TableField("transaction_id")
    private String transactionId;
    /**
     * 退款单号 可能多个
     */
    @TableField("refund_code")
    private String refundCode;


    public Long getId() {
        return id;
    }

    public UserWarrantSuccess setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getWarrantId() {
        return warrantId;
    }

    public UserWarrantSuccess setWarrantId(Long warrantId) {
        this.warrantId = warrantId;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public UserWarrantSuccess setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Long getBalance() {
        return balance;
    }

    public UserWarrantSuccess setBalance(Long balance) {
        this.balance = balance;
        return this;
    }

    public Long getTotal() {
        return total;
    }

    public UserWarrantSuccess setTotal(Long total) {
        this.total = total;
        return this;
    }

    public Integer getPayType() {
        return payType;
    }

    public UserWarrantSuccess setPayType(Integer payType) {
        this.payType = payType;
        return this;
    }

    public Integer getThawNum() {
        return thawNum;
    }

    public UserWarrantSuccess setThawNum(Integer thawNum) {
        this.thawNum = thawNum;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public UserWarrantSuccess setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public UserWarrantSuccess setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public UserWarrantSuccess setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public UserWarrantSuccess setTransactionId(String transactionId) {
        if (transactionId != null)
            transactionId = transactionId.trim();
        this.transactionId = transactionId;
        return this;
    }

    public String getRefundCode() {
        return refundCode;
    }

    public UserWarrantSuccess setRefundCode(String refundCode) {
        if (refundCode != null)
            refundCode = refundCode.trim();
        this.refundCode = refundCode;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "user_warrant_success";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 保证金标识
     */
    public static final String WARRANT_ID = "warrant_id";

    /**
     * 用户标识
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 剩余金额 单位：分
     */
    public static final String BALANCE = "balance";

    /**
     * 单笔金额 单位：分
     */
    public static final String TOTAL = "total";

    /**
     * 支付类型 1-微信支付 2-余额支付
     */
    public static final String PAY_TYPE = "pay_type";

    /**
     * 提现次数
     */
    public static final String THAW_NUM = "thaw_num";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 修改时间
     */
    public static final String MODIFY_TIME = "modify_time";

    /**
     * 状态 00A-有效 00B-提现中 00C-已提现  00Z-失效
     */
    public static final String STATUS = "status";

    /**
     * 交易号
     */
    public static final String TRANSACTION_ID = "transaction_id";

    /**
     * 退款单号 可能多个
     */
    public static final String REFUND_CODE = "refund_code";


    @Override
    public UserWarrantSuccess pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

