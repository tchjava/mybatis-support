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
 * 拍卖-发布数量购买记录
 * </p>
 *
 * @author Gaby
 * @since 2020-11-16
 */
@TableName("auction_publish_buy_log")
public class AuctionPublishBuyLog implements Serializable, IEntity {


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
     * 购买时间
     */
    @TableField("buy_time")
    private Date buyTime;
    /**
     * 失效
     */
    @TableField("expire_time")
    private Date expireTime;
    /**
     * 变动文本
     */
    @TableField("change_name")
    private String changeName;
    /**
     * 支付金额
     */
    private Long money;
    /**
     * 发布数量
     */
    @TableField("publish_num")
    private Integer publishNum;
    /**
     * 购买年限
     */
    @TableField("year_num")
    private Integer yearNum;
    /**
     * 支付方式 1-微信支付 2-余额支付
     */
    @TableField("pay_type")
    private Integer payType;
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
     * 状态 1-成功  2-失效
     */
    private Integer status;


    public Long getId() {
        return id;
    }

    public AuctionPublishBuyLog setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public AuctionPublishBuyLog setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Date getBuyTime() {
        return buyTime;
    }

    public AuctionPublishBuyLog setBuyTime(Date buyTime) {
        this.buyTime = buyTime;
        return this;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public AuctionPublishBuyLog setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    public String getChangeName() {
        return changeName;
    }

    public AuctionPublishBuyLog setChangeName(String changeName) {
        if (changeName != null)
            changeName = changeName.trim();
        this.changeName = changeName;
        return this;
    }

    public Long getMoney() {
        return money;
    }

    public AuctionPublishBuyLog setMoney(Long money) {
        this.money = money;
        return this;
    }

    public Integer getPublishNum() {
        return publishNum;
    }

    public AuctionPublishBuyLog setPublishNum(Integer publishNum) {
        this.publishNum = publishNum;
        return this;
    }

    public Integer getYearNum() {
        return yearNum;
    }

    public AuctionPublishBuyLog setYearNum(Integer yearNum) {
        this.yearNum = yearNum;
        return this;
    }

    public Integer getPayType() {
        return payType;
    }

    public AuctionPublishBuyLog setPayType(Integer payType) {
        this.payType = payType;
        return this;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public AuctionPublishBuyLog setTradeNo(String tradeNo) {
        if (tradeNo != null)
            tradeNo = tradeNo.trim();
        this.tradeNo = tradeNo;
        return this;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public AuctionPublishBuyLog setTransactionId(String transactionId) {
        if (transactionId != null)
            transactionId = transactionId.trim();
        this.transactionId = transactionId;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public AuctionPublishBuyLog setStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_publish_buy_log";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 所属用户
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 购买时间
     */
    public static final String BUY_TIME = "buy_time";

    /**
     * 失效
     */
    public static final String EXPIRE_TIME = "expire_time";

    /**
     * 变动文本
     */
    public static final String CHANGE_NAME = "change_name";

    /**
     * 支付金额
     */
    public static final String MONEY = "money";

    /**
     * 发布数量
     */
    public static final String PUBLISH_NUM = "publish_num";

    /**
     * 购买年限
     */
    public static final String YEAR_NUM = "year_num";

    /**
     * 支付方式 1-微信支付 2-余额支付
     */
    public static final String PAY_TYPE = "pay_type";

    /**
     * 业务单号
     */
    public static final String TRADE_NO = "trade_no";

    /**
     * 交易号
     */
    public static final String TRANSACTION_ID = "transaction_id";

    /**
     * 状态 1-成功  2-失效
     */
    public static final String STATUS = "status";


    @Override
    public AuctionPublishBuyLog pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

