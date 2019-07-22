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
 * 余额提现信息表
 * </p>
 *
 * @author Gaby
 * @since 2019-07-22
 */
@TableName("bill_balance_withdraw_info")
public class BillBalanceWithdrawInfo implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 用户标识
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 余额标识
     */
    @TableField("balance_id")
    private Long balanceId;
    /**
     * 提现单号
     */
    @TableField("withdraw_no")
    private String withdrawNo;
    /**
     * 提现金额 单位:分
     */
    private Integer money;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 备注
     */
    private String comment;

    public Long getId() {
        return id;
    }

    public BillBalanceWithdrawInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public BillBalanceWithdrawInfo setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Long getBalanceId() {
        return balanceId;
    }

    public BillBalanceWithdrawInfo setBalanceId(Long balanceId) {
        this.balanceId = balanceId;
        return this;
    }

    public String getWithdrawNo() {
        return withdrawNo;
    }

    public BillBalanceWithdrawInfo setWithdrawNo(String withdrawNo) {
        if (withdrawNo != null)
            withdrawNo = withdrawNo.trim();
        this.withdrawNo = withdrawNo;
        return this;
    }

    public Integer getMoney() {
        return money;
    }

    public BillBalanceWithdrawInfo setMoney(Integer money) {
        this.money = money;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public BillBalanceWithdrawInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public BillBalanceWithdrawInfo setComment(String comment) {
        if (comment != null)
            comment = comment.trim();
        this.comment = comment;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "bill_balance_withdraw_info";
    public static final String ID = "id";

    /**
     * 用户标识
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 余额标识
     */
    public static final String BALANCE_ID = "balance_id";

    /**
     * 提现单号
     */
    public static final String WITHDRAW_NO = "withdraw_no";

    /**
     * 提现金额 单位:分
     */
    public static final String MONEY = "money";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 备注
     */
    public static final String COMMENT = "comment";

    @Override
    public BillBalanceWithdrawInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

