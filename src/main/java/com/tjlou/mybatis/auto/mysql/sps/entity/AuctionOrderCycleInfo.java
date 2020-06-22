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
 * 拍卖-订单周期表
 * </p>
 *
 * @author Gaby
 * @since 2020-06-22
 */
@TableName("auction_order_cycle_info")
public class AuctionOrderCycleInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 所属订单
     */
    @TableField("order_id")
    private Long orderId;
    /**
     * 状态类型 1-正常订单 2-售后
     */
    @TableField("cycle_type")
    private Integer cycleType;
    /**
     * 状态  具体看所属类型的表信息中的状态
     */
    private Long status;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 退款凭证 图片数组 []
     */
    @TableField("credence_json")
    private String credenceJson;
    /**
     * 备注
     */
    private String comment;


    public Long getId() {
        return id;
    }

    public AuctionOrderCycleInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getOrderId() {
        return orderId;
    }

    public AuctionOrderCycleInfo setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }

    public Integer getCycleType() {
        return cycleType;
    }

    public AuctionOrderCycleInfo setCycleType(Integer cycleType) {
        this.cycleType = cycleType;
        return this;
    }

    public Long getStatus() {
        return status;
    }

    public AuctionOrderCycleInfo setStatus(Long status) {
        this.status = status;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public AuctionOrderCycleInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCredenceJson() {
        return credenceJson;
    }

    public AuctionOrderCycleInfo setCredenceJson(String credenceJson) {
        if (credenceJson != null)
            credenceJson = credenceJson.trim();
        this.credenceJson = credenceJson;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public AuctionOrderCycleInfo setComment(String comment) {
        if (comment != null)
            comment = comment.trim();
        this.comment = comment;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_order_cycle_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 所属订单
     */
    public static final String ORDER_ID = "order_id";

    /**
     * 状态类型 1-正常订单 2-售后
     */
    public static final String CYCLE_TYPE = "cycle_type";

    /**
     * 状态  具体看所属类型的表信息中的状态
     */
    public static final String STATUS = "status";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 退款凭证 图片数组 []
     */
    public static final String CREDENCE_JSON = "credence_json";

    /**
     * 备注
     */
    public static final String COMMENT = "comment";


    @Override
    public AuctionOrderCycleInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

