package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 聊天记录内容信息表
 * </p>
 *
 * @author Gaby
 * @since 2020-03-26
 */
@TableName("chat_record_ext_info")
public class ChatRecordExtInfo implements Serializable, IEntity {


    @TableId(value = "chat_id", type = IdType.INPUT)
    @TableField("chat_id")
    private Long chatId;
    /**
     * 聊天内容
     */
    private String content;


    public Long getChatId() {
        return chatId;
    }

    public ChatRecordExtInfo setChatId(Long chatId) {
        this.chatId = chatId;
        return this;
    }

    public String getContent() {
        return content;
    }

    public ChatRecordExtInfo setContent(String content) {
        if (content != null)
            content = content.trim();
        this.content = content;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "chat_record_ext_info";
    public static final String CHAT_ID = "chat_id";

    /**
     * 聊天内容
     */
    public static final String CONTENT = "content";


    @Override
    public ChatRecordExtInfo pkVal(Serializable val) {
        this.chatId = Long.valueOf(val.toString());
        return this;
    }
}

