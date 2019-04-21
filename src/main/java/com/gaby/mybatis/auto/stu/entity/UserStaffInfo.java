package com.gaby.mybatis.auto.stu.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.gaby.mybatis.base.entity.IEntity;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 用户身份表
 * </p>
 *
 * @author Gaby
 * @since 2019-04-19
 */
@TableName("user_staff_info")
public class UserStaffInfo implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 帐号标识
     */
    @TableField("user_id")
    private Long userId;
    /**
     * 名称
     */
    private String name;
    /**
     * 类型 0-超级管理员 1-学生 2-教师
     */
    private Integer type;
    /**
     * 状态 00A-生效 00Z-失效
     */
    private String status;
    /**
     * 备注
     */
    private String comment;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 修改时间
     */
    @TableField("modify_time")
    private Date modifyTime;
    /**
     * 状态时间
     */
    @TableField("status_time")
    private Date statusTime;

    public Long getId() {
        return id;
    }

    public UserStaffInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getUserId() {
        return userId;
    }

    public UserStaffInfo setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    public String getName() {
        return name;
    }

    public UserStaffInfo setName(String name) {
        if (name != null)
            name = name.trim();
        this.name = name;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public UserStaffInfo setType(Integer type) {
        this.type = type;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public UserStaffInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public UserStaffInfo setComment(String comment) {
        if (comment != null)
            comment = comment.trim();
        this.comment = comment;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public UserStaffInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public UserStaffInfo setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }

    public Date getStatusTime() {
        return statusTime;
    }

    public UserStaffInfo setStatusTime(Date statusTime) {
        this.statusTime = statusTime;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "user_staff_info";
    public static final String ID = "id";

    /**
     * 帐号标识
     */
    public static final String USER_ID = "user_id";

    /**
     * 名称
     */
    public static final String NAME = "name";

    /**
     * 类型 0-超级管理员 1-学生 2-教师
     */
    public static final String TYPE = "type";

    /**
     * 状态 00A-生效 00Z-失效
     */
    public static final String STATUS = "status";

    /**
     * 备注
     */
    public static final String COMMENT = "comment";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 修改时间
     */
    public static final String MODIFY_TIME = "modify_time";

    /**
     * 状态时间
     */
    public static final String STATUS_TIME = "status_time";

    @Override
    public UserStaffInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

