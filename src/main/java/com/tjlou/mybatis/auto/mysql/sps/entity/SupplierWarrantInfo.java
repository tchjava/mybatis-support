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
 * 商家消保金信息表
 * </p>
 *
 * @author Gaby
 * @since 2019-07-17
 */
@TableName("supplier_warrant_info")
public class SupplierWarrantInfo implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 供货商标识
     */
    @TableField("supplier_id")
    private Long supplierId;
    /**
     * 用户标识
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 缴纳金额
     */
    private Integer money;
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
     * 状态  00A-已缴纳  00Z-退保
     */
    private String status;

    public Long getId() {
        return id;
    }

    public SupplierWarrantInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public SupplierWarrantInfo setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public SupplierWarrantInfo setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Integer getMoney() {
        return money;
    }

    public SupplierWarrantInfo setMoney(Integer money) {
        this.money = money;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public SupplierWarrantInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public SupplierWarrantInfo setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public SupplierWarrantInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "supplier_warrant_info";
    public static final String ID = "id";

    /**
     * 供货商标识
     */
    public static final String SUPPLIER_ID = "supplier_id";

    /**
     * 用户标识
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 缴纳金额
     */
    public static final String MONEY = "money";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 修改时间
     */
    public static final String MODIFY_TIME = "modify_time";

    /**
     * 状态  00A-已缴纳  00Z-退保
     */
    public static final String STATUS = "status";

    @Override
    public SupplierWarrantInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

