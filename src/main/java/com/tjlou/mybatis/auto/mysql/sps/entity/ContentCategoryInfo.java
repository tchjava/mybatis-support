package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 广告分类表
 * </p>
 *
 * @author Gaby
 * @since 2019-08-21
 */
@TableName("content_category_info")
public class ContentCategoryInfo implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 分类名称
     */
    private String name;
    /**
     * 父节点
     */
    private Long pid;
    /**
     * 排序
     */
    private Integer sort;
    /**
     * 状态 00A-有效 00Z-失效
     */
    private String status;

    public Long getId() {
        return id;
    }

    public ContentCategoryInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ContentCategoryInfo setName(String name) {
        if (name != null)
            name = name.trim();
        this.name = name;
        return this;
    }

    public Long getPid() {
        return pid;
    }

    public ContentCategoryInfo setPid(Long pid) {
        this.pid = pid;
        return this;
    }

    public Integer getSort() {
        return sort;
    }

    public ContentCategoryInfo setSort(Integer sort) {
        this.sort = sort;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public ContentCategoryInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "content_category_info";
    public static final String ID = "id";

    /**
     * 分类名称
     */
    public static final String NAME = "name";

    /**
     * 父节点
     */
    public static final String PID = "pid";

    /**
     * 排序
     */
    public static final String SORT = "sort";

    /**
     * 状态 00A-有效 00Z-失效
     */
    public static final String STATUS = "status";

    @Override
    public ContentCategoryInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

