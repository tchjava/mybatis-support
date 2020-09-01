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
 * 拍卖系统消息
 * </p>
 *
 * @author Gaby
 * @since 2020-09-01
 */
@TableName("auction_system_message_info")
public class AuctionSystemMessageInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 标题
     */
    private String title;
    /**
     * 子标题
     */
    @TableField("sub_title")
    private String subTitle;
    /**
     * 主图
     */
    @TableField("first_pic")
    private String firstPic;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 状态  00A-有效 00Z-失效
     */
    private String status;
    /**
     * 跳转类型 1-富文本 2-h5链接 4-拍品详情 8-订单详情
     */
    @TableField("skip_type")
    private Integer skipType;
    /**
     * 所属用户
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 消息类型 1-个人 2-所有用户 4-所有商家
     */
    @TableField("message_type")
    private Integer messageType;


    public Long getId() {
        return id;
    }

    public AuctionSystemMessageInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public AuctionSystemMessageInfo setTitle(String title) {
        if (title != null)
            title = title.trim();
        this.title = title;
        return this;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public AuctionSystemMessageInfo setSubTitle(String subTitle) {
        if (subTitle != null)
            subTitle = subTitle.trim();
        this.subTitle = subTitle;
        return this;
    }

    public String getFirstPic() {
        return firstPic;
    }

    public AuctionSystemMessageInfo setFirstPic(String firstPic) {
        if (firstPic != null)
            firstPic = firstPic.trim();
        this.firstPic = firstPic;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public AuctionSystemMessageInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public AuctionSystemMessageInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    public Integer getSkipType() {
        return skipType;
    }

    public AuctionSystemMessageInfo setSkipType(Integer skipType) {
        this.skipType = skipType;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public AuctionSystemMessageInfo setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Integer getMessageType() {
        return messageType;
    }

    public AuctionSystemMessageInfo setMessageType(Integer messageType) {
        this.messageType = messageType;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_system_message_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 标题
     */
    public static final String TITLE = "title";

    /**
     * 子标题
     */
    public static final String SUB_TITLE = "sub_title";

    /**
     * 主图
     */
    public static final String FIRST_PIC = "first_pic";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 状态  00A-有效 00Z-失效
     */
    public static final String STATUS = "status";

    /**
     * 跳转类型 1-富文本 2-h5链接 4-拍品详情 8-订单详情
     */
    public static final String SKIP_TYPE = "skip_type";

    /**
     * 所属用户
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 消息类型 1-个人 2-所有用户 4-所有商家
     */
    public static final String MESSAGE_TYPE = "message_type";


    @Override
    public AuctionSystemMessageInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

