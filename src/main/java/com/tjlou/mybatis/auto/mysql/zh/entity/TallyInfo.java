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
 * 记账表
 * </p>
 *
 * @author Gaby
 * @since 2019-07-09
 */
@TableName("tally_info")
public class TallyInfo implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 项目名称
     */
    @TableField("project_name")
    private String projectName;
    /**
     * 项目标识
     */
    @TableField("project_id")
    private Long projectId;
    /**
     * 金额  单位分
     */
    private Integer money;
    /**
     * 记账类型  1-收入  2-支出
     */
    private Integer type;
    /**
     * 状态   00A-有效  00B-归档  00Z-失效
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
    /**
     * 备注
     */
    private String comment;
    /**
     * 经手人
     */
    @TableField("handler_id")
    private Long handlerId;
    /**
     * 往来单位
     */
    @TableField("come_id")
    private Long comeId;

    public Long getId() {
        return id;
    }

    public TallyInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getProjectName() {
        return projectName;
    }

    public TallyInfo setProjectName(String projectName) {
        if (projectName != null)
            projectName = projectName.trim();
        this.projectName = projectName;
        return this;
    }

    public Long getProjectId() {
        return projectId;
    }

    public TallyInfo setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }

    public Integer getMoney() {
        return money;
    }

    public TallyInfo setMoney(Integer money) {
        this.money = money;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public TallyInfo setType(Integer type) {
        this.type = type;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public TallyInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public TallyInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public TallyInfo setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public TallyInfo setComment(String comment) {
        if (comment != null)
            comment = comment.trim();
        this.comment = comment;
        return this;
    }

    public Long getHandlerId() {
        return handlerId;
    }

    public TallyInfo setHandlerId(Long handlerId) {
        this.handlerId = handlerId;
        return this;
    }

    public Long getComeId() {
        return comeId;
    }

    public TallyInfo setComeId(Long comeId) {
        this.comeId = comeId;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "tally_info";
    public static final String ID = "id";

    /**
     * 项目名称
     */
    public static final String PROJECTNAME = "projectName";

    /**
     * 项目标识
     */
    public static final String PROJECT_ID = "project_id";

    /**
     * 金额  单位分
     */
    public static final String MONEY = "money";

    /**
     * 记账类型  1-收入  2-支出
     */
    public static final String TYPE = "type";

    /**
     * 状态   00A-有效  00B-归档  00Z-失效
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

    /**
     * 备注
     */
    public static final String COMMENT = "comment";

    /**
     * 经手人
     */
    public static final String HANDLER_ID = "handler_id";

    /**
     * 往来单位
     */
    public static final String COME_ID = "come_id";

    @Override
    public TallyInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

