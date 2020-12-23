package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 拍卖-拍品权重系数表
 * </p>
 *
 * @author Gaby
 * @since 2020-12-23
 */
@TableName("auction_weight_product_ratio_info")
public class AuctionWeightProductRatioInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 系数类型   1-拍品访问人数  2-拍品访问次数            3-拍品分享人数 4-拍品分享进入人数 5-拍品出价人数 6.拍品出价次数 7.拍品被收藏人数  8-保证金金额
     */
    @TableField("ratio_type")
    private Integer ratioType;
    /**
     * 系数值
     */
    @TableField("ratio_value")
    private Double ratioValue;


    public Long getId() {
        return id;
    }

    public AuctionWeightProductRatioInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Integer getRatioType() {
        return ratioType;
    }

    public AuctionWeightProductRatioInfo setRatioType(Integer ratioType) {
        this.ratioType = ratioType;
        return this;
    }

    public Double getRatioValue() {
        return ratioValue;
    }

    public AuctionWeightProductRatioInfo setRatioValue(Double ratioValue) {
        this.ratioValue = ratioValue;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_weight_product_ratio_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 系数类型   1-拍品访问人数  2-拍品访问次数            3-拍品分享人数 4-拍品分享进入人数 5-拍品出价人数 6.拍品出价次数 7.拍品被收藏人数  8-保证金金额
     */
    public static final String RATIO_TYPE = "ratio_type";

    /**
     * 系数值
     */
    public static final String RATIO_VALUE = "ratio_value";


    @Override
    public AuctionWeightProductRatioInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

