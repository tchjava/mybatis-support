package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 用户在线表
 * </p>
 *
 * @author Gaby
 * @since 2020-12-01
 */
@TableName("auction_user_online_info")
public class AuctionUserOnlineInfo implements Serializable, IEntity {


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
     * 小程序
     */
    private Integer mp;
    /**
     * 电脑端H5
     */
    private Integer h5;
    /**
     * (弃用字段)
     */
    private Integer pc;
    /**
     * 苹果
     */
    private Integer ios;
    /**
     * 安卓
     */
    private Integer android;
    /**
     * 公众号
     */
    private Integer web;
    /**
     * 百度小程序
     */
    @TableField("baidu_mp")
    private Integer baiduMp;


    public Long getId() {
        return id;
    }

    public AuctionUserOnlineInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public AuctionUserOnlineInfo setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Integer getMp() {
        return mp;
    }

    public AuctionUserOnlineInfo setMp(Integer mp) {
        this.mp = mp;
        return this;
    }

    public Integer getH5() {
        return h5;
    }

    public AuctionUserOnlineInfo setH5(Integer h5) {
        this.h5 = h5;
        return this;
    }

    public Integer getPc() {
        return pc;
    }

    public AuctionUserOnlineInfo setPc(Integer pc) {
        this.pc = pc;
        return this;
    }

    public Integer getIos() {
        return ios;
    }

    public AuctionUserOnlineInfo setIos(Integer ios) {
        this.ios = ios;
        return this;
    }

    public Integer getAndroid() {
        return android;
    }

    public AuctionUserOnlineInfo setAndroid(Integer android) {
        this.android = android;
        return this;
    }

    public Integer getWeb() {
        return web;
    }

    public AuctionUserOnlineInfo setWeb(Integer web) {
        this.web = web;
        return this;
    }

    public Integer getBaiduMp() {
        return baiduMp;
    }

    public AuctionUserOnlineInfo setBaiduMp(Integer baiduMp) {
        this.baiduMp = baiduMp;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_user_online_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 用户标识
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 小程序
     */
    public static final String MP = "mp";

    /**
     * 电脑端H5
     */
    public static final String H5 = "h5";

    /**
     * (弃用字段)
     */
    public static final String PC = "pc";

    /**
     * 苹果
     */
    public static final String IOS = "ios";

    /**
     * 安卓
     */
    public static final String ANDROID = "android";

    /**
     * 公众号
     */
    public static final String WEB = "web";

    /**
     * 百度小程序
     */
    public static final String BAIDU_MP = "baidu_mp";


    @Override
    public AuctionUserOnlineInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

