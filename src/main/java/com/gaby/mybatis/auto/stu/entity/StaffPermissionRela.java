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
 *
 * </p>
 *
 * @author Gaby
 * @since 2019-05-05
 */
@TableName("staff_permission_rela")
public class StaffPermissionRela implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 身份类型标识
     */
    @TableField("staff_type_id")
    private Long staffTypeId;
    /**
     * 权限标识
     */
    @TableField("pi_id")
    private Long piId;
    /**
     * 状态 00A-生效 00Z-失效
     */
    private String status;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;

    public Long getId() {
        return id;
    }

    public StaffPermissionRela setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getStaffTypeId() {
        return staffTypeId;
    }

    public StaffPermissionRela setStaffTypeId(Long staffTypeId) {
        this.staffTypeId = staffTypeId;
        return this;
    }

    public Long getPiId() {
        return piId;
    }

    public StaffPermissionRela setPiId(Long piId) {
        this.piId = piId;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public StaffPermissionRela setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public StaffPermissionRela setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "staff_permission_rela";
    public static final String ID = "id";

    /**
     * 身份类型标识
     */
    public static final String STAFF_TYPE_ID = "staff_type_id";

    /**
     * 权限标识
     */
    public static final String PI_ID = "pi_id";

    /**
     * 状态 00A-生效 00Z-失效
     */
    public static final String STATUS = "status";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    @Override
    public StaffPermissionRela pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

