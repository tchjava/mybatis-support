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
 * 合伙人信息表
 * </p>
 *
 * @author Gaby
 * @since 2020-03-05
 */
@TableName("partner_info")
public class PartnerInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 用户
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 是否是顶级合伙人
     */
    private Integer top;
    /**
     * 上级合伙人
     */
    private Long parent;
    /**
     * 佣金比例
     */
    @TableField("commission_ratio")
    private Integer commissionRatio;
    /**
     * 成为合伙人时间
     */
    @TableField("change_time")
    private Date changeTime;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 状态 00A-有效 00Z-失效
     */
    private String status;


    public Long getId() {
        return id;
    }

    public PartnerInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public PartnerInfo setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Integer getTop() {
        return top;
    }

    public PartnerInfo setTop(Integer top) {
        this.top = top;
        return this;
    }

    public Long getParent() {
        return parent;
    }

    public PartnerInfo setParent(Long parent) {
        this.parent = parent;
        return this;
    }

    public Integer getCommissionRatio() {
        return commissionRatio;
    }

    public PartnerInfo setCommissionRatio(Integer commissionRatio) {
        this.commissionRatio = commissionRatio;
        return this;
    }

    public Date getChangeTime() {
        return changeTime;
    }

    public PartnerInfo setChangeTime(Date changeTime) {
        this.changeTime = changeTime;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public PartnerInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public PartnerInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "partner_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 用户
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 是否是顶级合伙人
     */
    public static final String TOP = "top";

    /**
     * 上级合伙人
     */
    public static final String PARENT = "parent";

    /**
     * 佣金比例
     */
    public static final String COMMISSION_RATIO = "commission_ratio";

    /**
     * 成为合伙人时间
     */
    public static final String CHANGE_TIME = "change_time";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 状态 00A-有效 00Z-失效
     */
    public static final String STATUS = "status";


    @Override
    public PartnerInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

