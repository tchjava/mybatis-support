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
 * 奖品订单周期表
 * </p>
 *
 * @author Gaby
 * @since 2019-09-06
 */
@TableName("prize_order_cycle_info")
public class PrizeOrderCycleInfo implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 订单标识
     */
    @TableField("order_id")
    private Long orderId;
    /**
     * 状态 状态 1-待确认  2-已确认 4-已发货 8-交易成功 16-交易关闭 32-已评价
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

    public PrizeOrderCycleInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getOrderId() {
        return orderId;
    }

    public PrizeOrderCycleInfo setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public PrizeOrderCycleInfo setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public PrizeOrderCycleInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "prize_order_cycle_info";
    public static final String ID = "id";

    /**
     * 订单标识
     */
    public static final String ORDER_ID = "order_id";

    /**
     * 状态 状态 1-待确认  2-已确认 4-已发货 8-交易成功 16-交易关闭 32-已评价
     */
    public static final String STATUS = "status";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    @Override
    public PrizeOrderCycleInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

