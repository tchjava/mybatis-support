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
 * 锤定聊天内容记录日志表
 * </p>
 *
 * @author Gaby
 * @since 2020-09-22
 */
@TableName("auction_chat_log")
public class AuctionChatLog implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 聊天内容
     */
    private String message;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 发送方环信标识
     */
    @TableField("from_hx_id")
    private String fromHxId;
    /**
     * 接收方环信标识
     */
    @TableField("to_hx_id")
    private String toHxId;
    /**
     * 内部店铺
     */
    @TableField("inside_shop")
    private String insideShop;
    /**
     * 店铺 ',' 隔开
     */
    private String shop;


    public Long getId() {
        return id;
    }

    public AuctionChatLog setId(Long id) {
        this.id = id;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public AuctionChatLog setMessage(String message) {
        if (message != null)
            message = message.trim();
        this.message = message;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public AuctionChatLog setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getFromHxId() {
        return fromHxId;
    }

    public AuctionChatLog setFromHxId(String fromHxId) {
        if (fromHxId != null)
            fromHxId = fromHxId.trim();
        this.fromHxId = fromHxId;
        return this;
    }

    public String getToHxId() {
        return toHxId;
    }

    public AuctionChatLog setToHxId(String toHxId) {
        if (toHxId != null)
            toHxId = toHxId.trim();
        this.toHxId = toHxId;
        return this;
    }

    public String getInsideShop() {
        return insideShop;
    }

    public AuctionChatLog setInsideShop(String insideShop) {
        if (insideShop != null)
            insideShop = insideShop.trim();
        this.insideShop = insideShop;
        return this;
    }

    public String getShop() {
        return shop;
    }

    public AuctionChatLog setShop(String shop) {
        if (shop != null)
            shop = shop.trim();
        this.shop = shop;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_chat_log";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 聊天内容
     */
    public static final String MESSAGE = "message";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 发送方环信标识
     */
    public static final String FROM_HX_ID = "from_hx_id";

    /**
     * 接收方环信标识
     */
    public static final String TO_HX_ID = "to_hx_id";

    /**
     * 内部店铺
     */
    public static final String INSIDE_SHOP = "inside_shop";

    /**
     * 店铺 ',' 隔开
     */
    public static final String SHOP = "shop";


    @Override
    public AuctionChatLog pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

