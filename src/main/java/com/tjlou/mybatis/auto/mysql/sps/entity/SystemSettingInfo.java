package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 系统设置信息表
 * </p>
 *
 * @author Gaby
 * @since 2020-06-16
 */
@TableName("system_setting_info")
public class SystemSettingInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 消保金开启
     */
    @TableField("warrant_enable")
    private Integer warrantEnable;
    /**
     * 最低消保金缴纳
     */
    @TableField("low_warrant")
    private Long lowWarrant;
    /**
     * 佣金抽点比例 /100
     */
    @TableField("commission_ratio")
    private Integer commissionRatio;
    /**
     * 买家客服
     */
    @TableField("buyer_kf")
    private String buyerKf;
    /**
     * 卖家客服
     */
    @TableField("seller_kf")
    private String sellerKf;
    /**
     * 系统类型 1-超级仓库 2-拍卖
     */
    @TableField("system_type")
    private Integer systemType;


    public Long getId() {
        return id;
    }

    public SystemSettingInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Integer getWarrantEnable() {
        return warrantEnable;
    }

    public SystemSettingInfo setWarrantEnable(Integer warrantEnable) {
        this.warrantEnable = warrantEnable;
        return this;
    }

    public Long getLowWarrant() {
        return lowWarrant;
    }

    public SystemSettingInfo setLowWarrant(Long lowWarrant) {
        this.lowWarrant = lowWarrant;
        return this;
    }

    public Integer getCommissionRatio() {
        return commissionRatio;
    }

    public SystemSettingInfo setCommissionRatio(Integer commissionRatio) {
        this.commissionRatio = commissionRatio;
        return this;
    }

    public String getBuyerKf() {
        return buyerKf;
    }

    public SystemSettingInfo setBuyerKf(String buyerKf) {
        if (buyerKf != null)
            buyerKf = buyerKf.trim();
        this.buyerKf = buyerKf;
        return this;
    }

    public String getSellerKf() {
        return sellerKf;
    }

    public SystemSettingInfo setSellerKf(String sellerKf) {
        if (sellerKf != null)
            sellerKf = sellerKf.trim();
        this.sellerKf = sellerKf;
        return this;
    }

    public Integer getSystemType() {
        return systemType;
    }

    public SystemSettingInfo setSystemType(Integer systemType) {
        this.systemType = systemType;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "system_setting_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 消保金开启
     */
    public static final String WARRANT_ENABLE = "warrant_enable";

    /**
     * 最低消保金缴纳
     */
    public static final String LOW_WARRANT = "low_warrant";

    /**
     * 佣金抽点比例 /100
     */
    public static final String COMMISSION_RATIO = "commission_ratio";

    /**
     * 买家客服
     */
    public static final String BUYER_KF = "buyer_kf";

    /**
     * 卖家客服
     */
    public static final String SELLER_KF = "seller_kf";

    /**
     * 系统类型 1-超级仓库 2-拍卖
     */
    public static final String SYSTEM_TYPE = "system_type";


    @Override
    public SystemSettingInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

