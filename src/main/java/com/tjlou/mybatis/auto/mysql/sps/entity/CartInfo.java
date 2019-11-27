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
 * 购物车信息表
 * </p>
 *
 * @author Gaby
 * @since 2019-11-27
 */
@TableName("cart_info")
public class CartInfo implements Serializable, IEntity {


    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 店铺ID
     */
    @TableField("shop_uri")
    private String shopUri;
    /**
     * 用户
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 商户标识
     */
    @TableField("supplier_id")
    private Long supplierId;
    /**
     * 状态
     */
    private String status;
    /**
     * 总计 (单位:分)
     */
    private Integer total;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 更新时间
     */
    @TableField("modify_time")
    private Date modifyTime;
    /**
     * 备注
     */
    private String comment;


    public Long getId() {
        return id;
    }

    public CartInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getShopUri() {
        return shopUri;
    }

    public CartInfo setShopUri(String shopUri) {
        if (shopUri != null)
            shopUri = shopUri.trim();
        this.shopUri = shopUri;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public CartInfo setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public CartInfo setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public CartInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    public Integer getTotal() {
        return total;
    }

    public CartInfo setTotal(Integer total) {
        this.total = total;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public CartInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public CartInfo setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public CartInfo setComment(String comment) {
        if (comment != null)
            comment = comment.trim();
        this.comment = comment;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "cart_info";
    public static final String ID = "id";

    /**
     * 店铺ID
     */
    public static final String SHOP_URI = "shop_uri";

    /**
     * 用户
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 商户标识
     */
    public static final String SUPPLIER_ID = "supplier_id";

    /**
     * 状态
     */
    public static final String STATUS = "status";

    /**
     * 总计 (单位:分)
     */
    public static final String TOTAL = "total";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 更新时间
     */
    public static final String MODIFY_TIME = "modify_time";

    /**
     * 备注
     */
    public static final String COMMENT = "comment";


    @Override
    public CartInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

