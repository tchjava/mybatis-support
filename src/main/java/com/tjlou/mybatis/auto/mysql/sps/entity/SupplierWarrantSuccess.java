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
 * 消保金缴纳成功记录表
 * </p>
 *
 * @author Gaby
 * @since 2019-09-18
 */
@TableName("supplier_warrant_success")
public class SupplierWarrantSuccess implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 消保金信息标识
     */
    @TableField("warrant_id")
    private Long warrantId;
    /**
     * 商户标识
     */
    @TableField("supplier_id")
    private Long supplierId;
    /**
     * 商户用户标识
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 剩余金额 单位：分
     */
    private Integer balance;
    /**
     * 单笔金额  单位：分
     */
    private Integer total;
    /**
     * 类型  0-余额支付 1-微信支付
     */
    private Long type;
    /**
     * 已提现次数
     */
    @TableField("thaw_num")
    private Integer thawNum;
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
     * 状态  00A-有效  00Z-失效
     */
    private String status;

    public Long getId() {
        return id;
    }

    public SupplierWarrantSuccess setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getWarrantId() {
        return warrantId;
    }

    public SupplierWarrantSuccess setWarrantId(Long warrantId) {
        this.warrantId = warrantId;
        return this;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public SupplierWarrantSuccess setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public SupplierWarrantSuccess setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Integer getBalance() {
        return balance;
    }

    public SupplierWarrantSuccess setBalance(Integer balance) {
        this.balance = balance;
        return this;
    }

    public Integer getTotal() {
        return total;
    }

    public SupplierWarrantSuccess setTotal(Integer total) {
        this.total = total;
        return this;
    }

    public Long getType() {
        return type;
    }

    public SupplierWarrantSuccess setType(Long type) {
        this.type = type;
        return this;
    }

    public Integer getThawNum() {
        return thawNum;
    }

    public SupplierWarrantSuccess setThawNum(Integer thawNum) {
        this.thawNum = thawNum;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public SupplierWarrantSuccess setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public SupplierWarrantSuccess setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public SupplierWarrantSuccess setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "supplier_warrant_success";
    public static final String ID = "id";

    /**
     * 消保金信息标识
     */
    public static final String WARRANT_ID = "warrant_id";

    /**
     * 商户标识
     */
    public static final String SUPPLIER_ID = "supplier_id";

    /**
     * 商户用户标识
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 剩余金额 单位：分
     */
    public static final String BALANCE = "balance";

    /**
     * 单笔金额  单位：分
     */
    public static final String TOTAL = "total";

    /**
     * 类型  0-余额支付 1-微信支付
     */
    public static final String TYPE = "type";

    /**
     * 已提现次数
     */
    public static final String THAW_NUM = "thaw_num";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 修改时间
     */
    public static final String MODIFY_TIME = "modify_time";

    /**
     * 状态  00A-有效  00Z-失效
     */
    public static final String STATUS = "status";

    @Override
    public SupplierWarrantSuccess pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

