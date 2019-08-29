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
 * 金币任务实例表
 * </p>
 *
 * @author Gaby
 * @since 2019-08-29
 */
@TableName("bill_coin_task_instance")
public class BillCoinTaskInstance implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 任务标识
     */
    @TableField("task_id")
    private Long taskId;
    /**
     * 用户标识
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 完成时间
     */
    @TableField("complete_time")
    private Date completeTime;

    public Long getId() {
        return id;
    }

    public BillCoinTaskInstance setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getTaskId() {
        return taskId;
    }

    public BillCoinTaskInstance setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public BillCoinTaskInstance setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Date getCompleteTime() {
        return completeTime;
    }

    public BillCoinTaskInstance setCompleteTime(Date completeTime) {
        this.completeTime = completeTime;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "bill_coin_task_instance";
    public static final String ID = "id";

    /**
     * 任务标识
     */
    public static final String TASK_ID = "task_id";

    /**
     * 用户标识
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 完成时间
     */
    public static final String COMPLETE_TIME = "complete_time";

    @Override
    public BillCoinTaskInstance pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

