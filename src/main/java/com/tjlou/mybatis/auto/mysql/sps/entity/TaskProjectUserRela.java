package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 项目人员关联表
 * </p>
 *
 * @author Gaby
 * @since 2020-01-06
 */
@TableName("task_project_user_rela")
public class TaskProjectUserRela implements Serializable, IEntity {


    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 项目标识
     */
    @TableField("project_id")
    private Long projectId;
    /**
     * 后台用户标识
     */
    @TableField("account_id")
    private Long accountId;


    public Long getId() {
        return id;
    }

    public TaskProjectUserRela setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getProjectId() {
        return projectId;
    }

    public TaskProjectUserRela setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }

    public Long getAccountId() {
        return accountId;
    }

    public TaskProjectUserRela setAccountId(Long accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "task_project_user_rela";
    public static final String ID = "id";

    /**
     * 项目标识
     */
    public static final String PROJECT_ID = "project_id";

    /**
     * 后台用户标识
     */
    public static final String ACCOUNT_ID = "account_id";


    @Override
    public TaskProjectUserRela pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

