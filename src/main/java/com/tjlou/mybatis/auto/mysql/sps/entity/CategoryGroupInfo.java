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
 * 分类分组表
 * </p>
 *
 * @author Gaby
 * @since 2020-08-17
 */
@TableName("category_group_info")
public class CategoryGroupInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 所属分类
     */
    @TableField("category_id")
    private Long categoryId;
    /**
     * 分组类型  1-万物拍  2-二手
     */
    @TableField("group_type")
    private Integer groupType;
    /**
     * 系统类型 1-超级仓库 2-锤定
     */
    @TableField("system_type")
    private Integer systemType;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;


    public Long getId() {
        return id;
    }

    public CategoryGroupInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public CategoryGroupInfo setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public Integer getGroupType() {
        return groupType;
    }

    public CategoryGroupInfo setGroupType(Integer groupType) {
        this.groupType = groupType;
        return this;
    }

    public Integer getSystemType() {
        return systemType;
    }

    public CategoryGroupInfo setSystemType(Integer systemType) {
        this.systemType = systemType;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public CategoryGroupInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "category_group_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 所属分类
     */
    public static final String CATEGORY_ID = "category_id";

    /**
     * 分组类型  1-万物拍  2-二手
     */
    public static final String GROUP_TYPE = "group_type";

    /**
     * 系统类型 1-超级仓库 2-锤定
     */
    public static final String SYSTEM_TYPE = "system_type";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";


    @Override
    public CategoryGroupInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

