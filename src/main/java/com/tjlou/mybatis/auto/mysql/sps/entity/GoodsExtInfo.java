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
 * @since 2020-05-22
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
    /**
     * 超级购活动权重值
     */
    @TableField("cjg_weight")
    private Double cjgWeight;
    /**
     * 精选好货活动权重值
     */
    @TableField("jxhh_weight")
    private Double jxhhWeight;
    /**
     * 超人气活动权重值
     */
    @TableField("crq_weight")
    private Double crqWeight;
    /**
     * 商品权重
     */
    private Double weight;
    /**
     * 商品热度值
     */
    private Integer heat;
    /**
     * 商品基础分
     */
    @TableField("base_score")
    private Integer baseScore;
    /**
     * 存储属性的值
     */
    @TableField("attribute_value")
    private String attributeValue;


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

    public Double getCjgWeight() {
        return cjgWeight;
    }

    public GoodsExtInfo setCjgWeight(Double cjgWeight) {
        this.cjgWeight = cjgWeight;
        return this;
    }

    public Double getJxhhWeight() {
        return jxhhWeight;
    }

    public GoodsExtInfo setJxhhWeight(Double jxhhWeight) {
        this.jxhhWeight = jxhhWeight;
        return this;
    }

    public Double getCrqWeight() {
        return crqWeight;
    }

    public GoodsExtInfo setCrqWeight(Double crqWeight) {
        this.crqWeight = crqWeight;
        return this;
    }

    public Double getWeight() {
        return weight;
    }

    public GoodsExtInfo setWeight(Double weight) {
        this.weight = weight;
        return this;
    }

    public Integer getHeat() {
        return heat;
    }

    public GoodsExtInfo setHeat(Integer heat) {
        this.heat = heat;
        return this;
    }

    public Integer getBaseScore() {
        return baseScore;
    }

    public GoodsExtInfo setBaseScore(Integer baseScore) {
        this.baseScore = baseScore;
        return this;
    }

    public String getAttributeValue() {
        return attributeValue;
    }

    public GoodsExtInfo setAttributeValue(String attributeValue) {
        if (attributeValue != null)
            attributeValue = attributeValue.trim();
        this.attributeValue = attributeValue;
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

    /**
     * 超级购活动权重值
     */
    public static final String CJG_WEIGHT = "cjg_weight";

    /**
     * 精选好货活动权重值
     */
    public static final String JXHH_WEIGHT = "jxhh_weight";

    /**
     * 超人气活动权重值
     */
    public static final String CRQ_WEIGHT = "crq_weight";

    /**
     * 商品权重
     */
    public static final String WEIGHT = "weight";

    /**
     * 商品热度值
     */
    public static final String HEAT = "heat";

    /**
     * 商品基础分
     */
    public static final String BASE_SCORE = "base_score";

    /**
     * 存储属性的值
     */
    public static final String ATTRIBUTE_VALUE = "attribute_value";


    @Override
    public GoodsExtInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

