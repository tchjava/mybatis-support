package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 身份证白名单
 * </p>
 *
 * @author Gaby
 * @since 2021-01-09
 */
@TableName("id_card_white_info")
public class IdCardWhiteInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 身份证号码
     */
    @TableField("id_card")
    private String idCard;
    /**
     * 系统重复次数
     */
    private Integer num;


    public Long getId() {
        return id;
    }

    public IdCardWhiteInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getIdCard() {
        return idCard;
    }

    public IdCardWhiteInfo setIdCard(String idCard) {
        if (idCard != null)
            idCard = idCard.trim();
        this.idCard = idCard;
        return this;
    }

    public Integer getNum() {
        return num;
    }

    public IdCardWhiteInfo setNum(Integer num) {
        this.num = num;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "id_card_white_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 身份证号码
     */
    public static final String ID_CARD = "id_card";

    /**
     * 系统重复次数
     */
    public static final String NUM = "num";


    @Override
    public IdCardWhiteInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

