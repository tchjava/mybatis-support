package com.tjlou.mybatis.auto.mysql.weipai.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 微信机器人信息表
 * </p>
 *
 * @author Gaby
 * @since 2019-04-11
 */
@TableName("wpt_robot_info")
public class WptRobotInfo implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.INPUT)
    private Long id;
    /**
     * 名称
     */
    private String name;
    /**
     * 帐号
     */
    private String username;
    /**
     * 状态  00A-生效 00B-停用 00Z-失效
     */
    private String status;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 备注
     */
    private String comment;

    public Long getId() {
        return id;
    }

    public WptRobotInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public WptRobotInfo setName(String name) {
        if (name != null)
            name = name.trim();
        this.name = name;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public WptRobotInfo setUsername(String username) {
        if (username != null)
            username = username.trim();
        this.username = username;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public WptRobotInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public WptRobotInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public WptRobotInfo setComment(String comment) {
        if (comment != null)
            comment = comment.trim();
        this.comment = comment;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "wpt_robot_info";
    public static final String ID = "id";

    /**
     * 名称
     */
    public static final String NAME = "name";

    /**
     * 帐号
     */
    public static final String USERNAME = "username";

    /**
     * 状态  00A-生效 00B-停用 00Z-失效
     */
    public static final String STATUS = "status";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 备注
     */
    public static final String COMMENT = "comment";

    @Override
    public WptRobotInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

