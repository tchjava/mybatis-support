package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 拍品拓展信息表
 * </p>
 *
 * @author Gaby
 * @since 2020-06-03
 */
@TableName("auction_product_ext_info")
public class AuctionProductExtInfo implements Serializable, IEntity {


    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 拍品标识
     */
    @TableField("product_id")
    private Long productId;
    /**
     * 描述
     */
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

    public AuctionProductExtInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getProductId() {
        return productId;
    }

    public AuctionProductExtInfo setProductId(Long productId) {
        this.productId = productId;
        return this;
    }

    public String getContent() {
        return content;
    }

    public AuctionProductExtInfo setContent(String content) {
        if (content != null)
            content = content.trim();
        this.content = content;
        return this;
    }

    public String getAttributeJson() {
        return attributeJson;
    }

    public AuctionProductExtInfo setAttributeJson(String attributeJson) {
        if (attributeJson != null)
            attributeJson = attributeJson.trim();
        this.attributeJson = attributeJson;
        return this;
    }

    public String getAttributeValue() {
        return attributeValue;
    }

    public AuctionProductExtInfo setAttributeValue(String attributeValue) {
        if (attributeValue != null)
            attributeValue = attributeValue.trim();
        this.attributeValue = attributeValue;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_product_ext_info";
    public static final String ID = "id";

    /**
     * 拍品标识
     */
    public static final String PRODUCT_ID = "product_id";

    /**
     * 描述
     */
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
    public AuctionProductExtInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

