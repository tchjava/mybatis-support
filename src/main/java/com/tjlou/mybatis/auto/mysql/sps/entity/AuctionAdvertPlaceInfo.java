package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 拍卖-广告位信息表
 * </p>
 *
 * @author Gaby
 * @since 2021-07-12
 */
@TableName("auction_advert_place_info")
public class AuctionAdvertPlaceInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 所属分类
     */
    @TableField("category_id")
    private Long categoryId;
    /**
     * 所属样式
     */
    private Long style;
    /**
     * 状态 1-开启 0-禁用
     */
    private Integer enable;
    /**
     * 排序
     */
    private Integer sort;
    /**
     * 模块类型  1-首页 2-精选  3-关注  4-品牌馆
     */
    @TableField("module_type")
    private Integer moduleType;
    /**
     * 客户端显示 -1-默认所有端显示  &运算进行判断
     */
    @TableField("client_view")
    private Integer clientView;


    public Long getId() {
        return id;
    }

    public AuctionAdvertPlaceInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public AuctionAdvertPlaceInfo setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public Long getStyle() {
        return style;
    }

    public AuctionAdvertPlaceInfo setStyle(Long style) {
        this.style = style;
        return this;
    }

    public Integer getEnable() {
        return enable;
    }

    public AuctionAdvertPlaceInfo setEnable(Integer enable) {
        this.enable = enable;
        return this;
    }

    public Integer getSort() {
        return sort;
    }

    public AuctionAdvertPlaceInfo setSort(Integer sort) {
        this.sort = sort;
        return this;
    }

    public Integer getModuleType() {
        return moduleType;
    }

    public AuctionAdvertPlaceInfo setModuleType(Integer moduleType) {
        this.moduleType = moduleType;
        return this;
    }

    public Integer getClientView() {
        return clientView;
    }

    public AuctionAdvertPlaceInfo setClientView(Integer clientView) {
        this.clientView = clientView;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_advert_place_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 所属分类
     */
    public static final String CATEGORY_ID = "category_id";

    /**
     * 所属样式
     */
    public static final String STYLE = "style";

    /**
     * 状态 1-开启 0-禁用
     */
    public static final String ENABLE = "enable";

    /**
     * 排序
     */
    public static final String SORT = "sort";

    /**
     * 模块类型  1-首页 2-精选  3-关注  4-品牌馆
     */
    public static final String MODULE_TYPE = "module_type";

    /**
     * 客户端显示 -1-默认所有端显示  &运算进行判断
     */
    public static final String CLIENT_VIEW = "client_view";


    @Override
    public AuctionAdvertPlaceInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

