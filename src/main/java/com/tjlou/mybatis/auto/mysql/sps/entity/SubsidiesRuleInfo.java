package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 补贴额度规则表
 * </p>
 *
 * @author Gaby
 * @since 2020-07-05
 */
@TableName("subsidies_rule_info")
public class SubsidiesRuleInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 粉丝数(最小)
     */
    @TableField("min_num")
    private Long minNum;
    /**
     * 粉丝数(最大)
     */
    @TableField("max_num")
    private Long maxNum;
    /**
     * 额度(单位:分)
     */
    private Long limit;


    public Long getId() {
        return id;
    }

    public SubsidiesRuleInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getMinNum() {
        return minNum;
    }

    public SubsidiesRuleInfo setMinNum(Long minNum) {
        this.minNum = minNum;
        return this;
    }

    public Long getMaxNum() {
        return maxNum;
    }

    public SubsidiesRuleInfo setMaxNum(Long maxNum) {
        this.maxNum = maxNum;
        return this;
    }

    public Long getLimit() {
        return limit;
    }

    public SubsidiesRuleInfo setLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "subsidies_rule_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 粉丝数(最小)
     */
    public static final String MIN_NUM = "min_num";

    /**
     * 粉丝数(最大)
     */
    public static final String MAX_NUM = "max_num";

    /**
     * 额度(单位:分)
     */
    public static final String LIMIT = "limit";


    @Override
    public SubsidiesRuleInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

