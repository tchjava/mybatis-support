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
 * 项目信息表
 * </p>
 *
 * @author Gaby
 * @since 2020-01-07
 */
@TableName("task_project_info")
public class TaskProjectInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 项目名称
     */
    private String name;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 状态 00A-有效  00Z-失效
     */
    private String status;


    public Long getId() {
        return id;
    }

    public TaskProjectInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public TaskProjectInfo setName(String name) {
        if (name != null)
            name = name.trim();
        this.name = name;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public TaskProjectInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public TaskProjectInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "task_project_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 项目名称
     */
    public static final String NAME = "name";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 状态 00A-有效  00Z-失效
     */
    public static final String STATUS = "status";


    @Override
    public TaskProjectInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

