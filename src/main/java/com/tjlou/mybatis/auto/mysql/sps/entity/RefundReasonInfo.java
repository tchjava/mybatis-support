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
 * 退款原因信息表
 * </p>
 *
 * @author Gaby
 * @since 2020-03-24
 */
@TableName("refund_reason_info")
public class RefundReasonInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 原因
     */
    private String reason;
    /**
     * 是否退运费
     */
    @TableField("refund_freight")
    private Integer refundFreight;
    /**
     * 00A-有效 00Z-失效
     */
    private String status;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 排序
     */
    private Integer sort;


    public Long getId() {
        return id;
    }

    public RefundReasonInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getReason() {
        return reason;
    }

    public RefundReasonInfo setReason(String reason) {
        if (reason != null)
            reason = reason.trim();
        this.reason = reason;
        return this;
    }

    public Integer getRefundFreight() {
        return refundFreight;
    }

    public RefundReasonInfo setRefundFreight(Integer refundFreight) {
        this.refundFreight = refundFreight;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public RefundReasonInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public RefundReasonInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Integer getSort() {
        return sort;
    }

    public RefundReasonInfo setSort(Integer sort) {
        this.sort = sort;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "refund_reason_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 原因
     */
    public static final String REASON = "reason";

    /**
     * 是否退运费
     */
    public static final String REFUND_FREIGHT = "refund_freight";

    /**
     * 00A-有效 00Z-失效
     */
    public static final String STATUS = "status";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 排序
     */
    public static final String SORT = "sort";


    @Override
    public RefundReasonInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

