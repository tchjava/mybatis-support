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
 * 商家消保缴纳日志
 * </p>
 *
 * @author Gaby
 * @since 2019-07-24
 */
@TableName("supplier_warrant_log")
public class SupplierWarrantLog implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
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
     * 消保标识
     */
    @TableField("warrant_id")
    private Long warrantId;
    /**
     * 变动金额 单位:分
     */
    @TableField("change_num")
    private Integer changeNum;
    /**
     * 结余金额 单位:分
     */
    @TableField("balance_num")
    private Integer balanceNum;
    /**
     * 变动类型   1-首次  2-追加  4-退消
     */
    @TableField("change_type")
    private Integer changeType;
    /**
     * 变动时间
     */
    @TableField("change_time")
    private Date changeTime;
    /**
     * 状态 00A-已缴纳 00B-待审核 00Z-退保
     */
    private String status;
    /**
     * 备注
     */
    private String comment;
    /**
     * 缴纳订单号
     */
    @TableField("warrant_no")
    private String warrantNo;

    public Long getId() {
        return id;
    }

    public SupplierWarrantLog setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public SupplierWarrantLog setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public SupplierWarrantLog setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Long getWarrantId() {
        return warrantId;
    }

    public SupplierWarrantLog setWarrantId(Long warrantId) {
        this.warrantId = warrantId;
        return this;
    }

    public Integer getChangeNum() {
        return changeNum;
    }

    public SupplierWarrantLog setChangeNum(Integer changeNum) {
        this.changeNum = changeNum;
        return this;
    }

    public Integer getBalanceNum() {
        return balanceNum;
    }

    public SupplierWarrantLog setBalanceNum(Integer balanceNum) {
        this.balanceNum = balanceNum;
        return this;
    }

    public Integer getChangeType() {
        return changeType;
    }

    public SupplierWarrantLog setChangeType(Integer changeType) {
        this.changeType = changeType;
        return this;
    }

    public Date getChangeTime() {
        return changeTime;
    }

    public SupplierWarrantLog setChangeTime(Date changeTime) {
        this.changeTime = changeTime;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public SupplierWarrantLog setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public SupplierWarrantLog setComment(String comment) {
        if (comment != null)
            comment = comment.trim();
        this.comment = comment;
        return this;
    }

    public String getWarrantNo() {
        return warrantNo;
    }

    public SupplierWarrantLog setWarrantNo(String warrantNo) {
        if (warrantNo != null)
            warrantNo = warrantNo.trim();
        this.warrantNo = warrantNo;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "supplier_warrant_log";
    public static final String ID = "id";

    /**
     * 供货商标识
     */
    public static final String SUPPLIER_ID = "supplier_id";

    /**
     * 用户标识
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 消保标识
     */
    public static final String WARRANT_ID = "warrant_id";

    /**
     * 变动金额 单位:分
     */
    public static final String CHANGE_NUM = "change_num";

    /**
     * 结余金额 单位:分
     */
    public static final String BALANCE_NUM = "balance_num";

    /**
     * 变动类型   1-首次  2-追加  4-退消
     */
    public static final String CHANGE_TYPE = "change_type";

    /**
     * 变动时间
     */
    public static final String CHANGE_TIME = "change_time";

    /**
     * 状态 00A-已缴纳 00B-待审核 00Z-退保
     */
    public static final String STATUS = "status";

    /**
     * 备注
     */
    public static final String COMMENT = "comment";

    /**
     * 缴纳订单号
     */
    public static final String WARRANT_NO = "warrant_no";

    @Override
    public SupplierWarrantLog pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

