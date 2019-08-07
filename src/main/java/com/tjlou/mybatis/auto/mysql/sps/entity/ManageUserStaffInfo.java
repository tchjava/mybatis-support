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
 * 用户身份信息表
 * </p>
 *
 * @author Gaby
 * @since 2019-08-07
 */
@TableName("manage_user_staff_info")
public class ManageUserStaffInfo implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 后台帐号标识
     */
    @TableField("manage_account_id")
    private Long manageAccountId;
    /**
     * 身份标识
     */
    @TableField("staff_id")
    private Long staffId;
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
     * 状态  00A-有效  00Z-失效
     */
    private String status;

    public Long getId() {
        return id;
    }

    public ManageUserStaffInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getManageAccountId() {
        return manageAccountId;
    }

    public ManageUserStaffInfo setManageAccountId(Long manageAccountId) {
        this.manageAccountId = manageAccountId;
        return this;
    }

    public Long getStaffId() {
        return staffId;
    }

    public ManageUserStaffInfo setStaffId(Long staffId) {
        this.staffId = staffId;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public ManageUserStaffInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public ManageUserStaffInfo setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public ManageUserStaffInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "manage_user_staff_info";
    public static final String ID = "id";

    /**
     * 后台帐号标识
     */
    public static final String MANAGE_ACCOUNT_ID = "manage_account_id";

    /**
     * 身份标识
     */
    public static final String STAFF_ID = "staff_id";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 修改时间
     */
    public static final String MODIFY_TIME = "modify_time";

    /**
     * 状态  00A-有效  00Z-失效
     */
    public static final String STATUS = "status";

    @Override
    public ManageUserStaffInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

