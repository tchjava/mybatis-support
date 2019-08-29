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
 * 用户行为记录表
 * </p>
 *
 * @author Gaby
 * @since 2019-08-28
 */
@TableName("user_action_info")
public class UserActionInfo implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 用户标识
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 商品标识
     */
    @TableField("goods_id")
    private Long goodsId;
    /**
     * 1-点击  2-分享 4-分享带来用户
     */
    private Integer type;
    /**
     * 分享带来的用户标识
     */
    private Long user;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;

    public Long getId() {
        return id;
    }

    public UserActionInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public UserActionInfo setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public UserActionInfo setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public UserActionInfo setType(Integer type) {
        this.type = type;
        return this;
    }

    public Long getUser() {
        return user;
    }

    public UserActionInfo setUser(Long user) {
        this.user = user;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public UserActionInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "user_action_info";
    public static final String ID = "id";

    /**
     * 用户标识
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 商品标识
     */
    public static final String GOODS_ID = "goods_id";

    /**
     * 1-点击  2-分享 4-分享带来用户
     */
    public static final String TYPE = "type";

    /**
     * 分享带来的用户标识
     */
    public static final String USER = "user";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    @Override
    public UserActionInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

