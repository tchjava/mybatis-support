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
 * @since 2020-03-10
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
     * 可用余额
     */
    @TableField("usable_balance")
    private Integer usableBalance;
    /**
     * 总额
     */
    private Integer balance;
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
     * 备注
     */
    private String comment;
    /**
     * 信用额度 默认与可用余额一致
     */
    @TableField("credit_limit")
    private Integer creditLimit;


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

    public Integer getUsableBalance() {
        return usableBalance;
    }

    public SupplierWarrantInfo setUsableBalance(Integer usableBalance) {
        this.usableBalance = usableBalance;
        return this;
    }

    public Integer getBalance() {
        return balance;
    }

    public SupplierWarrantInfo setBalance(Integer balance) {
        this.balance = balance;
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

    public String getComment() {
        return comment;
    }

    public SupplierWarrantInfo setComment(String comment) {
        if (comment != null)
            comment = comment.trim();
        this.comment = comment;
        return this;
    }

    public Integer getCreditLimit() {
        return creditLimit;
    }

    public SupplierWarrantInfo setCreditLimit(Integer creditLimit) {
        this.creditLimit = creditLimit;
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
     * 可用余额
     */
    public static final String USABLE_BALANCE = "usable_balance";

    /**
     * 总额
     */
    public static final String BALANCE = "balance";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 修改时间
     */
    public static final String MODIFY_TIME = "modify_time";

    /**
     * 备注
     */
    public static final String COMMENT = "comment";

    /**
     * 信用额度 默认与可用余额一致
     */
    public static final String CREDIT_LIMIT = "credit_limit";


    @Override
    public SupplierWarrantInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

