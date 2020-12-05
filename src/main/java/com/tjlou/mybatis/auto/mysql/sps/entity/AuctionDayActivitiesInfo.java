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
 * 拍卖日活统计信息表
 * </p>
 *
 * @author Gaby
 * @since 2020-12-05
 */
@TableName("auction_day_activities_info")
public class AuctionDayActivitiesInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 苹果端人数
     */
    private Integer ios;
    /**
     * 安卓端人数
     */
    private Integer android;
    /**
     * 公众号端人数
     */
    private Integer web;
    /**
     * H5端人数
     */
    private Integer h5;
    /**
     * 小程序端人数
     */
    private Integer mp;
    /**
     * 百度小程序端人数
     */
    @TableField("bd_mp")
    private Integer bdMp;
    /**
     * 统计人数(去重)
     */
    private Integer total;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;


    public Long getId() {
        return id;
    }

    public AuctionDayActivitiesInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Integer getIos() {
        return ios;
    }

    public AuctionDayActivitiesInfo setIos(Integer ios) {
        this.ios = ios;
        return this;
    }

    public Integer getAndroid() {
        return android;
    }

    public AuctionDayActivitiesInfo setAndroid(Integer android) {
        this.android = android;
        return this;
    }

    public Integer getWeb() {
        return web;
    }

    public AuctionDayActivitiesInfo setWeb(Integer web) {
        this.web = web;
        return this;
    }

    public Integer getH5() {
        return h5;
    }

    public AuctionDayActivitiesInfo setH5(Integer h5) {
        this.h5 = h5;
        return this;
    }

    public Integer getMp() {
        return mp;
    }

    public AuctionDayActivitiesInfo setMp(Integer mp) {
        this.mp = mp;
        return this;
    }

    public Integer getBdMp() {
        return bdMp;
    }

    public AuctionDayActivitiesInfo setBdMp(Integer bdMp) {
        this.bdMp = bdMp;
        return this;
    }

    public Integer getTotal() {
        return total;
    }

    public AuctionDayActivitiesInfo setTotal(Integer total) {
        this.total = total;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public AuctionDayActivitiesInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_day_activities_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 苹果端人数
     */
    public static final String IOS = "ios";

    /**
     * 安卓端人数
     */
    public static final String ANDROID = "android";

    /**
     * 公众号端人数
     */
    public static final String WEB = "web";

    /**
     * H5端人数
     */
    public static final String H5 = "h5";

    /**
     * 小程序端人数
     */
    public static final String MP = "mp";

    /**
     * 百度小程序端人数
     */
    public static final String BD_MP = "bd_mp";

    /**
     * 统计人数(去重)
     */
    public static final String TOTAL = "total";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";


    @Override
    public AuctionDayActivitiesInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

