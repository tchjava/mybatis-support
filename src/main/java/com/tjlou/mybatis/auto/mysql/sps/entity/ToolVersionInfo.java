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
 * 客户端版本信息表
 * </p>
 *
 * @author Gaby
 * @since 2019-11-24
 */
@TableName("tool_version_info")
public class ToolVersionInfo implements Serializable, IEntity {


    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 名称
     */
    private String name;
    /**
     * 版本号
     */
    private String version;
    /**
     * 下载路径
     */
    private String path;
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


    public Long getId() {
        return id;
    }

    public ToolVersionInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ToolVersionInfo setName(String name) {
        if (name != null)
            name = name.trim();
        this.name = name;
        return this;
    }

    public String getVersion() {
        return version;
    }

    public ToolVersionInfo setVersion(String version) {
        if (version != null)
            version = version.trim();
        this.version = version;
        return this;
    }

    public String getPath() {
        return path;
    }

    public ToolVersionInfo setPath(String path) {
        if (path != null)
            path = path.trim();
        this.path = path;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public ToolVersionInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public ToolVersionInfo setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "tool_version_info";
    public static final String ID = "id";

    /**
     * 名称
     */
    public static final String NAME = "name";

    /**
     * 版本号
     */
    public static final String VERSION = "version";

    /**
     * 下载路径
     */
    public static final String PATH = "path";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 修改时间
     */
    public static final String MODIFY_TIME = "modify_time";


    @Override
    public ToolVersionInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

