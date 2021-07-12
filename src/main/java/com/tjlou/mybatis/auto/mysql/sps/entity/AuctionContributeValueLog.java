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
 *
 * </p>
 *
 * @author Gaby
 * @since 2021-07-12
 */
@TableName("auction_contribute_value_log")
public class AuctionContributeValueLog implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 持股计划标识
     */
    @TableField("explain_id")
    private Long explainId;
    /**
     * 所属用户
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 所属订单
     */
    @TableField("order_id")
    private Long orderId;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 贡献值幅度
     */
    @TableField("contribute_value")
    private Long contributeValue;
    /**
     * 贡献类型
     */
    @TableField("contribute_type")
    private Integer contributeType;


    public Long getId() {
        return id;
    }

    public AuctionContributeValueLog setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getExplainId() {
        return explainId;
    }

    public AuctionContributeValueLog setExplainId(Long explainId) {
        this.explainId = explainId;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public AuctionContributeValueLog setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Long getOrderId() {
        return orderId;
    }

    public AuctionContributeValueLog setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public AuctionContributeValueLog setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Long getContributeValue() {
        return contributeValue;
    }

    public AuctionContributeValueLog setContributeValue(Long contributeValue) {
        this.contributeValue = contributeValue;
        return this;
    }

    public Integer getContributeType() {
        return contributeType;
    }

    public AuctionContributeValueLog setContributeType(Integer contributeType) {
        this.contributeType = contributeType;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_contribute_value_log";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 持股计划标识
     */
    public static final String EXPLAIN_ID = "explain_id";

    /**
     * 所属用户
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 所属订单
     */
    public static final String ORDER_ID = "order_id";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 贡献值幅度
     */
    public static final String CONTRIBUTE_VALUE = "contribute_value";

    /**
     * 贡献类型
     */
    public static final String CONTRIBUTE_TYPE = "contribute_type";


    @Override
    public AuctionContributeValueLog pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

