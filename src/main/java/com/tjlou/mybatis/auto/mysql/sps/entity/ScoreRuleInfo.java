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
 * 积分规则表
 * </p>
 *
 * @author Gaby
 * @since 2019-08-05
 */
@TableName("score_rule_info")
public class ScoreRuleInfo implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 积分
     */
    private Integer score;
    /**
     * 最小金额
     */
    @TableField("min_money")
    private Integer minMoney;
    /**
     * 最大金额
     */
    @TableField("max_money")
    private Integer maxMoney;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 状态 00A-有效  00Z-失效
     */
    private String status;

    public Long getId() {
        return id;
    }

    public ScoreRuleInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Integer getScore() {
        return score;
    }

    public ScoreRuleInfo setScore(Integer score) {
        this.score = score;
        return this;
    }

    public Integer getMinMoney() {
        return minMoney;
    }

    public ScoreRuleInfo setMinMoney(Integer minMoney) {
        this.minMoney = minMoney;
        return this;
    }

    public Integer getMaxMoney() {
        return maxMoney;
    }

    public ScoreRuleInfo setMaxMoney(Integer maxMoney) {
        this.maxMoney = maxMoney;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public ScoreRuleInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public ScoreRuleInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "score_rule_info";
    public static final String ID = "id";

    /**
     * 积分
     */
    public static final String SCORE = "score";

    /**
     * 最小金额
     */
    public static final String MIN_MONEY = "min_money";

    /**
     * 最大金额
     */
    public static final String MAX_MONEY = "max_money";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 状态 00A-有效  00Z-失效
     */
    public static final String STATUS = "status";

    @Override
    public ScoreRuleInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

