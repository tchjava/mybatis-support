package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 锤定意外事件记录表
 * </p>
 *
 * @author Gaby
 * @since 2020-09-16
 */
@TableName("auction_mishap_info")
public class AuctionMishapInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 类型 1-关注公众号
     */
    private Integer type;
    /**
     * 具体内容
     */
    private String content;


    public Long getId() {
        return id;
    }

    public AuctionMishapInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public AuctionMishapInfo setType(Integer type) {
        this.type = type;
        return this;
    }

    public String getContent() {
        return content;
    }

    public AuctionMishapInfo setContent(String content) {
        if (content != null)
            content = content.trim();
        this.content = content;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_mishap_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 类型 1-关注公众号
     */
    public static final String TYPE = "type";

    /**
     * 具体内容
     */
    public static final String CONTENT = "content";


    @Override
    public AuctionMishapInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

