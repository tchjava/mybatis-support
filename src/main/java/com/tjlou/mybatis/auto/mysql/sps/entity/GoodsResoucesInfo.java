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
 * 商品资源表
 * </p>
 *
 * @author Gaby
 * @since 2019-06-12
 */
@TableName("goods_resouces_info")
public class GoodsResoucesInfo implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 商品编号
     */
    @TableField("sale_code")
    private String saleCode;
    /**
     * 图片路径
     */
    private String url;
    /**
     * 图片入库时间
     */
    private Date intime;
    /**
     * 类型(0 图片 1 视频)
     */
    private String type;

    public Long getId() {
        return id;
    }

    public GoodsResoucesInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getSaleCode() {
        return saleCode;
    }

    public GoodsResoucesInfo setSaleCode(String saleCode) {
        if (saleCode != null)
            saleCode = saleCode.trim();
        this.saleCode = saleCode;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public GoodsResoucesInfo setUrl(String url) {
        if (url != null)
            url = url.trim();
        this.url = url;
        return this;
    }

    public Date getIntime() {
        return intime;
    }

    public GoodsResoucesInfo setIntime(Date intime) {
        this.intime = intime;
        return this;
    }

    public String getType() {
        return type;
    }

    public GoodsResoucesInfo setType(String type) {
        if (type != null)
            type = type.trim();
        this.type = type;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "goods_resouces_info";
    public static final String ID = "id";

    /**
     * 商品编号
     */
    public static final String SALE_CODE = "sale_code";

    /**
     * 图片路径
     */
    public static final String URL = "url";

    /**
     * 图片入库时间
     */
    public static final String INTIME = "intime";

    /**
     * 类型(0 图片 1 视频)
     */
    public static final String TYPE = "type";

    @Override
    public GoodsResoucesInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

