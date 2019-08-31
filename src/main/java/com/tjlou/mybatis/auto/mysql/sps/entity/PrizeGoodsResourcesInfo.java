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
 * 抽奖商品资源表
 * </p>
 *
 * @author Gaby
 * @since 2019-08-31
 */
@TableName("prize_goods_resources_info")
public class PrizeGoodsResourcesInfo implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 奖品标识
     */
    @TableField("goods_id")
    private Long goodsId;
    /**
     * 资源地址
     */
    private String url;
    /**
     * 类型(0 图片 1 视频 2-视频的截帧图)
     */
    private String type;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 状态 00A-有效  00Z-失效
     */
    private String status;

    public Long getId() {
        return id;
    }

    public PrizeGoodsResourcesInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public PrizeGoodsResourcesInfo setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public PrizeGoodsResourcesInfo setUrl(String url) {
        if (url != null)
            url = url.trim();
        this.url = url;
        return this;
    }

    public String getType() {
        return type;
    }

    public PrizeGoodsResourcesInfo setType(String type) {
        if (type != null)
            type = type.trim();
        this.type = type;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public PrizeGoodsResourcesInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public PrizeGoodsResourcesInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "prize_goods_resources_info";
    public static final String ID = "id";

    /**
     * 奖品标识
     */
    public static final String GOODS_ID = "goods_id";

    /**
     * 资源地址
     */
    public static final String URL = "url";

    /**
     * 类型(0 图片 1 视频 2-视频的截帧图)
     */
    public static final String TYPE = "type";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 状态 00A-有效  00Z-失效
     */
    public static final String STATUS = "status";

    @Override
    public PrizeGoodsResourcesInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

