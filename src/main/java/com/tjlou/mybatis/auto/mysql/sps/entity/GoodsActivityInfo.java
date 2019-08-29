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
 * 商品活动信息表
 * </p>
 *
 * @author Gaby
 * @since 2019-08-23
 */
@TableName("goods_activity_info")
public class GoodsActivityInfo implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 内容标识
     */
    @TableField("content_id")
    private Long contentId;
    /**
     * 商品标识
     */
    @TableField("goods_id")
    private Long goodsId;
    /**
     * 商品标题
     */
    @TableField("goods_title")
    private String goodsTitle;
    /**
     * 商品价格 单位:分
     */
    @TableField("goods_price")
    private Integer goodsPrice;
    /**
     * 商品代理价 单位:分
     */
    @TableField("goods_agent_price")
    private Integer goodsAgentPrice;
    /**
     * 商品图片
     */
    @TableField("first_pic")
    private String firstPic;
    /**
     * 店铺ID
     */
    @TableField("shop_uri")
    private String shopUri;
    /**
     * 商户标识
     */
    @TableField("supplier_id")
    private Long supplierId;
    /**
     * 版本号
     */
    private Integer version;
    /**
     * 平台标识
     */
    @TableField("app_id")
    private Long appId;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 结束时间
     */
    @TableField("end_time")
    private Date endTime;
    /**
     * 失效时间
     */
    @TableField("expire_time")
    private Date expireTime;
    /**
     * 更新时间
     */
    @TableField("modify_time")
    private Date modifyTime;
    /**
     * 状态 00A-有效  00Z-失效
     */
    private String status;
    /**
     * 排序
     */
    private Date sort;
    /**
     * 是否是平台推荐
     */
    private String nominate;

    public Long getId() {
        return id;
    }

    public GoodsActivityInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getContentId() {
        return contentId;
    }

    public GoodsActivityInfo setContentId(Long contentId) {
        this.contentId = contentId;
        return this;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public GoodsActivityInfo setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
        return this;
    }

    public String getGoodsTitle() {
        return goodsTitle;
    }

    public GoodsActivityInfo setGoodsTitle(String goodsTitle) {
        if (goodsTitle != null)
            goodsTitle = goodsTitle.trim();
        this.goodsTitle = goodsTitle;
        return this;
    }

    public Integer getGoodsPrice() {
        return goodsPrice;
    }

    public GoodsActivityInfo setGoodsPrice(Integer goodsPrice) {
        this.goodsPrice = goodsPrice;
        return this;
    }

    public Integer getGoodsAgentPrice() {
        return goodsAgentPrice;
    }

    public GoodsActivityInfo setGoodsAgentPrice(Integer goodsAgentPrice) {
        this.goodsAgentPrice = goodsAgentPrice;
        return this;
    }

    public String getFirstPic() {
        return firstPic;
    }

    public GoodsActivityInfo setFirstPic(String firstPic) {
        if (firstPic != null)
            firstPic = firstPic.trim();
        this.firstPic = firstPic;
        return this;
    }

    public String getShopUri() {
        return shopUri;
    }

    public GoodsActivityInfo setShopUri(String shopUri) {
        if (shopUri != null)
            shopUri = shopUri.trim();
        this.shopUri = shopUri;
        return this;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public GoodsActivityInfo setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
        return this;
    }

    public Integer getVersion() {
        return version;
    }

    public GoodsActivityInfo setVersion(Integer version) {
        this.version = version;
        return this;
    }

    public Long getAppId() {
        return appId;
    }

    public GoodsActivityInfo setAppId(Long appId) {
        this.appId = appId;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public GoodsActivityInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getEndTime() {
        return endTime;
    }

    public GoodsActivityInfo setEndTime(Date endTime) {
        this.endTime = endTime;
        return this;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public GoodsActivityInfo setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public GoodsActivityInfo setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public GoodsActivityInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    public Date getSort() {
        return sort;
    }

    public GoodsActivityInfo setSort(Date sort) {
        this.sort = sort;
        return this;
    }

    public String getNominate() {
        return nominate;
    }

    public GoodsActivityInfo setNominate(String nominate) {
        if (nominate != null)
            nominate = nominate.trim();
        this.nominate = nominate;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "goods_activity_info";
    public static final String ID = "id";

    /**
     * 内容标识
     */
    public static final String CONTENT_ID = "content_id";

    /**
     * 商品标识
     */
    public static final String GOODS_ID = "goods_id";

    /**
     * 商品标题
     */
    public static final String GOODS_TITLE = "goods_title";

    /**
     * 商品价格 单位:分
     */
    public static final String GOODS_PRICE = "goods_price";

    /**
     * 商品代理价 单位:分
     */
    public static final String GOODS_AGENT_PRICE = "goods_agent_price";

    /**
     * 商品图片
     */
    public static final String FIRST_PIC = "first_pic";

    /**
     * 店铺ID
     */
    public static final String SHOP_URI = "shop_uri";

    /**
     * 商户标识
     */
    public static final String SUPPLIER_ID = "supplier_id";

    /**
     * 版本号
     */
    public static final String VERSION = "version";

    /**
     * 平台标识
     */
    public static final String APP_ID = "app_id";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 结束时间
     */
    public static final String END_TIME = "end_time";

    /**
     * 失效时间
     */
    public static final String EXPIRE_TIME = "expire_time";

    /**
     * 更新时间
     */
    public static final String MODIFY_TIME = "modify_time";

    /**
     * 状态 00A-有效  00Z-失效
     */
    public static final String STATUS = "status";

    /**
     * 排序
     */
    public static final String SORT = "sort";

    /**
     * 是否是平台推荐
     */
    public static final String NOMINATE = "nominate";

    @Override
    public GoodsActivityInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

