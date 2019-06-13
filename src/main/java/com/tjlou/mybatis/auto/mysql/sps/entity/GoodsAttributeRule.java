package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 属性规则表
 * </p>
 *
 * @author Gaby
 * @since 2019-06-13
 */
@TableName("goods_attribute_rule")
public class GoodsAttributeRule implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 属性名称
     */
    private String name;
    /**
     * 店铺ID
     */
    private String shopUri;
    /**
     * 限定字符
     */
    private Integer characterNum;
    /**
     * 状态 00A-使用, 00B--未使用 00Z-失效
     */
    private String status;
    /**
     * 创建时间
     */
    private Date intime;

    public Long getId() {
        return id;
    }

    public GoodsAttributeRule setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public GoodsAttributeRule setName(String name) {
        if (name != null)
            name = name.trim();
        this.name = name;
        return this;
    }

    public String getShopUri() {
        return shopUri;
    }

    public GoodsAttributeRule setShopUri(String shopUri) {
        if (shopUri != null)
            shopUri = shopUri.trim();
        this.shopUri = shopUri;
        return this;
    }

    public Integer getCharacterNum() {
        return characterNum;
    }

    public GoodsAttributeRule setCharacterNum(Integer characterNum) {
        this.characterNum = characterNum;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public GoodsAttributeRule setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    public Date getIntime() {
        return intime;
    }

    public GoodsAttributeRule setIntime(Date intime) {
        this.intime = intime;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "goods_attribute_rule";
    public static final String ID = "id";

    /**
     * 属性名称
     */
    public static final String NAME = "name";

    /**
     * 店铺ID
     */
    public static final String SHOPURI = "shopUri";

    /**
     * 限定字符
     */
    public static final String CHARACTERNUM = "characterNum";

    /**
     * 状态 00A-使用, 00B--未使用 00Z-失效
     */
    public static final String STATUS = "status";

    /**
     * 创建时间
     */
    public static final String INTIME = "intime";

    @Override
    public GoodsAttributeRule pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

