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
 * 新人福利点击记录统计表
 * </p>
 *
 * @author Gaby
 * @since 2020-09-25
 */
@TableName("subsidies_boon_click_count_info")
public class SubsidiesBoonClickCountInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 每天的不同来源、不同点击类型的人数
     */
    @TableField("dimension_1")
    private String dimension1;


    public Long getId() {
        return id;
    }

    public SubsidiesBoonClickCountInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public SubsidiesBoonClickCountInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getDimension1() {
        return dimension1;
    }

    public SubsidiesBoonClickCountInfo setDimension1(String dimension1) {
        if (dimension1 != null)
            dimension1 = dimension1.trim();
        this.dimension1 = dimension1;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "subsidies_boon_click_count_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 每天的不同来源、不同点击类型的人数
     */
    public static final String DIMENSION_1 = "dimension_1";


    @Override
    public SubsidiesBoonClickCountInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

