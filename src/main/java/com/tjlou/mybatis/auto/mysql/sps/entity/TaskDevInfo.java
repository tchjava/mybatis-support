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
 * @since 2020-01-10
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
    private Long project;
    /**
     * 模块
     */
    private String module;
    /**
     * 任务类型  1-需求  2-缺陷
     */
    @TableField("task_type")
    private Integer taskType;
    /**
     * 内容
     */
    private String content;
    /**
     * 优先级 1-不重要 2-次要 4-主要 8-严重
     */
    private Integer priority;
    /**
     * 开始时间
     */
    @TableField("start_time")
    private Date startTime;
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
     * 任务状态  00A-未开发 00B-开发中  00C-开发完成 00D-测试中 00E-已测试
     */
    private String status;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 任务单号
     */
    private String code;
    /**
     * 被指派者
     */
    private Long nominator;


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

    public Long getProject() {
        return project;
    }

    public TaskDevInfo setProject(Long project) {
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

    public Date getStartTime() {
        return startTime;
    }

    public TaskDevInfo setStartTime(Date startTime) {
        this.startTime = startTime;
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

    public Date getCreateTime() {
        return createTime;
    }

    public TaskDevInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCode() {
        return code;
    }

    public TaskDevInfo setCode(String code) {
        if (code != null)
            code = code.trim();
        this.code = code;
        return this;
    }

    public Long getNominator() {
        return nominator;
    }

    public TaskDevInfo setNominator(Long nominator) {
        this.nominator = nominator;
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
     * 任务类型  1-需求  2-缺陷
     */
    public static final String TASK_TYPE = "task_type";

    /**
     * 内容
     */
    public static final String CONTENT = "content";

    /**
     * 优先级 1-不重要 2-次要 4-主要 8-严重
     */
    public static final String PRIORITY = "priority";

    /**
     * 开始时间
     */
    public static final String START_TIME = "start_time";

    /**
     * 结束时间
     */
    public static final String END_TIME = "end_time";

    /**
     * 预期工期
     */
    public static final String EXPECT = "expect";

    /**
     * 任务状态  00A-未开发 00B-开发中  00C-开发完成 00D-测试中 00E-已测试
     */
    public static final String STATUS = "status";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 任务单号
     */
    public static final String CODE = "code";

    /**
     * 被指派者
     */
    public static final String NOMINATOR = "nominator";


    @Override
    public TaskDevInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

