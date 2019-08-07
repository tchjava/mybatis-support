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
 * 权限角色关联表
 * </p>
 *
 * @author Gaby
 * @since 2019-08-07
 */
@TableName("manage_permission_staff_rela")
public class ManagePermissionStaffRela implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 角色标识
     */
    @TableField("staff_id")
    private Long staffId;
    /**
     * 权限标识
     */
    @TableField("per_id")
    private Long perId;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 状态
     */
    private String status;

    public Long getId() {
        return id;
    }

    public ManagePermissionStaffRela setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getStaffId() {
        return staffId;
    }

    public ManagePermissionStaffRela setStaffId(Long staffId) {
        this.staffId = staffId;
        return this;
    }

    public Long getPerId() {
        return perId;
    }

    public ManagePermissionStaffRela setPerId(Long perId) {
        this.perId = perId;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public ManagePermissionStaffRela setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public ManagePermissionStaffRela setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "manage_permission_staff_rela";
    public static final String ID = "id";

    /**
     * 角色标识
     */
    public static final String STAFF_ID = "staff_id";

    /**
     * 权限标识
     */
    public static final String PER_ID = "per_id";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 状态
     */
    public static final String STATUS = "status";

    @Override
    public ManagePermissionStaffRela pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

