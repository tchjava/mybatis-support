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
 * 拍卖用户限制日志表
 * </p>
 *
 * @author Gaby
 * @since 2020-08-20
 */
@TableName("auction_user_limit_log")
public class AuctionUserLimitLog implements Serializable, IEntity {


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
     * 限制类型
     */
    @TableField("limit_type")
    private Integer limitType;
    /**
     * 操作类型 1-限制类型 2-屏蔽类型
     */
    private Integer type;
    /**
     * 限制原因
     */
    private String reason;
    /**
     * 操作者 后台用户标识
     */
    @TableField("operator_id")
    private Long operatorId;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 结束时间
     */
    @TableField("end_time")
    private Date endTime;
    /**
     * 限制到期时间
     */
    @TableField("limit_time")
    private Date limitTime;
    /**
     * 状态 00A-有效  00B-解除限制
     */
    private String status;
    /**
     * 是否下架所有拍品
     */
    @TableField("lower_shelf")
    private Integer lowerShelf;


    public Long getId() {
        return id;
    }

    public AuctionUserLimitLog setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public AuctionUserLimitLog setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Integer getLimitType() {
        return limitType;
    }

    public AuctionUserLimitLog setLimitType(Integer limitType) {
        this.limitType = limitType;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public AuctionUserLimitLog setType(Integer type) {
        this.type = type;
        return this;
    }

    public String getReason() {
        return reason;
    }

    public AuctionUserLimitLog setReason(String reason) {
        if (reason != null)
            reason = reason.trim();
        this.reason = reason;
        return this;
    }

    public Long getOperatorId() {
        return operatorId;
    }

    public AuctionUserLimitLog setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public AuctionUserLimitLog setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getEndTime() {
        return endTime;
    }

    public AuctionUserLimitLog setEndTime(Date endTime) {
        this.endTime = endTime;
        return this;
    }

    public Date getLimitTime() {
        return limitTime;
    }

    public AuctionUserLimitLog setLimitTime(Date limitTime) {
        this.limitTime = limitTime;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public AuctionUserLimitLog setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    public Integer getLowerShelf() {
        return lowerShelf;
    }

    public AuctionUserLimitLog setLowerShelf(Integer lowerShelf) {
        this.lowerShelf = lowerShelf;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_user_limit_log";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 所属用户
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 限制类型
     */
    public static final String LIMIT_TYPE = "limit_type";

    /**
     * 操作类型 1-限制类型 2-屏蔽类型
     */
    public static final String TYPE = "type";

    /**
     * 限制原因
     */
    public static final String REASON = "reason";

    /**
     * 操作者 后台用户标识
     */
    public static final String OPERATOR_ID = "operator_id";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 结束时间
     */
    public static final String END_TIME = "end_time";

    /**
     * 限制到期时间
     */
    public static final String LIMIT_TIME = "limit_time";

    /**
     * 状态 00A-有效  00B-解除限制
     */
    public static final String STATUS = "status";

    /**
     * 是否下架所有拍品
     */
    public static final String LOWER_SHELF = "lower_shelf";


    @Override
    public AuctionUserLimitLog pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

