package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 拍品实例拓展信息表
 * </p>
 *
 * @author Gaby
 * @since 2020-06-03
 */
@TableName("product_instance_ext_info")
public class ProductInstanceExtInfo implements Serializable, IEntity {


    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    @TableField("instance_id")
    private Long instanceId;
    private String content;
    /**
     * 属性信息
     */
    @TableField("attribute_json")
    private String attributeJson;
    /**
     * 属性值
     */
    @TableField("attribute_value")
    private String attributeValue;


    public Long getId() {
        return id;
    }

    public ProductInstanceExtInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getInstanceId() {
        return instanceId;
    }

    public ProductInstanceExtInfo setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getContent() {
        return content;
    }

    public ProductInstanceExtInfo setContent(String content) {
        if (content != null)
            content = content.trim();
        this.content = content;
        return this;
    }

    public String getAttributeJson() {
        return attributeJson;
    }

    public ProductInstanceExtInfo setAttributeJson(String attributeJson) {
        if (attributeJson != null)
            attributeJson = attributeJson.trim();
        this.attributeJson = attributeJson;
        return this;
    }

    public String getAttributeValue() {
        return attributeValue;
    }

    public ProductInstanceExtInfo setAttributeValue(String attributeValue) {
        if (attributeValue != null)
            attributeValue = attributeValue.trim();
        this.attributeValue = attributeValue;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "product_instance_ext_info";
    public static final String ID = "id";

    public static final String INSTANCE_ID = "instance_id";

    public static final String CONTENT = "content";

    /**
     * 属性信息
     */
    public static final String ATTRIBUTE_JSON = "attribute_json";

    /**
     * 属性值
     */
    public static final String ATTRIBUTE_VALUE = "attribute_value";


    @Override
    public ProductInstanceExtInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

