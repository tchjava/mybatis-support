package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 运费选择信息表
 * </p>
 *
 * @author Gaby
 * @since 2020-01-28
 */
@TableName("freight_choose_info")
public class FreightChooseInfo implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 店铺ID
     */
    @TableField("shop_uri")
    private String shopUri;
    /**
     * 1-普通快递 2-顺丰快递 4-顺丰到付
     */
    private Integer type;
    /**
     * 是否显示
     */
    private Integer show;
    /**
     * 价格
     */
    private Long price;

    public Long getId() {
        return id;
    }

    public FreightChooseInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getShopUri() {
        return shopUri;
    }

    public FreightChooseInfo setShopUri(String shopUri) {
        if (shopUri != null)
            shopUri = shopUri.trim();
        this.shopUri = shopUri;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public FreightChooseInfo setType(Integer type) {
        this.type = type;
        return this;
    }

    public Integer getShow() {
        return show;
    }

    public FreightChooseInfo setShow(Integer show) {
        this.show = show;
        return this;
    }

    public Long getPrice() {
        return price;
    }

    public FreightChooseInfo setPrice(Long price) {
        this.price = price;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "freight_choose_info";
    public static final String ID = "id";

    /**
     * 店铺ID
     */
    public static final String SHOP_URI = "shop_uri";

    /**
     * 1-普通快递 2-顺丰快递 4-顺丰到付
     */
    public static final String TYPE = "type";

    /**
     * 是否显示
     */
    public static final String SHOW = "show";

    /**
     * 价格
     */
    public static final String PRICE = "price";

    @Override
    public FreightChooseInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

