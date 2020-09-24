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
 * 拍卖百亿补贴福利用户点击记录表
 * </p>
 *
 * @author Gaby
 * @since 2020-09-24
 */
@TableName("subsidies_boon_click_log")
public class SubsidiesBoonClickLog implements Serializable, IEntity {


    /**
     * 主键标识
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 用户标识
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 点击类型  1-新人福利页面  2-百亿补贴商品  3-极速捡漏  4-一元拍  5-捡漏按键 6-偷塔按键
     */
    @TableField("click_type")
    private Integer clickType;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 客户端   1-小程序  2-ios 4-安卓 8-公众号  16-H5
     */
    private Integer client;


    public Long getId() {
        return id;
    }

    public SubsidiesBoonClickLog setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public SubsidiesBoonClickLog setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Integer getClickType() {
        return clickType;
    }

    public SubsidiesBoonClickLog setClickType(Integer clickType) {
        this.clickType = clickType;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public SubsidiesBoonClickLog setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Integer getClient() {
        return client;
    }

    public SubsidiesBoonClickLog setClient(Integer client) {
        this.client = client;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "subsidies_boon_click_log";
    /**
     * 主键标识
     */
    public static final String ID = "id";

    /**
     * 用户标识
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 点击类型  1-新人福利页面  2-百亿补贴商品  3-极速捡漏  4-一元拍  5-捡漏按键 6-偷塔按键
     */
    public static final String CLICK_TYPE = "click_type";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 客户端   1-小程序  2-ios 4-安卓 8-公众号  16-H5
     */
    public static final String CLIENT = "client";


    @Override
    public SubsidiesBoonClickLog pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

