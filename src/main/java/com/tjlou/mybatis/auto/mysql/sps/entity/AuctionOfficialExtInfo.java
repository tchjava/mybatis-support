package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 拍卖公告拓展表
 * </p>
 *
 * @author Gaby
 * @since 2020-09-03
 */
@TableName("auction_official_ext_info")
public class AuctionOfficialExtInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 公告标识
     */
    @TableField("official_id")
    private Long officialId;
    /**
     * h5地址
     */
    @TableField("h5_url")
    private String h5Url;
    /**
     * 富文本内容
     */
    private String content;
    /**
     * 视频地址
     */
    private String video;
    /**
     * 拓展信息(包含移动端的跳转信息)
     */
    private String params;


    public Long getId() {
        return id;
    }

    public AuctionOfficialExtInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getOfficialId() {
        return officialId;
    }

    public AuctionOfficialExtInfo setOfficialId(Long officialId) {
        this.officialId = officialId;
        return this;
    }

    public String getH5Url() {
        return h5Url;
    }

    public AuctionOfficialExtInfo setH5Url(String h5Url) {
        if (h5Url != null)
            h5Url = h5Url.trim();
        this.h5Url = h5Url;
        return this;
    }

    public String getContent() {
        return content;
    }

    public AuctionOfficialExtInfo setContent(String content) {
        if (content != null)
            content = content.trim();
        this.content = content;
        return this;
    }

    public String getVideo() {
        return video;
    }

    public AuctionOfficialExtInfo setVideo(String video) {
        if (video != null)
            video = video.trim();
        this.video = video;
        return this;
    }

    public String getParams() {
        return params;
    }

    public AuctionOfficialExtInfo setParams(String params) {
        if (params != null)
            params = params.trim();
        this.params = params;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_official_ext_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 公告标识
     */
    public static final String OFFICIAL_ID = "official_id";

    /**
     * h5地址
     */
    public static final String H5_URL = "h5_url";

    /**
     * 富文本内容
     */
    public static final String CONTENT = "content";

    /**
     * 视频地址
     */
    public static final String VIDEO = "video";

    /**
     * 拓展信息(包含移动端的跳转信息)
     */
    public static final String PARAMS = "params";


    @Override
    public AuctionOfficialExtInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

