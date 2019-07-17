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
 * 抽点信息表
 * </p>
 *
 * @author Gaby
 * @since 2019-07-17
 */
@TableName("draw_info")
public class DrawInfo implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 订单标识
     */
    @TableField("order_id")
    private String orderId;
    /**
     * 平台抽点数
     */
    @TableField("platform_draw")
    private Integer platformDraw;
    /**
     * 供货商抽点数
     */
    @TableField("supplier_draw")
    private Integer supplierDraw;
    /**
     * 代理抽点数
     */
    @TableField("agent_draw")
    private Integer agentDraw;
    /**
     * 状态  00A-有效   00Z-失效
     */
    private String status;
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

    public Integer getId() {
        return id;
    }

    public DrawInfo setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getOrderId() {
        return orderId;
    }

    public DrawInfo setOrderId(String orderId) {
        if (orderId != null)
            orderId = orderId.trim();
        this.orderId = orderId;
        return this;
    }

    public Integer getPlatformDraw() {
        return platformDraw;
    }

    public DrawInfo setPlatformDraw(Integer platformDraw) {
        this.platformDraw = platformDraw;
        return this;
    }

    public Integer getSupplierDraw() {
        return supplierDraw;
    }

    public DrawInfo setSupplierDraw(Integer supplierDraw) {
        this.supplierDraw = supplierDraw;
        return this;
    }

    public Integer getAgentDraw() {
        return agentDraw;
    }

    public DrawInfo setAgentDraw(Integer agentDraw) {
        this.agentDraw = agentDraw;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public DrawInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public DrawInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public DrawInfo setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "draw_info";
    public static final String ID = "id";

    /**
     * 订单标识
     */
    public static final String ORDER_ID = "order_id";

    /**
     * 平台抽点数
     */
    public static final String PLATFORM_DRAW = "platform_draw";

    /**
     * 供货商抽点数
     */
    public static final String SUPPLIER_DRAW = "supplier_draw";

    /**
     * 代理抽点数
     */
    public static final String AGENT_DRAW = "agent_draw";

    /**
     * 状态  00A-有效   00Z-失效
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

    @Override
    public DrawInfo pkVal(Serializable val) {
        this.id = Integer.valueOf(val.toString());
        return this;
    }
}

