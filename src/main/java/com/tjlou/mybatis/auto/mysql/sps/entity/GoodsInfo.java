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
 * 商品信息表
 * </p>
 *
 * @author Gaby
 * @since 2019-06-13
 */
@TableName("goods_info")
public class GoodsInfo implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 商品编号
     */
    @TableField("sale_code")
    private String saleCode;
    /**
     * 分类标识
     */
    @TableField("category_id")
    private Long categoryId;
    /**
     * 店铺 ID
     */
    private String shopUri;
    /**
     * 商品标题
     */
    private String title;
    /**
     * 商品描述
     */
    private String content;
    /**
     * 发布时间
     */
    private Date intime;
    /**
     * 商品销售价格
     */
    private Integer price;
    /**
     * 商品库存
     */
    private Integer stock;
    /**
     * 代理价
     */
    @TableField("agent_price")
    private Integer agentPrice;
    /**
     * 商品状态
     */
    private String status;
    /**
     * 商品热度
     */
    private Integer heat;
    /**
     * 商品分享次数
     */
    private Integer share;
    /**
     * 商品下载次数
     */
    private Integer downtimes;
    /**
     * 是否包邮
     */
    private Integer isFreeShip;
    /**
     * 运费
     */
    private Integer freight;

    public Long getId() {
        return id;
    }

    public GoodsInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getSaleCode() {
        return saleCode;
    }

    public GoodsInfo setSaleCode(String saleCode) {
        if (saleCode != null)
            saleCode = saleCode.trim();
        this.saleCode = saleCode;
        return this;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public GoodsInfo setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public String getShopUri() {
        return shopUri;
    }

    public GoodsInfo setShopUri(String shopUri) {
        if (shopUri != null)
            shopUri = shopUri.trim();
        this.shopUri = shopUri;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public GoodsInfo setTitle(String title) {
        if (title != null)
            title = title.trim();
        this.title = title;
        return this;
    }

    public String getContent() {
        return content;
    }

    public GoodsInfo setContent(String content) {
        if (content != null)
            content = content.trim();
        this.content = content;
        return this;
    }

    public Date getIntime() {
        return intime;
    }

    public GoodsInfo setIntime(Date intime) {
        this.intime = intime;
        return this;
    }

    public Integer getPrice() {
        return price;
    }

    public GoodsInfo setPrice(Integer price) {
        this.price = price;
        return this;
    }

    public Integer getStock() {
        return stock;
    }

    public GoodsInfo setStock(Integer stock) {
        this.stock = stock;
        return this;
    }

    public Integer getAgentPrice() {
        return agentPrice;
    }

    public GoodsInfo setAgentPrice(Integer agentPrice) {
        this.agentPrice = agentPrice;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public GoodsInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    public Integer getHeat() {
        return heat;
    }

    public GoodsInfo setHeat(Integer heat) {
        this.heat = heat;
        return this;
    }

    public Integer getShare() {
        return share;
    }

    public GoodsInfo setShare(Integer share) {
        this.share = share;
        return this;
    }

    public Integer getDowntimes() {
        return downtimes;
    }

    public GoodsInfo setDowntimes(Integer downtimes) {
        this.downtimes = downtimes;
        return this;
    }

    public Integer getIsFreeShip() {
        return isFreeShip;
    }

    public GoodsInfo setIsFreeShip(Integer isFreeShip) {
        this.isFreeShip = isFreeShip;
        return this;
    }

    public Integer getFreight() {
        return freight;
    }

    public GoodsInfo setFreight(Integer freight) {
        this.freight = freight;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "goods_info";
    public static final String ID = "id";

    /**
     * 商品编号
     */
    public static final String SALE_CODE = "sale_code";

    /**
     * 分类标识
     */
    public static final String CATEGORY_ID = "category_id";

    /**
     * 店铺 ID
     */
    public static final String SHOPURI = "shopUri";

    /**
     * 商品标题
     */
    public static final String TITLE = "title";

    /**
     * 商品描述
     */
    public static final String CONTENT = "content";

    /**
     * 发布时间
     */
    public static final String INTIME = "intime";

    /**
     * 商品销售价格
     */
    public static final String PRICE = "price";

    /**
     * 商品库存
     */
    public static final String STOCK = "stock";

    /**
     * 代理价
     */
    public static final String AGENT_PRICE = "agent_price";

    /**
     * 商品状态
     */
    public static final String STATUS = "status";

    /**
     * 商品热度
     */
    public static final String HEAT = "heat";

    /**
     * 商品分享次数
     */
    public static final String SHARE = "share";

    /**
     * 商品下载次数
     */
    public static final String DOWNTIMES = "downtimes";

    /**
     * 是否包邮
     */
    public static final String ISFREESHIP = "isFreeShip";

    /**
     * 运费
     */
    public static final String FREIGHT = "freight";

    @Override
    public GoodsInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

