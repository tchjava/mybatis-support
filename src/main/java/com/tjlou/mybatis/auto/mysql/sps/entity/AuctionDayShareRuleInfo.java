package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 天天竞拍分享规则表
 * </p>
 *
 * @author Gaby
 * @since 2021-01-19
 */
@TableName("auction_day_share_rule_info")
public class AuctionDayShareRuleInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 主体说明
     */
    private String body;
    /**
     * 类型 1-分享  2-邀请
     */
    private Integer type;
    /**
     * 操作次数
     */
    private Integer num;
    /**
     * 奖励出价次数
     */
    @TableField("reward_bid_num")
    private Integer rewardBidNum;


    public Long getId() {
        return id;
    }

    public AuctionDayShareRuleInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getBody() {
        return body;
    }

    public AuctionDayShareRuleInfo setBody(String body) {
        if (body != null)
            body = body.trim();
        this.body = body;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public AuctionDayShareRuleInfo setType(Integer type) {
        this.type = type;
        return this;
    }

    public Integer getNum() {
        return num;
    }

    public AuctionDayShareRuleInfo setNum(Integer num) {
        this.num = num;
        return this;
    }

    public Integer getRewardBidNum() {
        return rewardBidNum;
    }

    public AuctionDayShareRuleInfo setRewardBidNum(Integer rewardBidNum) {
        this.rewardBidNum = rewardBidNum;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_day_share_rule_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 主体说明
     */
    public static final String BODY = "body";

    /**
     * 类型 1-分享  2-邀请
     */
    public static final String TYPE = "type";

    /**
     * 操作次数
     */
    public static final String NUM = "num";

    /**
     * 奖励出价次数
     */
    public static final String REWARD_BID_NUM = "reward_bid_num";


    @Override
    public AuctionDayShareRuleInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

