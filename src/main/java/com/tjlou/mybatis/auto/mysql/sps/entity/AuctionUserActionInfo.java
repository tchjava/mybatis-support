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
 * 拍卖用户记录表
 * </p>
 *
 * @author Gaby
 * @since 2020-06-07
 */
@TableName("auction_user_action_info")
public class AuctionUserActionInfo implements Serializable, IEntity {


    /**
     * 主键Z
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 用户标识
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 拍品实例标识
     */
    @TableField("product_instance_id")
    private Long productInstanceId;
    /**
     * 频道
     */
    @TableField("channel_type")
    private Integer channelType;
    /**
     * 动作类型
     */
    @TableField("action_type")
    private Integer actionType;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 状态  1-有效  2-失效
     */
    private Integer status;


    public Long getId() {
        return id;
    }

    public AuctionUserActionInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public AuctionUserActionInfo setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Long getProductInstanceId() {
        return productInstanceId;
    }

    public AuctionUserActionInfo setProductInstanceId(Long productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }

    public Integer getChannelType() {
        return channelType;
    }

    public AuctionUserActionInfo setChannelType(Integer channelType) {
        this.channelType = channelType;
        return this;
    }

    public Integer getActionType() {
        return actionType;
    }

    public AuctionUserActionInfo setActionType(Integer actionType) {
        this.actionType = actionType;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public AuctionUserActionInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public AuctionUserActionInfo setStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_user_action_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 用户标识
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 拍品实例标识
     */
    public static final String PRODUCT_INSTANCE_ID = "product_instance_id";

    /**
     * 频道
     */
    public static final String CHANNEL_TYPE = "channel_type";

    /**
     * 动作类型
     */
    public static final String ACTION_TYPE = "action_type";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 状态  1-有效  2-失效
     */
    public static final String STATUS = "status";


    @Override
    public AuctionUserActionInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

