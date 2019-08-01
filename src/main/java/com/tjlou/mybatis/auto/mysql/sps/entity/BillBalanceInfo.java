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
 * 余额信息表
 * </p>
 *
 * @author Gaby
 * @since 2019-07-25
 */
@TableName("bill_balance_info")
public class BillBalanceInfo implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 帐号标识
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 最新结余 单位:分
     */
    private Integer balance;
    /**
     * 可用余额 单位:分
     */
    @TableField("usable_balance")
    private Integer usableBalance;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 修改时间
     */
    @TableField("modify_time")
    private Date modifyTime;
    /**
     * 状态 00A-有效  00Z-失效
     */
    private String status;
    /**
     * 备注
     */
    private String comment;

    public Long getId() {
        return id;
    }

    public BillBalanceInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public BillBalanceInfo setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Integer getBalance() {
        return balance;
    }

    public BillBalanceInfo setBalance(Integer balance) {
        this.balance = balance;
        return this;
    }

    public Integer getUsableBalance() {
        return usableBalance;
    }

    public BillBalanceInfo setUsableBalance(Integer usableBalance) {
        this.usableBalance = usableBalance;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public BillBalanceInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public BillBalanceInfo setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public BillBalanceInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public BillBalanceInfo setComment(String comment) {
        if (comment != null)
            comment = comment.trim();
        this.comment = comment;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "bill_balance_info";
    public static final String ID = "id";

    /**
     * 帐号标识
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 最新结余 单位:分
     */
    public static final String BALANCE = "balance";

    /**
     * 可用余额 单位:分
     */
    public static final String USABLE_BALANCE = "usable_balance";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 修改时间
     */
    public static final String MODIFY_TIME = "modify_time";

    /**
     * 状态 00A-有效  00Z-失效
     */
    public static final String STATUS = "status";

    /**
     * 备注
     */
    public static final String COMMENT = "comment";

    @Override
    public BillBalanceInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

