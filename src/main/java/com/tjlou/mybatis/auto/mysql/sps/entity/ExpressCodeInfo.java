package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 快递编码表
 * </p>
 *
 * @author Gaby
 * @since 2019-07-10
 */
@TableName("express_code_info")
public class ExpressCodeInfo implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 快递编码
     */
    private String code;
    /**
     * 快递名称
     */
    private String name;
    private String cnt;

    public Long getId() {
        return id;
    }

    public ExpressCodeInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getCode() {
        return code;
    }

    public ExpressCodeInfo setCode(String code) {
        if (code != null)
            code = code.trim();
        this.code = code;
        return this;
    }

    public String getName() {
        return name;
    }

    public ExpressCodeInfo setName(String name) {
        if (name != null)
            name = name.trim();
        this.name = name;
        return this;
    }

    public String getCnt() {
        return cnt;
    }

    public ExpressCodeInfo setCnt(String cnt) {
        if (cnt != null)
            cnt = cnt.trim();
        this.cnt = cnt;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "express_code_info";
    public static final String ID = "id";

    /**
     * 快递编码
     */
    public static final String CODE = "code";

    /**
     * 快递名称
     */
    public static final String NAME = "name";

    public static final String CNT = "cnt";

    @Override
    public ExpressCodeInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

