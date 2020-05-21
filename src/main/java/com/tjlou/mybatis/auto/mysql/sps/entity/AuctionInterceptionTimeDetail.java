package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 截拍时间明细表
 * </p>
 *
 * @author Gaby
 * @since 2020-05-21
 */
@TableName("auction_interception_time_detail")
public class AuctionInterceptionTimeDetail implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 时间标识
     */
    @TableField("time_id")
    private Long timeId;
    /**
     * 显示文本
     */
    @TableField("show_text")
    private String showText;
    /**
     * 时间节点 (存储秒值)
     */
    @TableField("time_node")
    private Long timeNode;


    public Long getId() {
        return id;
    }

    public AuctionInterceptionTimeDetail setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getTimeId() {
        return timeId;
    }

    public AuctionInterceptionTimeDetail setTimeId(Long timeId) {
        this.timeId = timeId;
        return this;
    }

    public String getShowText() {
        return showText;
    }

    public AuctionInterceptionTimeDetail setShowText(String showText) {
        if (showText != null)
            showText = showText.trim();
        this.showText = showText;
        return this;
    }

    public Long getTimeNode() {
        return timeNode;
    }

    public AuctionInterceptionTimeDetail setTimeNode(Long timeNode) {
        this.timeNode = timeNode;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_interception_time_detail";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 时间标识
     */
    public static final String TIME_ID = "time_id";

    /**
     * 显示文本
     */
    public static final String SHOW_TEXT = "show_text";

    /**
     * 时间节点 (存储秒值)
     */
    public static final String TIME_NODE = "time_node";


    @Override
    public AuctionInterceptionTimeDetail pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

