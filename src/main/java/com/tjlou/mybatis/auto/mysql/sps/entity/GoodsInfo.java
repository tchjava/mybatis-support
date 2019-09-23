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
 * @since 2019-09-19
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
    @TableField("shop_uri")
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
     * 商品销售价格 单位:分
     */
    private Integer price;
    /**
     * 商品库存
     */
    private Integer stock;
    /**
     * 代理价  单位:分
     */
    @TableField("agent_price")
    private Integer agentPrice;
    /**
     * 商品状态 00A-上架 00B-下架  00C-草稿箱 00Z-失效
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
     * 评论数
     */
    @TableField("comment_num")
    private Integer commentNum;
    /**
     * 是否包邮
     */
    @TableField("free_ship")
    private Integer freeShip;
    /**
     * 运费
     */
    private Integer freight;
    /**
     * 主图
     */
    @TableField("first_pic")
    private String firstPic;
    /**
     * 销量
     */
    private Integer sales;
    /**
     * 更新时间
     */
    @TableField("modify_time")
    private Date modifyTime;
    /**
     * 商品权重
     */
    private Double weight;
    /**
     * 邮费到付
     */
    @TableField("to_pay")
    private Integer toPay;

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

    public Integer getCommentNum() {
        return commentNum;
    }

    public GoodsInfo setCommentNum(Integer commentNum) {
        this.commentNum = commentNum;
        return this;
    }

    public Integer getFreeShip() {
        return freeShip;
    }

    public GoodsInfo setFreeShip(Integer freeShip) {
        this.freeShip = freeShip;
        return this;
    }

    public Integer getFreight() {
        return freight;
    }

    public GoodsInfo setFreight(Integer freight) {
        this.freight = freight;
        return this;
    }

    public String getFirstPic() {
        return firstPic;
    }

    public GoodsInfo setFirstPic(String firstPic) {
        if (firstPic != null)
            firstPic = firstPic.trim();
        this.firstPic = firstPic;
        return this;
    }

    public Integer getSales() {
        return sales;
    }

    public GoodsInfo setSales(Integer sales) {
        this.sales = sales;
        return this;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public GoodsInfo setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }

    public Double getWeight() {
        return weight;
    }

    public GoodsInfo setWeight(Double weight) {
        this.weight = weight;
        return this;
    }

    public Integer getToPay() {
        return toPay;
    }

    public GoodsInfo setToPay(Integer toPay) {
        this.toPay = toPay;
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
    public static final String SHOP_URI = "shop_uri";

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
     * 商品销售价格 单位:分
     */
    public static final String PRICE = "price";

    /**
     * 商品库存
     */
    public static final String STOCK = "stock";

    /**
     * 代理价  单位:分
     */
    public static final String AGENT_PRICE = "agent_price";

    /**
     * 商品状态 00A-上架 00B-下架  00C-草稿箱 00Z-失效
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
     * 评论数
     */
    public static final String COMMENT_NUM = "comment_num";

    /**
     * 是否包邮
     */
    public static final String FREE_SHIP = "free_ship";

    /**
     * 运费
     */
    public static final String FREIGHT = "freight";

    /**
     * 主图
     */
    public static final String FIRST_PIC = "first_pic";

    /**
     * 销量
     */
    public static final String SALES = "sales";

    /**
     * 更新时间
     */
    public static final String MODIFY_TIME = "modify_time";

    /**
     * 商品权重
     */
    public static final String WEIGHT = "weight";

    /**
     * 邮费到付
     */
    public static final String TO_PAY = "to_pay";

    @Override
    public GoodsInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

