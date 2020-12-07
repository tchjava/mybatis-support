package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 百度设置信息表
 * </p>
 *
 * @author Gaby
 * @since 2020-12-07
 */
@TableName("baidu_setting_info")
public class BaiduSettingInfo implements Serializable, IEntity {


    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 小程序Id
     */
    @TableField("app_id")
    private String appId;
    /**
     * 小程序key
     */
    @TableField("app_key")
    private String appKey;
    /**
     * 小程序secret
     */
    @TableField("app_secret")
    private String appSecret;
    /**
     * 百度收银台的财务结算凭证
     */
    @TableField("deal_id")
    private String dealId;
    /**
     * 百度收银台的appKey
     */
    @TableField("pay_app_key")
    private String payAppKey;
    /**
     * 百度收银台平台公钥
     */
    @TableField("pay_pub_secret")
    private String payPubSecret;
    /**
     * 百度收银台平台私钥
     */
    @TableField("pay_private_secret")
    private String payPrivateSecret;
    /**
     * 项目类型 1-超级仓库  2-拍卖
     */
    private Integer type;


    public Long getId() {
        return id;
    }

    public BaiduSettingInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getAppId() {
        return appId;
    }

    public BaiduSettingInfo setAppId(String appId) {
        if (appId != null)
            appId = appId.trim();
        this.appId = appId;
        return this;
    }

    public String getAppKey() {
        return appKey;
    }

    public BaiduSettingInfo setAppKey(String appKey) {
        if (appKey != null)
            appKey = appKey.trim();
        this.appKey = appKey;
        return this;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public BaiduSettingInfo setAppSecret(String appSecret) {
        if (appSecret != null)
            appSecret = appSecret.trim();
        this.appSecret = appSecret;
        return this;
    }

    public String getDealId() {
        return dealId;
    }

    public BaiduSettingInfo setDealId(String dealId) {
        if (dealId != null)
            dealId = dealId.trim();
        this.dealId = dealId;
        return this;
    }

    public String getPayAppKey() {
        return payAppKey;
    }

    public BaiduSettingInfo setPayAppKey(String payAppKey) {
        if (payAppKey != null)
            payAppKey = payAppKey.trim();
        this.payAppKey = payAppKey;
        return this;
    }

    public String getPayPubSecret() {
        return payPubSecret;
    }

    public BaiduSettingInfo setPayPubSecret(String payPubSecret) {
        if (payPubSecret != null)
            payPubSecret = payPubSecret.trim();
        this.payPubSecret = payPubSecret;
        return this;
    }

    public String getPayPrivateSecret() {
        return payPrivateSecret;
    }

    public BaiduSettingInfo setPayPrivateSecret(String payPrivateSecret) {
        if (payPrivateSecret != null)
            payPrivateSecret = payPrivateSecret.trim();
        this.payPrivateSecret = payPrivateSecret;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public BaiduSettingInfo setType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "baidu_setting_info";
    public static final String ID = "id";

    /**
     * 小程序Id
     */
    public static final String APP_ID = "app_id";

    /**
     * 小程序key
     */
    public static final String APP_KEY = "app_key";

    /**
     * 小程序secret
     */
    public static final String APP_SECRET = "app_secret";

    /**
     * 百度收银台的财务结算凭证
     */
    public static final String DEAL_ID = "deal_id";

    /**
     * 百度收银台的appKey
     */
    public static final String PAY_APP_KEY = "pay_app_key";

    /**
     * 百度收银台平台公钥
     */
    public static final String PAY_PUB_SECRET = "pay_pub_secret";

    /**
     * 百度收银台平台私钥
     */
    public static final String PAY_PRIVATE_SECRET = "pay_private_secret";

    /**
     * 项目类型 1-超级仓库  2-拍卖
     */
    public static final String TYPE = "type";


    @Override
    public BaiduSettingInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

