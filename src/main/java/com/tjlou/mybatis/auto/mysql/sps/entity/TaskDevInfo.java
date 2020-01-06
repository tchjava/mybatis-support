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
 * 任务信息表
 * </p>
 *
 * @author Gaby
 * @since 2020-01-06
 */
@TableName("task_dev_info")
public class TaskDevInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 标题
     */
    private String title;
    /**
     * 创建者
     */
    @TableField("operator_id")
    private Long operatorId;
    /**
     * 所属项目
     */
    private String project;
    /**
     * 模块
     */
    private String module;
    /**
     * 任务类型
     */
    @TableField("task_type")
    private Integer taskType;
    /**
     * 内容
     */
    private String content;
    /**
     * 优先级
     */
    private Integer priority;
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
     * 预期工期
     */
    private Integer expect;
    /**
     * 任务状态
     */
    private String status;


    public Long getId() {
        return id;
    }

    public TaskDevInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public TaskDevInfo setTitle(String title) {
        if (title != null)
            title = title.trim();
        this.title = title;
        return this;
    }

    public Long getOperatorId() {
        return operatorId;
    }

    public TaskDevInfo setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
        return this;
    }

    public String getProject() {
        return project;
    }

    public TaskDevInfo setProject(String project) {
        if (project != null)
            project = project.trim();
        this.project = project;
        return this;
    }

    public String getModule() {
        return module;
    }

    public TaskDevInfo setModule(String module) {
        if (module != null)
            module = module.trim();
        this.module = module;
        return this;
    }

    public Integer getTaskType() {
        return taskType;
    }

    public TaskDevInfo setTaskType(Integer taskType) {
        this.taskType = taskType;
        return this;
    }

    public String getContent() {
        return content;
    }

    public TaskDevInfo setContent(String content) {
        if (content != null)
            content = content.trim();
        this.content = content;
        return this;
    }

    public Integer getPriority() {
        return priority;
    }

    public TaskDevInfo setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public TaskDevInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getEndTime() {
        return endTime;
    }

    public TaskDevInfo setEndTime(Date endTime) {
        this.endTime = endTime;
        return this;
    }

    public Integer getExpect() {
        return expect;
    }

    public TaskDevInfo setExpect(Integer expect) {
        this.expect = expect;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public TaskDevInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "task_dev_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 标题
     */
    public static final String TITLE = "title";

    /**
     * 创建者
     */
    public static final String OPERATOR_ID = "operator_id";

    /**
     * 所属项目
     */
    public static final String PROJECT = "project";

    /**
     * 模块
     */
    public static final String MODULE = "module";

    /**
     * 任务类型
     */
    public static final String TASK_TYPE = "task_type";

    /**
     * 内容
     */
    public static final String CONTENT = "content";

    /**
     * 优先级
     */
    public static final String PRIORITY = "priority";

    /**
     * 开始时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 结束时间
     */
    public static final String END_TIME = "end_time";

    /**
     * 预期工期
     */
    public static final String EXPECT = "expect";

    /**
     * 任务状态
     */
    public static final String STATUS = "status";


    @Override
    public TaskDevInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

