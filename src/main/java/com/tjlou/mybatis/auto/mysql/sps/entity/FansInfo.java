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
 * @since 2019-08-01
 */
@TableName("fans_info")
public class FansInfo implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 用户ID
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 店铺ID
     */
    @TableField("shop_uri")
    private String shopUri;
    /**
     * 供货商标识
     */
    @TableField("supplier_id")
    private Long supplierId;
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
    /**
     * 状态 00A-关注  00Z-取消关注
     */
    private String status;

    public Long getId() {
        return id;
    }

    public FansInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public FansInfo setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
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

    public Long getSupplierId() {
        return supplierId;
    }

    public FansInfo setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public FansInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public FansInfo setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public FansInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "fans_info";
    public static final String ID = "id";

    /**
     * 用户ID
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 店铺ID
     */
    public static final String SHOP_URI = "shop_uri";

    /**
     * 供货商标识
     */
    public static final String SUPPLIER_ID = "supplier_id";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 修改时间
     */
    public static final String MODIFY_TIME = "modify_time";

    /**
     * 状态 00A-关注  00Z-取消关注
     */
    public static final String STATUS = "status";

    @Override
    public FansInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

