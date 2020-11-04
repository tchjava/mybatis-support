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
 * 分类信息表
 * </p>
 *
 * @author Gaby
 * @since 2020-11-04
 */
@TableName("category_info")
public class CategoryInfo implements Serializable, IEntity {


    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 父类ID
     */
    @TableField("parent_id")
    private Long parentId;
    /**
     * 分类名称
     */
    private String name;
    /**
     * 创建时间
     */
    private Date intime;
    /**
     * 状态 00A-有效,00B-失效,00Z-已删除
     */
    private String status;
    /**
     * 路径(预留)
     */
    private String path;
    /**
     * 店铺Id(预留)
     */
    @TableField("shop_uri")
    private String shopUri;
    /**
     * 分类图片
     */
    private String icon;
    /**
     * 范围 1-超级仓库  2-拍卖
     */
    private Integer type;
    /**
     * 近x天点击的商品数量
     */
    @TableField("product__click_num")
    private Integer productClickNum;


    public Long getId() {
        return id;
    }

    public CategoryInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getParentId() {
        return parentId;
    }

    public CategoryInfo setParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }

    public String getName() {
        return name;
    }

    public CategoryInfo setName(String name) {
        if (name != null)
            name = name.trim();
        this.name = name;
        return this;
    }

    public Date getIntime() {
        return intime;
    }

    public CategoryInfo setIntime(Date intime) {
        this.intime = intime;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public CategoryInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    public String getPath() {
        return path;
    }

    public CategoryInfo setPath(String path) {
        if (path != null)
            path = path.trim();
        this.path = path;
        return this;
    }

    public String getShopUri() {
        return shopUri;
    }

    public CategoryInfo setShopUri(String shopUri) {
        if (shopUri != null)
            shopUri = shopUri.trim();
        this.shopUri = shopUri;
        return this;
    }

    public String getIcon() {
        return icon;
    }

    public CategoryInfo setIcon(String icon) {
        if (icon != null)
            icon = icon.trim();
        this.icon = icon;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public CategoryInfo setType(Integer type) {
        this.type = type;
        return this;
    }

    public Integer getProductClickNum() {
        return productClickNum;
    }

    public CategoryInfo setProductClickNum(Integer productClickNum) {
        this.productClickNum = productClickNum;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "category_info";
    public static final String ID = "id";

    /**
     * 父类ID
     */
    public static final String PARENT_ID = "parent_id";

    /**
     * 分类名称
     */
    public static final String NAME = "name";

    /**
     * 创建时间
     */
    public static final String INTIME = "intime";

    /**
     * 状态 00A-有效,00B-失效,00Z-已删除
     */
    public static final String STATUS = "status";

    /**
     * 路径(预留)
     */
    public static final String PATH = "path";

    /**
     * 店铺Id(预留)
     */
    public static final String SHOP_URI = "shop_uri";

    /**
     * 分类图片
     */
    public static final String ICON = "icon";

    /**
     * 范围 1-超级仓库  2-拍卖
     */
    public static final String TYPE = "type";

    /**
     * 近x天点击的商品数量
     */
    public static final String PRODUCT__CLICK_NUM = "product__click_num";


    @Override
    public CategoryInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

