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
 * 拍卖-用户拓展表
 * </p>
 *
 * @author Gaby
 * @since 2020-06-20
 */
@TableName("auction_user_ext_info")
public class AuctionUserExtInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 昵称
     */
    private String nickname;
    /**
     * 用户标识
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 静默登录token
     */
    private String token;
    /**
     * 环信通信标识
     */
    @TableField("hx_id")
    private String hxId;
    /**
     * 聊天是否连接
     */
    @TableField("dialog_connect")
    private Integer dialogConnect;
    /**
     * 0-正常  1-限制上拍  2-限制出价  4-全站拉黑   8-公众号临时生成
     */
    @TableField("limit_type")
    private Integer limitType;
    /**
     * 积分
     */
    private Integer score;
    /**
     * 卖家积分
     */
    @TableField("seller_score")
    private Integer sellerScore;
    /**
     * 拍卖身份  1-用户  2-商家
     */
    private Integer type;
    /**
     * 买家等级
     */
    private Integer level;
    /**
     * 卖家等级
     */
    @TableField("seller_level")
    private Integer sellerLevel;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 小程序open_id
     */
    @TableField("open_id")
    private String openId;
    /**
     * 公众号open_id
     */
    @TableField("pub_open_id")
    private String pubOpenId;
    /**
     * 移动端open_id
     */
    @TableField("app_open_id")
    private String appOpenId;
    /**
     * 评分
     */
    private Double rate;
    /**
     * 头像
     */
    @TableField("head_img")
    private String headImg;
    /**
     * 余额免密标识
     */
    @TableField("balance_exempt")
    private String balanceExempt;
    /**
     * 支付密码
     */
    @TableField("pay_pwd")
    private String payPwd;
    /**
     * 友盟推送信息标识
     */
    @TableField("ym_id")
    private String ymId;
    /**
     * 公众号静默登录token
     */
    @TableField("h5_token")
    private String h5Token;
    /**
     * 小程序静默登录token
     */
    @TableField("mp_token")
    private String mpToken;


    public Long getId() {
        return id;
    }

    public AuctionUserExtInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNickname() {
        return nickname;
    }

    public AuctionUserExtInfo setNickname(String nickname) {
        if (nickname != null)
            nickname = nickname.trim();
        this.nickname = nickname;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public AuctionUserExtInfo setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public String getToken() {
        return token;
    }

    public AuctionUserExtInfo setToken(String token) {
        if (token != null)
            token = token.trim();
        this.token = token;
        return this;
    }

    public String getHxId() {
        return hxId;
    }

    public AuctionUserExtInfo setHxId(String hxId) {
        if (hxId != null)
            hxId = hxId.trim();
        this.hxId = hxId;
        return this;
    }

    public Integer getDialogConnect() {
        return dialogConnect;
    }

    public AuctionUserExtInfo setDialogConnect(Integer dialogConnect) {
        this.dialogConnect = dialogConnect;
        return this;
    }

    public Integer getLimitType() {
        return limitType;
    }

    public AuctionUserExtInfo setLimitType(Integer limitType) {
        this.limitType = limitType;
        return this;
    }

    public Integer getScore() {
        return score;
    }

    public AuctionUserExtInfo setScore(Integer score) {
        this.score = score;
        return this;
    }

    public Integer getSellerScore() {
        return sellerScore;
    }

    public AuctionUserExtInfo setSellerScore(Integer sellerScore) {
        this.sellerScore = sellerScore;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public AuctionUserExtInfo setType(Integer type) {
        this.type = type;
        return this;
    }

    public Integer getLevel() {
        return level;
    }

    public AuctionUserExtInfo setLevel(Integer level) {
        this.level = level;
        return this;
    }

    public Integer getSellerLevel() {
        return sellerLevel;
    }

    public AuctionUserExtInfo setSellerLevel(Integer sellerLevel) {
        this.sellerLevel = sellerLevel;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public AuctionUserExtInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getOpenId() {
        return openId;
    }

    public AuctionUserExtInfo setOpenId(String openId) {
        if (openId != null)
            openId = openId.trim();
        this.openId = openId;
        return this;
    }

    public String getPubOpenId() {
        return pubOpenId;
    }

    public AuctionUserExtInfo setPubOpenId(String pubOpenId) {
        if (pubOpenId != null)
            pubOpenId = pubOpenId.trim();
        this.pubOpenId = pubOpenId;
        return this;
    }

    public String getAppOpenId() {
        return appOpenId;
    }

    public AuctionUserExtInfo setAppOpenId(String appOpenId) {
        if (appOpenId != null)
            appOpenId = appOpenId.trim();
        this.appOpenId = appOpenId;
        return this;
    }

    public Double getRate() {
        return rate;
    }

    public AuctionUserExtInfo setRate(Double rate) {
        this.rate = rate;
        return this;
    }

    public String getHeadImg() {
        return headImg;
    }

    public AuctionUserExtInfo setHeadImg(String headImg) {
        if (headImg != null)
            headImg = headImg.trim();
        this.headImg = headImg;
        return this;
    }

    public String getBalanceExempt() {
        return balanceExempt;
    }

    public AuctionUserExtInfo setBalanceExempt(String balanceExempt) {
        if (balanceExempt != null)
            balanceExempt = balanceExempt.trim();
        this.balanceExempt = balanceExempt;
        return this;
    }

    public String getPayPwd() {
        return payPwd;
    }

    public AuctionUserExtInfo setPayPwd(String payPwd) {
        if (payPwd != null)
            payPwd = payPwd.trim();
        this.payPwd = payPwd;
        return this;
    }

    public String getYmId() {
        return ymId;
    }

    public AuctionUserExtInfo setYmId(String ymId) {
        if (ymId != null)
            ymId = ymId.trim();
        this.ymId = ymId;
        return this;
    }

    public String getH5Token() {
        return h5Token;
    }

    public AuctionUserExtInfo setH5Token(String h5Token) {
        if (h5Token != null)
            h5Token = h5Token.trim();
        this.h5Token = h5Token;
        return this;
    }

    public String getMpToken() {
        return mpToken;
    }

    public AuctionUserExtInfo setMpToken(String mpToken) {
        if (mpToken != null)
            mpToken = mpToken.trim();
        this.mpToken = mpToken;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_user_ext_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 昵称
     */
    public static final String NICKNAME = "nickname";

    /**
     * 用户标识
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 静默登录token
     */
    public static final String TOKEN = "token";

    /**
     * 环信通信标识
     */
    public static final String HX_ID = "hx_id";

    /**
     * 聊天是否连接
     */
    public static final String DIALOG_CONNECT = "dialog_connect";

    /**
     * 0-正常  1-限制上拍  2-限制出价  4-全站拉黑   8-公众号临时生成
     */
    public static final String LIMIT_TYPE = "limit_type";

    /**
     * 积分
     */
    public static final String SCORE = "score";

    /**
     * 卖家积分
     */
    public static final String SELLER_SCORE = "seller_score";

    /**
     * 拍卖身份  1-用户  2-商家
     */
    public static final String TYPE = "type";

    /**
     * 买家等级
     */
    public static final String LEVEL = "level";

    /**
     * 卖家等级
     */
    public static final String SELLER_LEVEL = "seller_level";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 小程序open_id
     */
    public static final String OPEN_ID = "open_id";

    /**
     * 公众号open_id
     */
    public static final String PUB_OPEN_ID = "pub_open_id";

    /**
     * 移动端open_id
     */
    public static final String APP_OPEN_ID = "app_open_id";

    /**
     * 评分
     */
    public static final String RATE = "rate";

    /**
     * 头像
     */
    public static final String HEAD_IMG = "head_img";

    /**
     * 余额免密标识
     */
    public static final String BALANCE_EXEMPT = "balance_exempt";

    /**
     * 支付密码
     */
    public static final String PAY_PWD = "pay_pwd";

    /**
     * 友盟推送信息标识
     */
    public static final String YM_ID = "ym_id";

    /**
     * 公众号静默登录token
     */
    public static final String H5_TOKEN = "h5_token";

    /**
     * 小程序静默登录token
     */
    public static final String MP_TOKEN = "mp_token";


    @Override
    public AuctionUserExtInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

