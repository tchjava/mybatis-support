package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author Gaby
 * @since 2020-07-09
 */
@TableName("auction_order_subsidy_info")
public class AuctionOrderSubsidyInfo implements Serializable, IEntity {


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
     * 补贴额度 (单位:分)
     */
    @TableField("subsidy_money")
    private Long subsidyMoney;


    public Long getId() {
        return id;
    }

    public AuctionOrderSubsidyInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getOrderId() {
        return orderId;
    }

    public AuctionOrderSubsidyInfo setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }

    public Long getSubsidyMoney() {
        return subsidyMoney;
    }

    public AuctionOrderSubsidyInfo setSubsidyMoney(Long subsidyMoney) {
        this.subsidyMoney = subsidyMoney;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_order_subsidy_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 所属订单
     */
    public static final String ORDER_ID = "order_id";

    /**
     * 补贴额度 (单位:分)
     */
    public static final String SUBSIDY_MONEY = "subsidy_money";


    @Override
    public AuctionOrderSubsidyInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

