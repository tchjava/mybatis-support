package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 拍卖-发布费用套餐信息表
 * </p>
 *
 * @author Gaby
 * @since 2020-11-13
 */
@TableName("auction_publish_cost_info")
public class AuctionPublishCostInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 发布数量
     */
    @TableField("publish_num")
    private Integer publishNum;
    /**
     * 年份
     */
    @TableField("year_num")
    private Integer yearNum;
    /**
     * 推荐人佣金
     */
    @TableField("recommend_money")
    private Long recommendMoney;
    /**
     * 合伙人佣金
     */
    @TableField("partner_money")
    private Long partnerMoney;


    public Long getId() {
        return id;
    }

    public AuctionPublishCostInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Integer getPublishNum() {
        return publishNum;
    }

    public AuctionPublishCostInfo setPublishNum(Integer publishNum) {
        this.publishNum = publishNum;
        return this;
    }

    public Integer getYearNum() {
        return yearNum;
    }

    public AuctionPublishCostInfo setYearNum(Integer yearNum) {
        this.yearNum = yearNum;
        return this;
    }

    public Long getRecommendMoney() {
        return recommendMoney;
    }

    public AuctionPublishCostInfo setRecommendMoney(Long recommendMoney) {
        this.recommendMoney = recommendMoney;
        return this;
    }

    public Long getPartnerMoney() {
        return partnerMoney;
    }

    public AuctionPublishCostInfo setPartnerMoney(Long partnerMoney) {
        this.partnerMoney = partnerMoney;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_publish_cost_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 发布数量
     */
    public static final String PUBLISH_NUM = "publish_num";

    /**
     * 年份
     */
    public static final String YEAR_NUM = "year_num";

    /**
     * 推荐人佣金
     */
    public static final String RECOMMEND_MONEY = "recommend_money";

    /**
     * 合伙人佣金
     */
    public static final String PARTNER_MONEY = "partner_money";


    @Override
    public AuctionPublishCostInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

