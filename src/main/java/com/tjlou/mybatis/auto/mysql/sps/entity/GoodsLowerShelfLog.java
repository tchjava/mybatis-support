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
 * 商品下架记录表
 * </p>
 *
 * @author Gaby
 * @since 2020-03-27
 */
@TableName("goods_lower_shelf_log")
public class GoodsLowerShelfLog implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 商品标识
     */
    @TableField("goods_id")
    private Long goodsId;
    /**
     * 下架时间
     */
    @TableField("lower_shelf_time")
    private Date lowerShelfTime;
    /**
     * 原因
     */
    private String reason;
    /**
     * 00A-有效  00Z-失效
     */
    private String status;
    /**
     * 操作者
     */
    @TableField("operator_id")
    private Long operatorId;


    public Long getId() {
        return id;
    }

    public GoodsLowerShelfLog setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public GoodsLowerShelfLog setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
        return this;
    }

    public Date getLowerShelfTime() {
        return lowerShelfTime;
    }

    public GoodsLowerShelfLog setLowerShelfTime(Date lowerShelfTime) {
        this.lowerShelfTime = lowerShelfTime;
        return this;
    }

    public String getReason() {
        return reason;
    }

    public GoodsLowerShelfLog setReason(String reason) {
        if (reason != null)
            reason = reason.trim();
        this.reason = reason;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public GoodsLowerShelfLog setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    public Long getOperatorId() {
        return operatorId;
    }

    public GoodsLowerShelfLog setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "goods_lower_shelf_log";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 商品标识
     */
    public static final String GOODS_ID = "goods_id";

    /**
     * 下架时间
     */
    public static final String LOWER_SHELF_TIME = "lower_shelf_time";

    /**
     * 原因
     */
    public static final String REASON = "reason";

    /**
     * 00A-有效  00Z-失效
     */
    public static final String STATUS = "status";

    /**
     * 操作者
     */
    public static final String OPERATOR_ID = "operator_id";


    @Override
    public GoodsLowerShelfLog pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

