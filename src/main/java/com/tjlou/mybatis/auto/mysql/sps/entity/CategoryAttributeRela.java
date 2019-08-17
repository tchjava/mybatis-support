package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author Gaby
 * @since 2019-08-13
 */
@TableName("category_attribute_rela")
public class CategoryAttributeRela implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 分类标识
     */
    @TableField("category_id")
    private Long categoryId;
    /**
     * 父分类标识
     */
    @TableField("category_parent_id")
    private Long categoryParentId;
    /**
     * 属性标识
     */
    @TableField("attribute_id")
    private Long attributeId;
    /**
     * 状态 00A-有效  00Z-失效
     */
    private String status;
    /**
     * 描述
     */
    private String tab;
    /**
     * 规定长度
     */
    private Integer length;
    /**
     * 0-可选 1必选
     */
    private Integer option;
    /**
     * 排序
     */
    private Integer sort;

    public Long getId() {
        return id;
    }

    public CategoryAttributeRela setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public CategoryAttributeRela setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public Long getCategoryParentId() {
        return categoryParentId;
    }

    public CategoryAttributeRela setCategoryParentId(Long categoryParentId) {
        this.categoryParentId = categoryParentId;
        return this;
    }

    public Long getAttributeId() {
        return attributeId;
    }

    public CategoryAttributeRela setAttributeId(Long attributeId) {
        this.attributeId = attributeId;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public CategoryAttributeRela setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    public String getTab() {
        return tab;
    }

    public CategoryAttributeRela setTab(String tab) {
        if (tab != null)
            tab = tab.trim();
        this.tab = tab;
        return this;
    }

    public Integer getLength() {
        return length;
    }

    public CategoryAttributeRela setLength(Integer length) {
        this.length = length;
        return this;
    }

    public Integer getOption() {
        return option;
    }

    public CategoryAttributeRela setOption(Integer option) {
        this.option = option;
        return this;
    }

    public Integer getSort() {
        return sort;
    }

    public CategoryAttributeRela setSort(Integer sort) {
        this.sort = sort;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "category_attribute_rela";
    public static final String ID = "id";

    /**
     * 分类标识
     */
    public static final String CATEGORY_ID = "category_id";

    /**
     * 父分类标识
     */
    public static final String CATEGORY_PARENT_ID = "category_parent_id";

    /**
     * 属性标识
     */
    public static final String ATTRIBUTE_ID = "attribute_id";

    /**
     * 状态 00A-有效  00Z-失效
     */
    public static final String STATUS = "status";

    /**
     * 描述
     */
    public static final String TAB = "tab";

    /**
     * 规定长度
     */
    public static final String LENGTH = "length";

    /**
     * 0-可选 1必选
     */
    public static final String OPTION = "option";

    /**
     * 排序
     */
    public static final String SORT = "sort";

    @Override
    public CategoryAttributeRela pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

