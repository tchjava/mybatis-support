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
 * app版本信息表
 * </p>
 *
 * @author Gaby
 * @since 2019-12-12
 */
@TableName("app_version_info")
public class AppVersionInfo implements Serializable, IEntity {


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
     * 类型
     */
    private Integer type;
    /**
     * 备注
     */
    private String comment;


    public Long getId() {
        return id;
    }

    public AppVersionInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getVersion() {
        return version;
    }

    public AppVersionInfo setVersion(String version) {
        if (version != null)
            version = version.trim();
        this.version = version;
        return this;
    }

    public String getDownload() {
        return download;
    }

    public AppVersionInfo setDownload(String download) {
        if (download != null)
            download = download.trim();
        this.download = download;
        return this;
    }

    public Integer getForce() {
        return force;
    }

    public AppVersionInfo setForce(Integer force) {
        this.force = force;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public AppVersionInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public AppVersionInfo setType(Integer type) {
        this.type = type;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public AppVersionInfo setComment(String comment) {
        if (comment != null)
            comment = comment.trim();
        this.comment = comment;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "app_version_info";
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
     * 类型
     */
    public static final String TYPE = "type";

    /**
     * 备注
     */
    public static final String COMMENT = "comment";


    @Override
    public AppVersionInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

