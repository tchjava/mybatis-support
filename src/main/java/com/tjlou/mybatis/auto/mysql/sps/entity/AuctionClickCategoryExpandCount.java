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
 * 拍卖-点击分类拓展统计
 * </p>
 *
 * @author Gaby
 * @since 2020-11-03
 */
@TableName("auction_click_category_expand_count")
public class AuctionClickCategoryExpandCount implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 客户端
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

    public AuctionClickCategoryExpandCount setId(Long id) {
        this.id = id;
        return this;
    }

    public Integer getClient() {
        return client;
    }

    public AuctionClickCategoryExpandCount setClient(Integer client) {
        this.client = client;
        return this;
    }

    public Integer getClientClick() {
        return clientClick;
    }

    public AuctionClickCategoryExpandCount setClientClick(Integer clientClick) {
        this.clientClick = clientClick;
        return this;
    }

    public Integer getClientPerson() {
        return clientPerson;
    }

    public AuctionClickCategoryExpandCount setClientPerson(Integer clientPerson) {
        this.clientPerson = clientPerson;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public AuctionClickCategoryExpandCount setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_click_category_expand_count";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 客户端
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
    public AuctionClickCategoryExpandCount pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}
