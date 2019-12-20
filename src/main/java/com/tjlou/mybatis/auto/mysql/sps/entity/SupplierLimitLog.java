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
 * 商家受限日志表
 * </p>
 *
 * @author Gaby
 * @since 2019-12-20
 */
@TableName("supplier_limit_log")
public class SupplierLimitLog implements Serializable, IEntity {


    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 商家用户标识
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 受限理由
     */
    private String reason;
    /**
     * 操作者
     */
    @TableField("operator_id")
    private Long operatorId;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 结束时间
     */
    @TableField("end_time")
    private Date endTime;
    /**
     * 限制到期时间
     */
    @TableField("limit_time")
    private Date limitTime;
    /**
     * 状态 00A 有效  00B 解除受限
     */
    private String status;


    public Long getId() {
        return id;
    }

    public SupplierLimitLog setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public SupplierLimitLog setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public String getReason() {
        return reason;
    }

    public SupplierLimitLog setReason(String reason) {
        if (reason != null)
            reason = reason.trim();
        this.reason = reason;
        return this;
    }

    public Long getOperatorId() {
        return operatorId;
    }

    public SupplierLimitLog setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public SupplierLimitLog setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getEndTime() {
        return endTime;
    }

    public SupplierLimitLog setEndTime(Date endTime) {
        this.endTime = endTime;
        return this;
    }

    public Date getLimitTime() {
        return limitTime;
    }

    public SupplierLimitLog setLimitTime(Date limitTime) {
        this.limitTime = limitTime;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public SupplierLimitLog setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "supplier_limit_log";
    public static final String ID = "id";

    /**
     * 商家用户标识
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 受限理由
     */
    public static final String REASON = "reason";

    /**
     * 操作者
     */
    public static final String OPERATOR_ID = "operator_id";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 结束时间
     */
    public static final String END_TIME = "end_time";

    /**
     * 限制到期时间
     */
    public static final String LIMIT_TIME = "limit_time";

    /**
     * 状态 00A 有效  00B 解除受限
     */
    public static final String STATUS = "status";


    @Override
    public SupplierLimitLog pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

