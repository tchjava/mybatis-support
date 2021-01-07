package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 拍卖-首页标签信息表
 * </p>
 *
 * @author Gaby
 * @since 2021-01-07
 */
@TableName("auction_home_flag_info")
public class AuctionHomeFlagInfo implements Serializable, IEntity {


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
     * 标签类型  1-推荐  2-品牌馆 3-百亿补贴 4-假一赔三 5-退货包邮  6-精选
     */
    @TableField("flag_type")
    private Integer flagType;
    /**
     * 排序
     */
    private Integer sort;
    /**
     * 状态  00A-有效 00Z-失效
     */
    private String status;
    /**
     * 已点击图片
     */
    @TableField("click_pic")
    private String clickPic;
    /**
     * 未点击图片
     */
    @TableField("unclick_pic")
    private String unclickPic;


    public Long getId() {
        return id;
    }

    public AuctionHomeFlagInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public AuctionHomeFlagInfo setTitle(String title) {
        if (title != null)
            title = title.trim();
        this.title = title;
        return this;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public AuctionHomeFlagInfo setSubTitle(String subTitle) {
        if (subTitle != null)
            subTitle = subTitle.trim();
        this.subTitle = subTitle;
        return this;
    }

    public Integer getFlagType() {
        return flagType;
    }

    public AuctionHomeFlagInfo setFlagType(Integer flagType) {
        this.flagType = flagType;
        return this;
    }

    public Integer getSort() {
        return sort;
    }

    public AuctionHomeFlagInfo setSort(Integer sort) {
        this.sort = sort;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public AuctionHomeFlagInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    public String getClickPic() {
        return clickPic;
    }

    public AuctionHomeFlagInfo setClickPic(String clickPic) {
        if (clickPic != null)
            clickPic = clickPic.trim();
        this.clickPic = clickPic;
        return this;
    }

    public String getUnclickPic() {
        return unclickPic;
    }

    public AuctionHomeFlagInfo setUnclickPic(String unclickPic) {
        if (unclickPic != null)
            unclickPic = unclickPic.trim();
        this.unclickPic = unclickPic;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_home_flag_info";
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
     * 标签类型  1-推荐  2-品牌馆 3-百亿补贴 4-假一赔三 5-退货包邮  6-精选
     */
    public static final String FLAG_TYPE = "flag_type";

    /**
     * 排序
     */
    public static final String SORT = "sort";

    /**
     * 状态  00A-有效 00Z-失效
     */
    public static final String STATUS = "status";

    /**
     * 已点击图片
     */
    public static final String CLICK_PIC = "click_pic";

    /**
     * 未点击图片
     */
    public static final String UNCLICK_PIC = "unclick_pic";


    @Override
    public AuctionHomeFlagInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

