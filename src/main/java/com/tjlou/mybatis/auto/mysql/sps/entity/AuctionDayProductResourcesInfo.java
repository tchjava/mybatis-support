package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 天天竞拍资源表
 * </p>
 *
 * @author Gaby
 * @since 2021-01-12
 */
@TableName("auction_day_product_resources_info")
public class AuctionDayProductResourcesInfo implements Serializable, IEntity {


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
     * 资源地址
     */
    private String url;
    /**
     * 资源类型  0-图片 1-视频 2-视频截帧
     */
    private Integer type;
    /**
     * 状态  00A-有效  00Z-失效
     */
    private String status;


    public Long getId() {
        return id;
    }

    public AuctionDayProductResourcesInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getProductId() {
        return productId;
    }

    public AuctionDayProductResourcesInfo setProductId(Long productId) {
        this.productId = productId;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public AuctionDayProductResourcesInfo setUrl(String url) {
        if (url != null)
            url = url.trim();
        this.url = url;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public AuctionDayProductResourcesInfo setType(Integer type) {
        this.type = type;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public AuctionDayProductResourcesInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_day_product_resources_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 所属拍品
     */
    public static final String PRODUCT_ID = "product_id";

    /**
     * 资源地址
     */
    public static final String URL = "url";

    /**
     * 资源类型  0-图片 1-视频 2-视频截帧
     */
    public static final String TYPE = "type";

    /**
     * 状态  00A-有效  00Z-失效
     */
    public static final String STATUS = "status";


    @Override
    public AuctionDayProductResourcesInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

