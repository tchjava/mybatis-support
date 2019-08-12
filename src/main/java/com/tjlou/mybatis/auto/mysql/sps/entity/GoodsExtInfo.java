package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 商品扩展信息表
 * </p>
 *
 * @author Gaby
 * @since 2019-08-12
 */
@TableName("goods_ext_info")
public class GoodsExtInfo implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 商品标识
     */
    @TableField("goods_id")
    private Long goodsId;
    /**
     * 商品属性
     */
    @TableField("attribute_json")
    private String attributeJson;
    /**
     * 状态  00A-有效   00Z-失效
     */
    private String status;

    public Long getId() {
        return id;
    }

    public GoodsExtInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public GoodsExtInfo setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
        return this;
    }

    public String getAttributeJson() {
        return attributeJson;
    }

    public GoodsExtInfo setAttributeJson(String attributeJson) {
        if (attributeJson != null)
            attributeJson = attributeJson.trim();
        this.attributeJson = attributeJson;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public GoodsExtInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "goods_ext_info";
    public static final String ID = "id";

    /**
     * 商品标识
     */
    public static final String GOODS_ID = "goods_id";

    /**
     * 商品属性
     */
    public static final String ATTRIBUTE_JSON = "attribute_json";

    /**
     * 状态  00A-有效   00Z-失效
     */
    public static final String STATUS = "status";

    @Override
    public GoodsExtInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

