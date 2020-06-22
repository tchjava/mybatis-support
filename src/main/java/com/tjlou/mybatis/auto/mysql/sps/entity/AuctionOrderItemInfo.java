package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 拍卖-订单条目表
 * </p>
 *
 * @author Gaby
 * @since 2020-06-22
 */
@TableName("auction_order_item_info")
public class AuctionOrderItemInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 订单标识
     */
    @TableField("order_id")
    private Long orderId;
    /**
     * 拍品实例标识
     */
    @TableField("instance_id")
    private Long instanceId;
    /**
     * 数量
     */
    private Integer num;
    /**
     * 单价（单位：分）
     */
    private Long price;
    /**
     * 总价(单位：分)
     */
    private Long total;
    /**
     * 主图
     */
    @TableField("first_pic")
    private String firstPic;
    /**
     * 拍品标题
     */
    private String title;


    public Long getId() {
        return id;
    }

    public AuctionOrderItemInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getOrderId() {
        return orderId;
    }

    public AuctionOrderItemInfo setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }

    public Long getInstanceId() {
        return instanceId;
    }

    public AuctionOrderItemInfo setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public Integer getNum() {
        return num;
    }

    public AuctionOrderItemInfo setNum(Integer num) {
        this.num = num;
        return this;
    }

    public Long getPrice() {
        return price;
    }

    public AuctionOrderItemInfo setPrice(Long price) {
        this.price = price;
        return this;
    }

    public Long getTotal() {
        return total;
    }

    public AuctionOrderItemInfo setTotal(Long total) {
        this.total = total;
        return this;
    }

    public String getFirstPic() {
        return firstPic;
    }

    public AuctionOrderItemInfo setFirstPic(String firstPic) {
        if (firstPic != null)
            firstPic = firstPic.trim();
        this.firstPic = firstPic;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public AuctionOrderItemInfo setTitle(String title) {
        if (title != null)
            title = title.trim();
        this.title = title;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_order_item_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 订单标识
     */
    public static final String ORDER_ID = "order_id";

    /**
     * 拍品实例标识
     */
    public static final String INSTANCE_ID = "instance_id";

    /**
     * 数量
     */
    public static final String NUM = "num";

    /**
     * 单价（单位：分）
     */
    public static final String PRICE = "price";

    /**
     * 总价(单位：分)
     */
    public static final String TOTAL = "total";

    /**
     * 主图
     */
    public static final String FIRST_PIC = "first_pic";

    /**
     * 拍品标题
     */
    public static final String TITLE = "title";


    @Override
    public AuctionOrderItemInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

