package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 天天竞拍拍品实例拓展信息表
 * </p>
 *
 * @author Gaby
 * @since 2021-01-14
 */
@TableName("auction_day_instance_ext_info")
public class AuctionDayInstanceExtInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 所属实例
     */
    @TableField("instance_id")
    private Long instanceId;
    /**
     * 实例描述
     */
    private String content;


    public Long getId() {
        return id;
    }

    public AuctionDayInstanceExtInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getInstanceId() {
        return instanceId;
    }

    public AuctionDayInstanceExtInfo setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getContent() {
        return content;
    }

    public AuctionDayInstanceExtInfo setContent(String content) {
        if (content != null)
            content = content.trim();
        this.content = content;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_day_instance_ext_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 所属实例
     */
    public static final String INSTANCE_ID = "instance_id";

    /**
     * 实例描述
     */
    public static final String CONTENT = "content";


    @Override
    public AuctionDayInstanceExtInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

