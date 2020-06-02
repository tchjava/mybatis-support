package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 订单拓展表
 * </p>
 *
 * @author Gaby
 * @since 2020-06-02
 */
@TableName("order_ext_info")
public class OrderExtInfo implements Serializable, IEntity {


    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    @TableField("order_id")
    private Long orderId;
    /**
     * 标记颜色
     */
    @TableField("flag_color")
    private String flagColor;
    /**
     * 商品描述
     */
    private String content;


    public Long getId() {
        return id;
    }

    public OrderExtInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getOrderId() {
        return orderId;
    }

    public OrderExtInfo setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }

    public String getFlagColor() {
        return flagColor;
    }

    public OrderExtInfo setFlagColor(String flagColor) {
        if (flagColor != null)
            flagColor = flagColor.trim();
        this.flagColor = flagColor;
        return this;
    }

    public String getContent() {
        return content;
    }

    public OrderExtInfo setContent(String content) {
        if (content != null)
            content = content.trim();
        this.content = content;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "order_ext_info";
    public static final String ID = "id";

    public static final String ORDER_ID = "order_id";

    /**
     * 标记颜色
     */
    public static final String FLAG_COLOR = "flag_color";

    /**
     * 商品描述
     */
    public static final String CONTENT = "content";


    @Override
    public OrderExtInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

