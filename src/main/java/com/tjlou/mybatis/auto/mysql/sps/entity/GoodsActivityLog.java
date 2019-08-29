package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 *
 * </p>
 *
 * @author Gaby
 * @since 2019-08-27
 */
@TableName("goods_activity_log")
public class GoodsActivityLog implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 活动标识
     */
    @TableField("activity_id")
    private Long activityId;
    /**
     * 商品标识
     */
    @TableField("goods_id")
    private Long goodsId;
    /**
     * 内容标识  超级购等等
     */
    @TableField("content_id")
    private Long contentId;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 店铺ID
     */
    @TableField("shop_uri")
    private String shopUri;
    /**
     * 结束时间
     */
    @TableField("end_time")
    private Date endTime;

    public Long getId() {
        return id;
    }

    public GoodsActivityLog setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getActivityId() {
        return activityId;
    }

    public GoodsActivityLog setActivityId(Long activityId) {
        this.activityId = activityId;
        return this;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public GoodsActivityLog setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
        return this;
    }

    public Long getContentId() {
        return contentId;
    }

    public GoodsActivityLog setContentId(Long contentId) {
        this.contentId = contentId;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public GoodsActivityLog setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getShopUri() {
        return shopUri;
    }

    public GoodsActivityLog setShopUri(String shopUri) {
        if (shopUri != null)
            shopUri = shopUri.trim();
        this.shopUri = shopUri;
        return this;
    }

    public Date getEndTime() {
        return endTime;
    }

    public GoodsActivityLog setEndTime(Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "goods_activity_log";
    public static final String ID = "id";

    /**
     * 活动标识
     */
    public static final String ACTIVITY_ID = "activity_id";

    /**
     * 商品标识
     */
    public static final String GOODS_ID = "goods_id";

    /**
     * 内容标识  超级购等等
     */
    public static final String CONTENT_ID = "content_id";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 店铺ID
     */
    public static final String SHOP_URI = "shop_uri";

    /**
     * 结束时间
     */
    public static final String END_TIME = "end_time";

    @Override
    public GoodsActivityLog pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

