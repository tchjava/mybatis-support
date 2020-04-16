package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 攻略拓展表
 * </p>
 *
 * @author Gaby
 * @since 2020-04-16
 */
@TableName("strategy_ext_info")
public class StrategyExtInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * h5地址
     */
    @TableField("h5_url")
    private String h5Url;
    /**
     * 内容
     */
    private String content;
    /**
     * 视频地址
     */
    private String video;
    /**
     * 首帧地址
     */
    @TableField("cut_pic")
    private String cutPic;


    public Long getId() {
        return id;
    }

    public StrategyExtInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getH5Url() {
        return h5Url;
    }

    public StrategyExtInfo setH5Url(String h5Url) {
        if (h5Url != null)
            h5Url = h5Url.trim();
        this.h5Url = h5Url;
        return this;
    }

    public String getContent() {
        return content;
    }

    public StrategyExtInfo setContent(String content) {
        if (content != null)
            content = content.trim();
        this.content = content;
        return this;
    }

    public String getVideo() {
        return video;
    }

    public StrategyExtInfo setVideo(String video) {
        if (video != null)
            video = video.trim();
        this.video = video;
        return this;
    }

    public String getCutPic() {
        return cutPic;
    }

    public StrategyExtInfo setCutPic(String cutPic) {
        if (cutPic != null)
            cutPic = cutPic.trim();
        this.cutPic = cutPic;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "strategy_ext_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * h5地址
     */
    public static final String H5_URL = "h5_url";

    /**
     * 内容
     */
    public static final String CONTENT = "content";

    /**
     * 视频地址
     */
    public static final String VIDEO = "video";

    /**
     * 首帧地址
     */
    public static final String CUT_PIC = "cut_pic";


    @Override
    public StrategyExtInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

