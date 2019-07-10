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
 * 订单条目表
 * </p>
 *
 * @author Gaby
 * @since 2019-06-26
 */
@TableName("order_item_info")
public class OrderItemInfo implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 商品标识
     */
    @TableField("goods_id")
    private Long goodsId;
    /**
     * 订单标识
     */
    @TableField("order_id")
    private Long orderId;
    /**
     * 供货商标识
     */
    @TableField("supplier_id")
    private Long supplierId;
    /**
     * 商品标题
     */
    @TableField("goods_title")
    private String goodsTitle;
    /**
     * 数量
     */
    private Integer num;
    /**
     * 单价
     */
    private Integer price;
    /**
     * 总金额
     */
    private Integer total;
    /**
     * 图片路径
     */
    @TableField("pic_path")
    private String picPath;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;

    public Long getId() {
        return id;
    }

    public OrderItemInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public OrderItemInfo setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
        return this;
    }

    public Long getOrderId() {
        return orderId;
    }

    public OrderItemInfo setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public OrderItemInfo setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
        return this;
    }

    public String getGoodsTitle() {
        return goodsTitle;
    }

    public OrderItemInfo setGoodsTitle(String goodsTitle) {
        if (goodsTitle != null)
            goodsTitle = goodsTitle.trim();
        this.goodsTitle = goodsTitle;
        return this;
    }

    public Integer getNum() {
        return num;
    }

    public OrderItemInfo setNum(Integer num) {
        this.num = num;
        return this;
    }

    public Integer getPrice() {
        return price;
    }

    public OrderItemInfo setPrice(Integer price) {
        this.price = price;
        return this;
    }

    public Integer getTotal() {
        return total;
    }

    public OrderItemInfo setTotal(Integer total) {
        this.total = total;
        return this;
    }

    public String getPicPath() {
        return picPath;
    }

    public OrderItemInfo setPicPath(String picPath) {
        if (picPath != null)
            picPath = picPath.trim();
        this.picPath = picPath;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public OrderItemInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "order_item_info";
    public static final String ID = "id";

    /**
     * 商品标识
     */
    public static final String GOODS_ID = "goods_id";

    /**
     * 订单标识
     */
    public static final String ORDER_ID = "order_id";

    /**
     * 供货商标识
     */
    public static final String SUPPLIER_ID = "supplier_id";

    /**
     * 商品标题
     */
    public static final String GOODS_TITLE = "goods_title";

    /**
     * 数量
     */
    public static final String NUM = "num";

    /**
     * 单价
     */
    public static final String PRICE = "price";

    /**
     * 总金额
     */
    public static final String TOTAL = "total";

    /**
     * 图片路径
     */
    public static final String PIC_PATH = "pic_path";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    @Override
    public OrderItemInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}
