package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 拍卖-广告样式表
 * </p>
 *
 * @author Gaby
 * @since 2020-10-29
 */
@TableName("auction_advert_style_info")
public class AuctionAdvertStyleInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 样式类型  1-轮播形式  2-频道形式  3-模块1-1   4-模块1-1-1  5-模块2-1-1  6-模块3
     */
    @TableField("style_type")
    private Integer styleType;
    /**
     * 最低广告数
     */
    @TableField("advert_num")
    private Integer advertNum;
    /**
     * 样式名称
     */
    private String name;
    /**
     * 举例图片
     */
    private String eg;


    public Long getId() {
        return id;
    }

    public AuctionAdvertStyleInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Integer getStyleType() {
        return styleType;
    }

    public AuctionAdvertStyleInfo setStyleType(Integer styleType) {
        this.styleType = styleType;
        return this;
    }

    public Integer getAdvertNum() {
        return advertNum;
    }

    public AuctionAdvertStyleInfo setAdvertNum(Integer advertNum) {
        this.advertNum = advertNum;
        return this;
    }

    public String getName() {
        return name;
    }

    public AuctionAdvertStyleInfo setName(String name) {
        if (name != null)
            name = name.trim();
        this.name = name;
        return this;
    }

    public String getEg() {
        return eg;
    }

    public AuctionAdvertStyleInfo setEg(String eg) {
        if (eg != null)
            eg = eg.trim();
        this.eg = eg;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_advert_style_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 样式类型  1-轮播形式  2-频道形式  3-模块1-1   4-模块1-1-1  5-模块2-1-1  6-模块3
     */
    public static final String STYLE_TYPE = "style_type";

    /**
     * 最低广告数
     */
    public static final String ADVERT_NUM = "advert_num";

    /**
     * 样式名称
     */
    public static final String NAME = "name";

    /**
     * 举例图片
     */
    public static final String EG = "eg";


    @Override
    public AuctionAdvertStyleInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

