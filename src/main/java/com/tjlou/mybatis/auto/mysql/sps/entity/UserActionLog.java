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
 * 用户行为记录表
 * </p>
 *
 * @author Gaby
 * @since 2019-09-28
 */
@TableName("user_action_log")
public class UserActionLog implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 用户标识
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 商品标识
     */
    @TableField("goods_id")
    private Long goodsId;
    /**
     * 店铺ID
     */
    @TableField("shop_uri")
    private String shopUri;
    /**
     * 频道类型  1-超级购  2-超人气 3-精选 4-首页 5-分类 6-店铺首页 7-收藏关注
     */
    @TableField("channel_type")
    private Integer channelType;
    /**
     * 动作类型   1-点击  2-收藏 3-付款  4-分享 5-分享新用户
     */
    @TableField("action_type")
    private Integer actionType;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 状态  1-有效   -1 失效
     */
    private Integer status;

    public Long getId() {
        return id;
    }

    public UserActionLog setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public UserActionLog setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public UserActionLog setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
        return this;
    }

    public String getShopUri() {
        return shopUri;
    }

    public UserActionLog setShopUri(String shopUri) {
        if (shopUri != null)
            shopUri = shopUri.trim();
        this.shopUri = shopUri;
        return this;
    }

    public Integer getChannelType() {
        return channelType;
    }

    public UserActionLog setChannelType(Integer channelType) {
        this.channelType = channelType;
        return this;
    }

    public Integer getActionType() {
        return actionType;
    }

    public UserActionLog setActionType(Integer actionType) {
        this.actionType = actionType;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public UserActionLog setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public UserActionLog setStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "user_action_log";
    public static final String ID = "id";

    /**
     * 用户标识
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 商品标识
     */
    public static final String GOODS_ID = "goods_id";

    /**
     * 店铺ID
     */
    public static final String SHOP_URI = "shop_uri";

    /**
     * 频道类型  1-超级购  2-超人气 3-精选 4-首页 5-分类 6-店铺首页 7-收藏关注
     */
    public static final String CHANNEL_TYPE = "channel_type";

    /**
     * 动作类型   1-点击  2-收藏 3-付款  4-分享 5-分享新用户
     */
    public static final String ACTION_TYPE = "action_type";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 状态  1-有效   -1 失效
     */
    public static final String STATUS = "status";

    @Override
    public UserActionLog pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

