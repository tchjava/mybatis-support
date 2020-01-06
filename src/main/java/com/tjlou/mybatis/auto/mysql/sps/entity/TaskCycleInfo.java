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
 * 任务周期表
 * </p>
 *
 * @author Gaby
 * @since 2020-01-06
 */
@TableName("task_cycle_info")
public class TaskCycleInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 任务标识
     */
    @TableField("task_dev_id")
    private Long taskDevId;
    /**
     * 被指派者
     */
    @TableField("account_id")
    private Long accountId;
    /**
     * 开始时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 结束时间
     */
    @TableField("end_time")
    private Date endTime;
    /**
     * 任务状态  00A-未完成 00B-开发中 00C-已完成 00D-已测试
     */
    private String status;


    public Long getId() {
        return id;
    }

    public TaskCycleInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getTaskDevId() {
        return taskDevId;
    }

    public TaskCycleInfo setTaskDevId(Long taskDevId) {
        this.taskDevId = taskDevId;
        return this;
    }

    public Long getAccountId() {
        return accountId;
    }

    public TaskCycleInfo setAccountId(Long accountId) {
        this.accountId = accountId;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public TaskCycleInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getEndTime() {
        return endTime;
    }

    public TaskCycleInfo setEndTime(Date endTime) {
        this.endTime = endTime;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public TaskCycleInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "task_cycle_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 任务标识
     */
    public static final String TASK_DEV_ID = "task_dev_id";

    /**
     * 被指派者
     */
    public static final String ACCOUNT_ID = "account_id";

    /**
     * 开始时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 结束时间
     */
    public static final String END_TIME = "end_time";

    /**
     * 任务状态  00A-未完成 00B-开发中 00C-已完成 00D-已测试
     */
    public static final String STATUS = "status";


    @Override
    public TaskCycleInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

