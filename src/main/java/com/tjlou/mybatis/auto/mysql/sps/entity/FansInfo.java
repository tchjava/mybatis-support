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
 * 粉丝基本信息表
 * </p>
 *
 * @author Gaby
 * @since 2019-06-20
 */
@TableName("fans_info")
public class FansInfo implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 店铺ID
     */
    @TableField("shop_uri")
    private String shopUri;
    /**
     * 用户ID
     */
    @TableField("user_id")
    private String userId;
    /**
     * 创建时间
     */
    private Date intime;
    /**
     * 供货商标识
     */
    @TableField("supplier_id")
    private Long supplierId;

    public Long getId() {
        return id;
    }

    public FansInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getShopUri() {
        return shopUri;
    }

    public FansInfo setShopUri(String shopUri) {
        if (shopUri != null)
            shopUri = shopUri.trim();
        this.shopUri = shopUri;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public FansInfo setUserId(String userId) {
        if (userId != null)
            userId = userId.trim();
        this.userId = userId;
        return this;
    }

    public Date getIntime() {
        return intime;
    }

    public FansInfo setIntime(Date intime) {
        this.intime = intime;
        return this;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public FansInfo setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "fans_info";
    public static final String ID = "id";

    /**
     * 店铺ID
     */
    public static final String SHOP_URI = "shop_uri";

    /**
     * 用户ID
     */
    public static final String USER_ID = "user_id";

    /**
     * 创建时间
     */
    public static final String INTIME = "intime";

    /**
     * 供货商标识
     */
    public static final String SUPPLIER_ID = "supplier_id";

    @Override
    public FansInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

