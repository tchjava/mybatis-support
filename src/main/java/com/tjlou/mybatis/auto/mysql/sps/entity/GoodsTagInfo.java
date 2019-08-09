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
 * 商品标签信息表
 * </p>
 *
 * @author Gaby
 * @since 2019-08-09
 */
@TableName("goods_tag_info")
public class GoodsTagInfo implements Serializable, IEntity {

    /**
     * 主键标识
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 标签名字
     */
    private String name;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;

    public Long getId() {
        return id;
    }

    public GoodsTagInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public GoodsTagInfo setName(String name) {
        if (name != null)
            name = name.trim();
        this.name = name;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public GoodsTagInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "goods_tag_info";
    /**
     * 主键标识
     */
    public static final String ID = "id";

    /**
     * 标签名字
     */
    public static final String NAME = "name";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    @Override
    public GoodsTagInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

