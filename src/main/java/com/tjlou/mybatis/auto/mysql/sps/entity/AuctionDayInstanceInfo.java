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
 * 天天竞拍拍品实例表
 * </p>
 *
 * @author Gaby
 * @since 2021-01-15
 */
@TableName("auction_day_instance_info")
public class AuctionDayInstanceInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 实例编码 特殊处理 天天竞拍A 开头
     */
    @TableField("instance_code")
    private String instanceCode;
    /**
     * 所属用户
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 所属竞拍拍品
     */
    @TableField("product_id")
    private Long productId;
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
     * 起拍价
     */
    @TableField("start_price")
    private Long startPrice;
    /**
     * 领先价
     */
    @TableField("current_price")
    private Long currentPrice;
    /**
     * 封顶价
     */
    @TableField("top_price")
    private Long topPrice;
    /**
     * 市场价
     */
    @TableField("market_price")
    private Long marketPrice;
    /**
     * 加价幅度
     */
    @TableField("markup_range")
    private Long markupRange;
    /**
     * 状态 1-竞拍中  2-在线付款 4-当面交易 8-未付款  16-流拍 32-未及时付款 64-已下架 128-退款
     */
    private Integer status;
    /**
     * 打折文本
     */
    @TableField("discount_text")
    private String discountText;
    /**
     * 出价次数
     */
    @TableField("bid_num")
    private Integer bidNum;
    /**
     * 备注
     */
    private String comment;
    /**
     * 配送方式 1-包邮
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
     * 结束时间
     */
    @TableField("end_time")
    private Date endTime;

    @TableField("start_time")
    private Date startTime;

    @TableField("end_small_account")
    private Integer endSmallAccount;

    @TableField("small_bid_second_start")
    private Integer smallBidSecondStart;

    @TableField("small_bid_second_end")
    private Integer smallBidSecondEnd;


    public Long getId() {
        return id;
    }

    public AuctionDayInstanceInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getInstanceCode() {
        return instanceCode;
    }

    public AuctionDayInstanceInfo setInstanceCode(String instanceCode) {
        if (instanceCode != null)
            instanceCode = instanceCode.trim();
        this.instanceCode = instanceCode;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public AuctionDayInstanceInfo setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Long getProductId() {
        return productId;
    }

    public AuctionDayInstanceInfo setProductId(Long productId) {
        this.productId = productId;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public AuctionDayInstanceInfo setTitle(String title) {
        if (title != null)
            title = title.trim();
        this.title = title;
        return this;
    }

    public String getFirstPic() {
        return firstPic;
    }

    public AuctionDayInstanceInfo setFirstPic(String firstPic) {
        if (firstPic != null)
            firstPic = firstPic.trim();
        this.firstPic = firstPic;
        return this;
    }

    public Long getStartPrice() {
        return startPrice;
    }

    public AuctionDayInstanceInfo setStartPrice(Long startPrice) {
        this.startPrice = startPrice;
        return this;
    }

    public Long getCurrentPrice() {
        return currentPrice;
    }

    public AuctionDayInstanceInfo setCurrentPrice(Long currentPrice) {
        this.currentPrice = currentPrice;
        return this;
    }

    public Long getTopPrice() {
        return topPrice;
    }

    public AuctionDayInstanceInfo setTopPrice(Long topPrice) {
        this.topPrice = topPrice;
        return this;
    }

    public Long getMarketPrice() {
        return marketPrice;
    }

    public AuctionDayInstanceInfo setMarketPrice(Long marketPrice) {
        this.marketPrice = marketPrice;
        return this;
    }

    public Long getMarkupRange() {
        return markupRange;
    }

    public AuctionDayInstanceInfo setMarkupRange(Long markupRange) {
        this.markupRange = markupRange;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public AuctionDayInstanceInfo setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public String getDiscountText() {
        return discountText;
    }

    public AuctionDayInstanceInfo setDiscountText(String discountText) {
        if (discountText != null)
            discountText = discountText.trim();
        this.discountText = discountText;
        return this;
    }

    public Integer getBidNum() {
        return bidNum;
    }

    public AuctionDayInstanceInfo setBidNum(Integer bidNum) {
        this.bidNum = bidNum;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public AuctionDayInstanceInfo setComment(String comment) {
        if (comment != null)
            comment = comment.trim();
        this.comment = comment;
        return this;
    }

    public Integer getDistributeType() {
        return distributeType;
    }

    public AuctionDayInstanceInfo setDistributeType(Integer distributeType) {
        this.distributeType = distributeType;
        return this;
    }

    public Long getCountdown() {
        return countdown;
    }

    public AuctionDayInstanceInfo setCountdown(Long countdown) {
        this.countdown = countdown;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public AuctionDayInstanceInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public AuctionDayInstanceInfo setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }

    public Date getEndTime() {
        return endTime;
    }

    public AuctionDayInstanceInfo setEndTime(Date endTime) {
        this.endTime = endTime;
        return this;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Integer getEndSmallAccount() {
        return endSmallAccount;
    }

    public void setEndSmallAccount(Integer endSmallAccount) {
        this.endSmallAccount = endSmallAccount;
    }

    public Integer getSmallBidSecondStart() {
        return smallBidSecondStart;
    }

    public void setSmallBidSecondStart(Integer smallBidSecondStart) {
        this.smallBidSecondStart = smallBidSecondStart;
    }

    public Integer getSmallBidSecondEnd() {
        return smallBidSecondEnd;
    }

    public void setSmallBidSecondEnd(Integer smallBidSecondEnd) {
        this.smallBidSecondEnd = smallBidSecondEnd;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_day_instance_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 实例编码 特殊处理 天天竞拍A 开头
     */
    public static final String INSTANCE_CODE = "instance_code";

    /**
     * 所属用户
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 所属竞拍拍品
     */
    public static final String PRODUCT_ID = "product_id";

    /**
     * 标题
     */
    public static final String TITLE = "title";

    /**
     * 主图
     */
    public static final String FIRST_PIC = "first_pic";

    /**
     * 起拍价
     */
    public static final String START_PRICE = "start_price";

    /**
     * 领先价
     */
    public static final String CURRENT_PRICE = "current_price";

    /**
     * 封顶价
     */
    public static final String TOP_PRICE = "top_price";

    /**
     * 市场价
     */
    public static final String MARKET_PRICE = "market_price";

    /**
     * 加价幅度
     */
    public static final String MARKUP_RANGE = "markup_range";

    /**
     * 状态 1-竞拍中  2-在线付款 4-当面交易 8-未付款  16-流拍 32-未及时付款 64-已下架 128-退款
     */
    public static final String STATUS = "status";

    /**
     * 打折文本
     */
    public static final String DISCOUNT_TEXT = "discount_text";

    /**
     * 出价次数
     */
    public static final String BID_NUM = "bid_num";

    /**
     * 备注
     */
    public static final String COMMENT = "comment";

    /**
     * 配送方式 1-包邮
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
    public static final String END_SMALL_ACCOUNT = "end_small_account";
    public static final String SMALL_BID_SECOND_START = "small_bid_second_start";
    public static final String SMALL_BID_SECOND_END = "small_bid_second_end";



    /**
     * 结束时间
     */
    public static final String END_TIME = "end_time";
    public static final String START_TIME = "start_time";


    @Override
    public AuctionDayInstanceInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

