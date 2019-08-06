package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 商品查看记录表
 * </p>
 *
 * @author Gaby
 * @since 2019-08-06
 */
@TableName("goods_look_log")
public class GoodsLookLog implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 商品标识
     */
    @TableField("goods_id")
    private Long goodsId;
    /**
     * 子分类标识
     */
    @TableField("category_id")
    private Long categoryId;
    /**
     * 父分类标识
     */
    @TableField("category_parent_id")
    private Long categoryParentId;
    /**
     * 点击次数
     */
    @TableField("look_num")
    private Long lookNum;
    /**
     * 用户标识
     */
    @TableField("user_account_id")
    private Long userAccountId;

    public Long getId() {
        return id;
    }

    public GoodsLookLog setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public GoodsLookLog setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
        return this;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public GoodsLookLog setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public Long getCategoryParentId() {
        return categoryParentId;
    }

    public GoodsLookLog setCategoryParentId(Long categoryParentId) {
        this.categoryParentId = categoryParentId;
        return this;
    }

    public Long getLookNum() {
        return lookNum;
    }

    public GoodsLookLog setLookNum(Long lookNum) {
        this.lookNum = lookNum;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public GoodsLookLog setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "goods_look_log";
    public static final String ID = "id";

    /**
     * 商品标识
     */
    public static final String GOODS_ID = "goods_id";

    /**
     * 子分类标识
     */
    public static final String CATEGORY_ID = "category_id";

    /**
     * 父分类标识
     */
    public static final String CATEGORY_PARENT_ID = "category_parent_id";

    /**
     * 点击次数
     */
    public static final String LOOK_NUM = "look_num";

    /**
     * 用户标识
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    @Override
    public GoodsLookLog pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

