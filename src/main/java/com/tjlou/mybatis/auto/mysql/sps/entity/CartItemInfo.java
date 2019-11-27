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
 * 购物车明细表
 * </p>
 *
 * @author Gaby
 * @since 2019-11-27
 */
@TableName("cart_item_info")
public class CartItemInfo implements Serializable, IEntity {


    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 购物车标识
     */
    @TableField("cart_id")
    private Long cartId;
    /**
     * 商品标识
     */
    @TableField("goods_id")
    private Long goodsId;
    /**
     * 加入时的价格(单位:分)
     */
    private Integer price;
    /**
     * 数量
     */
    private Integer num;
    /**
     * 小计
     */
    private Integer total;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;


    public Long getId() {
        return id;
    }

    public CartItemInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getCartId() {
        return cartId;
    }

    public CartItemInfo setCartId(Long cartId) {
        this.cartId = cartId;
        return this;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public CartItemInfo setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
        return this;
    }

    public Integer getPrice() {
        return price;
    }

    public CartItemInfo setPrice(Integer price) {
        this.price = price;
        return this;
    }

    public Integer getNum() {
        return num;
    }

    public CartItemInfo setNum(Integer num) {
        this.num = num;
        return this;
    }

    public Integer getTotal() {
        return total;
    }

    public CartItemInfo setTotal(Integer total) {
        this.total = total;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public CartItemInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "cart_item_info";
    public static final String ID = "id";

    /**
     * 购物车标识
     */
    public static final String CART_ID = "cart_id";

    /**
     * 商品标识
     */
    public static final String GOODS_ID = "goods_id";

    /**
     * 加入时的价格(单位:分)
     */
    public static final String PRICE = "price";

    /**
     * 数量
     */
    public static final String NUM = "num";

    /**
     * 小计
     */
    public static final String TOTAL = "total";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";


    @Override
    public CartItemInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

