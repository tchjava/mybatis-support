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
 * @since 2020-06-29
 */
@TableName("auction_score_info")
public class AuctionScoreInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 获得积分
     */
    private Integer score;
    /**
     * 最小价格
     */
    @TableField("min_price")
    private Long minPrice;
    /**
     * 最大价格
     */
    @TableField("max_price")
    private Long maxPrice;
    /**
     * 类型 1-通用
     */
    private Integer type;


    public Long getId() {
        return id;
    }

    public AuctionScoreInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Integer getScore() {
        return score;
    }

    public AuctionScoreInfo setScore(Integer score) {
        this.score = score;
        return this;
    }

    public Long getMinPrice() {
        return minPrice;
    }

    public AuctionScoreInfo setMinPrice(Long minPrice) {
        this.minPrice = minPrice;
        return this;
    }

    public Long getMaxPrice() {
        return maxPrice;
    }

    public AuctionScoreInfo setMaxPrice(Long maxPrice) {
        this.maxPrice = maxPrice;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public AuctionScoreInfo setType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_score_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 获得积分
     */
    public static final String SCORE = "score";

    /**
     * 最小价格
     */
    public static final String MIN_PRICE = "min_price";

    /**
     * 最大价格
     */
    public static final String MAX_PRICE = "max_price";

    /**
     * 类型 1-通用
     */
    public static final String TYPE = "type";


    @Override
    public AuctionScoreInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

