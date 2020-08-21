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
 * 拍品置顶信息表
 * </p>
 *
 * @author Gaby
 * @since 2020-08-21
 */
@TableName("product_instance_top_info")
public class ProductInstanceTopInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 所属拍品
     */
    @TableField("product_instance_id")
    private Long productInstanceId;
    /**
     * 所属用户
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;


    public Long getId() {
        return id;
    }

    public ProductInstanceTopInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getProductInstanceId() {
        return productInstanceId;
    }

    public ProductInstanceTopInfo setProductInstanceId(Long productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public ProductInstanceTopInfo setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public ProductInstanceTopInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "product_instance_top_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 所属拍品
     */
    public static final String PRODUCT_INSTANCE_ID = "product_instance_id";

    /**
     * 所属用户
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";


    @Override
    public ProductInstanceTopInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

