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
 * 退款周期表
 * </p>
 *
 * @author Gaby
 * @since 2019-07-16
 */
@TableName("refund_cycle_info")
public class RefundCycleInfo implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 退款标识
     */
    @TableField("refund_id")
    private Long refundId;
    /**
     * 订单标识
     */
    @TableField("order_id")
    private Long orderId;
    /**
     * 状态 1-申请退款 2-同意退货 4-买家已发货 8-退款成功 16-拒绝
     */
    private Integer status;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;

    public Long getId() {
        return id;
    }

    public RefundCycleInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getRefundId() {
        return refundId;
    }

    public RefundCycleInfo setRefundId(Long refundId) {
        this.refundId = refundId;
        return this;
    }

    public Long getOrderId() {
        return orderId;
    }

    public RefundCycleInfo setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public RefundCycleInfo setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public RefundCycleInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "refund_cycle_info";
    public static final String ID = "id";

    /**
     * 退款标识
     */
    public static final String REFUND_ID = "refund_id";

    /**
     * 订单标识
     */
    public static final String ORDER_ID = "order_id";

    /**
     * 状态 1-申请退款 2-同意退货 4-买家已发货 8-退款成功 16-拒绝
     */
    public static final String STATUS = "status";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    @Override
    public RefundCycleInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

