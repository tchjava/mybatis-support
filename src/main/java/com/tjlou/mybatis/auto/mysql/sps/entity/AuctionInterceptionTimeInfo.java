package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 截拍时间信息表
 * </p>
 *
 * @author Gaby
 * @since 2020-05-21
 */
@TableName("auction_interception_time_info")
public class AuctionInterceptionTimeInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 类型 1-快速截拍 2-正常截拍
     */
    private Integer type;
    /**
     * 延时竞价时间 (单位:秒)
     */
    @TableField("delay_time")
    private Long delayTime;
    /**
     * 延时竞价文本
     */
    @TableField("delay_text")
    private String delayText;


    public Long getId() {
        return id;
    }

    public AuctionInterceptionTimeInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public AuctionInterceptionTimeInfo setType(Integer type) {
        this.type = type;
        return this;
    }

    public Long getDelayTime() {
        return delayTime;
    }

    public AuctionInterceptionTimeInfo setDelayTime(Long delayTime) {
        this.delayTime = delayTime;
        return this;
    }

    public String getDelayText() {
        return delayText;
    }

    public AuctionInterceptionTimeInfo setDelayText(String delayText) {
        if (delayText != null)
            delayText = delayText.trim();
        this.delayText = delayText;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_interception_time_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 类型 1-快速截拍 2-正常截拍
     */
    public static final String TYPE = "type";

    /**
     * 延时竞价时间 (单位:秒)
     */
    public static final String DELAY_TIME = "delay_time";

    /**
     * 延时竞价文本
     */
    public static final String DELAY_TEXT = "delay_text";


    @Override
    public AuctionInterceptionTimeInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

