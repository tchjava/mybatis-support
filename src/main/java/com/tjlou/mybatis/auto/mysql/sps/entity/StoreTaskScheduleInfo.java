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
 * 任务调度信息表
 * </p>
 *
 * @author Gaby
 * @since 2020-08-28
 */
@TableName("store_task_schedule_info")
public class StoreTaskScheduleInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 参数
     */
    private String params;
    /**
     * 类型
     */
    private Integer type;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 执行时间
     */
    @TableField("execute_time")
    private Date executeTime;
    /**
     * 记忆时间
     */
    @TableField("memory_time")
    private Date memoryTime;
    /**
     * 是否抢占  1-抢占 0-未抢占
     */
    private Integer grab;
    /**
     * 主机名 默认值： 1
     */
    @TableField("host_name")
    private Integer hostName;
    /**
     * 主体标识
     */
    @TableField("body_id")
    private Long bodyId;
    /**
     * 是否被回收 0-正常  1-回收
     */
    private Integer del;


    public Long getId() {
        return id;
    }

    public StoreTaskScheduleInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getParams() {
        return params;
    }

    public StoreTaskScheduleInfo setParams(String params) {
        if (params != null)
            params = params.trim();
        this.params = params;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public StoreTaskScheduleInfo setType(Integer type) {
        this.type = type;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public StoreTaskScheduleInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getExecuteTime() {
        return executeTime;
    }

    public StoreTaskScheduleInfo setExecuteTime(Date executeTime) {
        this.executeTime = executeTime;
        return this;
    }

    public Date getMemoryTime() {
        return memoryTime;
    }

    public StoreTaskScheduleInfo setMemoryTime(Date memoryTime) {
        this.memoryTime = memoryTime;
        return this;
    }

    public Integer getGrab() {
        return grab;
    }

    public StoreTaskScheduleInfo setGrab(Integer grab) {
        this.grab = grab;
        return this;
    }

    public Integer getHostName() {
        return hostName;
    }

    public StoreTaskScheduleInfo setHostName(Integer hostName) {
        this.hostName = hostName;
        return this;
    }

    public Long getBodyId() {
        return bodyId;
    }

    public StoreTaskScheduleInfo setBodyId(Long bodyId) {
        this.bodyId = bodyId;
        return this;
    }

    public Integer getDel() {
        return del;
    }

    public StoreTaskScheduleInfo setDel(Integer del) {
        this.del = del;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "store_task_schedule_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 参数
     */
    public static final String PARAMS = "params";

    /**
     * 类型
     */
    public static final String TYPE = "type";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 执行时间
     */
    public static final String EXECUTE_TIME = "execute_time";

    /**
     * 记忆时间
     */
    public static final String MEMORY_TIME = "memory_time";

    /**
     * 是否抢占  1-抢占 0-未抢占
     */
    public static final String GRAB = "grab";

    /**
     * 主机名 默认值： 1
     */
    public static final String HOST_NAME = "host_name";

    /**
     * 主体标识
     */
    public static final String BODY_ID = "body_id";

    /**
     * 是否被回收 0-正常  1-回收
     */
    public static final String DEL = "del";


    @Override
    public StoreTaskScheduleInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

