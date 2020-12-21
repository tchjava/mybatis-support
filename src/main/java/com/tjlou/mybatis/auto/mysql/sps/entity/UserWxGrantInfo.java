package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 用户微信授权信息表
 * </p>
 *
 * @author Gaby
 * @since 2020-12-21
 */
@TableName("user_wx_grant_info")
public class UserWxGrantInfo implements Serializable, IEntity {


    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 所属用户
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 授权unionid
     */
    private String unionid;
    /**
     * 小程序openId
     */
    @TableField("open_id")
    private String openId;
    /**
     * 移动端openId
     */
    @TableField("app_open_id")
    private String appOpenId;
    /**
     * 公众号openId
     */
    @TableField("pub_open_id")
    private String pubOpenId;
    /**
     * 是否关注公众号
     */
    private Integer subscribe;
    /**
     * 系统类型 1-超级仓库 2-锤定 4-诸葛拍拍
     */
    @TableField("system_type")
    private Integer systemType;


    public Long getId() {
        return id;
    }

    public UserWxGrantInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public UserWxGrantInfo setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public String getUnionid() {
        return unionid;
    }

    public UserWxGrantInfo setUnionid(String unionid) {
        if (unionid != null)
            unionid = unionid.trim();
        this.unionid = unionid;
        return this;
    }

    public String getOpenId() {
        return openId;
    }

    public UserWxGrantInfo setOpenId(String openId) {
        if (openId != null)
            openId = openId.trim();
        this.openId = openId;
        return this;
    }

    public String getAppOpenId() {
        return appOpenId;
    }

    public UserWxGrantInfo setAppOpenId(String appOpenId) {
        if (appOpenId != null)
            appOpenId = appOpenId.trim();
        this.appOpenId = appOpenId;
        return this;
    }

    public String getPubOpenId() {
        return pubOpenId;
    }

    public UserWxGrantInfo setPubOpenId(String pubOpenId) {
        if (pubOpenId != null)
            pubOpenId = pubOpenId.trim();
        this.pubOpenId = pubOpenId;
        return this;
    }

    public Integer getSubscribe() {
        return subscribe;
    }

    public UserWxGrantInfo setSubscribe(Integer subscribe) {
        this.subscribe = subscribe;
        return this;
    }

    public Integer getSystemType() {
        return systemType;
    }

    public UserWxGrantInfo setSystemType(Integer systemType) {
        this.systemType = systemType;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "user_wx_grant_info";
    public static final String ID = "id";

    /**
     * 所属用户
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 授权unionid
     */
    public static final String UNIONID = "unionid";

    /**
     * 小程序openId
     */
    public static final String OPEN_ID = "open_id";

    /**
     * 移动端openId
     */
    public static final String APP_OPEN_ID = "app_open_id";

    /**
     * 公众号openId
     */
    public static final String PUB_OPEN_ID = "pub_open_id";

    /**
     * 是否关注公众号
     */
    public static final String SUBSCRIBE = "subscribe";

    /**
     * 系统类型 1-超级仓库 2-锤定 4-诸葛拍拍
     */
    public static final String SYSTEM_TYPE = "system_type";


    @Override
    public UserWxGrantInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

