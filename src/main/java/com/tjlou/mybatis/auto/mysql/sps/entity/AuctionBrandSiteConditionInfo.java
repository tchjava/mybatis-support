package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 品牌馆开通条件配置表
 * </p>
 *
 * @author Gaby
 * @since 2020-10-20
 */
@TableName("auction_brand_site_condition_info")
public class AuctionBrandSiteConditionInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 标题
     */
    private String title;
    /**
     * 阈值
     */
    private Long threshold;
    /**
     * 业务码
     */
    @TableField("service_code")
    private Long serviceCode;
    /**
     * 排序
     */
    private Integer sort;
    /**
     * 是否开启 1-开启  0-不开启
     */
    private Integer enable;


    public Long getId() {
        return id;
    }

    public AuctionBrandSiteConditionInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public AuctionBrandSiteConditionInfo setTitle(String title) {
        if (title != null)
            title = title.trim();
        this.title = title;
        return this;
    }

    public Long getThreshold() {
        return threshold;
    }

    public AuctionBrandSiteConditionInfo setThreshold(Long threshold) {
        this.threshold = threshold;
        return this;
    }

    public Long getServiceCode() {
        return serviceCode;
    }

    public AuctionBrandSiteConditionInfo setServiceCode(Long serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }

    public Integer getSort() {
        return sort;
    }

    public AuctionBrandSiteConditionInfo setSort(Integer sort) {
        this.sort = sort;
        return this;
    }

    public Integer getEnable() {
        return enable;
    }

    public AuctionBrandSiteConditionInfo setEnable(Integer enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_brand_site_condition_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 标题
     */
    public static final String TITLE = "title";

    /**
     * 阈值
     */
    public static final String THRESHOLD = "threshold";

    /**
     * 业务码
     */
    public static final String SERVICE_CODE = "service_code";

    /**
     * 排序
     */
    public static final String SORT = "sort";

    /**
     * 是否开启 1-开启  0-不开启
     */
    public static final String ENABLE = "enable";


    @Override
    public AuctionBrandSiteConditionInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

