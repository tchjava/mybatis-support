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
 * 抽奖商品日志表
 * </p>
 *
 * @author Gaby
 * @since 2019-09-05
 */
@TableName("prize_goods_log")
public class PrizeGoodsLog implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 商品标识
     */
    @TableField("goods_id")
    private Long goodsId;
    /**
     * 商品标题
     */
    private String title;
    /**
     * 价格
     */
    private Integer price;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 开奖时间
     */
    @TableField("prize_time")
    private Date prizeTime;
    /**
     * 00A-正在开奖 00B-归档
     */
    private String status;
    /**
     * 中奖码
     */
    @TableField("win_code")
    private String winCode;

    public Long getId() {
        return id;
    }

    public PrizeGoodsLog setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public PrizeGoodsLog setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public PrizeGoodsLog setTitle(String title) {
        if (title != null)
            title = title.trim();
        this.title = title;
        return this;
    }

    public Integer getPrice() {
        return price;
    }

    public PrizeGoodsLog setPrice(Integer price) {
        this.price = price;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public PrizeGoodsLog setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getPrizeTime() {
        return prizeTime;
    }

    public PrizeGoodsLog setPrizeTime(Date prizeTime) {
        this.prizeTime = prizeTime;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public PrizeGoodsLog setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    public String getWinCode() {
        return winCode;
    }

    public PrizeGoodsLog setWinCode(String winCode) {
        if (winCode != null)
            winCode = winCode.trim();
        this.winCode = winCode;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "prize_goods_log";
    public static final String ID = "id";

    /**
     * 商品标识
     */
    public static final String GOODS_ID = "goods_id";

    /**
     * 商品标题
     */
    public static final String TITLE = "title";

    /**
     * 价格
     */
    public static final String PRICE = "price";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 开奖时间
     */
    public static final String PRIZE_TIME = "prize_time";

    /**
     * 00A-正在开奖 00B-归档
     */
    public static final String STATUS = "status";

    /**
     * 中奖码
     */
    public static final String WIN_CODE = "win_code";

    @Override
    public PrizeGoodsLog pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

