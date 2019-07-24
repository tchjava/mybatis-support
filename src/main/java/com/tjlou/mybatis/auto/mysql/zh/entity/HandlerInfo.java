package com.tjlou.mybatis.auto.mysql.zh.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author Gaby
 * @since 2019-06-26
 */
@TableName("handler_info")
public class HandlerInfo implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 名称
     */
    private String name;

    public Long getId() {
        return id;
    }

    public HandlerInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public HandlerInfo setName(String name) {
        if (name != null)
            name = name.trim();
        this.name = name;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "handler_info";
    public static final String ID = "id";

    /**
     * 名称
     */
    public static final String NAME = "name";

    @Override
    public HandlerInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

