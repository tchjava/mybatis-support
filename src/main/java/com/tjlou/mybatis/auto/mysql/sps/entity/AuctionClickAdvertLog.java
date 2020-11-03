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
 * 拍卖-点击广告日志
 * </p>
 *
 * @author Gaby
 * @since 2020-11-03
 */
@TableName("auction_click_advert_log")
public class AuctionClickAdvertLog implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 样式类型
     */
    @TableField("style_type")
    private Integer styleType;
    /**
     * 主图
     */
    @TableField("first_pic")
    private String firstPic;
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
     * 所属用户
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;


    public Long getId() {
        return id;
    }

    public AuctionClickAdvertLog setId(Long id) {
        this.id = id;
        return this;
    }

    public Integer getStyleType() {
        return styleType;
    }

    public AuctionClickAdvertLog setStyleType(Integer styleType) {
        this.styleType = styleType;
        return this;
    }

    public String getFirstPic() {
        return firstPic;
    }

    public AuctionClickAdvertLog setFirstPic(String firstPic) {
        if (firstPic != null)
            firstPic = firstPic.trim();
        this.firstPic = firstPic;
        return this;
    }

    public Integer getSkipScene() {
        return skipScene;
    }

    public AuctionClickAdvertLog setSkipScene(Integer skipScene) {
        this.skipScene = skipScene;
        return this;
    }

    public Integer getClient() {
        return client;
    }

    public AuctionClickAdvertLog setClient(Integer client) {
        this.client = client;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public AuctionClickAdvertLog setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public AuctionClickAdvertLog setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_click_advert_log";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 样式类型
     */
    public static final String STYLE_TYPE = "style_type";

    /**
     * 主图
     */
    public static final String FIRST_PIC = "first_pic";

    /**
     * 跳转场景
     */
    public static final String SKIP_SCENE = "skip_scene";

    /**
     * 客户端
     */
    public static final String CLIENT = "client";

    /**
     * 所属用户
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";


    @Override
    public AuctionClickAdvertLog pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

