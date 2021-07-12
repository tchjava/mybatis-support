package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 贡献明细表
 * </p>
 *
 * @author Gaby
 * @since 2021-07-12
 */
@TableName("auction_contribute_log")
public class AuctionContributeLog implements Serializable, IEntity {


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
     * 贡献值
     */
    @TableField("contribute_value")
    private Long contributeValue;
    /**
     * 类型
     */
    private Integer type;
    /**
     * 所属计划
     */
    @TableField("explain_id")
    private Long explainId;


    public Long getId() {
        return id;
    }

    public AuctionContributeLog setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public AuctionContributeLog setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Long getContributeValue() {
        return contributeValue;
    }

    public AuctionContributeLog setContributeValue(Long contributeValue) {
        this.contributeValue = contributeValue;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public AuctionContributeLog setType(Integer type) {
        this.type = type;
        return this;
    }

    public Long getExplainId() {
        return explainId;
    }

    public AuctionContributeLog setExplainId(Long explainId) {
        this.explainId = explainId;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_contribute_log";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 所属用户
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 贡献值
     */
    public static final String CONTRIBUTE_VALUE = "contribute_value";

    /**
     * 类型
     */
    public static final String TYPE = "type";

    /**
     * 所属计划
     */
    public static final String EXPLAIN_ID = "explain_id";


    @Override
    public AuctionContributeLog pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

