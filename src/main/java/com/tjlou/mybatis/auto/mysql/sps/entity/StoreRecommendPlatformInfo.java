package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 超级仓库推荐平台信息表
 * </p>
 *
 * @author Gaby
 * @since 2021-03-12
 */
@TableName("store_recommend_platform_info")
public class StoreRecommendPlatformInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 平台名称
     */
    private String name;
    /**
     * 平台图标
     */
    private String icon;
    /**
     * 跳转类型  1-小程序
     */
    @TableField("skip_type")
    private Integer skipType;
    /**
     * 排序
     */
    private Integer sort;
    /**
     * 是否启用  1-启用 0-禁用
     */
    private Integer enable;
    /**
     * 小程序appId
     */
    private String appid;


    public Long getId() {
        return id;
    }

    public StoreRecommendPlatformInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public StoreRecommendPlatformInfo setName(String name) {
        if (name != null)
            name = name.trim();
        this.name = name;
        return this;
    }

    public String getIcon() {
        return icon;
    }

    public StoreRecommendPlatformInfo setIcon(String icon) {
        if (icon != null)
            icon = icon.trim();
        this.icon = icon;
        return this;
    }

    public Integer getSkipType() {
        return skipType;
    }

    public StoreRecommendPlatformInfo setSkipType(Integer skipType) {
        this.skipType = skipType;
        return this;
    }

    public Integer getSort() {
        return sort;
    }

    public StoreRecommendPlatformInfo setSort(Integer sort) {
        this.sort = sort;
        return this;
    }

    public Integer getEnable() {
        return enable;
    }

    public StoreRecommendPlatformInfo setEnable(Integer enable) {
        this.enable = enable;
        return this;
    }

    public String getAppid() {
        return appid;
    }

    public StoreRecommendPlatformInfo setAppid(String appid) {
        if (appid != null)
            appid = appid.trim();
        this.appid = appid;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "store_recommend_platform_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 平台名称
     */
    public static final String NAME = "name";

    /**
     * 平台图标
     */
    public static final String ICON = "icon";

    /**
     * 跳转类型  1-小程序
     */
    public static final String SKIP_TYPE = "skip_type";

    /**
     * 排序
     */
    public static final String SORT = "sort";

    /**
     * 是否启用  1-启用 0-禁用
     */
    public static final String ENABLE = "enable";

    /**
     * 小程序appId
     */
    public static final String APPID = "appid";


    @Override
    public StoreRecommendPlatformInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

