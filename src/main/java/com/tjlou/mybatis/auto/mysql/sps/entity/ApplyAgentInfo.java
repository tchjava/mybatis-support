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
 * 申请代理信息表
 * </p>
 *
 * @author Gaby
 * @since 2019-12-30
 */
@TableName("apply_agent_info")
public class ApplyAgentInfo implements Serializable, IEntity {


    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 用户标识
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 金额 单位:分
     */
    private Long money;
    /**
     * 申请号
     */
    @TableField("trade_no")
    private String tradeNo;
    /**
     * 交易号
     */
    @TableField("transaction_id")
    private String transactionId;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 成功时间
     */
    @TableField("end_time")
    private Date endTime;
    /**
     * 状态
     */
    private String status;


    public Long getId() {
        return id;
    }

    public ApplyAgentInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public ApplyAgentInfo setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Long getMoney() {
        return money;
    }

    public ApplyAgentInfo setMoney(Long money) {
        this.money = money;
        return this;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public ApplyAgentInfo setTradeNo(String tradeNo) {
        if (tradeNo != null)
            tradeNo = tradeNo.trim();
        this.tradeNo = tradeNo;
        return this;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public ApplyAgentInfo setTransactionId(String transactionId) {
        if (transactionId != null)
            transactionId = transactionId.trim();
        this.transactionId = transactionId;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public ApplyAgentInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getEndTime() {
        return endTime;
    }

    public ApplyAgentInfo setEndTime(Date endTime) {
        this.endTime = endTime;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public ApplyAgentInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "apply_agent_info";
    public static final String ID = "id";

    /**
     * 用户标识
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 金额 单位:分
     */
    public static final String MONEY = "money";

    /**
     * 申请号
     */
    public static final String TRADE_NO = "trade_no";

    /**
     * 交易号
     */
    public static final String TRANSACTION_ID = "transaction_id";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 成功时间
     */
    public static final String END_TIME = "end_time";

    /**
     * 状态
     */
    public static final String STATUS = "status";


    @Override
    public ApplyAgentInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

