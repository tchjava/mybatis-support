package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 拍卖-广告位信息表
 * </p>
 *
 * @author Gaby
 * @since 2020-10-29
 */
@TableName("auction_advert_place_info")
public class AuctionAdvertPlaceInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 所属分类
     */
    @TableField("category_id")
    private Long categoryId;
    /**
     * 所属楼层
     */
    private Integer floor;
    /**
     * 所属样式
     */
    private Long style;
    /**
     * 状态 1-开启 0-禁用
     */
    private Integer enable;
    /**
     * 拥有广告id [1,2]
     */
    private String advert;


    public Long getId() {
        return id;
    }

    public AuctionAdvertPlaceInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public AuctionAdvertPlaceInfo setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public Integer getFloor() {
        return floor;
    }

    public AuctionAdvertPlaceInfo setFloor(Integer floor) {
        this.floor = floor;
        return this;
    }

    public Long getStyle() {
        return style;
    }

    public AuctionAdvertPlaceInfo setStyle(Long style) {
        this.style = style;
        return this;
    }

    public Integer getEnable() {
        return enable;
    }

    public AuctionAdvertPlaceInfo setEnable(Integer enable) {
        this.enable = enable;
        return this;
    }

    public String getAdvert() {
        return advert;
    }

    public AuctionAdvertPlaceInfo setAdvert(String advert) {
        if (advert != null)
            advert = advert.trim();
        this.advert = advert;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_advert_place_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 所属分类
     */
    public static final String CATEGORY_ID = "category_id";

    /**
     * 所属楼层
     */
    public static final String FLOOR = "floor";

    /**
     * 所属样式
     */
    public static final String STYLE = "style";

    /**
     * 状态 1-开启 0-禁用
     */
    public static final String ENABLE = "enable";

    /**
     * 拥有广告id [1,2]
     */
    public static final String ADVERT = "advert";


    @Override
    public AuctionAdvertPlaceInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

