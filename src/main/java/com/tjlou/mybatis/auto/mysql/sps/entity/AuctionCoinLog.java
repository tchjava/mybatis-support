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
 * 拍卖-金币明细表
 * </p>
 *
 * @author Gaby
 * @since 2020-09-14
 */
@TableName("auction_coin_log")
public class AuctionCoinLog implements Serializable, IEntity {


    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 所属佣金信息
     */
    @TableField("coin_id")
    private Long coinId;
    /**
     * 所属用户
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 来源标识
     */
    @TableField("source_id")
    private Long sourceId;
    /**
     * 变动类型  1-一般收入  2-支出  4-提现
     */
    @TableField("change_type")
    private Long changeType;
    /**
     * 变动名称
     */
    @TableField("change_name")
    private String changeName;
    /**
     * 变动数量
     */
    @TableField("change_num")
    private Long changeNum;
    /**
     * 变动时间
     */
    @TableField("change_time")
    private Date changeTime;
    /**
     * 结余数量
     */
    @TableField("balance_num")
    private Long balanceNum;
    /**
     * 备注
     */
    private String comment;
    /**
     * 状态  00A-收入  00C-支出
     */
    private String status;
    /**
     * 解释类型
     */
    @TableField("explain_type")
    private Integer explainType;
    /**
     * 跳转类型
     */
    @TableField("skip_type")
    private Integer skipType;
    /**
     * 交易号
     */
    @TableField("transaction_id")
    private String transactionId;
    /**
     * 业务单号
     */
    @TableField("trade_no")
    private String tradeNo;
    /**
     * 支付方式 1-微信支付 2-余额支付
     */
    @TableField("pay_type")
    private Integer payType;
    /**
     * 业务数据
     */
    @TableField("bss_attach")
    private String bssAttach;


    public Long getId() {
        return id;
    }

    public AuctionCoinLog setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getCoinId() {
        return coinId;
    }

    public AuctionCoinLog setCoinId(Long coinId) {
        this.coinId = coinId;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public AuctionCoinLog setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Long getSourceId() {
        return sourceId;
    }

    public AuctionCoinLog setSourceId(Long sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    public Long getChangeType() {
        return changeType;
    }

    public AuctionCoinLog setChangeType(Long changeType) {
        this.changeType = changeType;
        return this;
    }

    public String getChangeName() {
        return changeName;
    }

    public AuctionCoinLog setChangeName(String changeName) {
        if (changeName != null)
            changeName = changeName.trim();
        this.changeName = changeName;
        return this;
    }

    public Long getChangeNum() {
        return changeNum;
    }

    public AuctionCoinLog setChangeNum(Long changeNum) {
        this.changeNum = changeNum;
        return this;
    }

    public Date getChangeTime() {
        return changeTime;
    }

    public AuctionCoinLog setChangeTime(Date changeTime) {
        this.changeTime = changeTime;
        return this;
    }

    public Long getBalanceNum() {
        return balanceNum;
    }

    public AuctionCoinLog setBalanceNum(Long balanceNum) {
        this.balanceNum = balanceNum;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public AuctionCoinLog setComment(String comment) {
        if (comment != null)
            comment = comment.trim();
        this.comment = comment;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public AuctionCoinLog setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    public Integer getExplainType() {
        return explainType;
    }

    public AuctionCoinLog setExplainType(Integer explainType) {
        this.explainType = explainType;
        return this;
    }

    public Integer getSkipType() {
        return skipType;
    }

    public AuctionCoinLog setSkipType(Integer skipType) {
        this.skipType = skipType;
        return this;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public AuctionCoinLog setTransactionId(String transactionId) {
        if (transactionId != null)
            transactionId = transactionId.trim();
        this.transactionId = transactionId;
        return this;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public AuctionCoinLog setTradeNo(String tradeNo) {
        if (tradeNo != null)
            tradeNo = tradeNo.trim();
        this.tradeNo = tradeNo;
        return this;
    }

    public Integer getPayType() {
        return payType;
    }

    public AuctionCoinLog setPayType(Integer payType) {
        this.payType = payType;
        return this;
    }

    public String getBssAttach() {
        return bssAttach;
    }

    public AuctionCoinLog setBssAttach(String bssAttach) {
        if (bssAttach != null)
            bssAttach = bssAttach.trim();
        this.bssAttach = bssAttach;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_coin_log";
    public static final String ID = "id";

    /**
     * 所属佣金信息
     */
    public static final String COIN_ID = "coin_id";

    /**
     * 所属用户
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 来源标识
     */
    public static final String SOURCE_ID = "source_id";

    /**
     * 变动类型  1-一般收入  2-支出  4-提现
     */
    public static final String CHANGE_TYPE = "change_type";

    /**
     * 变动名称
     */
    public static final String CHANGE_NAME = "change_name";

    /**
     * 变动数量
     */
    public static final String CHANGE_NUM = "change_num";

    /**
     * 变动时间
     */
    public static final String CHANGE_TIME = "change_time";

    /**
     * 结余数量
     */
    public static final String BALANCE_NUM = "balance_num";

    /**
     * 备注
     */
    public static final String COMMENT = "comment";

    /**
     * 状态  00A-收入  00C-支出
     */
    public static final String STATUS = "status";

    /**
     * 解释类型
     */
    public static final String EXPLAIN_TYPE = "explain_type";

    /**
     * 跳转类型
     */
    public static final String SKIP_TYPE = "skip_type";

    /**
     * 交易号
     */
    public static final String TRANSACTION_ID = "transaction_id";

    /**
     * 业务单号
     */
    public static final String TRADE_NO = "trade_no";

    /**
     * 支付方式 1-微信支付 2-余额支付
     */
    public static final String PAY_TYPE = "pay_type";

    /**
     * 业务数据
     */
    public static final String BSS_ATTACH = "bss_attach";


    @Override
    public AuctionCoinLog pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

