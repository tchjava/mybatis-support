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
 * 库币变动日志表
 * </p>
 *
 * @author Gaby
 * @since 2019-08-08
 */
@TableName("bill_coin_log")
public class BillCoinLog implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 库币信息标识
     */
    @TableField("coin_id")
    private Long coinId;
    /**
     * 用户标识
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 来源标识  订单标识
     */
    @TableField("source_id")
    private Long sourceId;
    /**
     * 变动类型   1-购物   2-佣金  4-退款  8-兑换余额 16-兑换余额中 32-待收款
     */
    @TableField("change_type")
    private Integer changeType;
    /**
     * 变动个数
     */
    @TableField("change_num")
    private Integer changeNum;
    /**
     * 变动时间
     */
    @TableField("change_time")
    private Date changeTime;
    /**
     * 结余个数
     */
    @TableField("balance_num")
    private Integer balanceNum;
    /**
     * 备注
     */
    private String comment;
    /**
     * 状态 00A-收入   00B-交易中冻结   00C-支出   00D-超消保金冻结  00Z-失效
     */
    private String status;

    public Long getId() {
        return id;
    }

    public BillCoinLog setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getCoinId() {
        return coinId;
    }

    public BillCoinLog setCoinId(Long coinId) {
        this.coinId = coinId;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public BillCoinLog setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Long getSourceId() {
        return sourceId;
    }

    public BillCoinLog setSourceId(Long sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    public Integer getChangeType() {
        return changeType;
    }

    public BillCoinLog setChangeType(Integer changeType) {
        this.changeType = changeType;
        return this;
    }

    public Integer getChangeNum() {
        return changeNum;
    }

    public BillCoinLog setChangeNum(Integer changeNum) {
        this.changeNum = changeNum;
        return this;
    }

    public Date getChangeTime() {
        return changeTime;
    }

    public BillCoinLog setChangeTime(Date changeTime) {
        this.changeTime = changeTime;
        return this;
    }

    public Integer getBalanceNum() {
        return balanceNum;
    }

    public BillCoinLog setBalanceNum(Integer balanceNum) {
        this.balanceNum = balanceNum;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public BillCoinLog setComment(String comment) {
        if (comment != null)
            comment = comment.trim();
        this.comment = comment;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public BillCoinLog setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "bill_coin_log";
    public static final String ID = "id";

    /**
     * 库币信息标识
     */
    public static final String COIN_ID = "coin_id";

    /**
     * 用户标识
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 来源标识  订单标识
     */
    public static final String SOURCE_ID = "source_id";

    /**
     * 变动类型   1-购物   2-佣金  4-退款  8-兑换余额 16-兑换余额中 32-待收款
     */
    public static final String CHANGE_TYPE = "change_type";

    /**
     * 变动个数
     */
    public static final String CHANGE_NUM = "change_num";

    /**
     * 变动时间
     */
    public static final String CHANGE_TIME = "change_time";

    /**
     * 结余个数
     */
    public static final String BALANCE_NUM = "balance_num";

    /**
     * 备注
     */
    public static final String COMMENT = "comment";

    /**
     * 状态 00A-收入   00B-交易中冻结   00C-支出   00D-超消保金冻结  00Z-失效
     */
    public static final String STATUS = "status";

    @Override
    public BillCoinLog pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

