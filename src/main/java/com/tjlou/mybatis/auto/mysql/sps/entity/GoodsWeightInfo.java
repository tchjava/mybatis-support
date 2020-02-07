package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 商品权重信息表
 * </p>
 *
 * @author Gaby
 * @since 2020-02-07
 */
@TableName("goods_weight_info")
public class GoodsWeightInfo implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 点击比重
     */
    @TableField("click_rate")
    private Double clickRate;
    /**
     * 点击操作符
     */
    @TableField("click_operator")
    private String clickOperator;
    /**
     * 分享比重
     */
    @TableField("share_rate")
    private Double shareRate;
    /**
     * 分享操作符
     */
    @TableField("share_operator")
    private String shareOperator;
    /**
     * 收藏比重
     */
    @TableField("collect_rate")
    private Double collectRate;
    /**
     * 收藏操作符
     */
    @TableField("collect_operator")
    private String collectOperator;
    /**
     * 分享进用户比重
     */
    @TableField("sharein_rate")
    private Double shareinRate;
    /**
     * 分享进用户操作符
     */
    @TableField("sharein_operator")
    private String shareinOperator;
    /**
     * 付款比重
     */
    @TableField("pay_rate")
    private Double payRate;
    /**
     * 付款操作符
     */
    @TableField("pay_operator")
    private String payOperator;
    /**
     * 分享朋友圈
     */
    @TableField("share_friends")
    private Double shareFriends;
    /**
     * 分享朋友圈操作符
     */
    @TableField("share_friends_operator")
    private String shareFriendsOperator;
    /**
     * 加入购物车
     */
    @TableField("join_cart")
    private Double joinCart;
    /**
     * 加入购物车操作符
     */
    @TableField("join_cart_operator")
    private String joinCartOperator;
    /**
     * 类型 1-商品权重  2-商品热度
     */
    private Integer type;

    public Long getId() {
        return id;
    }

    public GoodsWeightInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Double getClickRate() {
        return clickRate;
    }

    public GoodsWeightInfo setClickRate(Double clickRate) {
        this.clickRate = clickRate;
        return this;
    }

    public String getClickOperator() {
        return clickOperator;
    }

    public GoodsWeightInfo setClickOperator(String clickOperator) {
        if (clickOperator != null)
            clickOperator = clickOperator.trim();
        this.clickOperator = clickOperator;
        return this;
    }

    public Double getShareRate() {
        return shareRate;
    }

    public GoodsWeightInfo setShareRate(Double shareRate) {
        this.shareRate = shareRate;
        return this;
    }

    public String getShareOperator() {
        return shareOperator;
    }

    public GoodsWeightInfo setShareOperator(String shareOperator) {
        if (shareOperator != null)
            shareOperator = shareOperator.trim();
        this.shareOperator = shareOperator;
        return this;
    }

    public Double getCollectRate() {
        return collectRate;
    }

    public GoodsWeightInfo setCollectRate(Double collectRate) {
        this.collectRate = collectRate;
        return this;
    }

    public String getCollectOperator() {
        return collectOperator;
    }

    public GoodsWeightInfo setCollectOperator(String collectOperator) {
        if (collectOperator != null)
            collectOperator = collectOperator.trim();
        this.collectOperator = collectOperator;
        return this;
    }

    public Double getShareinRate() {
        return shareinRate;
    }

    public GoodsWeightInfo setShareinRate(Double shareinRate) {
        this.shareinRate = shareinRate;
        return this;
    }

    public String getShareinOperator() {
        return shareinOperator;
    }

    public GoodsWeightInfo setShareinOperator(String shareinOperator) {
        if (shareinOperator != null)
            shareinOperator = shareinOperator.trim();
        this.shareinOperator = shareinOperator;
        return this;
    }

    public Double getPayRate() {
        return payRate;
    }

    public GoodsWeightInfo setPayRate(Double payRate) {
        this.payRate = payRate;
        return this;
    }

    public String getPayOperator() {
        return payOperator;
    }

    public GoodsWeightInfo setPayOperator(String payOperator) {
        if (payOperator != null)
            payOperator = payOperator.trim();
        this.payOperator = payOperator;
        return this;
    }

    public Double getShareFriends() {
        return shareFriends;
    }

    public GoodsWeightInfo setShareFriends(Double shareFriends) {
        this.shareFriends = shareFriends;
        return this;
    }

    public String getShareFriendsOperator() {
        return shareFriendsOperator;
    }

    public GoodsWeightInfo setShareFriendsOperator(String shareFriendsOperator) {
        if (shareFriendsOperator != null)
            shareFriendsOperator = shareFriendsOperator.trim();
        this.shareFriendsOperator = shareFriendsOperator;
        return this;
    }

    public Double getJoinCart() {
        return joinCart;
    }

    public GoodsWeightInfo setJoinCart(Double joinCart) {
        this.joinCart = joinCart;
        return this;
    }

    public String getJoinCartOperator() {
        return joinCartOperator;
    }

    public GoodsWeightInfo setJoinCartOperator(String joinCartOperator) {
        if (joinCartOperator != null)
            joinCartOperator = joinCartOperator.trim();
        this.joinCartOperator = joinCartOperator;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public GoodsWeightInfo setType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "goods_weight_info";
    public static final String ID = "id";

    /**
     * 点击比重
     */
    public static final String CLICK_RATE = "click_rate";

    /**
     * 点击操作符
     */
    public static final String CLICK_OPERATOR = "click_operator";

    /**
     * 分享比重
     */
    public static final String SHARE_RATE = "share_rate";

    /**
     * 分享操作符
     */
    public static final String SHARE_OPERATOR = "share_operator";

    /**
     * 收藏比重
     */
    public static final String COLLECT_RATE = "collect_rate";

    /**
     * 收藏操作符
     */
    public static final String COLLECT_OPERATOR = "collect_operator";

    /**
     * 分享进用户比重
     */
    public static final String SHAREIN_RATE = "sharein_rate";

    /**
     * 分享进用户操作符
     */
    public static final String SHAREIN_OPERATOR = "sharein_operator";

    /**
     * 付款比重
     */
    public static final String PAY_RATE = "pay_rate";

    /**
     * 付款操作符
     */
    public static final String PAY_OPERATOR = "pay_operator";

    /**
     * 分享朋友圈
     */
    public static final String SHARE_FRIENDS = "share_friends";

    /**
     * 分享朋友圈操作符
     */
    public static final String SHARE_FRIENDS_OPERATOR = "share_friends_operator";

    /**
     * 加入购物车
     */
    public static final String JOIN_CART = "join_cart";

    /**
     * 加入购物车操作符
     */
    public static final String JOIN_CART_OPERATOR = "join_cart_operator";

    /**
     * 类型 1-商品权重  2-商品热度
     */
    public static final String TYPE = "type";

    @Override
    public GoodsWeightInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

