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
 * 商家审核日志表
 * </p>
 *
 * @author Gaby
 * @since 2020-03-26
 */
@TableName("supplier_check_log")
public class SupplierCheckLog implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 商家标识
     */
    @TableField("supplier_id")
    private Long supplierId;
    /**
     * 申请时间
     */
    @TableField("application_time")
    private Date applicationTime;
    /**
     * 审核时间
     */
    @TableField("check_time")
    private Date checkTime;
    /**
     * 审核状态
     */
    @TableField("check_status")
    private String checkStatus;
    /**
     * 审核原因
     */
    private String reason;


    public Long getId() {
        return id;
    }

    public SupplierCheckLog setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public SupplierCheckLog setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
        return this;
    }

    public Date getApplicationTime() {
        return applicationTime;
    }

    public SupplierCheckLog setApplicationTime(Date applicationTime) {
        this.applicationTime = applicationTime;
        return this;
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public SupplierCheckLog setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
        return this;
    }

    public String getCheckStatus() {
        return checkStatus;
    }

    public SupplierCheckLog setCheckStatus(String checkStatus) {
        if (checkStatus != null)
            checkStatus = checkStatus.trim();
        this.checkStatus = checkStatus;
        return this;
    }

    public String getReason() {
        return reason;
    }

    public SupplierCheckLog setReason(String reason) {
        if (reason != null)
            reason = reason.trim();
        this.reason = reason;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "supplier_check_log";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 商家标识
     */
    public static final String SUPPLIER_ID = "supplier_id";

    /**
     * 申请时间
     */
    public static final String APPLICATION_TIME = "application_time";

    /**
     * 审核时间
     */
    public static final String CHECK_TIME = "check_time";

    /**
     * 审核状态
     */
    public static final String CHECK_STATUS = "check_status";

    /**
     * 审核原因
     */
    public static final String REASON = "reason";


    @Override
    public SupplierCheckLog pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

