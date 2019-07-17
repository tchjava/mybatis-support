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
 * 余额信息表
 * </p>
 *
 * @author Gaby
 * @since 2019-07-17
 */
@TableName("bill_balance_info")
public class BillBalanceInfo implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 帐号标识
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 余额  单位:分
     */
    private Integer blance;
    /**
     * 状态  00A-收入   00B-冻结   00C-支出   00Z-失效
     */
    private String status;
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

    public Long getId() {
        return id;
    }

    public BillBalanceInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public BillBalanceInfo setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Integer getBlance() {
        return blance;
    }

    public BillBalanceInfo setBlance(Integer blance) {
        this.blance = blance;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public BillBalanceInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public BillBalanceInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public BillBalanceInfo setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "bill_balance_info";
    public static final String ID = "id";

    /**
     * 帐号标识
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 余额  单位:分
     */
    public static final String BLANCE = "blance";

    /**
     * 状态  00A-收入   00B-冻结   00C-支出   00Z-失效
     */
    public static final String STATUS = "status";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 更新时间
     */
    public static final String MODIFY_TIME = "modify_time";

    @Override
    public BillBalanceInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

