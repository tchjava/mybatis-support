package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 拍卖-积分日志表
 * </p>
 *
 * @author Gaby
 * @since 2020-06-29
 */
@TableName("auction_score_log")
public class AuctionScoreLog implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 来源标识
     */
    @TableField("source_id")
    private Long sourceId;
    /**
     * 类型 1-订单
     */
    private Integer type;
    /**
     * 买家积分
     */
    @TableField("buyer_score")
    private Integer buyerScore;
    /**
     * 卖家积分
     */
    @TableField("seller_score")
    private Integer sellerScore;
    /**
     * 所属买家
     */
    @TableField("buyer_account_id")
    private Long buyerAccountId;
    /**
     * 所属卖家
     */
    @TableField("seller_account_id")
    private Long sellerAccountId;


    public Long getId() {
        return id;
    }

    public AuctionScoreLog setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getSourceId() {
        return sourceId;
    }

    public AuctionScoreLog setSourceId(Long sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public AuctionScoreLog setType(Integer type) {
        this.type = type;
        return this;
    }

    public Integer getBuyerScore() {
        return buyerScore;
    }

    public AuctionScoreLog setBuyerScore(Integer buyerScore) {
        this.buyerScore = buyerScore;
        return this;
    }

    public Integer getSellerScore() {
        return sellerScore;
    }

    public AuctionScoreLog setSellerScore(Integer sellerScore) {
        this.sellerScore = sellerScore;
        return this;
    }

    public Long getBuyerAccountId() {
        return buyerAccountId;
    }

    public AuctionScoreLog setBuyerAccountId(Long buyerAccountId) {
        this.buyerAccountId = buyerAccountId;
        return this;
    }

    public Long getSellerAccountId() {
        return sellerAccountId;
    }

    public AuctionScoreLog setSellerAccountId(Long sellerAccountId) {
        this.sellerAccountId = sellerAccountId;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_score_log";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 来源标识
     */
    public static final String SOURCE_ID = "source_id";

    /**
     * 类型 1-订单
     */
    public static final String TYPE = "type";

    /**
     * 买家积分
     */
    public static final String BUYER_SCORE = "buyer_score";

    /**
     * 卖家积分
     */
    public static final String SELLER_SCORE = "seller_score";

    /**
     * 所属买家
     */
    public static final String BUYER_ACCOUNT_ID = "buyer_account_id";

    /**
     * 所属卖家
     */
    public static final String SELLER_ACCOUNT_ID = "seller_account_id";


    @Override
    public AuctionScoreLog pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

