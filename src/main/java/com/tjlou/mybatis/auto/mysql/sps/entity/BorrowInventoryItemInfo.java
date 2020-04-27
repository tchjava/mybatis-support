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
 * 借货清单明细表
 * </p>
 *
 * @author Gaby
 * @since 2020-04-27
 */
@TableName("borrow_inventory_item_info")
public class BorrowInventoryItemInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 所属清单
     */
    @TableField("inventory_id")
    private Long inventoryId;
    /**
     * 所属商品
     */
    @TableField("goods_id")
    private Long goodsId;
    /**
     * 数量
     */
    private Integer num;
    /**
     * 销售价(单位:分)
     */
    private Long price;
    /**
     * 供货价(单位:分)
     */
    @TableField("agent_price")
    private Long agentPrice;
    /**
     * 配送方式 1-快递包邮 2-快递运费 4-到付
     */
    @TableField("distribute_type")
    private Integer distributeType;
    /**
     * 商品标题
     */
    @TableField("goods_title")
    private String goodsTitle;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 总价(单位:分)
     */
    private Long total;


    public Long getId() {
        return id;
    }

    public BorrowInventoryItemInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getInventoryId() {
        return inventoryId;
    }

    public BorrowInventoryItemInfo setInventoryId(Long inventoryId) {
        this.inventoryId = inventoryId;
        return this;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public BorrowInventoryItemInfo setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
        return this;
    }

    public Integer getNum() {
        return num;
    }

    public BorrowInventoryItemInfo setNum(Integer num) {
        this.num = num;
        return this;
    }

    public Long getPrice() {
        return price;
    }

    public BorrowInventoryItemInfo setPrice(Long price) {
        this.price = price;
        return this;
    }

    public Long getAgentPrice() {
        return agentPrice;
    }

    public BorrowInventoryItemInfo setAgentPrice(Long agentPrice) {
        this.agentPrice = agentPrice;
        return this;
    }

    public Integer getDistributeType() {
        return distributeType;
    }

    public BorrowInventoryItemInfo setDistributeType(Integer distributeType) {
        this.distributeType = distributeType;
        return this;
    }

    public String getGoodsTitle() {
        return goodsTitle;
    }

    public BorrowInventoryItemInfo setGoodsTitle(String goodsTitle) {
        if (goodsTitle != null)
            goodsTitle = goodsTitle.trim();
        this.goodsTitle = goodsTitle;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public BorrowInventoryItemInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Long getTotal() {
        return total;
    }

    public BorrowInventoryItemInfo setTotal(Long total) {
        this.total = total;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "borrow_inventory_item_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 所属清单
     */
    public static final String INVENTORY_ID = "inventory_id";

    /**
     * 所属商品
     */
    public static final String GOODS_ID = "goods_id";

    /**
     * 数量
     */
    public static final String NUM = "num";

    /**
     * 销售价(单位:分)
     */
    public static final String PRICE = "price";

    /**
     * 供货价(单位:分)
     */
    public static final String AGENT_PRICE = "agent_price";

    /**
     * 配送方式 1-快递包邮 2-快递运费 4-到付
     */
    public static final String DISTRIBUTE_TYPE = "distribute_type";

    /**
     * 商品标题
     */
    public static final String GOODS_TITLE = "goods_title";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 总价(单位:分)
     */
    public static final String TOTAL = "total";


    @Override
    public BorrowInventoryItemInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

