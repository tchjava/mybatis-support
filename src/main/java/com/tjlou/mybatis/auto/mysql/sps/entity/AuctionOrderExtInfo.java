package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 拍卖订单拓展表
 * </p>
 *
 * @author Gaby
 * @since 2020-08-11
 */
@TableName("auction_order_ext_info")
public class AuctionOrderExtInfo implements Serializable, IEntity {


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
     * 标记颜色
     */
    @TableField("flag_colr")
    private Long flagColr;
    /**
     * 备注
     */
    private String comment;


    public Long getId() {
        return id;
    }

    public AuctionOrderExtInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getOrderId() {
        return orderId;
    }

    public AuctionOrderExtInfo setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }

    public Long getFlagColr() {
        return flagColr;
    }

    public AuctionOrderExtInfo setFlagColr(Long flagColr) {
        this.flagColr = flagColr;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public AuctionOrderExtInfo setComment(String comment) {
        if (comment != null)
            comment = comment.trim();
        this.comment = comment;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_order_ext_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 所属订单
     */
    public static final String ORDER_ID = "order_id";

    /**
     * 标记颜色
     */
    public static final String FLAG_COLR = "flag_colr";

    /**
     * 备注
     */
    public static final String COMMENT = "comment";


    @Override
    public AuctionOrderExtInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

