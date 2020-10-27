package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 分类保证金配置表
 * </p>
 *
 * @author Gaby
 * @since 2020-10-27
 */
@TableName("auction_category_warrant_info")
public class AuctionCategoryWarrantInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 所属分类标识
     */
    @TableField("category_id")
    private Long categoryId;
    /**
     * 缴纳的金额
     */
    private Long money;


    public Long getId() {
        return id;
    }

    public AuctionCategoryWarrantInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public AuctionCategoryWarrantInfo setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public Long getMoney() {
        return money;
    }

    public AuctionCategoryWarrantInfo setMoney(Long money) {
        this.money = money;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_category_warrant_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 所属分类标识
     */
    public static final String CATEGORY_ID = "category_id";

    /**
     * 缴纳的金额
     */
    public static final String MONEY = "money";


    @Override
    public AuctionCategoryWarrantInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

