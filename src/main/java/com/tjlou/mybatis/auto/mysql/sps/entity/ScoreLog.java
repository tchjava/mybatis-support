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
 * 积分日志表
 * </p>
 *
 * @author Gaby
 * @since 2019-08-05
 */
@TableName("score_log")
public class ScoreLog implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 订单标识
     */
    @TableField("order_id")
    private Long orderId;
    /**
     * 卖家获取积分
     */
    @TableField("supplier_score")
    private Integer supplierScore;
    /**
     * 买家获取积分
     */
    @TableField("user_score")
    private Integer userScore;
    /**
     * 状态 00A-有效 00Z-失效
     */
    private String status;
    /**
     * 卖家标识
     */
    @TableField("supplier_id")
    private Long supplierId;
    /**
     * 买家标识
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;

    public Long getId() {
        return id;
    }

    public ScoreLog setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getOrderId() {
        return orderId;
    }

    public ScoreLog setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }

    public Integer getSupplierScore() {
        return supplierScore;
    }

    public ScoreLog setSupplierScore(Integer supplierScore) {
        this.supplierScore = supplierScore;
        return this;
    }

    public Integer getUserScore() {
        return userScore;
    }

    public ScoreLog setUserScore(Integer userScore) {
        this.userScore = userScore;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public ScoreLog setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public ScoreLog setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public ScoreLog setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public ScoreLog setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "score_log";
    public static final String ID = "id";

    /**
     * 订单标识
     */
    public static final String ORDER_ID = "order_id";

    /**
     * 卖家获取积分
     */
    public static final String SUPPLIER_SCORE = "supplier_score";

    /**
     * 买家获取积分
     */
    public static final String USER_SCORE = "user_score";

    /**
     * 状态 00A-有效 00Z-失效
     */
    public static final String STATUS = "status";

    /**
     * 卖家标识
     */
    public static final String SUPPLIER_ID = "supplier_id";

    /**
     * 买家标识
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    @Override
    public ScoreLog pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

