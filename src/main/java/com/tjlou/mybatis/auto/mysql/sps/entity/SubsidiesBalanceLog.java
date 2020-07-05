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
 * 补贴余额日志表
 * </p>
 *
 * @author Gaby
 * @since 2020-07-05
 */
@TableName("subsidies_balance_log")
public class SubsidiesBalanceLog implements Serializable, IEntity {


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
     * 所属补贴
     */
    @TableField("subsidies_id")
    private Long subsidiesId;
    /**
     * 变动金额(单位:分)
     */
    @TableField("change_num")
    private Long changeNum;
    /**
     * 变动名称
     */
    @TableField("change_name")
    private String changeName;
    /**
     * 变动类型   1-邀请新人 2-签到 4-邀请签到 8-购物奖励 16-出价奖励 32-购买 64-违约 128-补贴失效 256-补贴恢复
     */
    @TableField("change_type")
    private Long changeType;
    /**
     * 变动时间
     */
    @TableField("change_time")
    private Date changeTime;
    /**
     * 状态 00A-收入 00C-支出
     */
    private String status;
    /**
     * 解释类型  1-邀请新人  2-签到  3-邀请签到   4-购物奖励  5-出价奖励  6-购买  7-违约  8-补贴失效  9-补贴恢复
     */
    @TableField("explain_type")
    private Integer explainType;
    /**
     * 结余余额(单位:分)
     */
    @TableField("balance_num")
    private Long balanceNum;
    /**
     * 备注
     */
    private String comment;
    /**
     * 来源标识
     */
    @TableField("source_id")
    private Long sourceId;
    /**
     * 跳转类型  -1 未知 1-订单 2-拍品
     */
    @TableField("skip_type")
    private Integer skipType;
    /**
     * 业务单号
     */
    @TableField("trade_no")
    private String tradeNo;
    /**
     * 交易号
     */
    @TableField("transaction_id")
    private String transactionId;
    /**
     * 支付类型  -1 未知 1-微信支付 2-余额支付
     */
    @TableField("pay_type")
    private Integer payType;


    public Long getId() {
        return id;
    }

    public SubsidiesBalanceLog setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public SubsidiesBalanceLog setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Long getSubsidiesId() {
        return subsidiesId;
    }

    public SubsidiesBalanceLog setSubsidiesId(Long subsidiesId) {
        this.subsidiesId = subsidiesId;
        return this;
    }

    public Long getChangeNum() {
        return changeNum;
    }

    public SubsidiesBalanceLog setChangeNum(Long changeNum) {
        this.changeNum = changeNum;
        return this;
    }

    public String getChangeName() {
        return changeName;
    }

    public SubsidiesBalanceLog setChangeName(String changeName) {
        if (changeName != null)
            changeName = changeName.trim();
        this.changeName = changeName;
        return this;
    }

    public Long getChangeType() {
        return changeType;
    }

    public SubsidiesBalanceLog setChangeType(Long changeType) {
        this.changeType = changeType;
        return this;
    }

    public Date getChangeTime() {
        return changeTime;
    }

    public SubsidiesBalanceLog setChangeTime(Date changeTime) {
        this.changeTime = changeTime;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public SubsidiesBalanceLog setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    public Integer getExplainType() {
        return explainType;
    }

    public SubsidiesBalanceLog setExplainType(Integer explainType) {
        this.explainType = explainType;
        return this;
    }

    public Long getBalanceNum() {
        return balanceNum;
    }

    public SubsidiesBalanceLog setBalanceNum(Long balanceNum) {
        this.balanceNum = balanceNum;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public SubsidiesBalanceLog setComment(String comment) {
        if (comment != null)
            comment = comment.trim();
        this.comment = comment;
        return this;
    }

    public Long getSourceId() {
        return sourceId;
    }

    public SubsidiesBalanceLog setSourceId(Long sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    public Integer getSkipType() {
        return skipType;
    }

    public SubsidiesBalanceLog setSkipType(Integer skipType) {
        this.skipType = skipType;
        return this;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public SubsidiesBalanceLog setTradeNo(String tradeNo) {
        if (tradeNo != null)
            tradeNo = tradeNo.trim();
        this.tradeNo = tradeNo;
        return this;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public SubsidiesBalanceLog setTransactionId(String transactionId) {
        if (transactionId != null)
            transactionId = transactionId.trim();
        this.transactionId = transactionId;
        return this;
    }

    public Integer getPayType() {
        return payType;
    }

    public SubsidiesBalanceLog setPayType(Integer payType) {
        this.payType = payType;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "subsidies_balance_log";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 所属用户
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 所属补贴
     */
    public static final String SUBSIDIES_ID = "subsidies_id";

    /**
     * 变动金额(单位:分)
     */
    public static final String CHANGE_NUM = "change_num";

    /**
     * 变动名称
     */
    public static final String CHANGE_NAME = "change_name";

    /**
     * 变动类型   1-邀请新人 2-签到 4-邀请签到 8-购物奖励 16-出价奖励 32-购买 64-违约 128-补贴失效 256-补贴恢复
     */
    public static final String CHANGE_TYPE = "change_type";

    /**
     * 变动时间
     */
    public static final String CHANGE_TIME = "change_time";

    /**
     * 状态 00A-收入 00C-支出
     */
    public static final String STATUS = "status";

    /**
     * 解释类型  1-邀请新人  2-签到  3-邀请签到   4-购物奖励  5-出价奖励  6-购买  7-违约  8-补贴失效  9-补贴恢复
     */
    public static final String EXPLAIN_TYPE = "explain_type";

    /**
     * 结余余额(单位:分)
     */
    public static final String BALANCE_NUM = "balance_num";

    /**
     * 备注
     */
    public static final String COMMENT = "comment";

    /**
     * 来源标识
     */
    public static final String SOURCE_ID = "source_id";

    /**
     * 跳转类型  -1 未知 1-订单 2-拍品
     */
    public static final String SKIP_TYPE = "skip_type";

    /**
     * 业务单号
     */
    public static final String TRADE_NO = "trade_no";

    /**
     * 交易号
     */
    public static final String TRANSACTION_ID = "transaction_id";

    /**
     * 支付类型  -1 未知 1-微信支付 2-余额支付
     */
    public static final String PAY_TYPE = "pay_type";


    @Override
    public SubsidiesBalanceLog pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

