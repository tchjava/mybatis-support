package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 贡献提示信息表
 * </p>
 *
 * @author Gaby
 * @since 2021-07-12
 */
@TableName("auction_contribute_remind_info")
public class AuctionContributeRemindInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 类型
     */
    private Integer type;
    /**
     * 提醒文本
     */
    private String remind;


    public Long getId() {
        return id;
    }

    public AuctionContributeRemindInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public AuctionContributeRemindInfo setType(Integer type) {
        this.type = type;
        return this;
    }

    public String getRemind() {
        return remind;
    }

    public AuctionContributeRemindInfo setRemind(String remind) {
        if (remind != null)
            remind = remind.trim();
        this.remind = remind;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_contribute_remind_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 类型
     */
    public static final String TYPE = "type";

    /**
     * 提醒文本
     */
    public static final String REMIND = "remind";


    @Override
    public AuctionContributeRemindInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

