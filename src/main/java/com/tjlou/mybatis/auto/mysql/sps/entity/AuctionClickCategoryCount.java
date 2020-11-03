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
 * 拍卖-点击分类统计
 * </p>
 *
 * @author Gaby
 * @since 2020-11-03
 */
@TableName("auction_click_category_count")
public class AuctionClickCategoryCount implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 二级分类
     */
    @TableField("category_id")
    private Long categoryId;
    /**
     * 一级分类
     */
    @TableField("parent_id")
    private Long parentId;
    /**
     * 客户端  1-微信小程序  2-IOS  4-安卓  8-公众号 16-网页
     */
    private Integer client;
    /**
     * 点击次数
     */
    @TableField("client_click")
    private Integer clientClick;
    /**
     * 点击人数
     */
    @TableField("client_person")
    private Integer clientPerson;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;


    public Long getId() {
        return id;
    }

    public AuctionClickCategoryCount setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public AuctionClickCategoryCount setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public Long getParentId() {
        return parentId;
    }

    public AuctionClickCategoryCount setParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }

    public Integer getClient() {
        return client;
    }

    public AuctionClickCategoryCount setClient(Integer client) {
        this.client = client;
        return this;
    }

    public Integer getClientClick() {
        return clientClick;
    }

    public AuctionClickCategoryCount setClientClick(Integer clientClick) {
        this.clientClick = clientClick;
        return this;
    }

    public Integer getClientPerson() {
        return clientPerson;
    }

    public AuctionClickCategoryCount setClientPerson(Integer clientPerson) {
        this.clientPerson = clientPerson;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public AuctionClickCategoryCount setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_click_category_count";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 二级分类
     */
    public static final String CATEGORY_ID = "category_id";

    /**
     * 一级分类
     */
    public static final String PARENT_ID = "parent_id";

    /**
     * 客户端  1-微信小程序  2-IOS  4-安卓  8-公众号 16-网页
     */
    public static final String CLIENT = "client";

    /**
     * 点击次数
     */
    public static final String CLIENT_CLICK = "client_click";

    /**
     * 点击人数
     */
    public static final String CLIENT_PERSON = "client_person";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";


    @Override
    public AuctionClickCategoryCount pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

