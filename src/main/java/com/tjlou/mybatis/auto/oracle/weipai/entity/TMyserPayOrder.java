package com.tjlou.mybatis.auto.oracle.weipai.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 订单表
 * </p>
 *
 * @author Gaby
 * @since 2019-04-12
 */
@TableName("T_MYSER_PAY_ORDER")
public class TMyserPayOrder implements Serializable, IEntity {

    @TableId(value = "ORDERNO", type = IdType.INPUT)
    @TableField("ORDERNO")
    private String orderno;
    /**
     * 店铺名称
     */
    @TableField("NICKNAME")
    private String nickname;
    /**
     * 是否包退
     */
    @TableField("ISBT")
    private String isbt;
    /**
     * 成交价
     */
    @TableField("MONEY")
    private Double money;
    /**
     * 小号昵称
     */
    @TableField("MY_NICKNAME")
    private String myNickname;
    /**
     * 商品链接
     */
    @TableField("SHOPURI")
    private String shopuri;
    /**
     * 违约时间
     */
    @TableField("WYSJ")
    private Date wysj;
    /**
     * 小号cookie
     */
    @TableField("USER_COOKIE")
    private String userCookie;
    /**
     * 订单入库时间
     */
    @TableField("SCSJ")
    private Date scsj;
    /**
     * 0 未支付  1已支付
     */
    @TableField("PAY_STATE")
    private String payState;
    @TableField("ZXBZ")
    private String zxbz;
    @TableField("DDLX")
    private String ddlx;
    /**
     * 订单编号
     */
    @TableField("TRADE_NO")
    private String tradeNo;
    @TableField("TRADE_SCSJ")
    private Date tradeScsj;
    /**
     * 支付时间
     */
    @TableField("TRADE_PAY_TIME")
    private Date tradePayTime;
    @TableField("TRADE_PAY_URL")
    private String tradePayUrl;
    @TableField("CXBZ")
    private String cxbz;
    @TableField("CXSJ")
    private Date cxsj;
    /**
     * 查订单微信编号
     */
    @TableField("FROMUSERNAME")
    private String fromusername;
    @TableField("SALEID")
    private String saleid;
    @TableField("PHONE")
    private String phone;
    @TableField("KCJF")
    private String kcjf;

    public String getOrderno() {
        return orderno;
    }

    public TMyserPayOrder setOrderno(String orderno) {
        if (orderno != null)
            orderno = orderno.trim();
        this.orderno = orderno;
        return this;
    }

    public String getNickname() {
        return nickname;
    }

    public TMyserPayOrder setNickname(String nickname) {
        if (nickname != null)
            nickname = nickname.trim();
        this.nickname = nickname;
        return this;
    }

    public String getIsbt() {
        return isbt;
    }

    public TMyserPayOrder setIsbt(String isbt) {
        if (isbt != null)
            isbt = isbt.trim();
        this.isbt = isbt;
        return this;
    }

    public Double getMoney() {
        return money;
    }

    public TMyserPayOrder setMoney(Double money) {
        this.money = money;
        return this;
    }

    public String getMyNickname() {
        return myNickname;
    }

    public TMyserPayOrder setMyNickname(String myNickname) {
        if (myNickname != null)
            myNickname = myNickname.trim();
        this.myNickname = myNickname;
        return this;
    }

    public String getShopuri() {
        return shopuri;
    }

    public TMyserPayOrder setShopuri(String shopuri) {
        if (shopuri != null)
            shopuri = shopuri.trim();
        this.shopuri = shopuri;
        return this;
    }

    public Date getWysj() {
        return wysj;
    }

    public TMyserPayOrder setWysj(Date wysj) {
        this.wysj = wysj;
        return this;
    }

    public String getUserCookie() {
        return userCookie;
    }

    public TMyserPayOrder setUserCookie(String userCookie) {
        if (userCookie != null)
            userCookie = userCookie.trim();
        this.userCookie = userCookie;
        return this;
    }

    public Date getScsj() {
        return scsj;
    }

    public TMyserPayOrder setScsj(Date scsj) {
        this.scsj = scsj;
        return this;
    }

    public String getPayState() {
        return payState;
    }

    public TMyserPayOrder setPayState(String payState) {
        if (payState != null)
            payState = payState.trim();
        this.payState = payState;
        return this;
    }

    public String getZxbz() {
        return zxbz;
    }

