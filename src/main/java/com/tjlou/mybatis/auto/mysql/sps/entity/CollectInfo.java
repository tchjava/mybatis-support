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
 * 收藏店铺信息表
 * </p>
 *
 * @author Gaby
 * @since 2019-08-03
 */
@TableName("collect_info")
public class CollectInfo implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 账号标识
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 商户标识
     */
    @TableField("supplier_id")
    private Long supplierId;
    /**
     * 商户ID
     */
    @TableField("shop_uri")
    private String shopUri;
    /**
     * 状态 00A-已收藏 00Z-已取消
     */
    private String status;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 修改时间
     */
    @TableField("modify_time")
    private Date modifyTime;

    public Long getId() {
        return id;
    }

    public CollectInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public CollectInfo setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public CollectInfo setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
        return this;
    }

    public String getShopUri() {
        return shopUri;
    }

    public CollectInfo setShopUri(String shopUri) {
        if (shopUri != null)
            shopUri = shopUri.trim();
        this.shopUri = shopUri;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public CollectInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public CollectInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public CollectInfo setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "collect_info";
    public static final String ID = "id";

    /**
     * 账号标识
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 商户标识
     */
    public static final String SUPPLIER_ID = "supplier_id";

    /**
     * 商户ID
     */
    public static final String SHOP_URI = "shop_uri";

    /**
     * 状态 00A-已收藏 00Z-已取消
     */
    public static final String STATUS = "status";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 修改时间
     */
    public static final String MODIFY_TIME = "modify_time";

    @Override
    public CollectInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

