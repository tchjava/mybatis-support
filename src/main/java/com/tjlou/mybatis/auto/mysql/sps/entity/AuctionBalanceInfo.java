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
 * 拍卖余额信息表
 * </p>
 *
 * @author Gaby
 * @since 2020-05-29
 */
@TableName("auction_balance_info")
public class AuctionBalanceInfo implements Serializable, IEntity {


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
     * 余额
     */
    private Long balance;
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
     * 备注
     */
    private String comment;
    /**
     * 状态 00A-有效 00Z-失效
     */
    private String status;


    public Long getId() {
        return id;
    }

    public AuctionBalanceInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public AuctionBalanceInfo setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Long getBalance() {
        return balance;
    }

    public AuctionBalanceInfo setBalance(Long balance) {
        this.balance = balance;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public AuctionBalanceInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public AuctionBalanceInfo setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public AuctionBalanceInfo setComment(String comment) {
        if (comment != null)
            comment = comment.trim();
        this.comment = comment;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public AuctionBalanceInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_balance_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 所属用户
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 余额
     */
    public static final String BALANCE = "balance";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 修改时间
     */
    public static final String MODIFY_TIME = "modify_time";

    /**
     * 备注
     */
    public static final String COMMENT = "comment";

    /**
     * 状态 00A-有效 00Z-失效
     */
    public static final String STATUS = "status";


    @Override
    public AuctionBalanceInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

