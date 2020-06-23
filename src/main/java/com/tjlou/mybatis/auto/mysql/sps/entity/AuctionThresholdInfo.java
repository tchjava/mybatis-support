package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 拍卖-阈值信息表
 * </p>
 *
 * @author Gaby
 * @since 2020-06-23
 */
@TableName("auction_threshold_info")
public class AuctionThresholdInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 1-申请当面交易
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
    /**
     * 随机种子
     */
    private Integer random;
    /**
     * 上限值
     */
    private Double upper;


    public Long getId() {
        return id;
    }

    public AuctionThresholdInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public AuctionThresholdInfo setType(Integer type) {
        this.type = type;
        return this;
    }

    public Double getValue() {
        return value;
    }

    public AuctionThresholdInfo setValue(Double value) {
        this.value = value;
        return this;
    }

    public Integer getEnable() {
        return enable;
    }

    public AuctionThresholdInfo setEnable(Integer enable) {
        this.enable = enable;
        return this;
    }

    public String getName() {
        return name;
    }

    public AuctionThresholdInfo setName(String name) {
        if (name != null)
            name = name.trim();
        this.name = name;
        return this;
    }

    public Integer getRandom() {
        return random;
    }

    public AuctionThresholdInfo setRandom(Integer random) {
        this.random = random;
        return this;
    }

    public Double getUpper() {
        return upper;
    }

    public AuctionThresholdInfo setUpper(Double upper) {
        this.upper = upper;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_threshold_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 1-申请当面交易
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

    /**
     * 随机种子
     */
    public static final String RANDOM = "random";

    /**
     * 上限值
     */
    public static final String UPPER = "upper";


    @Override
    public AuctionThresholdInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

