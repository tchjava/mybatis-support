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
 * 拍品信息表
 * </p>
 *
 * @author Gaby
 * @since 2020-06-04
 */
@TableName("auction_product_info")
public class AuctionProductInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 所属用户
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 标题
     */
    private String title;
    /**
     * 所属分类
     */
    @TableField("category_id")
    private Long categoryId;
    /**
     * 拍品编号
     */
    @TableField("product_code")
    private String productCode;
    /**
     * 主图
     */
    @TableField("first_pic")
    private String firstPic;
    /**
     * 起拍价
     */
    @TableField("start_price")
    private Long startPrice;
    /**
     * 加价幅度
     */
    @TableField("markup_range")
    private Long markupRange;
    /**
     * 备注
     */
    private String comment;
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
     * 状态  00A-有效  00Z-失效
     */
    private String status;
    /**
     * 版本号
     */
    private Integer version;


    public Long getId() {
        return id;
    }

    public AuctionProductInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public AuctionProductInfo setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public AuctionProductInfo setTitle(String title) {
        if (title != null)
            title = title.trim();
        this.title = title;
        return this;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public AuctionProductInfo setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public String getProductCode() {
        return productCode;
    }

    public AuctionProductInfo setProductCode(String productCode) {
        if (productCode != null)
            productCode = productCode.trim();
        this.productCode = productCode;
        return this;
    }

    public String getFirstPic() {
        return firstPic;
    }

    public AuctionProductInfo setFirstPic(String firstPic) {
        if (firstPic != null)
            firstPic = firstPic.trim();
        this.firstPic = firstPic;
        return this;
    }

    public Long getStartPrice() {
        return startPrice;
    }

    public AuctionProductInfo setStartPrice(Long startPrice) {
        this.startPrice = startPrice;
        return this;
    }

    public Long getMarkupRange() {
        return markupRange;
    }

    public AuctionProductInfo setMarkupRange(Long markupRange) {
        this.markupRange = markupRange;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public AuctionProductInfo setComment(String comment) {
        if (comment != null)
            comment = comment.trim();
        this.comment = comment;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public AuctionProductInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public AuctionProductInfo setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public AuctionProductInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    public Integer getVersion() {
        return version;
    }

    public AuctionProductInfo setVersion(Integer version) {
        this.version = version;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_product_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 所属用户
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 标题
     */
    public static final String TITLE = "title";

    /**
     * 所属分类
     */
    public static final String CATEGORY_ID = "category_id";

    /**
     * 拍品编号
     */
    public static final String PRODUCT_CODE = "product_code";

    /**
     * 主图
     */
    public static final String FIRST_PIC = "first_pic";

    /**
     * 起拍价
     */
    public static final String START_PRICE = "start_price";

    /**
     * 加价幅度
     */
    public static final String MARKUP_RANGE = "markup_range";

    /**
     * 备注
     */
    public static final String COMMENT = "comment";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 修改时间
     */
    public static final String MODIFY_TIME = "modify_time";

    /**
     * 状态  00A-有效  00Z-失效
     */
    public static final String STATUS = "status";

    /**
     * 版本号
     */
    public static final String VERSION = "version";


    @Override
    public AuctionProductInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

