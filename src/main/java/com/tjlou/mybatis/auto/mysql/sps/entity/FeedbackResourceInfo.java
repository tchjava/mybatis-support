package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 意见反馈资源表
 * </p>
 *
 * @author Gaby
 * @since 2019-06-23
 */
@TableName("feedback_resource_info")
public class FeedbackResourceInfo implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 意见反馈标识
     */
    @TableField("feedback_id")
    private Long feedbackId;
    /**
     * 图片路径
     */
    private String path;

    public Long getId() {
        return id;
    }

    public FeedbackResourceInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getFeedbackId() {
        return feedbackId;
    }

    public FeedbackResourceInfo setFeedbackId(Long feedbackId) {
        this.feedbackId = feedbackId;
        return this;
    }

    public String getPath() {
        return path;
    }

    public FeedbackResourceInfo setPath(String path) {
        if (path != null)
            path = path.trim();
        this.path = path;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "feedback_resource_info";
    public static final String ID = "id";

    /**
     * 意见反馈标识
     */
    public static final String FEEDBACK_ID = "feedback_id";

    /**
     * 图片路径
     */
    public static final String PATH = "path";

    @Override
    public FeedbackResourceInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

