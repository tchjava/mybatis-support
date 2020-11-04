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
 * 拍卖-点击分类记录表
 * </p>
 *
 * @author Gaby
 * @since 2020-11-04
 */
@TableName("auction_click_category_log")
public class AuctionClickCategoryLog implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 拍品实例标识
     */
    @TableField("instance_id")
    private Long instanceId;
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
     * 所属用户
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 客户端  客户端  1-微信小程序  2-IOS  4-安卓  8-公众号 16-网页
     */
    private Integer client;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;


    public Long getId() {
        return id;
    }

    public AuctionClickCategoryLog setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getInstanceId() {
        return instanceId;
    }

    public AuctionClickCategoryLog setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public AuctionClickCategoryLog setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public Long getParentId() {
        return parentId;
    }

    public AuctionClickCategoryLog setParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public AuctionClickCategoryLog setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Integer getClient() {
        return client;
    }

    public AuctionClickCategoryLog setClient(Integer client) {
        this.client = client;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public AuctionClickCategoryLog setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_click_category_log";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 拍品实例标识
     */
    public static final String INSTANCE_ID = "instance_id";

    /**
     * 二级分类
     */
    public static final String CATEGORY_ID = "category_id";

    /**
     * 一级分类
     */
    public static final String PARENT_ID = "parent_id";

    /**
     * 所属用户
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 客户端  客户端  1-微信小程序  2-IOS  4-安卓  8-公众号 16-网页
     */
    public static final String CLIENT = "client";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";


    @Override
    public AuctionClickCategoryLog pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

