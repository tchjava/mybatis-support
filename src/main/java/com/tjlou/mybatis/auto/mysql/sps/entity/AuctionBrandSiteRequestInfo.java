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
 * 品牌馆请求信息表
 * </p>
 *
 * @author Gaby
 * @since 2020-10-22
 */
@TableName("auction_brand_site_request_info")
public class AuctionBrandSiteRequestInfo implements Serializable, IEntity {


    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 申请者
     */
    @TableField("application_account_id")
    private Long applicationAccountId;
    /**
     * 操作者
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 状态 2-申请  4-同意 8-拒绝
     */
    private Integer status;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 操作理由
     */
    private String reason;


    public Long getId() {
        return id;
    }

    public AuctionBrandSiteRequestInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getApplicationAccountId() {
        return applicationAccountId;
    }

    public AuctionBrandSiteRequestInfo setApplicationAccountId(Long applicationAccountId) {
        this.applicationAccountId = applicationAccountId;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public AuctionBrandSiteRequestInfo setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public AuctionBrandSiteRequestInfo setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public AuctionBrandSiteRequestInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getReason() {
        return reason;
    }

    public AuctionBrandSiteRequestInfo setReason(String reason) {
        if (reason != null)
            reason = reason.trim();
        this.reason = reason;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_brand_site_request_info";
    public static final String ID = "id";

    /**
     * 申请者
     */
    public static final String APPLICATION_ACCOUNT_ID = "application_account_id";

    /**
     * 操作者
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 状态 2-申请  4-同意 8-拒绝
     */
    public static final String STATUS = "status";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 操作理由
     */
    public static final String REASON = "reason";


    @Override
    public AuctionBrandSiteRequestInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

