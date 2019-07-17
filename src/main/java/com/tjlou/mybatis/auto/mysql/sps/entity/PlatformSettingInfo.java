package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 平台参数设置信息表
 * </p>
 *
 * @author Gaby
 * @since 2019-07-17
 */
@TableName("platform_setting_info")
public class PlatformSettingInfo implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 平台标识
     */
    @TableField("app_id")
    private Long appId;
    /**
     * 消保金是否启用
     */
    @TableField("warrant_enable")
    private Integer warrantEnable;
    /**
     * 消保金最低金额   单位:分
     */
    @TableField("low_warrant")
    private Integer lowWarrant;
    /**
     * 平台佣金比例:百分比
     */
    @TableField("commission_ratio")
    private Integer commissionRatio;

    public Long getId() {
        return id;
    }

    public PlatformSettingInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getAppId() {
        return appId;
    }

    public PlatformSettingInfo setAppId(Long appId) {
        this.appId = appId;
        return this;
    }

    public Integer getWarrantEnable() {
        return warrantEnable;
    }

    public PlatformSettingInfo setWarrantEnable(Integer warrantEnable) {
        this.warrantEnable = warrantEnable;
        return this;
    }

    public Integer getLowWarrant() {
        return lowWarrant;
    }

    public PlatformSettingInfo setLowWarrant(Integer lowWarrant) {
        this.lowWarrant = lowWarrant;
        return this;
    }

    public Integer getCommissionRatio() {
        return commissionRatio;
    }

    public PlatformSettingInfo setCommissionRatio(Integer commissionRatio) {
        this.commissionRatio = commissionRatio;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "platform_setting_info";
    public static final String ID = "id";

    /**
     * 平台标识
     */
    public static final String APP_ID = "app_id";

    /**
     * 消保金是否启用
     */
    public static final String WARRANT_ENABLE = "warrant_enable";

    /**
     * 消保金最低金额   单位:分
     */
    public static final String LOW_WARRANT = "low_warrant";

    /**
     * 平台佣金比例:百分比
     */
    public static final String COMMISSION_RATIO = "commission_ratio";

    @Override
    public PlatformSettingInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

