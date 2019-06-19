package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 行政区划表
 * </p>
 *
 * @author Gaby
 * @since 2019-06-19
 */
@TableName("cfg_area_info")
public class CfgAreaInfo implements Serializable, IEntity {

    /**
     * 行政区划代码
     */
    private BigDecimal id;
    /**
     * 行政区划名称简称，如“内蒙古”
     */
    private String name;
    /**
     * 行政区划等级
     */
    private BigDecimal level;
    /**
     * 上级行政区划
     */
    private BigDecimal pid;
    /**
     * 纬度
     */
    private String lat;
    /**
     * 经度
     */
    private String lng;
    /**
     * 拼音
     */
    private String pinyin;
    /**
     * 全称，如“内蒙古自治区”
     */
    private String fullname;

    public BigDecimal getId() {
        return id;
    }

    public CfgAreaInfo setId(BigDecimal id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public CfgAreaInfo setName(String name) {
        if (name != null)
            name = name.trim();
        this.name = name;
        return this;
    }

    public BigDecimal getLevel() {
        return level;
    }

    public CfgAreaInfo setLevel(BigDecimal level) {
        this.level = level;
        return this;
    }

    public BigDecimal getPid() {
        return pid;
    }

    public CfgAreaInfo setPid(BigDecimal pid) {
        this.pid = pid;
        return this;
    }

    public String getLat() {
        return lat;
    }

    public CfgAreaInfo setLat(String lat) {
        if (lat != null)
            lat = lat.trim();
        this.lat = lat;
        return this;
    }

    public String getLng() {
        return lng;
    }

    public CfgAreaInfo setLng(String lng) {
        if (lng != null)
            lng = lng.trim();
        this.lng = lng;
        return this;
    }

    public String getPinyin() {
        return pinyin;
    }

    public CfgAreaInfo setPinyin(String pinyin) {
        if (pinyin != null)
            pinyin = pinyin.trim();
        this.pinyin = pinyin;
        return this;
    }

    public String getFullname() {
        return fullname;
    }

    public CfgAreaInfo setFullname(String fullname) {
        if (fullname != null)
            fullname = fullname.trim();
        this.fullname = fullname;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "cfg_area_info";
    /**
     * 行政区划代码
     */
    public static final String ID = "id";

    /**
     * 行政区划名称简称，如“内蒙古”
     */
    public static final String NAME = "name";

    /**
     * 行政区划等级
     */
    public static final String LEVEL = "level";

    /**
     * 上级行政区划
     */
    public static final String PID = "pid";

    /**
     * 纬度
     */
    public static final String LAT = "lat";

    /**
     * 经度
     */
    public static final String LNG = "lng";

    /**
     * 拼音
     */
    public static final String PINYIN = "pinyin";

    /**
     * 全称，如“内蒙古自治区”
     */
    public static final String FULLNAME = "fullname";

    @Override
    public CfgAreaInfo pkVal(Serializable val) {
        return this;
    }
}

