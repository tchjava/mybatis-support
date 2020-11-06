package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 拍卖-拍品单日权重日志表
 * </p>
 *
 * @author Gaby
 * @since 2020-11-06
 */
@TableName("auction_product_weight_day_log")
public class AuctionProductWeightDayLog implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 实例标识
     */
    @TableField("instance_id")
    private Long instanceId;
    /**
     * 权重值
     */
    private Double weight;
    /**
     * 拍品访问人数
     */
    @TableField("dimension_1")
    private Integer dimension1;
    /**
     * 拍品访问次数
     */
    @TableField("dimension_2")
    private Integer dimension2;
    /**
     * 拍品分享人数
     */
    @TableField("dimension_3")
    private Integer dimension3;
    /**
     * 拍品分享后通过分享链接访问人数
     */
    @TableField("dimension_4")
    private Integer dimension4;
    /**
     * 拍品出价人数
     */
    @TableField("dimension_5")
    private Integer dimension5;
    /**
     * 拍品出价次数
     */
    @TableField("dimension_6")
    private Integer dimension6;
    /**
     * 拍品被收藏人数
     */
    @TableField("dimension_7")
    private Integer dimension7;
    /**
     * 预留
     */
    @TableField("dimension_8")
    private Integer dimension8;
    /**
     * 预留
     */
    @TableField("dimension_9")
    private Integer dimension9;
    /**
     * 预留
     */
    @TableField("dimension_10")
    private Integer dimension10;


    public Long getId() {
        return id;
    }

    public AuctionProductWeightDayLog setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getInstanceId() {
        return instanceId;
    }

    public AuctionProductWeightDayLog setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public Double getWeight() {
        return weight;
    }

    public AuctionProductWeightDayLog setWeight(Double weight) {
        this.weight = weight;
        return this;
    }

    public Integer getDimension1() {
        return dimension1;
    }

    public AuctionProductWeightDayLog setDimension1(Integer dimension1) {
        this.dimension1 = dimension1;
        return this;
    }

    public Integer getDimension2() {
        return dimension2;
    }

    public AuctionProductWeightDayLog setDimension2(Integer dimension2) {
        this.dimension2 = dimension2;
        return this;
    }

    public Integer getDimension3() {
        return dimension3;
    }

    public AuctionProductWeightDayLog setDimension3(Integer dimension3) {
        this.dimension3 = dimension3;
        return this;
    }

    public Integer getDimension4() {
        return dimension4;
    }

    public AuctionProductWeightDayLog setDimension4(Integer dimension4) {
        this.dimension4 = dimension4;
        return this;
    }

    public Integer getDimension5() {
        return dimension5;
    }

    public AuctionProductWeightDayLog setDimension5(Integer dimension5) {
        this.dimension5 = dimension5;
        return this;
    }

    public Integer getDimension6() {
        return dimension6;
    }

    public AuctionProductWeightDayLog setDimension6(Integer dimension6) {
        this.dimension6 = dimension6;
        return this;
    }

    public Integer getDimension7() {
        return dimension7;
    }

    public AuctionProductWeightDayLog setDimension7(Integer dimension7) {
        this.dimension7 = dimension7;
        return this;
    }

    public Integer getDimension8() {
        return dimension8;
    }

    public AuctionProductWeightDayLog setDimension8(Integer dimension8) {
        this.dimension8 = dimension8;
        return this;
    }

    public Integer getDimension9() {
        return dimension9;
    }

    public AuctionProductWeightDayLog setDimension9(Integer dimension9) {
        this.dimension9 = dimension9;
        return this;
    }

    public Integer getDimension10() {
        return dimension10;
    }

    public AuctionProductWeightDayLog setDimension10(Integer dimension10) {
        this.dimension10 = dimension10;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_product_weight_day_log";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 实例标识
     */
    public static final String INSTANCE_ID = "instance_id";

    /**
     * 权重值
     */
    public static final String WEIGHT = "weight";

    /**
     * 拍品访问人数
     */
    public static final String DIMENSION_1 = "dimension_1";

    /**
     * 拍品访问次数
     */
    public static final String DIMENSION_2 = "dimension_2";

    /**
     * 拍品分享人数
     */
    public static final String DIMENSION_3 = "dimension_3";

    /**
     * 拍品分享后通过分享链接访问人数
     */
    public static final String DIMENSION_4 = "dimension_4";

    /**
     * 拍品出价人数
     */
    public static final String DIMENSION_5 = "dimension_5";

    /**
     * 拍品出价次数
     */
    public static final String DIMENSION_6 = "dimension_6";

    /**
     * 拍品被收藏人数
     */
    public static final String DIMENSION_7 = "dimension_7";

    /**
     * 预留
     */
    public static final String DIMENSION_8 = "dimension_8";

    /**
     * 预留
     */
    public static final String DIMENSION_9 = "dimension_9";

    /**
     * 预留
     */
    public static final String DIMENSION_10 = "dimension_10";


    @Override
    public AuctionProductWeightDayLog pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

