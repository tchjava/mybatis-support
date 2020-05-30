package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 拍品资源表
 * </p>
 *
 * @author Gaby
 * @since 2020-05-30
 */
@TableName("auction_product_resources_info")
public class AuctionProductResourcesInfo implements Serializable, IEntity {

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 拍品标识
     */
    @TableField("product_id")
    private Long productId;
    /**
     * 路径
     */
    private String url;
    /**
     * 类型  0-图片  1-视频  2-视频截帧
     */
    private Integer type;
    /**
     * 状态  00A-有效  00Z-失效
     */
    private String status;

    public Long getId() {
        return id;
    }

    public AuctionProductResourcesInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getProductId() {
        return productId;
    }

    public AuctionProductResourcesInfo setProductId(Long productId) {
        this.productId = productId;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public AuctionProductResourcesInfo setUrl(String url) {
        if (url != null)
            url = url.trim();
        this.url = url;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public AuctionProductResourcesInfo setType(Integer type) {
        this.type = type;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public AuctionProductResourcesInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_product_resources_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 拍品标识
     */
    public static final String PRODUCT_ID = "product_id";

    /**
     * 路径
     */
    public static final String URL = "url";

    /**
     * 类型  0-图片  1-视频  2-视频截帧
     */
    public static final String TYPE = "type";

    /**
     * 状态  00A-有效  00Z-失效
     */
    public static final String STATUS = "status";

    @Override
    public AuctionProductResourcesInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

