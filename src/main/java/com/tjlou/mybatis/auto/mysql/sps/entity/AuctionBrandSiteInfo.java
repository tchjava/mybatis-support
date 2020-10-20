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
 * 拍卖-品牌馆信息表
 * </p>
 *
 * @author Gaby
 * @since 2020-10-20
 */
@TableName("auction_brand_site_info")
public class AuctionBrandSiteInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 所属用户
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 状态  1-未满足 2-申请中 4-通过
     */
    private Long status;
    /**
     * 满足的开通条件
     */
    @TableField("open_service")
    private Long openService;
    /**
     * 开通条件信息
     */
    @TableField("condition_json")
    private String conditionJson;
    /**
     * 通过时间
     */
    @TableField("success_time")
    private Date successTime;
    /**
     * 申请时间
     */
    @TableField("application_time")
    private Date applicationTime;
    /**
     * 拒绝时间
     */
    @TableField("reject_time")
    private Date rejectTime;


    public Long getId() {
        return id;
    }

    public AuctionBrandSiteInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public AuctionBrandSiteInfo setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Long getStatus() {
        return status;
    }

    public AuctionBrandSiteInfo setStatus(Long status) {
        this.status = status;
        return this;
    }

    public Long getOpenService() {
        return openService;
    }

    public AuctionBrandSiteInfo setOpenService(Long openService) {
        this.openService = openService;
        return this;
    }

    public String getConditionJson() {
        return conditionJson;
    }

    public AuctionBrandSiteInfo setConditionJson(String conditionJson) {
        if (conditionJson != null)
            conditionJson = conditionJson.trim();
        this.conditionJson = conditionJson;
        return this;
    }

    public Date getSuccessTime() {
        return successTime;
    }

    public AuctionBrandSiteInfo setSuccessTime(Date successTime) {
        this.successTime = successTime;
        return this;
    }

    public Date getApplicationTime() {
        return applicationTime;
    }

    public AuctionBrandSiteInfo setApplicationTime(Date applicationTime) {
        this.applicationTime = applicationTime;
        return this;
    }

    public Date getRejectTime() {
        return rejectTime;
    }

    public AuctionBrandSiteInfo setRejectTime(Date rejectTime) {
        this.rejectTime = rejectTime;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_brand_site_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 所属用户
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 状态  1-未满足 2-申请中 4-通过
     */
    public static final String STATUS = "status";

    /**
     * 满足的开通条件
     */
    public static final String OPEN_SERVICE = "open_service";

    /**
     * 开通条件信息
     */
    public static final String CONDITION_JSON = "condition_json";

    /**
     * 通过时间
     */
    public static final String SUCCESS_TIME = "success_time";

    /**
     * 申请时间
     */
    public static final String APPLICATION_TIME = "application_time";

    /**
     * 拒绝时间
     */
    public static final String REJECT_TIME = "reject_time";


    @Override
    public AuctionBrandSiteInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

