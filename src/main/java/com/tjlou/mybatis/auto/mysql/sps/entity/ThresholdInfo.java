package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 阈值信息表
 * </p>
 *
 * @author Gaby
 * @since 2020-02-10
 */
@TableName("threshold_info")
public class ThresholdInfo implements Serializable, IEntity {

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 1-商品热度
     */
    private Integer type;
    /**
     * 阈值
     */
    private Double value;
    /**
     * 是否开启
     */
    private Integer enable;
    /**
     * 类型名称
     */
    private String name;

    public Long getId() {
        return id;
    }

    public ThresholdInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public ThresholdInfo setType(Integer type) {
        this.type = type;
        return this;
    }

    public Double getValue() {
        return value;
    }

    public ThresholdInfo setValue(Double value) {
        this.value = value;
        return this;
    }

    public Integer getEnable() {
        return enable;
    }

    public ThresholdInfo setEnable(Integer enable) {
        this.enable = enable;
        return this;
    }

    public String getName() {
        return name;
    }

    public ThresholdInfo setName(String name) {
        if (name != null)
            name = name.trim();
        this.name = name;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "threshold_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 1-商品热度
     */
    public static final String TYPE = "type";

    /**
     * 阈值
     */
    public static final String VALUE = "value";

    /**
     * 是否开启
     */
    public static final String ENABLE = "enable";

    /**
     * 类型名称
     */
    public static final String NAME = "name";

    @Override
    public ThresholdInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

