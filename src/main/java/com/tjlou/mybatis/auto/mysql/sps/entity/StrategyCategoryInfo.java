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
 * 攻略分类表
 * </p>
 *
 * @author Gaby
 * @since 2020-04-16
 */
@TableName("strategy_category_info")
public class StrategyCategoryInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 分类名称
     */
    private String name;
    /**
     * 父级分类
     */
    @TableField("parent_id")
    private Long parentId;
    /**
     * 排序
     */
    private Integer sort;
    /**
     * 状态 00A-有效 00Z-失效
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

    public StrategyCategoryInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public StrategyCategoryInfo setName(String name) {
        if (name != null)
            name = name.trim();
        this.name = name;
        return this;
    }

    public Long getParentId() {
        return parentId;
    }

    public StrategyCategoryInfo setParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }

    public Integer getSort() {
        return sort;
    }

    public StrategyCategoryInfo setSort(Integer sort) {
        this.sort = sort;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public StrategyCategoryInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public StrategyCategoryInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "strategy_category_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 分类名称
     */
    public static final String NAME = "name";

    /**
     * 父级分类
     */
    public static final String PARENT_ID = "parent_id";

    /**
     * 排序
     */
    public static final String SORT = "sort";

    /**
     * 状态 00A-有效 00Z-失效
     */
    public static final String STATUS = "status";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";


    @Override
    public StrategyCategoryInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