    public TMyserPayOrder setZxbz(String zxbz) {
        if (zxbz != null)
            zxbz = zxbz.trim();
        this.zxbz = zxbz;
        return this;
    }

    public String getDdlx() {
        return ddlx;
    }

    public TMyserPayOrder setDdlx(String ddlx) {
        if (ddlx != null)
            ddlx = ddlx.trim();
        this.ddlx = ddlx;
        return this;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public TMyserPayOrder setTradeNo(String tradeNo) {
        if (tradeNo != null)
            tradeNo = tradeNo.trim();
        this.tradeNo = tradeNo;
        return this;
    }

    public Date getTradeScsj() {
        return tradeScsj;
    }

    public TMyserPayOrder setTradeScsj(Date tradeScsj) {
        this.tradeScsj = tradeScsj;
        return this;
    }

    public Date getTradePayTime() {
        return tradePayTime;
    }

    public TMyserPayOrder setTradePayTime(Date tradePayTime) {
        this.tradePayTime = tradePayTime;
        return this;
    }

    public String getTradePayUrl() {
        return tradePayUrl;
    }

    public TMyserPayOrder setTradePayUrl(String tradePayUrl) {
        if (tradePayUrl != null)
            tradePayUrl = tradePayUrl.trim();
        this.tradePayUrl = tradePayUrl;
        return this;
    }

    public String getCxbz() {
        return cxbz;
    }

    public TMyserPayOrder setCxbz(String cxbz) {
        if (cxbz != null)
            cxbz = cxbz.trim();
        this.cxbz = cxbz;
        return this;
    }

    public Date getCxsj() {
        return cxsj;
    }

    public TMyserPayOrder setCxsj(Date cxsj) {
        this.cxsj = cxsj;
        return this;
    }

    public String getFromusername() {
        return fromusername;
    }

    public TMyserPayOrder setFromusername(String fromusername) {
        if (fromusername != null)
            fromusername = fromusername.trim();
        this.fromusername = fromusername;
        return this;
    }

    public String getSaleid() {
        return saleid;
    }

    public TMyserPayOrder setSaleid(String saleid) {
        if (saleid != null)
            saleid = saleid.trim();
        this.saleid = saleid;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public TMyserPayOrder setPhone(String phone) {
        if (phone != null)
            phone = phone.trim();
        this.phone = phone;
        return this;
    }

    public String getKcjf() {
        return kcjf;
    }

    public TMyserPayOrder setKcjf(String kcjf) {
        if (kcjf != null)
            kcjf = kcjf.trim();
        this.kcjf = kcjf;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "T_MYSER_PAY_ORDER";
    public static final String ORDERNO = "ORDERNO";

    /**
     * 店铺名称
     */
    public static final String NICKNAME = "NICKNAME";

    /**
     * 是否包退
     */
    public static final String ISBT = "ISBT";

    /**
     * 成交价
     */
    public static final String MONEY = "MONEY";

    /**
     * 小号昵称
     */
    public static final String MY_NICKNAME = "MY_NICKNAME";

    /**
     * 商品链接
     */
    public static final String SHOPURI = "SHOPURI";

    /**
     * 违约时间
     */
    public static final String WYSJ = "WYSJ";

    /**
     * 小号cookie
     */
    public static final String USER_COOKIE = "USER_COOKIE";

    /**
     * 订单入库时间
     */
    public static final String SCSJ = "SCSJ";

    /**
     * 0 未支付  1已支付
     */
    public static final String PAY_STATE = "PAY_STATE";

    public static final String ZXBZ = "ZXBZ";

    public static final String DDLX = "DDLX";

    /**
     * 订单编号
     */
    public static final String TRADE_NO = "TRADE_NO";

    public static final String TRADE_SCSJ = "TRADE_SCSJ";

    /**
     * 支付时间
     */
    public static final String TRADE_PAY_TIME = "TRADE_PAY_TIME";

    public static final String TRADE_PAY_URL = "TRADE_PAY_URL";

    public static final String CXBZ = "CXBZ";

    public static final String CXSJ = "CXSJ";

    /**
     * 查订单微信编号
     */
    public static final String FROMUSERNAME = "FROMUSERNAME";

    public static final String SALEID = "SALEID";

    public static final String PHONE = "PHONE";

    public static final String KCJF = "KCJF";

    @Override
    public TMyserPayOrder pkVal(Serializable val) {
        this.orderno = String.valueOf(val.toString());
        return this;
    }
}

