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
 * 抽奖商品信息表
 * </p>
 *
 * @author Gaby
 * @since 2019-08-31
 */
@TableName("prize_goods_info")
public class PrizeGoodsInfo implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 抽奖商品编号 17位    普通商品16位
     */
    @TableField("goods_code")
    private String goodsCode;
    /**
     * 商品标题
     */
    private String title;
    /**
     * 描述
     */
    private String content;
    /**
     * 价格
     */
    private Integer price;
    /**
     * 状态  00A-抽奖  00B-未抽奖
     */
    private String status;
    /**
     * 商户标识
     */
    @TableField("supplier_id")
    private Long supplierId;
    /**
     * 店铺ID
     */
    @TableField("shop_uri")
    private String shopUri;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 修改时间
     */
    @TableField("modify_time")
    private Date modifyTime;
    /**
     * 主图
     */
    @TableField("first_pic")
    private String firstPic;

    public Long getId() {
        return id;
    }

    public PrizeGoodsInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public PrizeGoodsInfo setGoodsCode(String goodsCode) {
        if (goodsCode != null)
            goodsCode = goodsCode.trim();
        this.goodsCode = goodsCode;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public PrizeGoodsInfo setTitle(String title) {
        if (title != null)
            title = title.trim();
        this.title = title;
        return this;
    }

    public String getContent() {
        return content;
    }

    public PrizeGoodsInfo setContent(String content) {
        if (content != null)
            content = content.trim();
        this.content = content;
        return this;
    }

    public Integer getPrice() {
        return price;
    }

    public PrizeGoodsInfo setPrice(Integer price) {
        this.price = price;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public PrizeGoodsInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public PrizeGoodsInfo setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
        return this;
    }

    public String getShopUri() {
        return shopUri;
    }

    public PrizeGoodsInfo setShopUri(String shopUri) {
        if (shopUri != null)
            shopUri = shopUri.trim();
        this.shopUri = shopUri;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public PrizeGoodsInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public PrizeGoodsInfo setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }

    public String getFirstPic() {
        return firstPic;
    }

    public PrizeGoodsInfo setFirstPic(String firstPic) {
        if (firstPic != null)
            firstPic = firstPic.trim();
        this.firstPic = firstPic;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "prize_goods_info";
    public static final String ID = "id";

    /**
     * 抽奖商品编号 17位    普通商品16位
     */
    public static final String GOODS_CODE = "goods_code";

    /**
     * 商品标题
     */
    public static final String TITLE = "title";

    /**
     * 描述
     */
    public static final String CONTENT = "content";

    /**
     * 价格
     */
    public static final String PRICE = "price";

    /**
     * 状态  00A-抽奖  00B-未抽奖
     */
    public static final String STATUS = "status";

    /**
     * 商户标识
     */
    public static final String SUPPLIER_ID = "supplier_id";

    /**
     * 店铺ID
     */
    public static final String SHOP_URI = "shop_uri";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 修改时间
     */
    public static final String MODIFY_TIME = "modify_time";

    /**
     * 主图
     */
    public static final String FIRST_PIC = "first_pic";

    @Override
    public PrizeGoodsInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

