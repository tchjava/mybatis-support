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
 * 模板信息表
 * </p>
 *
 * @author Gaby
 * @since 2020-05-15
 */
@TableName("templete_info")
public class TempleteInfo implements Serializable, IEntity {


    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    private String name;
    private String path;
    @TableField("create_time")
    private Date createTime;
    @TableField("operator_id")
    private Long operatorId;
    /**
     * 状态 00A-有效 00Z-无效
     */
    private String status;
    /**
     * 类型 1-模板  2-开发文档
     */
    private Integer type;


    public Long getId() {
        return id;
    }

    public TempleteInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public TempleteInfo setName(String name) {
        if (name != null)
            name = name.trim();
        this.name = name;
        return this;
    }

    public String getPath() {
        return path;
    }

    public TempleteInfo setPath(String path) {
        if (path != null)
            path = path.trim();
        this.path = path;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public TempleteInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Long getOperatorId() {
        return operatorId;
    }

    public TempleteInfo setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public TempleteInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public TempleteInfo setType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "templete_info";
    public static final String ID = "id";

    public static final String NAME = "name";

    public static final String PATH = "path";

    public static final String CREATE_TIME = "create_time";

    public static final String OPERATOR_ID = "operator_id";

    /**
     * 状态 00A-有效 00Z-无效
     */
    public static final String STATUS = "status";

    /**
     * 类型 1-模板  2-开发文档
     */
    public static final String TYPE = "type";


    @Override
    public TempleteInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

