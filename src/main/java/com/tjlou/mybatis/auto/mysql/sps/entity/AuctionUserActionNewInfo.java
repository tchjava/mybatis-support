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
 * 拍卖-用户行为日志表(新)
 * </p>
 *
 * @author Gaby
 * @since 2020-11-05
 */
@TableName("auction_user_action_new_info")
public class AuctionUserActionNewInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 来源类型 1-店铺 2-拍品
     */
    @TableField("source_type")
    private Integer sourceType;
    /**
     * 来源标识
     */
    @TableField("source_id")
    private Long sourceId;
    /**
     * 动作类型 1-点击  2-收藏 3-出价  4-分享 5-分享新用户 6-分享朋友圈
     */
    @TableField("action_type")
    private Integer actionType;
    /**
     * 访问类型 1-正常 2-永久二维码 4-商品二维码 8-链接
     */
    @TableField("call_type")
    private Integer callType;
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

    public AuctionUserActionNewInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Integer getSourceType() {
        return sourceType;
    }

    public AuctionUserActionNewInfo setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    public Long getSourceId() {
        return sourceId;
    }

    public AuctionUserActionNewInfo setSourceId(Long sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    public Integer getActionType() {
        return actionType;
    }

    public AuctionUserActionNewInfo setActionType(Integer actionType) {
        this.actionType = actionType;
        return this;
    }

    public Integer getCallType() {
        return callType;
    }

    public AuctionUserActionNewInfo setCallType(Integer callType) {
        this.callType = callType;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public AuctionUserActionNewInfo setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public AuctionUserActionNewInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_user_action_new_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 来源类型 1-店铺 2-拍品
     */
    public static final String SOURCE_TYPE = "source_type";

    /**
     * 来源标识
     */
    public static final String SOURCE_ID = "source_id";

    /**
     * 动作类型 1-点击  2-收藏 3-出价  4-分享 5-分享新用户 6-分享朋友圈
     */
    public static final String ACTION_TYPE = "action_type";

    /**
     * 访问类型 1-正常 2-永久二维码 4-商品二维码 8-链接
     */
    public static final String CALL_TYPE = "call_type";

    /**
     * 所属用户
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";


    @Override
    public AuctionUserActionNewInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

