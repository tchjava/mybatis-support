package com.tjlou.mybatis.auto.mysql.zh.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 *
 * </p>
 *
 * @author Gaby
 * @since 2019-06-26
 */
@TableName("project_info")
public class ProjectInfo implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 项目名称
     */
    private String name;
    /**
     * 父项目标识
     */
    private Long pid;
    /**
     * 状态  00A-有效  00Z-失效
     */
    private String status;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 更新时间
     */
    @TableField("update_time")
    private Date updateTime;

    public Long getId() {
        return id;
    }

    public ProjectInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ProjectInfo setName(String name) {
        if (name != null)
            name = name.trim();
        this.name = name;
        return this;
    }

    public Long getPid() {
        return pid;
    }

    public ProjectInfo setPid(Long pid) {
        this.pid = pid;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public ProjectInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public ProjectInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public ProjectInfo setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "project_info";
    public static final String ID = "id";

    /**
     * 项目名称
     */
    public static final String NAME = "name";

    /**
     * 父项目标识
     */
    public static final String PID = "pid";

    /**
     * 状态  00A-有效  00Z-失效
     */
    public static final String STATUS = "status";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 更新时间
     */
    public static final String UPDATE_TIME = "update_time";

    @Override
    public ProjectInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

