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
 * @since 2020-05-28
 */
@TableName("auction_user_ext_info")
public class AuctionUserExtInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
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
     * 0-正常  1-限制上拍  2-限制出价
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


    public Long getId() {
        return id;
    }

    public AuctionUserExtInfo setId(Long id) {
        this.id = id;
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

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_user_ext_info";
    /**
     * 主键
     */
    public static final String ID = "id";

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
     * 0-正常  1-限制上拍  2-限制出价
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


    @Override
    public AuctionUserExtInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

