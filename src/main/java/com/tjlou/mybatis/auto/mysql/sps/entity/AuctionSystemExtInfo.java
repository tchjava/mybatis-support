package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 拍卖系统消息拓展表
 * </p>
 *
 * @author Gaby
 * @since 2020-09-03
 */
@TableName("auction_system_ext_info")
public class AuctionSystemExtInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 所属消息
     */
    @TableField("system_id")
    private Long systemId;
    /**
     * h5链接
     */
    @TableField("h5_url")
    private String h5Url;
    /**
     * 富文本内容
     */
    private String content;
    /**
     * 拓展信息(包含移动端的跳转信息)
     */
    private String params;


    public Long getId() {
        return id;
    }

    public AuctionSystemExtInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getSystemId() {
        return systemId;
    }

    public AuctionSystemExtInfo setSystemId(Long systemId) {
        this.systemId = systemId;
        return this;
    }

    public String getH5Url() {
        return h5Url;
    }

    public AuctionSystemExtInfo setH5Url(String h5Url) {
        if (h5Url != null)
            h5Url = h5Url.trim();
        this.h5Url = h5Url;
        return this;
    }

    public String getContent() {
        return content;
    }

    public AuctionSystemExtInfo setContent(String content) {
        if (content != null)
            content = content.trim();
        this.content = content;
        return this;
    }

    public String getParams() {
        return params;
    }

    public AuctionSystemExtInfo setParams(String params) {
        if (params != null)
            params = params.trim();
        this.params = params;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_system_ext_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 所属消息
     */
    public static final String SYSTEM_ID = "system_id";

    /**
     * h5链接
     */
    public static final String H5_URL = "h5_url";

    /**
     * 富文本内容
     */
    public static final String CONTENT = "content";

    /**
     * 拓展信息(包含移动端的跳转信息)
     */
    public static final String PARAMS = "params";


    @Override
    public AuctionSystemExtInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

