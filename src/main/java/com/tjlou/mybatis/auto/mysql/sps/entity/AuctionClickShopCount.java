package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 拍卖-用户访问店铺次数
 * </p>
 *
 * @author Gaby
 * @since 2020-12-23
 */
@TableName("auction_click_shop_count")
public class AuctionClickShopCount implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 用户标识
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 所属店铺
     */
    @TableField("product_account_id")
    private Long productAccountId;
    /**
     * 点击次数
     */
    private Integer click;


    public Long getId() {
        return id;
    }

    public AuctionClickShopCount setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public AuctionClickShopCount setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Long getProductAccountId() {
        return productAccountId;
    }

    public AuctionClickShopCount setProductAccountId(Long productAccountId) {
        this.productAccountId = productAccountId;
        return this;
    }

    public Integer getClick() {
        return click;
    }

    public AuctionClickShopCount setClick(Integer click) {
        this.click = click;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_click_shop_count";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 用户标识
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 所属店铺
     */
    public static final String PRODUCT_ACCOUNT_ID = "product_account_id";

    /**
     * 点击次数
     */
    public static final String CLICK = "click";


    @Override
    public AuctionClickShopCount pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

