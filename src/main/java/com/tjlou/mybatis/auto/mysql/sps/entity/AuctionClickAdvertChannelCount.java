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
 * 拍卖-点击广告频道统计
 * </p>
 *
 * @author Gaby
 * @since 2020-11-03
 */
@TableName("auction_click_advert_channel_count")
public class AuctionClickAdvertChannelCount implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 跳转场景
     */
    @TableField("skip_scene")
    private Integer skipScene;
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

    public AuctionClickAdvertChannelCount setId(Long id) {
        this.id = id;
        return this;
    }

    public Integer getSkipScene() {
        return skipScene;
    }

    public AuctionClickAdvertChannelCount setSkipScene(Integer skipScene) {
        this.skipScene = skipScene;
        return this;
    }

    public Integer getClient() {
        return client;
    }

    public AuctionClickAdvertChannelCount setClient(Integer client) {
        this.client = client;
        return this;
    }

    public Integer getClientClick() {
        return clientClick;
    }

    public AuctionClickAdvertChannelCount setClientClick(Integer clientClick) {
        this.clientClick = clientClick;
        return this;
    }

    public Integer getClientPerson() {
        return clientPerson;
    }

    public AuctionClickAdvertChannelCount setClientPerson(Integer clientPerson) {
        this.clientPerson = clientPerson;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public AuctionClickAdvertChannelCount setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_click_advert_channel_count";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 跳转场景
     */
    public static final String SKIP_SCENE = "skip_scene";

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
    public AuctionClickAdvertChannelCount pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

