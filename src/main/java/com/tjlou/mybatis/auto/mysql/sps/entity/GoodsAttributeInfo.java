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
 * 商品属性信息表
 * </p>
 *
 * @author Gaby
 * @since 2019-08-09
 */
@TableName("goods_attribute_info")
public class GoodsAttributeInfo implements Serializable, IEntity {

    /**
     * 主键标识
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 名称
     */
    private String title;
    /**
     * 描述
     */
    private String tab;
    /**
     * 状态 00A-有效  00Z-失效
     */
    private String status;
    /**
     * 规定长度
     */
    private Integer length;
    /**
     * 可选/可不选 1-必选 0-非必选
     */
    private Integer option;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;

    public Long getId() {
        return id;
    }

    public GoodsAttributeInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public GoodsAttributeInfo setTitle(String title) {
        if (title != null)
            title = title.trim();
        this.title = title;
        return this;
    }

    public String getTab() {
        return tab;
    }

    public GoodsAttributeInfo setTab(String tab) {
        if (tab != null)
            tab = tab.trim();
        this.tab = tab;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public GoodsAttributeInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    public Integer getLength() {
        return length;
    }

    public GoodsAttributeInfo setLength(Integer length) {
        this.length = length;
        return this;
    }

    public Integer getOption() {
        return option;
    }

    public GoodsAttributeInfo setOption(Integer option) {
        this.option = option;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public GoodsAttributeInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "goods_attribute_info";
    /**
     * 主键标识
     */
    public static final String ID = "id";

    /**
     * 名称
     */
    public static final String TITLE = "title";

    /**
     * 描述
     */
    public static final String TAB = "tab";

    /**
     * 状态 00A-有效  00Z-失效
     */
    public static final String STATUS = "status";

    /**
     * 规定长度
     */
    public static final String LENGTH = "length";

    /**
     * 可选/可不选 1-必选 0-非必选
     */
    public static final String OPTION = "option";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    @Override
    public GoodsAttributeInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

