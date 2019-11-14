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
 * 平台用户表
 * </p>
 *
 * @author Gaby
 * @since 2019-11-14
 */
@TableName("user_account_info")
public class UserAccountInfo implements Serializable, IEntity {


    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 用户昵称及微信昵称
     */
    private String nickname;
    /**
     * 微信 id
     */
    @TableField("open_id")
    private String openId;
    /**
     * 用户 ID(可作为店铺 ID)
     */
    @TableField("user_id")
    private String userId;
    /**
     * 联系电话
     */
    private String phone;
    /**
     * 头像及微信头像
     */
    private String headimg;
    /**
     * 入库时间
     */
    private Date intime;
    /**
     * 用户等级(默认 V0)
     */
    private Integer level;
    /**
     * 积分(默认 0)
     */
    private Integer score;
    /**
     * 退货率(默认 0)
     */
    private Integer rate;
    /**
     * 折扣百分比默认 100
     */
    private Integer rebate;
    /**
     * 身份 0 用户 1 供货商 2 代理
     */
    private String type;
    /**
     * 店铺ID
     */
    @TableField("shop_uri")
    private String shopUri;
    /**
     * 成为代理时间
     */
    @TableField("agent_time")
    private Date agentTime;
    /**
     * 状态 00A-已绑定  00B-未绑定  00C-关注公众号但未进入小程序(临时态) 00Z-失效
     */
    private String status;
    /**
     * 成为代理的首位供货商标识
     */
    @TableField("supplier_id")
    private Long supplierId;
    /**
     * 平台支付密码 MD5加密
     */
    @TableField("pay_pwd")
    private String payPwd;
    /**
     * 余额免密
     */
    @TableField("balance_exempt")
    private String balanceExempt;
    /**
     * 固定[我的]为商家页面 -标识
     */
    @TableField("fixed_supplier")
    private String fixedSupplier;
    /**
     * 用户在开放平台的唯一标识符
     */
    private String unionid;
    /**
     * 公众号下的openId
     */
    @TableField("pub_open_id")
    private String pubOpenId;
    /**
     * 静默登录的密钥
     */
    private String token;
    /**
     * 来源   1-JSAPI 2-IOS 3-Andrioid 4-WEB
     */
    private Integer sources;


    public Long getId() {
        return id;
    }

    public UserAccountInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNickname() {
        return nickname;
    }

    public UserAccountInfo setNickname(String nickname) {
        if (nickname != null)
            nickname = nickname.trim();
        this.nickname = nickname;
        return this;
    }

    public String getOpenId() {
        return openId;
    }

