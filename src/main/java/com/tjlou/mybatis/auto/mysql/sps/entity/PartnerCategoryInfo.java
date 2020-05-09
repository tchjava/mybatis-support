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
 * 品类合伙人信息表
 * </p>
 *
 * @author Gaby
 * @since 2020-05-09
 */
@TableName("partner_category_info")
public class PartnerCategoryInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 用户标识
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 二级分类标识
     */
    @TableField("category_id")
    private Long categoryId;
    /**
     * 单位(百分数)
     */
    @TableField("commission_ratio")
    private Integer commissionRatio;
    /**
     * 状态 00A-有效 00Z-失效
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

    public PartnerCategoryInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public PartnerCategoryInfo setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public PartnerCategoryInfo setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public Integer getCommissionRatio() {
        return commissionRatio;
    }

    public PartnerCategoryInfo setCommissionRatio(Integer commissionRatio) {
        this.commissionRatio = commissionRatio;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public PartnerCategoryInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public PartnerCategoryInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public PartnerCategoryInfo setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "partner_category_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 用户标识
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 二级分类标识
     */
    public static final String CATEGORY_ID = "category_id";

    /**
     * 单位(百分数)
     */
    public static final String COMMISSION_RATIO = "commission_ratio";

    /**
     * 状态 00A-有效 00Z-失效
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
    public PartnerCategoryInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

