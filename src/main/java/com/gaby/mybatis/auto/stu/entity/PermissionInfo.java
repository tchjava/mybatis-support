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
@TableName("permission_info")
public class PermissionInfo implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 资源名称
     */
    private String name;
    /**
     * 资源类型:menu,button
     */
    private String type;
    /**
     * 访问地址
     */
    private String url;
    /**
     * 权限代码字符串
     */
    private String percode;
    /**
     * 父节点
     */
    @TableField("parent_id")
    private Long parentId;
    /**
     * 路径
     */
    private String path;
    /**
     * 排序号
     */
    private Integer sort;
    /**
     * 状态: 00A-可用 00Z-不可用
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

    public PermissionInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public PermissionInfo setName(String name) {
        if (name != null)
            name = name.trim();
        this.name = name;
        return this;
    }

    public String getType() {
        return type;
    }

    public PermissionInfo setType(String type) {
        if (type != null)
            type = type.trim();
        this.type = type;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public PermissionInfo setUrl(String url) {
        if (url != null)
            url = url.trim();
        this.url = url;
        return this;
    }

    public String getPercode() {
        return percode;
    }

    public PermissionInfo setPercode(String percode) {
        if (percode != null)
            percode = percode.trim();
        this.percode = percode;
        return this;
    }

    public Long getParentId() {
        return parentId;
    }

    public PermissionInfo setParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }

    public String getPath() {
        return path;
    }

    public PermissionInfo setPath(String path) {
        if (path != null)
            path = path.trim();
        this.path = path;
        return this;
    }

    public Integer getSort() {
        return sort;
    }

    public PermissionInfo setSort(Integer sort) {
        this.sort = sort;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public PermissionInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public PermissionInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "permission_info";
    public static final String ID = "id";

    /**
     * 资源名称
     */
    public static final String NAME = "name";

    /**
     * 资源类型:menu,button
     */
    public static final String TYPE = "type";

    /**
     * 访问地址
     */
    public static final String URL = "url";

    /**
     * 权限代码字符串
     */
    public static final String PERCODE = "percode";

    /**
     * 父节点
     */
    public static final String PARENT_ID = "parent_id";

    /**
     * 路径
     */
    public static final String PATH = "path";

    /**
     * 排序号
     */
    public static final String SORT = "sort";

    /**
     * 状态: 00A-可用 00Z-不可用
     */
    public static final String STATUS = "status";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    @Override
    public PermissionInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

