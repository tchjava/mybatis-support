package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 商家保障条件配置表
 * </p>
 *
 * @author Gaby
 * @since 2020-10-13
 */
@TableName("auction_supplier_ensure_info")
public class AuctionSupplierEnsureInfo implements Serializable, IEntity {


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
     * 子标题
     */
    @TableField("sub_title")
    private String subTitle;
    /**
     * 学堂关联场景类型
     */
    @TableField("strategy_scene")
    private Integer strategyScene;
    /**
     * 是否要开启  0-未开启 1-开启
     */
    private Integer enable;
    /**
     * 业务识别码  1-假一赔三  2-退货包邮
     */
    @TableField("service_code")
    private Integer serviceCode;


    public Long getId() {
        return id;
    }

    public AuctionSupplierEnsureInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public AuctionSupplierEnsureInfo setTitle(String title) {
        if (title != null)
            title = title.trim();
        this.title = title;
        return this;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public AuctionSupplierEnsureInfo setSubTitle(String subTitle) {
        if (subTitle != null)
            subTitle = subTitle.trim();
        this.subTitle = subTitle;
        return this;
    }

    public Integer getStrategyScene() {
        return strategyScene;
    }

    public AuctionSupplierEnsureInfo setStrategyScene(Integer strategyScene) {
        this.strategyScene = strategyScene;
        return this;
    }

    public Integer getEnable() {
        return enable;
    }

    public AuctionSupplierEnsureInfo setEnable(Integer enable) {
        this.enable = enable;
        return this;
    }

    public Integer getServiceCode() {
        return serviceCode;
    }

    public AuctionSupplierEnsureInfo setServiceCode(Integer serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_supplier_ensure_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 标题
     */
    public static final String TITLE = "title";

    /**
     * 子标题
     */
    public static final String SUB_TITLE = "sub_title";

    /**
     * 学堂关联场景类型
     */
    public static final String STRATEGY_SCENE = "strategy_scene";

    /**
     * 是否要开启  0-未开启 1-开启
     */
    public static final String ENABLE = "enable";

    /**
     * 业务识别码  1-假一赔三  2-退货包邮
     */
    public static final String SERVICE_CODE = "service_code";


    @Override
    public AuctionSupplierEnsureInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

