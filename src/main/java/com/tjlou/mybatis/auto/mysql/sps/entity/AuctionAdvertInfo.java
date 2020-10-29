package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 拍卖-广告信息表
 * </p>
 *
 * @author Gaby
 * @since 2020-10-29
 */
@TableName("auction_advert_info")
public class AuctionAdvertInfo implements Serializable, IEntity {


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
     * 主图
     */
    @TableField("first_pic")
    private String firstPic;
    /**
     * 是否开启 1-开启 0-禁用
     */
    private Integer enable;
    /**
     * 跳转类型   1-web  2-应用内
     */
    @TableField("skip_type")
    private Integer skipType;
    /**
     * 跳转场景  1-今日热门 2-精选  3-优店 4-极速捡漏 5-万物拍 6-最新发布 7-即将截拍 8-一元拍  9-退货包邮 10-二手 11-店铺  12-商品 13-超级学堂
     */
    @TableField("skip_scene")
    private Integer skipScene;
    /**
     * 跳转参数 {url:'',params:''}
     */
    @TableField("skip_params")
    private String skipParams;
    /**
     * 图片宽度
     */
    private Integer width;
    /**
     * 图片高度
     */
    private Integer height;


    public Long getId() {
        return id;
    }

    public AuctionAdvertInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public AuctionAdvertInfo setTitle(String title) {
        if (title != null)
            title = title.trim();
        this.title = title;
        return this;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public AuctionAdvertInfo setSubTitle(String subTitle) {
        if (subTitle != null)
            subTitle = subTitle.trim();
        this.subTitle = subTitle;
        return this;
    }

    public String getFirstPic() {
        return firstPic;
    }

    public AuctionAdvertInfo setFirstPic(String firstPic) {
        if (firstPic != null)
            firstPic = firstPic.trim();
        this.firstPic = firstPic;
        return this;
    }

    public Integer getEnable() {
        return enable;
    }

    public AuctionAdvertInfo setEnable(Integer enable) {
        this.enable = enable;
        return this;
    }

    public Integer getSkipType() {
        return skipType;
    }

    public AuctionAdvertInfo setSkipType(Integer skipType) {
        this.skipType = skipType;
        return this;
    }

    public Integer getSkipScene() {
        return skipScene;
    }

    public AuctionAdvertInfo setSkipScene(Integer skipScene) {
        this.skipScene = skipScene;
        return this;
    }

    public String getSkipParams() {
        return skipParams;
    }

    public AuctionAdvertInfo setSkipParams(String skipParams) {
        if (skipParams != null)
            skipParams = skipParams.trim();
        this.skipParams = skipParams;
        return this;
    }

    public Integer getWidth() {
        return width;
    }

    public AuctionAdvertInfo setWidth(Integer width) {
        this.width = width;
        return this;
    }

    public Integer getHeight() {
        return height;
    }

    public AuctionAdvertInfo setHeight(Integer height) {
        this.height = height;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_advert_info";
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
     * 主图
     */
    public static final String FIRST_PIC = "first_pic";

    /**
     * 是否开启 1-开启 0-禁用
     */
    public static final String ENABLE = "enable";

    /**
     * 跳转类型   1-web  2-应用内
     */
    public static final String SKIP_TYPE = "skip_type";

    /**
     * 跳转场景  1-今日热门 2-精选  3-优店 4-极速捡漏 5-万物拍 6-最新发布 7-即将截拍 8-一元拍  9-退货包邮 10-二手 11-店铺  12-商品 13-超级学堂
     */
    public static final String SKIP_SCENE = "skip_scene";

    /**
     * 跳转参数 {url:'',params:''}
     */
    public static final String SKIP_PARAMS = "skip_params";

    /**
     * 图片宽度
     */
    public static final String WIDTH = "width";

    /**
     * 图片高度
     */
    public static final String HEIGHT = "height";


    @Override
    public AuctionAdvertInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

