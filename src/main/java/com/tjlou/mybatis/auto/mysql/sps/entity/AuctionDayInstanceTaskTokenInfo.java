package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 天天竞拍实例任务token记录表
 * </p>
 *
 * @author Gaby
 * @since 2021-01-14
 */
@TableName("auction_day_instance_task_token_info")
public class AuctionDayInstanceTaskTokenInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 所属实例标识
     */
    @TableField("instance_id")
    private Long instanceId;
    /**
     * 用于记忆有效任务的token
     */
    private String token;
    /**
     * 任务类型
     */
    @TableField("task_type")
    private Integer taskType;


    public Long getId() {
        return id;
    }

    public AuctionDayInstanceTaskTokenInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getInstanceId() {
        return instanceId;
    }

    public AuctionDayInstanceTaskTokenInfo setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getToken() {
        return token;
    }

    public AuctionDayInstanceTaskTokenInfo setToken(String token) {
        if (token != null)
            token = token.trim();
        this.token = token;
        return this;
    }

    public Integer getTaskType() {
        return taskType;
    }

    public AuctionDayInstanceTaskTokenInfo setTaskType(Integer taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_day_instance_task_token_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 所属实例标识
     */
    public static final String INSTANCE_ID = "instance_id";

    /**
     * 用于记忆有效任务的token
     */
    public static final String TOKEN = "token";

    /**
     * 任务类型
     */
    public static final String TASK_TYPE = "task_type";


    @Override
    public AuctionDayInstanceTaskTokenInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

