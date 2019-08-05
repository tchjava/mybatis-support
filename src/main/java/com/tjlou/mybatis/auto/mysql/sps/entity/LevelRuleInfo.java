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
 * 等级规则信息表
 * </p>
 *
 * @author Gaby
 * @since 2019-08-05
 */
@TableName("level_rule_info")
public class LevelRuleInfo implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 等级
     */
    private Integer level;
    /**
     * 最小积分
     */
    @TableField("min_score")
    private Integer minScore;
    /**
     * 最大积分
     */
    @TableField("max_score")
    private Integer maxScore;
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

    public LevelRuleInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Integer getLevel() {
        return level;
    }

    public LevelRuleInfo setLevel(Integer level) {
        this.level = level;
        return this;
    }

    public Integer getMinScore() {
        return minScore;
    }

    public LevelRuleInfo setMinScore(Integer minScore) {
        this.minScore = minScore;
        return this;
    }

    public Integer getMaxScore() {
        return maxScore;
    }

    public LevelRuleInfo setMaxScore(Integer maxScore) {
        this.maxScore = maxScore;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public LevelRuleInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public LevelRuleInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "level_rule_info";
    public static final String ID = "id";

    /**
     * 等级
     */
    public static final String LEVEL = "level";

    /**
     * 最小积分
     */
    public static final String MIN_SCORE = "min_score";

    /**
     * 最大积分
     */
    public static final String MAX_SCORE = "max_score";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 状态 00A-有效  00Z-失效
     */
    public static final String STATUS = "status";

    @Override
    public LevelRuleInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

