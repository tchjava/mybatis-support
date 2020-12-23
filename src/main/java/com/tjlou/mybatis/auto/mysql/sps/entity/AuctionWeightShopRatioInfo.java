package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 拍卖-店铺权重系数表
 * </p>
 *
 * @author Gaby
 * @since 2020-12-23
 */
@TableName("auction_weight_shop_ratio_info")
public class AuctionWeightShopRatioInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 系数类型  1-店铺首页被分享的人数  2-店铺商品被分享的人数 3-通过永久二维码访问的人数 4-通过商品二维码访问的人数  5-店铺首页分享链接访问的人数  6-商品分享链接访问的人数  7-店铺付款成交额   8-店铺付款成交人数  9-店铺付款成交比数 10-店铺当面交易成交额 11-店铺退款额  12-店铺退款额人数
     */
    @TableField("ratio_type")
    private Integer ratioType;
    /**
     * 系数值
     */
    @TableField("ratio_value")
    private Double ratioValue;
    /**
     * 系数天数之内
     */
    @TableField("ratio_day_value")
    private Integer ratioDayValue;


    public Long getId() {
        return id;
    }

    public AuctionWeightShopRatioInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Integer getRatioType() {
        return ratioType;
    }

    public AuctionWeightShopRatioInfo setRatioType(Integer ratioType) {
        this.ratioType = ratioType;
        return this;
    }

    public Double getRatioValue() {
        return ratioValue;
    }

    public AuctionWeightShopRatioInfo setRatioValue(Double ratioValue) {
        this.ratioValue = ratioValue;
        return this;
    }

    public Integer getRatioDayValue() {
        return ratioDayValue;
    }

    public AuctionWeightShopRatioInfo setRatioDayValue(Integer ratioDayValue) {
        this.ratioDayValue = ratioDayValue;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_weight_shop_ratio_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 系数类型  1-店铺首页被分享的人数  2-店铺商品被分享的人数 3-通过永久二维码访问的人数 4-通过商品二维码访问的人数  5-店铺首页分享链接访问的人数  6-商品分享链接访问的人数  7-店铺付款成交额   8-店铺付款成交人数  9-店铺付款成交比数 10-店铺当面交易成交额 11-店铺退款额  12-店铺退款额人数
     */
    public static final String RATIO_TYPE = "ratio_type";

    /**
     * 系数值
     */
    public static final String RATIO_VALUE = "ratio_value";

    /**
     * 系数天数之内
     */
    public static final String RATIO_DAY_VALUE = "ratio_day_value";


    @Override
    public AuctionWeightShopRatioInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

