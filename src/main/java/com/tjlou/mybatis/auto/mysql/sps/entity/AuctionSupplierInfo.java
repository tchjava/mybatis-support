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
 * 拍卖商家信息表
 * </p>
 *
 * @author Gaby
 * @since 2020-06-11
 */
@TableName("auction_supplier_info")
public class AuctionSupplierInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 卖家昵称
     */
    private String nickname;
    /**
     * 真实姓名
     */
    private String username;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 店铺二维码
     */
    @TableField("qr_code")
    private String qrCode;
    /**
     * 身份证
     */
    private String idCard;
    /**
     * 用户标识
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 状态 00A-有效 00B-待审核  00C-已拒绝  00D-待支付 00Z-失效
     */
    private String status;
    /**
     * 审核原因
     */
    private String reason;
    /**
     * 店铺屏蔽 0-正常 1-屏蔽
     */
    @TableField("store_shield")
    private Integer storeShield;
    /**
     * 业务单号
     */
    @TableField("trade_no")
    private String tradeNo;
    /**
     * 交易单号
     */
    @TableField("transction_id")
    private String transctionId;
    /**
     * 认证费 (单位：分)
     */
    @TableField("auth_money")
    private Integer authMoney;


    public Long getId() {
        return id;
    }

    public AuctionSupplierInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNickname() {
        return nickname;
    }

    public AuctionSupplierInfo setNickname(String nickname) {
        if (nickname != null)
            nickname = nickname.trim();
        this.nickname = nickname;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public AuctionSupplierInfo setUsername(String username) {
        if (username != null)
            username = username.trim();
        this.username = username;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public AuctionSupplierInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getQrCode() {
        return qrCode;
    }

    public AuctionSupplierInfo setQrCode(String qrCode) {
        if (qrCode != null)
            qrCode = qrCode.trim();
        this.qrCode = qrCode;
        return this;
    }

    public String getIdCard() {
        return idCard;
    }

    public AuctionSupplierInfo setIdCard(String idCard) {
        if (idCard != null)
            idCard = idCard.trim();
        this.idCard = idCard;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public AuctionSupplierInfo setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public AuctionSupplierInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    public String getReason() {
        return reason;
    }

    public AuctionSupplierInfo setReason(String reason) {
        if (reason != null)
            reason = reason.trim();
        this.reason = reason;
        return this;
    }

    public Integer getStoreShield() {
        return storeShield;
    }

    public AuctionSupplierInfo setStoreShield(Integer storeShield) {
        this.storeShield = storeShield;
        return this;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public AuctionSupplierInfo setTradeNo(String tradeNo) {
        if (tradeNo != null)
            tradeNo = tradeNo.trim();
        this.tradeNo = tradeNo;
        return this;
    }

    public String getTransctionId() {
        return transctionId;
    }

    public AuctionSupplierInfo setTransctionId(String transctionId) {
        if (transctionId != null)
            transctionId = transctionId.trim();
        this.transctionId = transctionId;
        return this;
    }

    public Integer getAuthMoney() {
        return authMoney;
    }

    public AuctionSupplierInfo setAuthMoney(Integer authMoney) {
        this.authMoney = authMoney;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_supplier_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 卖家昵称
     */
    public static final String NICKNAME = "nickname";

    /**
     * 真实姓名
     */
    public static final String USERNAME = "username";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 店铺二维码
     */
    public static final String QR_CODE = "qr_code";

    /**
     * 身份证
     */
    public static final String IDCARD = "idCard";

    /**
     * 用户标识
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 状态 00A-有效 00B-待审核  00C-已拒绝  00D-待支付 00Z-失效
     */
    public static final String STATUS = "status";

    /**
     * 审核原因
     */
    public static final String REASON = "reason";

    /**
     * 店铺屏蔽 0-正常 1-屏蔽
     */
    public static final String STORE_SHIELD = "store_shield";

    /**
     * 业务单号
     */
    public static final String TRADE_NO = "trade_no";

    /**
     * 交易单号
     */
    public static final String TRANSCTION_ID = "transction_id";

    /**
     * 认证费 (单位：分)
     */
    public static final String AUTH_MONEY = "auth_money";


    @Override
    public AuctionSupplierInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

