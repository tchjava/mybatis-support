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
 * 拍卖-店铺单日权重日志表
 * </p>
 *
 * @author Gaby
 * @since 2020-11-05
 */
@TableName("auction_shop_weight_day_log")
public class AuctionShopWeightDayLog implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 所属用户
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 权重值
     */
    private Double weight;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 店铺首页被分享的人数
     */
    @TableField("dimension_1")
    private Integer dimension1;
    /**
     * 店铺商品被分享的人数
     */
    @TableField("dimension_2")
    private Integer dimension2;
    /**
     * 通过永久二维码访问的人数
     */
    @TableField("dimension_3")
    private Integer dimension3;
    /**
     * 通过商品二维码访问的人数
     */
    @TableField("dimension_4")
    private Integer dimension4;
    /**
     * 店铺首页分享链接访问的人数
     */
    @TableField("dimension_5")
    private Integer dimension5;
    /**
     * 商品分享链接访问的人数
     */
    @TableField("dimension_6")
    private Integer dimension6;
    /**
     * 店铺付款成交额
     */
    @TableField("dimension_7")
    private Long dimension7;
    /**
     * 店铺付款成交人数
     */
    @TableField("dimension_8")
    private Integer dimension8;
    /**
     * 店铺付款成交比数
     */
    @TableField("dimension_9")
    private Integer dimension9;
    /**
     * 店铺当面交易成交额
     */
    @TableField("dimension_10")
    private Long dimension10;
    /**
     * 店铺退款额
     */
    @TableField("dimension_11")
    private Long dimension11;
    /**
     * 店铺退款额人数
     */
    @TableField("dimension_12")
    private Integer dimension12;
    /**
     * 预留
     */
    @TableField("dimension_13")
    private Integer dimension13;
    /**
     * 预留
     */
    @TableField("dimension_14")
    private Integer dimension14;
    /**
     * 预留
     */
    @TableField("dimension_15")
    private Integer dimension15;


    public Long getId() {
        return id;
    }

    public AuctionShopWeightDayLog setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public AuctionShopWeightDayLog setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Double getWeight() {
        return weight;
    }

    public AuctionShopWeightDayLog setWeight(Double weight) {
        this.weight = weight;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public AuctionShopWeightDayLog setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Integer getDimension1() {
        return dimension1;
    }

    public AuctionShopWeightDayLog setDimension1(Integer dimension1) {
        this.dimension1 = dimension1;
        return this;
    }

    public Integer getDimension2() {
        return dimension2;
    }

    public AuctionShopWeightDayLog setDimension2(Integer dimension2) {
        this.dimension2 = dimension2;
        return this;
    }

    public Integer getDimension3() {
        return dimension3;
    }

    public AuctionShopWeightDayLog setDimension3(Integer dimension3) {
        this.dimension3 = dimension3;
        return this;
    }

    public Integer getDimension4() {
        return dimension4;
    }

    public AuctionShopWeightDayLog setDimension4(Integer dimension4) {
        this.dimension4 = dimension4;
        return this;
    }

    public Integer getDimension5() {
        return dimension5;
    }

    public AuctionShopWeightDayLog setDimension5(Integer dimension5) {
        this.dimension5 = dimension5;
        return this;
    }

    public Integer getDimension6() {
        return dimension6;
    }

    public AuctionShopWeightDayLog setDimension6(Integer dimension6) {
        this.dimension6 = dimension6;
        return this;
    }

    public Long getDimension7() {
        return dimension7;
    }

    public AuctionShopWeightDayLog setDimension7(Long dimension7) {
        this.dimension7 = dimension7;
        return this;
    }

    public Integer getDimension8() {
        return dimension8;
    }

    public AuctionShopWeightDayLog setDimension8(Integer dimension8) {
        this.dimension8 = dimension8;
        return this;
    }

    public Integer getDimension9() {
        return dimension9;
    }

    public AuctionShopWeightDayLog setDimension9(Integer dimension9) {
        this.dimension9 = dimension9;
        return this;
    }

    public Long getDimension10() {
        return dimension10;
    }

    public AuctionShopWeightDayLog setDimension10(Long dimension10) {
        this.dimension10 = dimension10;
        return this;
    }

    public Long getDimension11() {
        return dimension11;
    }

    public AuctionShopWeightDayLog setDimension11(Long dimension11) {
        this.dimension11 = dimension11;
        return this;
    }

    public Integer getDimension12() {
        return dimension12;
    }

    public AuctionShopWeightDayLog setDimension12(Integer dimension12) {
        this.dimension12 = dimension12;
        return this;
    }

    public Integer getDimension13() {
        return dimension13;
    }

    public AuctionShopWeightDayLog setDimension13(Integer dimension13) {
        this.dimension13 = dimension13;
        return this;
    }

    public Integer getDimension14() {
        return dimension14;
    }

    public AuctionShopWeightDayLog setDimension14(Integer dimension14) {
        this.dimension14 = dimension14;
        return this;
    }

    public Integer getDimension15() {
        return dimension15;
    }

    public AuctionShopWeightDayLog setDimension15(Integer dimension15) {
        this.dimension15 = dimension15;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_shop_weight_day_log";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 所属用户
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 权重值
     */
    public static final String WEIGHT = "weight";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 店铺首页被分享的人数
     */
    public static final String DIMENSION_1 = "dimension_1";

    /**
     * 店铺商品被分享的人数
     */
    public static final String DIMENSION_2 = "dimension_2";

    /**
     * 通过永久二维码访问的人数
     */
    public static final String DIMENSION_3 = "dimension_3";

    /**
     * 通过商品二维码访问的人数
     */
    public static final String DIMENSION_4 = "dimension_4";

    /**
     * 店铺首页分享链接访问的人数
     */
    public static final String DIMENSION_5 = "dimension_5";

    /**
     * 商品分享链接访问的人数
     */
    public static final String DIMENSION_6 = "dimension_6";

    /**
     * 店铺付款成交额
     */
    public static final String DIMENSION_7 = "dimension_7";

    /**
     * 店铺付款成交人数
     */
    public static final String DIMENSION_8 = "dimension_8";

    /**
     * 店铺付款成交比数
     */
    public static final String DIMENSION_9 = "dimension_9";

    /**
     * 店铺当面交易成交额
     */
    public static final String DIMENSION_10 = "dimension_10";

    /**
     * 店铺退款额
     */
    public static final String DIMENSION_11 = "dimension_11";

    /**
     * 店铺退款额人数
     */
    public static final String DIMENSION_12 = "dimension_12";

    /**
     * 预留
     */
    public static final String DIMENSION_13 = "dimension_13";

    /**
     * 预留
     */
    public static final String DIMENSION_14 = "dimension_14";

    /**
     * 预留
     */
    public static final String DIMENSION_15 = "dimension_15";


    @Override
    public AuctionShopWeightDayLog pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

