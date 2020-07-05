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
 * 补贴余额信息表
 * </p>
 *
 * @author Gaby
 * @since 2020-07-05
 */
@TableName("subsidies_balance_info")
public class SubsidiesBalanceInfo implements Serializable, IEntity {


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
     * 有效余额
     */
    private Long balance;
    /**
     * 失效余额
     */
    @TableField("lose_balance")
    private Long loseBalance;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 状态 00A-有效   00Z-失效
     */
    private String status;


    public Long getId() {
        return id;
    }

    public SubsidiesBalanceInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public SubsidiesBalanceInfo setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Long getBalance() {
        return balance;
    }

    public SubsidiesBalanceInfo setBalance(Long balance) {
        this.balance = balance;
        return this;
    }

    public Long getLoseBalance() {
        return loseBalance;
    }

    public SubsidiesBalanceInfo setLoseBalance(Long loseBalance) {
        this.loseBalance = loseBalance;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public SubsidiesBalanceInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public SubsidiesBalanceInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "subsidies_balance_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 所属用户
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 有效余额
     */
    public static final String BALANCE = "balance";

    /**
     * 失效余额
     */
    public static final String LOSE_BALANCE = "lose_balance";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 状态 00A-有效   00Z-失效
     */
    public static final String STATUS = "status";


    @Override
    public SubsidiesBalanceInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

