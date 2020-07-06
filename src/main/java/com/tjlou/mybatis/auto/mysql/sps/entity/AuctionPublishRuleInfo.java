package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 发布规则信息表
 * </p>
 *
 * @author Gaby
 * @since 2020-07-06
 */
@TableName("auction_publish_rule_info")
public class AuctionPublishRuleInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 最小粉丝数
     */
    @TableField("min_num")
    private Long minNum;
    /**
     * 最大粉丝数
     */
    @TableField("max_num")
    private Long maxNum;
    /**
     * 发布次数
     */
    @TableField("publish_num")
    private Integer publishNum;


    public Long getId() {
        return id;
    }

    public AuctionPublishRuleInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getMinNum() {
        return minNum;
    }

    public AuctionPublishRuleInfo setMinNum(Long minNum) {
        this.minNum = minNum;
        return this;
    }

    public Long getMaxNum() {
        return maxNum;
    }

    public AuctionPublishRuleInfo setMaxNum(Long maxNum) {
        this.maxNum = maxNum;
        return this;
    }

    public Integer getPublishNum() {
        return publishNum;
    }

    public AuctionPublishRuleInfo setPublishNum(Integer publishNum) {
        this.publishNum = publishNum;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_publish_rule_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 最小粉丝数
     */
    public static final String MIN_NUM = "min_num";

    /**
     * 最大粉丝数
     */
    public static final String MAX_NUM = "max_num";

    /**
     * 发布次数
     */
    public static final String PUBLISH_NUM = "publish_num";


    @Override
    public AuctionPublishRuleInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

