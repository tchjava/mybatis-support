package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
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
 * @since 2020-07-30
 */
@TableName("platform_count_info")
public class PlatformCountInfo implements Serializable, IEntity {


    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 统计类型 -1-未知  1-百亿补贴(已补贴)
     */
    @TableField("count_type")
    private Integer countType;
    /**
     * 统计数
     */
    private Long num;
    /**
     * 系统类型 1-超级仓库 2-拍卖
     */
    @TableField("system_type")
    private Integer systemType;


    public Long getId() {
        return id;
    }

    public PlatformCountInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Integer getCountType() {
        return countType;
    }

    public PlatformCountInfo setCountType(Integer countType) {
        this.countType = countType;
        return this;
    }

    public Long getNum() {
        return num;
    }

    public PlatformCountInfo setNum(Long num) {
        this.num = num;
        return this;
    }

    public Integer getSystemType() {
        return systemType;
    }

    public PlatformCountInfo setSystemType(Integer systemType) {
        this.systemType = systemType;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "platform_count_info";
    public static final String ID = "id";

    /**
     * 统计类型 -1-未知  1-百亿补贴(已补贴)
     */
    public static final String COUNT_TYPE = "count_type";

    /**
     * 统计数
     */
    public static final String NUM = "num";

    /**
     * 系统类型 1-超级仓库 2-拍卖
     */
    public static final String SYSTEM_TYPE = "system_type";


    @Override
    public PlatformCountInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

