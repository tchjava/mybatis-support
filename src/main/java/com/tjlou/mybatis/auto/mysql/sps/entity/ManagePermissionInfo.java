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
 * 权限信息表
 * </p>
 *
 * @author Gaby
 * @since 2019-08-15
 */
@TableName("manage_permission_info")
public class ManagePermissionInfo implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 父节点
     */
    @TableField("parent_id")
    private Long parentId;
    /**
     * 权限名称
     */
    private String name;
    /**
     * 权限标识
     */
    private String percode;
    /**
     * 类型  0-按钮 1-菜单
     */
    private Integer type;
    /**
     * 访问地址
     */
    private String url;
    /**
     * 状态  00A-有效 00Z-失效
     */
    private String status;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 路径
     */
    private String path;
    /**
     * 图标
     */
    private String icon;

    public Long getId() {
        return id;
    }

    public ManagePermissionInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getParentId() {
        return parentId;
    }

    public ManagePermissionInfo setParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }

    public String getName() {
        return name;
    }

    public ManagePermissionInfo setName(String name) {
        if (name != null)
            name = name.trim();
        this.name = name;
        return this;
    }

    public String getPercode() {
        return percode;
    }

    public ManagePermissionInfo setPercode(String percode) {
        if (percode != null)
            percode = percode.trim();
        this.percode = percode;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public ManagePermissionInfo setType(Integer type) {
        this.type = type;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public ManagePermissionInfo setUrl(String url) {
        if (url != null)
            url = url.trim();
        this.url = url;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public ManagePermissionInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public ManagePermissionInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getPath() {
        return path;
    }

    public ManagePermissionInfo setPath(String path) {
        if (path != null)
            path = path.trim();
        this.path = path;
        return this;
    }

    public String getIcon() {
        return icon;
    }

    public ManagePermissionInfo setIcon(String icon) {
        if (icon != null)
            icon = icon.trim();
        this.icon = icon;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "manage_permission_info";
    public static final String ID = "id";

    /**
     * 父节点
     */
    public static final String PARENT_ID = "parent_id";

    /**
     * 权限名称
     */
    public static final String NAME = "name";

    /**
     * 权限标识
     */
    public static final String PERCODE = "percode";

    /**
     * 类型  0-按钮 1-菜单
     */
    public static final String TYPE = "type";

    /**
     * 访问地址
     */
    public static final String URL = "url";

    /**
     * 状态  00A-有效 00Z-失效
     */
    public static final String STATUS = "status";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 路径
     */
    public static final String PATH = "path";

    /**
     * 图标
     */
    public static final String ICON = "icon";

    @Override
    public ManagePermissionInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

