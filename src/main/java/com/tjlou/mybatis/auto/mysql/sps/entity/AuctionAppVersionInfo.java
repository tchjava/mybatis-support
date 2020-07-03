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
 * 拍卖-app版本更新日志表
 * </p>
 *
 * @author Gaby
 * @since 2020-07-03
 */
@TableName("auction_app_version_info")
public class AuctionAppVersionInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 版本号
     */
    private String version;
    /**
     * 下载地址
     */
    private String download;
    /**
     * 是否强制
     */
    private Integer force;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 客户端类型  1-小程序 2-苹果  4-安卓
     */
    private Integer client;
    /**
     * 系统类型  1-超级仓库  2-拍卖
     */
    @TableField("system_type")
    private Integer systemType;


    public Long getId() {
        return id;
    }

    public AuctionAppVersionInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getVersion() {
        return version;
    }

    public AuctionAppVersionInfo setVersion(String version) {
        if (version != null)
            version = version.trim();
        this.version = version;
        return this;
    }

    public String getDownload() {
        return download;
    }

    public AuctionAppVersionInfo setDownload(String download) {
        if (download != null)
            download = download.trim();
        this.download = download;
        return this;
    }

    public Integer getForce() {
        return force;
    }

    public AuctionAppVersionInfo setForce(Integer force) {
        this.force = force;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public AuctionAppVersionInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Integer getClient() {
        return client;
    }

    public AuctionAppVersionInfo setClient(Integer client) {
        this.client = client;
        return this;
    }

    public Integer getSystemType() {
        return systemType;
    }

    public AuctionAppVersionInfo setSystemType(Integer systemType) {
        this.systemType = systemType;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_app_version_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 版本号
     */
    public static final String VERSION = "version";

    /**
     * 下载地址
     */
    public static final String DOWNLOAD = "download";

    /**
     * 是否强制
     */
    public static final String FORCE = "force";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 客户端类型  1-小程序 2-苹果  4-安卓
     */
    public static final String CLIENT = "client";

    /**
     * 系统类型  1-超级仓库  2-拍卖
     */
    public static final String SYSTEM_TYPE = "system_type";


    @Override
    public AuctionAppVersionInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

