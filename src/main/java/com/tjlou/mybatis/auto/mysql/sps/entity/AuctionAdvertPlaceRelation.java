package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author Gaby
 * @since 2020-10-29
 */
@TableName("auction_advert_place_relation")
public class AuctionAdvertPlaceRelation implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 所属广告
     */
    @TableField("advert_id")
    private Long advertId;
    /**
     * 所属广告位
     */
    @TableField("place_id")
    private Long placeId;
    /**
     * 排序
     */
    private Integer sort;


    public Integer getId() {
        return id;
    }

    public AuctionAdvertPlaceRelation setId(Integer id) {
        this.id = id;
        return this;
    }

    public Long getAdvertId() {
        return advertId;
    }

    public AuctionAdvertPlaceRelation setAdvertId(Long advertId) {
        this.advertId = advertId;
        return this;
    }

    public Long getPlaceId() {
        return placeId;
    }

    public AuctionAdvertPlaceRelation setPlaceId(Long placeId) {
        this.placeId = placeId;
        return this;
    }

    public Integer getSort() {
        return sort;
    }

    public AuctionAdvertPlaceRelation setSort(Integer sort) {
        this.sort = sort;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_advert_place_relation";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 所属广告
     */
    public static final String ADVERT_ID = "advert_id";

    /**
     * 所属广告位
     */
    public static final String PLACE_ID = "place_id";

    /**
     * 排序
     */
    public static final String SORT = "sort";


    @Override
    public AuctionAdvertPlaceRelation pkVal(Serializable val) {
        this.id = Integer.valueOf(val.toString());
        return this;
    }
}

