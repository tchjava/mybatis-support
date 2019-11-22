package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 平台信息表
 * </p>
 *
 * @author Gaby
 * @since 2019-11-22
 */
@TableName("platform_info")
public class PlatformInfo implements Serializable, IEntity {


    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 平台名称
     */
    private String name;
    /**
     * 认证标识
     */
    @TableField("app_key")
    private String appKey;
    /**
     * 状态
     */
    private String status;
    /**
     * 密钥
     */
    private String secret;
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
     * 存放位置
     */
    @TableField("cert_path")
    private String certPath;
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
     * 移动支付的appid
     */
    @TableField("app_appid")
    private String appAppid;
    /**
     * 移动支付的密钥
     */
    @TableField("app_secret")
    private String appSecret;


    public Long getId() {
        return id;
    }

    public PlatformInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public PlatformInfo setName(String name) {
        if (name != null)
            name = name.trim();
        this.name = name;
        return this;
    }

    public String getAppKey() {
        return appKey;
    }

    public PlatformInfo setAppKey(String appKey) {
        if (appKey != null)
            appKey = appKey.trim();
        this.appKey = appKey;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public PlatformInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    public String getSecret() {
        return secret;
    }

    public PlatformInfo setSecret(String secret) {
        if (secret != null)
            secret = secret.trim();
        this.secret = secret;
        return this;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public PlatformInfo setMerchantNo(String merchantNo) {
        if (merchantNo != null)
            merchantNo = merchantNo.trim();
        this.merchantNo = merchantNo;
        return this;
    }

    public String getMerchantKey() {
        return merchantKey;
    }

    public PlatformInfo setMerchantKey(String merchantKey) {
        if (merchantKey != null)
            merchantKey = merchantKey.trim();
        this.merchantKey = merchantKey;
        return this;
    }

    public String getCertPath() {
        return certPath;
    }

    public PlatformInfo setCertPath(String certPath) {
        if (certPath != null)
            certPath = certPath.trim();
        this.certPath = certPath;
        return this;
    }

    public String getPubAppid() {
        return pubAppid;
    }

    public PlatformInfo setPubAppid(String pubAppid) {
        if (pubAppid != null)
            pubAppid = pubAppid.trim();
        this.pubAppid = pubAppid;
        return this;
    }

    public String getPubSecret() {
        return pubSecret;
    }

    public PlatformInfo setPubSecret(String pubSecret) {
        if (pubSecret != null)
            pubSecret = pubSecret.trim();
        this.pubSecret = pubSecret;
        return this;
    }

    public String getAppAppid() {
        return appAppid;
    }

    public PlatformInfo setAppAppid(String appAppid) {
        if (appAppid != null)
            appAppid = appAppid.trim();
        this.appAppid = appAppid;
        return this;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public PlatformInfo setAppSecret(String appSecret) {
        if (appSecret != null)
            appSecret = appSecret.trim();
        this.appSecret = appSecret;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "platform_info";
    public static final String ID = "id";

    /**
     * 平台名称
     */
    public static final String NAME = "name";

    /**
     * 认证标识
     */
    public static final String APP_KEY = "app_key";

    /**
     * 状态
     */
    public static final String STATUS = "status";

    /**
     * 密钥
     */
    public static final String SECRET = "secret";

    /**
     * 商户号
     */
    public static final String MERCHANT_NO = "merchant_no";

    /**
     * 商户密钥
     */
    public static final String MERCHANT_KEY = "merchant_key";

    /**
     * 存放位置
     */
    public static final String CERT_PATH = "cert_path";

    /**
     * 公众号的appid
     */
    public static final String PUB_APPID = "pub_appid";

    /**
     * 公众号的密钥
     */
    public static final String PUB_SECRET = "pub_secret";

    /**
     * 移动支付的appid
     */
    public static final String APP_APPID = "app_appid";

    /**
     * 移动支付的密钥
     */
    public static final String APP_SECRET = "app_secret";


    @Override
    public PlatformInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

