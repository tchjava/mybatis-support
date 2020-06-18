package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 拍卖-买卖家等级表
 * </p>
 *
 * @author Gaby
 * @since 2020-06-18
 */
@TableName("auction_level_info")
public class AuctionLevelInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 等级
     */
    private Integer level;
    /**
     * 买家-最小成长值  卖家-最小积分
     */
    @TableField("min_score")
    private Long minScore;
    /**
     * 买家-最大成长值  卖家-最大积分
     */
    @TableField("max_score")
    private Long maxScore;
    /**
     * 出手次数
     */
    @TableField("bid_product_num")
    private Integer bidProductNum;
    /**
     * 用户类型  1-买家  2-卖家
     */
    private Integer type;


    public Long getId() {
        return id;
    }

    public AuctionLevelInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Integer getLevel() {
        return level;
    }

    public AuctionLevelInfo setLevel(Integer level) {
        this.level = level;
        return this;
    }

    public Long getMinScore() {
        return minScore;
    }

    public AuctionLevelInfo setMinScore(Long minScore) {
        this.minScore = minScore;
        return this;
    }

    public Long getMaxScore() {
        return maxScore;
    }

    public AuctionLevelInfo setMaxScore(Long maxScore) {
        this.maxScore = maxScore;
        return this;
    }

    public Integer getBidProductNum() {
        return bidProductNum;
    }

    public AuctionLevelInfo setBidProductNum(Integer bidProductNum) {
        this.bidProductNum = bidProductNum;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public AuctionLevelInfo setType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_level_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 等级
     */
    public static final String LEVEL = "level";

    /**
     * 买家-最小成长值  卖家-最小积分
     */
    public static final String MIN_SCORE = "min_score";

    /**
     * 买家-最大成长值  卖家-最大积分
     */
    public static final String MAX_SCORE = "max_score";

    /**
     * 出手次数
     */
    public static final String BID_PRODUCT_NUM = "bid_product_num";

    /**
     * 用户类型  1-买家  2-卖家
     */
    public static final String TYPE = "type";


    @Override
    public AuctionLevelInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

