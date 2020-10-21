package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 品牌馆条件白名单信息表
 * </p>
 *
 * @author Gaby
 * @since 2020-10-21
 */
@TableName("auction_brand_site_condition_white_info")
public class AuctionBrandSiteConditionWhiteInfo implements Serializable, IEntity {


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
     * 业务码
     */
    @TableField("service_code")
    private Long serviceCode;


    public Long getId() {
        return id;
    }

    public AuctionBrandSiteConditionWhiteInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public AuctionBrandSiteConditionWhiteInfo setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Long getServiceCode() {
        return serviceCode;
    }

    public AuctionBrandSiteConditionWhiteInfo setServiceCode(Long serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_brand_site_condition_white_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 所属用户
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 业务码
     */
    public static final String SERVICE_CODE = "service_code";


    @Override
    public AuctionBrandSiteConditionWhiteInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

