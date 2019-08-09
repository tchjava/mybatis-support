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
 * @since 2019-08-09
 */
@TableName("attribute_tag_rela")
public class AttributeTagRela implements Serializable, IEntity {

    /**
     * 主键标识
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 属性标识
     */
    @TableField("attribute_id")
    private Long attributeId;
    /**
     * 标签标识
     */
    @TableField("tag_id")
    private Long tagId;
    /**
     * 状态 00A-有效  00Z-失效
     */
    private String status;

    public Long getId() {
        return id;
    }

    public AttributeTagRela setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getAttributeId() {
        return attributeId;
    }

    public AttributeTagRela setAttributeId(Long attributeId) {
        this.attributeId = attributeId;
        return this;
    }

    public Long getTagId() {
        return tagId;
    }

    public AttributeTagRela setTagId(Long tagId) {
        this.tagId = tagId;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public AttributeTagRela setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "attribute_tag_rela";
    /**
     * 主键标识
     */
    public static final String ID = "id";

    /**
     * 属性标识
     */
    public static final String ATTRIBUTE_ID = "attribute_id";

    /**
     * 标签标识
     */
    public static final String TAG_ID = "tag_id";

    /**
     * 状态 00A-有效  00Z-失效
     */
    public static final String STATUS = "status";

    @Override
    public AttributeTagRela pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

