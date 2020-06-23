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
 * 拍卖系统抽点表
 * </p>
 *
 * @author Gaby
 * @since 2020-06-23
 */
@TableName("auction_draw_info")
public class AuctionDrawInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 所属订单
     */
    @TableField("order_id")
    private Long orderId;
    /**
     * 平台抽点数
     */
    @TableField("platform_draw")
    private Long platformDraw;
    /**
     * 卖家抽点数
     */
    @TableField("supplier_draw")
    private Long supplierDraw;
    /**
     * 买家推荐人抽点数
     */
    @TableField("buyer_recommend_draw")
    private Long buyerRecommendDraw;
    /**
     * 卖家推荐人抽点数
     */
    @TableField("seller_recommend_draw")
    private Long sellerRecommendDraw;
    /**
     * 状态 00A-有效 00Z-失效
     */
    private String status;
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


    public Long getId() {
        return id;
    }

    public AuctionDrawInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getOrderId() {
        return orderId;
    }

    public AuctionDrawInfo setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }

    public Long getPlatformDraw() {
        return platformDraw;
    }

    public AuctionDrawInfo setPlatformDraw(Long platformDraw) {
        this.platformDraw = platformDraw;
        return this;
    }

    public Long getSupplierDraw() {
        return supplierDraw;
    }

    public AuctionDrawInfo setSupplierDraw(Long supplierDraw) {
        this.supplierDraw = supplierDraw;
        return this;
    }

    public Long getBuyerRecommendDraw() {
        return buyerRecommendDraw;
    }

    public AuctionDrawInfo setBuyerRecommendDraw(Long buyerRecommendDraw) {
        this.buyerRecommendDraw = buyerRecommendDraw;
        return this;
    }

    public Long getSellerRecommendDraw() {
        return sellerRecommendDraw;
    }

    public AuctionDrawInfo setSellerRecommendDraw(Long sellerRecommendDraw) {
        this.sellerRecommendDraw = sellerRecommendDraw;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public AuctionDrawInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public AuctionDrawInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public AuctionDrawInfo setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_draw_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 所属订单
     */
    public static final String ORDER_ID = "order_id";

    /**
     * 平台抽点数
     */
    public static final String PLATFORM_DRAW = "platform_draw";

    /**
     * 卖家抽点数
     */
    public static final String SUPPLIER_DRAW = "supplier_draw";

    /**
     * 买家推荐人抽点数
     */
    public static final String BUYER_RECOMMEND_DRAW = "buyer_recommend_draw";

    /**
     * 卖家推荐人抽点数
     */
    public static final String SELLER_RECOMMEND_DRAW = "seller_recommend_draw";

    /**
     * 状态 00A-有效 00Z-失效
     */
    public static final String STATUS = "status";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 修改时间
     */
    public static final String MODIFY_TIME = "modify_time";


    @Override
    public AuctionDrawInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

