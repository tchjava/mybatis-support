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
 * 拍卖商家资源表
 * </p>
 *
 * @author Gaby
 * @since 2020-06-05
 */
@TableName("auction_supplier_resources_info")
public class AuctionSupplierResourcesInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 商家标识
     */
    @TableField("supplier_id")
    private Long supplierId;
    /**
     * 路径
     */
    private String url;
    /**
     * 类型 1-身份证正面 2-身份证反面 4-手持身份证 8-营业执照 16-食品许可证
     */
    private Integer type;
    /**
     * 状态 00A-有效  00Z-失效
     */
    private String status;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;


    public Long getId() {
        return id;
    }

    public AuctionSupplierResourcesInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public AuctionSupplierResourcesInfo setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public AuctionSupplierResourcesInfo setUrl(String url) {
        if (url != null)
            url = url.trim();
        this.url = url;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public AuctionSupplierResourcesInfo setType(Integer type) {
        this.type = type;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public AuctionSupplierResourcesInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public AuctionSupplierResourcesInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_supplier_resources_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 商家标识
     */
    public static final String SUPPLIER_ID = "supplier_id";

    /**
     * 路径
     */
    public static final String URL = "url";

    /**
     * 类型 1-身份证正面 2-身份证反面 4-手持身份证 8-营业执照 16-食品许可证
     */
    public static final String TYPE = "type";

    /**
     * 状态 00A-有效  00Z-失效
     */
    public static final String STATUS = "status";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";


    @Override
    public AuctionSupplierResourcesInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

