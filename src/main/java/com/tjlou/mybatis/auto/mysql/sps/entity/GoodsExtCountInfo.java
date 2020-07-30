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
 * @since 2020-07-30
 */
@TableName("goods_ext_count_info")
public class GoodsExtCountInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 仓库商品标识
     */
    @TableField("goods_id")
    private Long goodsId;
    /**
     * 引用次数
     */
    private Integer referenceNum;
    /**
     * 拓展字段1
     */
    @TableField("attr1_num")
    private Integer attr1Num;
    /**
     * 拓展字段2
     */
    @TableField("attr2_num")
    private Integer attr2Num;
    /**
     * 拓展字段3
     */
    @TableField("attr3_num")
    private Integer attr3Num;
    /**
     * 拓展字段4
     */
    @TableField("attr4_num")
    private Integer attr4Num;
    /**
     * 拓展字段5
     */
    @TableField("attr5_num")
    private Integer attr5Num;


    public Long getId() {
        return id;
    }

    public GoodsExtCountInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public GoodsExtCountInfo setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
        return this;
    }

    public Integer getReferenceNum() {
        return referenceNum;
    }

    public GoodsExtCountInfo setReferenceNum(Integer referenceNum) {
        this.referenceNum = referenceNum;
        return this;
    }

    public Integer getAttr1Num() {
        return attr1Num;
    }

    public GoodsExtCountInfo setAttr1Num(Integer attr1Num) {
        this.attr1Num = attr1Num;
        return this;
    }

    public Integer getAttr2Num() {
        return attr2Num;
    }

    public GoodsExtCountInfo setAttr2Num(Integer attr2Num) {
        this.attr2Num = attr2Num;
        return this;
    }

    public Integer getAttr3Num() {
        return attr3Num;
    }

    public GoodsExtCountInfo setAttr3Num(Integer attr3Num) {
        this.attr3Num = attr3Num;
        return this;
    }

    public Integer getAttr4Num() {
        return attr4Num;
    }

    public GoodsExtCountInfo setAttr4Num(Integer attr4Num) {
        this.attr4Num = attr4Num;
        return this;
    }

    public Integer getAttr5Num() {
        return attr5Num;
    }

    public GoodsExtCountInfo setAttr5Num(Integer attr5Num) {
        this.attr5Num = attr5Num;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "goods_ext_count_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 仓库商品标识
     */
    public static final String GOODS_ID = "goods_id";

    /**
     * 引用次数
     */
    public static final String REFERENCENUM = "referenceNum";

    /**
     * 拓展字段1
     */
    public static final String ATTR1_NUM = "attr1_num";

    /**
     * 拓展字段2
     */
    public static final String ATTR2_NUM = "attr2_num";

    /**
     * 拓展字段3
     */
    public static final String ATTR3_NUM = "attr3_num";

    /**
     * 拓展字段4
     */
    public static final String ATTR4_NUM = "attr4_num";

    /**
     * 拓展字段5
     */
    public static final String ATTR5_NUM = "attr5_num";


    @Override
    public GoodsExtCountInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

