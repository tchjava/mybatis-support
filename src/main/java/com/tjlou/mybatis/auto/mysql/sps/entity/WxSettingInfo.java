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
 * 微信配置信息表
 * </p>
 *
 * @author Gaby
 * @since 2020-05-30
 */
@TableName("wx_setting_info")
public class WxSettingInfo implements Serializable, IEntity {

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 商户号
     */
    @TableField("merchant_no")
    private String merchantNo;
    /**
     * 商户密钥
     */
    @TableField("merchant_key")
    private String merchantKey;
    /**
     * 小程序的appid
     */
    private String appid;
    /**
     * 小程序的密钥
     */
    private String secret;
    /**
     * 公众号的appid
     */
    @TableField("pub_appid")
    private String pubAppid;
    /**
     * 公众号的密钥
     */
    @TableField("pub_secret")
    private String pubSecret;
    /**
     * 移动端的appid
     */
    @TableField("app_appid")
    private String appAppid;
    /**
     * 移动端的密钥
     */
    @TableField("app_secret")
    private String appSecret;
    /**
     * 类型 1-超级仓库  2-拍卖
     */
    private Integer type;
    /**
     * 状态 00A-有效  00Z-失效
     */
    private String status;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;

    public Long getId() {
        return id;
    }

    public WxSettingInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public WxSettingInfo setMerchantNo(String merchantNo) {
        if (merchantNo != null)
            merchantNo = merchantNo.trim();
        this.merchantNo = merchantNo;
        return this;
    }

    public String getMerchantKey() {
        return merchantKey;
    }

    public WxSettingInfo setMerchantKey(String merchantKey) {
        if (merchantKey != null)
            merchantKey = merchantKey.trim();
        this.merchantKey = merchantKey;
        return this;
    }

    public String getAppid() {
        return appid;
    }

    public WxSettingInfo setAppid(String appid) {
        if (appid != null)
            appid = appid.trim();
        this.appid = appid;
        return this;
    }

    public String getSecret() {
        return secret;
    }

    public WxSettingInfo setSecret(String secret) {
        if (secret != null)
            secret = secret.trim();
        this.secret = secret;
        return this;
    }

    public String getPubAppid() {
        return pubAppid;
    }

    public WxSettingInfo setPubAppid(String pubAppid) {
        if (pubAppid != null)
            pubAppid = pubAppid.trim();
        this.pubAppid = pubAppid;
        return this;
    }

    public String getPubSecret() {
        return pubSecret;
    }

    public WxSettingInfo setPubSecret(String pubSecret) {
        if (pubSecret != null)
            pubSecret = pubSecret.trim();
        this.pubSecret = pubSecret;
        return this;
    }

    public String getAppAppid() {
        return appAppid;
    }

    public WxSettingInfo setAppAppid(String appAppid) {
        if (appAppid != null)
            appAppid = appAppid.trim();
        this.appAppid = appAppid;
        return this;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public WxSettingInfo setAppSecret(String appSecret) {
        if (appSecret != null)
            appSecret = appSecret.trim();
        this.appSecret = appSecret;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public WxSettingInfo setType(Integer type) {
        this.type = type;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public WxSettingInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public WxSettingInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "wx_setting_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 商户号
     */
    public static final String MERCHANT_NO = "merchant_no";

    /**
     * 商户密钥
     */
    public static final String MERCHANT_KEY = "merchant_key";

    /**
     * 小程序的appid
     */
    public static final String APPID = "appid";

    /**
     * 小程序的密钥
     */
    public static final String SECRET = "secret";

    /**
     * 公众号的appid
     */
    public static final String PUB_APPID = "pub_appid";

    /**
     * 公众号的密钥
     */
    public static final String PUB_SECRET = "pub_secret";

    /**
     * 移动端的appid
     */
    public static final String APP_APPID = "app_appid";

    /**
     * 移动端的密钥
     */
    public static final String APP_SECRET = "app_secret";

    /**
     * 类型 1-超级仓库  2-拍卖
     */
    public static final String TYPE = "type";

    /**
     * 状态 00A-有效  00Z-失效
     */
    public static final String STATUS = "status";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    @Override
    public WxSettingInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

