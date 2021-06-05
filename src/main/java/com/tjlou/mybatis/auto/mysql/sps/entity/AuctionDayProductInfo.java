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
 * 天天竞拍产品表
 * </p>
 *
 * @author Gaby
 * @since 2021-01-13
 */
@TableName("auction_day_product_info")
public class AuctionDayProductInfo implements Serializable, IEntity {


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
     * 主图
     */
    @TableField("first_pic")
    private String firstPic;
    /**
     * 起拍价(单位:分)
     */
    @TableField("start_price")
    private Long startPrice;
    /**
     * 封顶价(单位:分)
     */
    @TableField("top_price")
    private Long topPrice;
    /**
     * 市场价(单位:分)
     */
    @TableField("market_price")
    private Long marketPrice;
    /**
     * 加价幅度(单位:分)
     */
    @TableField("markup_range")
    private Long markupRange;
    /**
     * 状态 1-审核中  2-已上架  4-未通过审核  8-已结束
     */
    private Integer status;
    /**
     * 备注
     */
    private String comment;
    /**
     * 1-包邮  2-到付
     */
    @TableField("distribute_type")
    private Integer distributeType;
    /**
     * 倒计时(单位:秒)
     */
    private Long countdown;
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
     * 拒绝理由
     */
    @TableField("reject_reason")
    private String rejectReason;

    @TableField("auto_check")
    private Integer autoCheck;


    public Long getId() {
        return id;
    }

    public AuctionDayProductInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public AuctionDayProductInfo setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public AuctionDayProductInfo setTitle(String title) {
        if (title != null)
            title = title.trim();
        this.title = title;
        return this;
    }

    public String getFirstPic() {
        return firstPic;
    }

    public AuctionDayProductInfo setFirstPic(String firstPic) {
        if (firstPic != null)
            firstPic = firstPic.trim();
        this.firstPic = firstPic;
        return this;
    }

    public Long getStartPrice() {
        return startPrice;
    }

    public AuctionDayProductInfo setStartPrice(Long startPrice) {
        this.startPrice = startPrice;
        return this;
    }

    public Long getTopPrice() {
        return topPrice;
    }

    public AuctionDayProductInfo setTopPrice(Long topPrice) {
        this.topPrice = topPrice;
        return this;
    }

    public Long getMarketPrice() {
        return marketPrice;
    }

    public AuctionDayProductInfo setMarketPrice(Long marketPrice) {
        this.marketPrice = marketPrice;
        return this;
    }

    public Long getMarkupRange() {
        return markupRange;
    }

    public AuctionDayProductInfo setMarkupRange(Long markupRange) {
        this.markupRange = markupRange;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public AuctionDayProductInfo setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public AuctionDayProductInfo setComment(String comment) {
        if (comment != null)
            comment = comment.trim();
        this.comment = comment;
        return this;
    }

    public Integer getDistributeType() {
        return distributeType;
    }

    public AuctionDayProductInfo setDistributeType(Integer distributeType) {
        this.distributeType = distributeType;
        return this;
    }

    public Long getCountdown() {
        return countdown;
    }

    public AuctionDayProductInfo setCountdown(Long countdown) {
        this.countdown = countdown;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public AuctionDayProductInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public AuctionDayProductInfo setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }

    public String getRejectReason() {
        return rejectReason;
    }

    public AuctionDayProductInfo setRejectReason(String rejectReason) {
        if (rejectReason != null)
            rejectReason = rejectReason.trim();
        this.rejectReason = rejectReason;
        return this;
    }

    public Integer getAutoCheck() {
        return autoCheck;
    }

    public void setAutoCheck(Integer autoCheck) {
        this.autoCheck = autoCheck;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_day_product_info";
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
     * 主图
     */
    public static final String FIRST_PIC = "first_pic";

    /**
     * 起拍价(单位:分)
     */
    public static final String START_PRICE = "start_price";

    /**
     * 封顶价(单位:分)
     */
    public static final String TOP_PRICE = "top_price";

    /**
     * 市场价(单位:分)
     */
    public static final String MARKET_PRICE = "market_price";

    /**
     * 加价幅度(单位:分)
     */
    public static final String MARKUP_RANGE = "markup_range";

    /**
     * 状态 1-审核中  2-已上架  4-未通过审核  8-已结束
     */
    public static final String STATUS = "status";

    /**
     * 备注
     */
    public static final String COMMENT = "comment";

    /**
     * 1-包邮  2-到付
     */
    public static final String DISTRIBUTE_TYPE = "distribute_type";

    /**
     * 倒计时(单位:秒)
     */
    public static final String COUNTDOWN = "countdown";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 修改时间
     */
    public static final String MODIFY_TIME = "modify_time";

    /**
     * 拒绝理由
     */
    public static final String REJECT_REASON = "reject_reason";
    public static final String AUTO_CHECK = "auto_check";


    @Override
    public AuctionDayProductInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