    public UserAccountInfo setOpenId(String openId) {
        if (openId != null)
            openId = openId.trim();
        this.openId = openId;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public UserAccountInfo setUserId(String userId) {
        if (userId != null)
            userId = userId.trim();
        this.userId = userId;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public UserAccountInfo setPhone(String phone) {
        if (phone != null)
            phone = phone.trim();
        this.phone = phone;
        return this;
    }

    public String getHeadimg() {
        return headimg;
    }

    public UserAccountInfo setHeadimg(String headimg) {
        if (headimg != null)
            headimg = headimg.trim();
        this.headimg = headimg;
        return this;
    }

    public Date getIntime() {
        return intime;
    }

    public UserAccountInfo setIntime(Date intime) {
        this.intime = intime;
        return this;
    }

    public Integer getLevel() {
        return level;
    }

    public UserAccountInfo setLevel(Integer level) {
        this.level = level;
        return this;
    }

    public Integer getScore() {
        return score;
    }

    public UserAccountInfo setScore(Integer score) {
        this.score = score;
        return this;
    }

    public Integer getRate() {
        return rate;
    }

    public UserAccountInfo setRate(Integer rate) {
        this.rate = rate;
        return this;
    }

    public Integer getRebate() {
        return rebate;
    }

    public UserAccountInfo setRebate(Integer rebate) {
        this.rebate = rebate;
        return this;
    }

    public String getType() {
        return type;
    }

    public UserAccountInfo setType(String type) {
        if (type != null)
            type = type.trim();
        this.type = type;
        return this;
    }

    public String getShopUri() {
        return shopUri;
    }

    public UserAccountInfo setShopUri(String shopUri) {
        if (shopUri != null)
            shopUri = shopUri.trim();
        this.shopUri = shopUri;
        return this;
    }

    public Date getAgentTime() {
        return agentTime;
    }

    public UserAccountInfo setAgentTime(Date agentTime) {
        this.agentTime = agentTime;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public UserAccountInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public UserAccountInfo setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
        return this;
    }

    public String getPayPwd() {
        return payPwd;
    }

    public UserAccountInfo setPayPwd(String payPwd) {
        if (payPwd != null)
            payPwd = payPwd.trim();
        this.payPwd = payPwd;
        return this;
    }

    public String getBalanceExempt() {
        return balanceExempt;
    }

    public UserAccountInfo setBalanceExempt(String balanceExempt) {
        if (balanceExempt != null)
            balanceExempt = balanceExempt.trim();
        this.balanceExempt = balanceExempt;
        return this;
    }

    public String getFixedSupplier() {
        return fixedSupplier;
    }

    public UserAccountInfo setFixedSupplier(String fixedSupplier) {
        if (fixedSupplier != null)
            fixedSupplier = fixedSupplier.trim();
        this.fixedSupplier = fixedSupplier;
        return this;
    }

    public String getUnionid() {
        return unionid;
    }

    public UserAccountInfo setUnionid(String unionid) {
        if (unionid != null)
            unionid = unionid.trim();
        this.unionid = unionid;
        return this;
    }

    public String getPubOpenId() {
        return pubOpenId;
    }

    public UserAccountInfo setPubOpenId(String pubOpenId) {
        if (pubOpenId != null)
            pubOpenId = pubOpenId.trim();
        this.pubOpenId = pubOpenId;
        return this;
    }

    public String getToken() {
        return token;
    }

    public UserAccountInfo setToken(String token) {
        if (token != null)
            token = token.trim();
        this.token = token;
        return this;
    }

    public Integer getSources() {
        return sources;
    }

    public UserAccountInfo setSources(Integer sources) {
        this.sources = sources;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "user_account_info";
    public static final String ID = "id";

    /**
     * 用户昵称及微信昵称
     */
    public static final String NICKNAME = "nickname";

    /**
     * 微信 id
     */
    public static final String OPEN_ID = "open_id";

    /**
     * 用户 ID(可作为店铺 ID)
     */
    public static final String USER_ID = "user_id";

    /**
     * 联系电话
     */
    public static final String PHONE = "phone";

    /**
     * 头像及微信头像
     */
    public static final String HEADIMG = "headimg";

    /**
     * 入库时间
     */
    public static final String INTIME = "intime";

    /**
     * 用户等级(默认 V0)
     */
    public static final String LEVEL = "level";

    /**
     * 积分(默认 0)
     */
    public static final String SCORE = "score";

    /**
     * 退货率(默认 0)
     */
    public static final String RATE = "rate";

    /**
     * 折扣百分比默认 100
     */
    public static final String REBATE = "rebate";

    /**
     * 身份 0 用户 1 供货商 2 代理
     */
    public static final String TYPE = "type";

    /**
     * 店铺ID
     */
    public static final String SHOP_URI = "shop_uri";

    /**
     * 成为代理时间
     */
    public static final String AGENT_TIME = "agent_time";

    /**
     * 状态 00A-已绑定  00B-未绑定  00C-关注公众号但未进入小程序(临时态) 00Z-失效
     */
    public static final String STATUS = "status";

    /**
     * 成为代理的首位供货商标识
     */
    public static final String SUPPLIER_ID = "supplier_id";

    /**
     * 平台支付密码 MD5加密
     */
    public static final String PAY_PWD = "pay_pwd";

    /**
     * 余额免密
     */
    public static final String BALANCE_EXEMPT = "balance_exempt";

    /**
     * 固定[我的]为商家页面 -标识
     */
    public static final String FIXED_SUPPLIER = "fixed_supplier";

    /**
     * 用户在开放平台的唯一标识符
     */
    public static final String UNIONID = "unionid";

    /**
     * 公众号下的openId
     */
    public static final String PUB_OPEN_ID = "pub_open_id";

    /**
     * 静默登录的密钥
     */
    public static final String TOKEN = "token";

    /**
     * 来源   1-JSAPI 2-IOS 3-Andrioid 4-WEB
     */
    public static final String SOURCES = "sources";


    @Override
    public UserAccountInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

