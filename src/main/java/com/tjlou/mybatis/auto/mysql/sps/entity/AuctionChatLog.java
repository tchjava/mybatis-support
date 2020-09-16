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
 * @since 2020-09-16
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


    @Override
    public AuctionChatLog pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

