package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 供货商信息表
 * </p>
 *
 * @author Gaby
 * @since 2019-06-16
 */
@TableName("supplier_info")
public class SupplierInfo implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    private String nickname;
    private String openId;
    private String shopUri;
    private String phone;
    private String headimg;
    private Date intime;
    private Integer level;
    private Integer score;
    private String qrcode;
    private BigDecimal rate;
    @TableField("id_card")
    private String idCard;
    @TableField("foot_safe")
    private Integer footSafe;
    private Long capacity;

    public Long getId() {
        return id;
    }

    public SupplierInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNickname() {
        return nickname;
    }

    public SupplierInfo setNickname(String nickname) {
        if (nickname != null)
            nickname = nickname.trim();
        this.nickname = nickname;
        return this;
    }

    public String getOpenId() {
        return openId;
    }

    public SupplierInfo setOpenId(String openId) {
        if (openId != null)
            openId = openId.trim();
        this.openId = openId;
        return this;
    }

    public String getShopUri() {
        return shopUri;
    }

    public SupplierInfo setShopUri(String shopUri) {
        if (shopUri != null)
            shopUri = shopUri.trim();
        this.shopUri = shopUri;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public SupplierInfo setPhone(String phone) {
        if (phone != null)
            phone = phone.trim();
        this.phone = phone;
        return this;
    }

    public String getHeadimg() {
        return headimg;
    }

    public SupplierInfo setHeadimg(String headimg) {
        if (headimg != null)
            headimg = headimg.trim();
        this.headimg = headimg;
        return this;
    }

    public Date getIntime() {
        return intime;
    }

    public SupplierInfo setIntime(Date intime) {
        this.intime = intime;
        return this;
    }

    public Integer getLevel() {
        return level;
    }

    public SupplierInfo setLevel(Integer level) {
        this.level = level;
        return this;
    }

    public Integer getScore() {
        return score;
    }

    public SupplierInfo setScore(Integer score) {
        this.score = score;
        return this;
    }

    public String getQrcode() {
        return qrcode;
    }

    public SupplierInfo setQrcode(String qrcode) {
        if (qrcode != null)
            qrcode = qrcode.trim();
        this.qrcode = qrcode;
        return this;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public SupplierInfo setRate(BigDecimal rate) {
        this.rate = rate;
        return this;
    }

    public String getIdCard() {
        return idCard;
    }

    public SupplierInfo setIdCard(String idCard) {
        if (idCard != null)
            idCard = idCard.trim();
        this.idCard = idCard;
        return this;
    }

    public Integer getFootSafe() {
        return footSafe;
    }

    public SupplierInfo setFootSafe(Integer footSafe) {
        this.footSafe = footSafe;
        return this;
    }

    public Long getCapacity() {
        return capacity;
    }

    public SupplierInfo setCapacity(Long capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "supplier_info";
    public static final String ID = "id";

    public static final String NICKNAME = "nickname";

    public static final String OPENID = "openId";

    public static final String SHOPURI = "shopUri";

    public static final String PHONE = "phone";

    public static final String HEADIMG = "headimg";

    public static final String INTIME = "intime";

    public static final String LEVEL = "level";

    public static final String SCORE = "score";

    public static final String QRCODE = "qrcode";

    public static final String RATE = "rate";

    public static final String ID_CARD = "id_card";

    public static final String FOOT_SAFE = "foot_safe";

    public static final String CAPACITY = "capacity";

    @Override
    public SupplierInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

