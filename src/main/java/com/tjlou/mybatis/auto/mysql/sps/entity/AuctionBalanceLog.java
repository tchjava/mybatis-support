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
 * 拍卖-余额日志表
 * </p>
 *
 * @author Gaby
 * @since 2020-06-17
 */
@TableName("auction_balance_log")
public class AuctionBalanceLog implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 所属余额信息
     */
    @TableField("balance_id")
    private Long balanceId;
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
     * 变动类型 1-交易 2-赔偿(收入) 4-待收款 8-冻结 16-提现中 32-已提现 64-购物 128-赔偿(支出) 256-退款  512-退还 1024-消保金 2048-充值 4096-保证金
     */
    @TableField("change_type")
    private Long changeType;
    /**
     * 变动名称
     */
    @TableField("change_name")
    private String changeName;
    /**
     * 变动金额 单位:分
     */
    @TableField("change_num")
    private Long changeNum;
    /**
     * 变动时间
     */
    @TableField("change_time")
    private Date changeTime;
    /**
     * 结余金额 单位:分
     */
    @TableField("balance_num")
    private Long balanceNum;
    /**
     * 备注
     */
    private String comment;
    /**
     * 状态 00A-有效 00C-支出 00Z-失效
     */
    private String status;
    /**
     * 解释类型  1-拍品货款  2-待收货-拍品货款  3-退款拍品货款 4-支付-买家保证金 5-退还-买家保证金
     * 6-提现中 7-已到账
     */
    @TableField("explain_type")
    private Integer explainType;
    /**
     * 跳转类型  1-订单  2-上拍拍品详情
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


    public Long getId() {
        return id;
    }

    public AuctionBalanceLog setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getBalanceId() {
        return balanceId;
    }

    public AuctionBalanceLog setBalanceId(Long balanceId) {
        this.balanceId = balanceId;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public AuctionBalanceLog setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Long getSourceId() {
        return sourceId;
    }

    public AuctionBalanceLog setSourceId(Long sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    public Long getChangeType() {
        return changeType;
    }

    public AuctionBalanceLog setChangeType(Long changeType) {
        this.changeType = changeType;
        return this;
    }

    public String getChangeName() {
        return changeName;
    }

    public AuctionBalanceLog setChangeName(String changeName) {
        if (changeName != null)
            changeName = changeName.trim();
        this.changeName = changeName;
        return this;
    }

    public Long getChangeNum() {
        return changeNum;
    }

    public AuctionBalanceLog setChangeNum(Long changeNum) {
        this.changeNum = changeNum;
        return this;
    }

    public Date getChangeTime() {
        return changeTime;
    }

    public AuctionBalanceLog setChangeTime(Date changeTime) {
        this.changeTime = changeTime;
        return this;
    }

    public Long getBalanceNum() {
        return balanceNum;
    }

    public AuctionBalanceLog setBalanceNum(Long balanceNum) {
        this.balanceNum = balanceNum;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public AuctionBalanceLog setComment(String comment) {
        if (comment != null)
            comment = comment.trim();
        this.comment = comment;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public AuctionBalanceLog setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    public Integer getExplainType() {
        return explainType;
    }

    public AuctionBalanceLog setExplainType(Integer explainType) {
        this.explainType = explainType;
        return this;
    }

    public Integer getSkipType() {
        return skipType;
    }

    public AuctionBalanceLog setSkipType(Integer skipType) {
        this.skipType = skipType;
        return this;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public AuctionBalanceLog setTransactionId(String transactionId) {
        if (transactionId != null)
            transactionId = transactionId.trim();
        this.transactionId = transactionId;
        return this;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public AuctionBalanceLog setTradeNo(String tradeNo) {
        if (tradeNo != null)
            tradeNo = tradeNo.trim();
        this.tradeNo = tradeNo;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_balance_log";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 所属余额信息
     */
    public static final String BALANCE_ID = "balance_id";

    /**
     * 所属用户
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 来源标识
     */
    public static final String SOURCE_ID = "source_id";

    /**
     * 变动类型 1-交易 2-赔偿(收入) 4-待收款 8-冻结 16-提现中 32-已提现 64-购物 128-赔偿(支出) 256-退款  512-退还 1024-消保金 2048-充值 4096-保证金
     */
    public static final String CHANGE_TYPE = "change_type";

    /**
     * 变动名称
     */
    public static final String CHANGE_NAME = "change_name";

    /**
     * 变动金额 单位:分
     */
    public static final String CHANGE_NUM = "change_num";

    /**
     * 变动时间
     */
    public static final String CHANGE_TIME = "change_time";

    /**
     * 结余金额 单位:分
     */
    public static final String BALANCE_NUM = "balance_num";

    /**
     * 备注
     */
    public static final String COMMENT = "comment";

    /**
     * 状态 00A-有效 00C-支出 00Z-失效
     */
    public static final String STATUS = "status";

    /**
     * 解释类型  1-拍品货款  2-待收货-拍品货款  3-退款拍品货款 4-支付-买家保证金 5-退还-买家保证金
     * 6-提现中 7-已到账
     */
    public static final String EXPLAIN_TYPE = "explain_type";

    /**
     * 跳转类型  1-订单  2-上拍拍品详情
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


    @Override
    public AuctionBalanceLog pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

