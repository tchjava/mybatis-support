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
 * 聊天记录表
 * </p>
 *
 * @author Gaby
 * @since 2020-06-09
 */
@TableName("chat_record_info")
public class ChatRecordInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 起始地
     */
    private Long from;
    /**
     * 目的地
     */
    private Long to;
    /**
     * 涉及敏感词
     */
    @TableField("senstive_word")
    private String senstiveWord;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 00A-有效 00Z-失效
     */
    private String status;
    /**
     * 类型 1-敏感词  2-正常
     */
    private Integer type;


    public Long getId() {
        return id;
    }

    public ChatRecordInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getFrom() {
        return from;
    }

    public ChatRecordInfo setFrom(Long from) {
        this.from = from;
        return this;
    }

    public Long getTo() {
        return to;
    }

    public ChatRecordInfo setTo(Long to) {
        this.to = to;
        return this;
    }

    public String getSenstiveWord() {
        return senstiveWord;
    }

    public ChatRecordInfo setSenstiveWord(String senstiveWord) {
        if (senstiveWord != null)
            senstiveWord = senstiveWord.trim();
        this.senstiveWord = senstiveWord;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public ChatRecordInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public ChatRecordInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public ChatRecordInfo setType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "chat_record_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 起始地
     */
    public static final String FROM = "from";

    /**
     * 目的地
     */
    public static final String TO = "to";

    /**
     * 涉及敏感词
     */
    public static final String SENSTIVE_WORD = "senstive_word";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 00A-有效 00Z-失效
     */
    public static final String STATUS = "status";

    /**
     * 类型 1-敏感词  2-正常
     */
    public static final String TYPE = "type";


    @Override
    public ChatRecordInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

