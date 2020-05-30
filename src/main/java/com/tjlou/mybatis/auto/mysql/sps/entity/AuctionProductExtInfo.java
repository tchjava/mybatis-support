package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 拍品拓展信息表
 * </p>
 *
 * @author Gaby
 * @since 2020-05-30
 */
@TableName("auction_product_ext_info")
public class AuctionProductExtInfo implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 拍品标识
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

    public AuctionProductExtInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getProductId() {
        return productId;
    }

    public AuctionProductExtInfo setProductId(Long productId) {
        this.productId = productId;
        return this;
    }

    public String getContent() {
        return content;
    }

    public AuctionProductExtInfo setContent(String content) {
        if (content != null)
            content = content.trim();
        this.content = content;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_product_ext_info";
    public static final String ID = "id";

    /**
     * 拍品标识
     */
    public static final String PRODUCT_ID = "product_id";

    /**
     * 描述
     */
    public static final String CONTENT = "content";

    @Override
    public AuctionProductExtInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

