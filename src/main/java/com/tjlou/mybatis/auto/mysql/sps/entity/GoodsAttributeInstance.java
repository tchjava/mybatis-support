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
 * 商品属性实例表
 * </p>
 *
 * @author Gaby
 * @since 2019-06-13
 */
@TableName("goods_attribute_instance")
public class GoodsAttributeInstance implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 商品标识
     */
    @TableField("goods_id")
    private Long goodsId;
    /**
     * 属性规则标识
     */
    @TableField("attribute_id")
    private Long attributeId;
    /**
     * 店铺ID
     */
    private String shopUri;
    /**
     * 属性名称
     */
    private String name;
    /**
     * 属性值
     */
    private String value;
    /**
     * 创建时间
     */
    private Date intime;

    public Long getId() {
        return id;
    }

    public GoodsAttributeInstance setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public GoodsAttributeInstance setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
        return this;
    }

    public Long getAttributeId() {
        return attributeId;
    }

    public GoodsAttributeInstance setAttributeId(Long attributeId) {
        this.attributeId = attributeId;
        return this;
    }

    public String getShopUri() {
        return shopUri;
    }

    public GoodsAttributeInstance setShopUri(String shopUri) {
        if (shopUri != null)
            shopUri = shopUri.trim();
        this.shopUri = shopUri;
        return this;
    }

    public String getName() {
        return name;
    }

    public GoodsAttributeInstance setName(String name) {
        if (name != null)
            name = name.trim();
        this.name = name;
        return this;
    }

    public String getValue() {
        return value;
    }

    public GoodsAttributeInstance setValue(String value) {
        if (value != null)
            value = value.trim();
        this.value = value;
        return this;
    }

    public Date getIntime() {
        return intime;
    }

    public GoodsAttributeInstance setIntime(Date intime) {
        this.intime = intime;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "goods_attribute_instance";
    public static final String ID = "id";

    /**
     * 商品标识
     */
    public static final String GOODS_ID = "goods_id";

    /**
     * 属性规则标识
     */
    public static final String ATTRIBUTE_ID = "attribute_id";

    /**
     * 店铺ID
     */
    public static final String SHOPURI = "shopUri";

    /**
     * 属性名称
     */
    public static final String NAME = "name";

    /**
     * 属性值
     */
    public static final String VALUE = "value";

    /**
     * 创建时间
     */
    public static final String INTIME = "intime";

    @Override
    public GoodsAttributeInstance pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

