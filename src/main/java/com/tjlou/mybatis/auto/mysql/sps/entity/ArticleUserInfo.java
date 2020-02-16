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
 * 文案-用户表
 * </p>
 *
 * @author Gaby
 * @since 2020-02-17
 */
@TableName("article_user_info")
public class ArticleUserInfo implements Serializable, IEntity {

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
     * 移动应用下的openid
     */
    @TableField("app_open_id")
    private String appOpenId;
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
     * 身份 0-用户
     */
    private Integer type;
    /**
     * 状态 00A-已绑定  00B-未绑定  00C-关注公众号但未进入小程序(临时态) 00Z-失效
     */
    private String status;

    public Long getId() {
        return id;
    }

    public ArticleUserInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNickname() {
        return nickname;
    }

    public ArticleUserInfo setNickname(String nickname) {
        if (nickname != null)
            nickname = nickname.trim();
        this.nickname = nickname;
        return this;
    }

    public String getOpenId() {
        return openId;
    }

    public ArticleUserInfo setOpenId(String openId) {
        if (openId != null)
            openId = openId.trim();
        this.openId = openId;
        return this;
    }

    public String getUnionid() {
        return unionid;
    }

    public ArticleUserInfo setUnionid(String unionid) {
        if (unionid != null)
            unionid = unionid.trim();
        this.unionid = unionid;
        return this;
    }

    public String getPubOpenId() {
        return pubOpenId;
    }

    public ArticleUserInfo setPubOpenId(String pubOpenId) {
        if (pubOpenId != null)
            pubOpenId = pubOpenId.trim();
        this.pubOpenId = pubOpenId;
        return this;
    }

    public String getToken() {
        return token;
    }

    public ArticleUserInfo setToken(String token) {
        if (token != null)
            token = token.trim();
        this.token = token;
        return this;
    }

    public String getAppOpenId() {
        return appOpenId;
    }

    public ArticleUserInfo setAppOpenId(String appOpenId) {
        if (appOpenId != null)
            appOpenId = appOpenId.trim();
        this.appOpenId = appOpenId;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public ArticleUserInfo setUserId(String userId) {
        if (userId != null)
            userId = userId.trim();
        this.userId = userId;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public ArticleUserInfo setPhone(String phone) {
        if (phone != null)
            phone = phone.trim();
        this.phone = phone;
        return this;
    }

    public String getHeadimg() {
        return headimg;
    }

    public ArticleUserInfo setHeadimg(String headimg) {
        if (headimg != null)
            headimg = headimg.trim();
        this.headimg = headimg;
        return this;
    }

    public Date getIntime() {
        return intime;
    }

    public ArticleUserInfo setIntime(Date intime) {
        this.intime = intime;
        return this;
    }

    public Integer getLevel() {
        return level;
    }

    public ArticleUserInfo setLevel(Integer level) {
        this.level = level;
        return this;
    }

    public Integer getScore() {
        return score;
    }

    public ArticleUserInfo setScore(Integer score) {
        this.score = score;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public ArticleUserInfo setType(Integer type) {
        this.type = type;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public ArticleUserInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "article_user_info";
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
     * 移动应用下的openid
     */
    public static final String APP_OPEN_ID = "app_open_id";

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
     * 身份 0-用户
     */
    public static final String TYPE = "type";

    /**
     * 状态 00A-已绑定  00B-未绑定  00C-关注公众号但未进入小程序(临时态) 00Z-失效
     */
    public static final String STATUS = "status";

    @Override
    public ArticleUserInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

