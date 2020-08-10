package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 自定义参数置换表
 * </p>
 *
 * @author Gaby
 * @since 2020-08-10
 */
@TableName("custom_params_info")
public class CustomParamsInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 唯一key
     */
    private String key;
    /**
     * 自定义参数
     */
    private String params;
    /**
     * 类型 1-生成永久二维码
     */
    private Integer type;
    /**
     * 系统类型 1-超级仓库 2-拍卖
     */
    @TableField("system_type")
    private Integer systemType;
    /**
     * 二维码地址
     */
    private String url;


    public Long getId() {
        return id;
    }

    public CustomParamsInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getKey() {
        return key;
    }

    public CustomParamsInfo setKey(String key) {
        if (key != null)
            key = key.trim();
        this.key = key;
        return this;
    }

    public String getParams() {
        return params;
    }

    public CustomParamsInfo setParams(String params) {
        if (params != null)
            params = params.trim();
        this.params = params;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public CustomParamsInfo setType(Integer type) {
        this.type = type;
        return this;
    }

    public Integer getSystemType() {
        return systemType;
    }

    public CustomParamsInfo setSystemType(Integer systemType) {
        this.systemType = systemType;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public CustomParamsInfo setUrl(String url) {
        if (url != null)
            url = url.trim();
        this.url = url;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "custom_params_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 唯一key
     */
    public static final String KEY = "key";

    /**
     * 自定义参数
     */
    public static final String PARAMS = "params";

    /**
     * 类型 1-生成永久二维码
     */
    public static final String TYPE = "type";

    /**
     * 系统类型 1-超级仓库 2-拍卖
     */
    public static final String SYSTEM_TYPE = "system_type";

    /**
     * 二维码地址
     */
    public static final String URL = "url";


    @Override
    public CustomParamsInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

