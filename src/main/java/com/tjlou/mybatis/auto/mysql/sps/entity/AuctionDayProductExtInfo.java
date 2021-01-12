package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 天天竞拍拓展表
 * </p>
 *
 * @author Gaby
 * @since 2021-01-12
 */
@TableName("auction_day_product_ext_info")
public class AuctionDayProductExtInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 所属拍品
     */
    @TableField("product_id")
    private Long productId;
    /**
     * 描述
     */
    private String content;


    public Long getId() {
        return id;
    }

    public AuctionDayProductExtInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getProductId() {
        return productId;
    }

    public AuctionDayProductExtInfo setProductId(Long productId) {
        this.productId = productId;
        return this;
    }

    public String getContent() {
        return content;
    }

    public AuctionDayProductExtInfo setContent(String content) {
        if (content != null)
            content = content.trim();
        this.content = content;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_day_product_ext_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 所属拍品
     */
    public static final String PRODUCT_ID = "product_id";

    /**
     * 描述
     */
    public static final String CONTENT = "content";


    @Override
    public AuctionDayProductExtInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

