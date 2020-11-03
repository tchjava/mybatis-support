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
 * 拍卖-点击模块记录表
 * </p>
 *
 * @author Gaby
 * @since 2020-11-03
 */
@TableName("auction_click_module_log")
public class AuctionClickModuleLog implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 模块类型 1-首页 2-精选  3-关注
     */
    @TableField("module_type")
    private Integer moduleType;
    /**
     * 所属用户
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 客户端  1-微信小程序  2-IOS  4-安卓  8-公众号 16-网页
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

    public AuctionClickModuleLog setId(Long id) {
        this.id = id;
        return this;
    }

    public Integer getModuleType() {
        return moduleType;
    }

    public AuctionClickModuleLog setModuleType(Integer moduleType) {
        this.moduleType = moduleType;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public AuctionClickModuleLog setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Integer getClient() {
        return client;
    }

    public AuctionClickModuleLog setClient(Integer client) {
        this.client = client;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public AuctionClickModuleLog setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_click_module_log";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 模块类型 1-首页 2-精选  3-关注
     */
    public static final String MODULE_TYPE = "module_type";

    /**
     * 所属用户
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 客户端  1-微信小程序  2-IOS  4-安卓  8-公众号 16-网页
     */
    public static final String CLIENT = "client";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";


    @Override
    public AuctionClickModuleLog pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

