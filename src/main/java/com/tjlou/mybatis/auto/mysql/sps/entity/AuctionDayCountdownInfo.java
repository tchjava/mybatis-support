package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 天天竞拍倒计时配置表
 * </p>
 *
 * @author Gaby
 * @since 2021-01-12
 */
@TableName("auction_day_countdown_info")
public class AuctionDayCountdownInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 倒计时(单位:秒)
     */
    private Long countdown;
    /**
     * 倒计时文本
     */
    @TableField("countdown_text")
    private String countdownText;
    /**
     * 状态 00A-有效 00Z-失效
     */
    private String status;


    public Long getId() {
        return id;
    }

    public AuctionDayCountdownInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getCountdown() {
        return countdown;
    }

    public AuctionDayCountdownInfo setCountdown(Long countdown) {
        this.countdown = countdown;
        return this;
    }

    public String getCountdownText() {
        return countdownText;
    }

    public AuctionDayCountdownInfo setCountdownText(String countdownText) {
        if (countdownText != null)
            countdownText = countdownText.trim();
        this.countdownText = countdownText;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public AuctionDayCountdownInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_day_countdown_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 倒计时(单位:秒)
     */
    public static final String COUNTDOWN = "countdown";

    /**
     * 倒计时文本
     */
    public static final String COUNTDOWN_TEXT = "countdown_text";

    /**
     * 状态 00A-有效 00Z-失效
     */
    public static final String STATUS = "status";


    @Override
    public AuctionDayCountdownInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

