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
 * 协议内容信息表
 * </p>
 *
 * @author Gaby
 * @since 2019-08-17
 */
@TableName("protocol_info")
public class ProtocolInfo implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 协议标题
     */
    private String title;
    /**
     * 协议内容
     */
    private String content;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;

    public Long getId() {
        return id;
    }

    public ProtocolInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public ProtocolInfo setTitle(String title) {
        if (title != null)
            title = title.trim();
        this.title = title;
        return this;
    }

    public String getContent() {
        return content;
    }

    public ProtocolInfo setContent(String content) {
        if (content != null)
            content = content.trim();
        this.content = content;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public ProtocolInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "protocol_info";
    public static final String ID = "id";

    /**
     * 协议标题
     */
    public static final String TITLE = "title";

    /**
     * 协议内容
     */
    public static final String CONTENT = "content";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    @Override
    public ProtocolInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

