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
 * 拍品实例表
 * </p>
 *
 * @author Gaby
 * @since 2020-06-07
 */
@TableName("auction_product_instance")
public class AuctionProductInstance implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 拍品实例编号
     */
    @TableField("instance_code")
    private String instanceCode;
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
     * 主图
     */
    @TableField("first_pic")
    private String firstPic;
    /**
     * 起拍价(单价:分)
     */
    @TableField("start_price")
    private Long startPrice;
    /**
     * 加价幅度(单位:分)
     */
    @TableField("markup_range")
    private Long markupRange;
    /**
     * 当前价格
     */
    @TableField("current_price")
    private Long currentPrice;
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
     * 截拍时间
     */
    @TableField("intercept_time")
    private Date interceptTime;
    /**
     * 中拍时间
     */
    @TableField("success_time")
    private Date successTime;
    /**
     * 流拍时间
     */
    @TableField("lose_time")
    private Date loseTime;
    /**
     * 状态  1-竞拍中  2-在线付款 4-当面交易 8-未付款  16-流拍 32-未及时付款 64-已下架 128-退款
     */
    private Integer status;
    /**
     * 类型   1-自行发布 2-产品库
     */
    @TableField("source_type")
    private Integer sourceType;
    /**
     * 产品标识
     */
    @TableField("product_id")
    private Long productId;
    /**
     * 出价次数
     */
    @TableField("bid_num")
    private Integer bidNum;
    /**
     * 延迟时间 单位(秒)
     */
    @TableField("delay_time")
    private Integer delayTime;
    /**
     * 截拍时间节点
     */
    @TableField("intercept_time_node")
    private Integer interceptTimeNode;
    /**
     * 截拍节点天数
     */
    @TableField("intercept_time_day")
    private Integer interceptTimeDay;
    /**
     * 商品标识(选择产品库时存在该值)
     */
    @TableField("goods_id")
    private Long goodsId;
    /**
     * 商品销售价
     */
    @TableField("goods_price")
    private Long goodsPrice;
    /**
     * 商品供货价
     */
    @TableField("goods_agent_price")
    private Long goodsAgentPrice;


    public Long getId() {
        return id;
    }

    public AuctionProductInstance setId(Long id) {
        this.id = id;
        return this;
    }

    public String getInstanceCode() {
        return instanceCode;
    }

    public AuctionProductInstance setInstanceCode(String instanceCode) {
        if (instanceCode != null)
            instanceCode = instanceCode.trim();
        this.instanceCode = instanceCode;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public AuctionProductInstance setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public AuctionProductInstance setTitle(String title) {
        if (title != null)
            title = title.trim();
        this.title = title;
        return this;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public AuctionProductInstance setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public String getFirstPic() {
        return firstPic;
    }

    public AuctionProductInstance setFirstPic(String firstPic) {
        if (firstPic != null)
            firstPic = firstPic.trim();
        this.firstPic = firstPic;
        return this;
    }

    public Long getStartPrice() {
        return startPrice;
    }

    public AuctionProductInstance setStartPrice(Long startPrice) {
        this.startPrice = startPrice;
        return this;
    }

    public Long getMarkupRange() {
        return markupRange;
    }

    public AuctionProductInstance setMarkupRange(Long markupRange) {
        this.markupRange = markupRange;
        return this;
    }

    public Long getCurrentPrice() {
        return currentPrice;
    }

    public AuctionProductInstance setCurrentPrice(Long currentPrice) {
        this.currentPrice = currentPrice;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public AuctionProductInstance setComment(String comment) {
        if (comment != null)
            comment = comment.trim();
        this.comment = comment;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public AuctionProductInstance setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public AuctionProductInstance setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }

    public Date getInterceptTime() {
        return interceptTime;
    }

    public AuctionProductInstance setInterceptTime(Date interceptTime) {
        this.interceptTime = interceptTime;
        return this;
    }

    public Date getSuccessTime() {
        return successTime;
    }

    public AuctionProductInstance setSuccessTime(Date successTime) {
        this.successTime = successTime;
        return this;
    }

    public Date getLoseTime() {
        return loseTime;
    }

    public AuctionProductInstance setLoseTime(Date loseTime) {
        this.loseTime = loseTime;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public AuctionProductInstance setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public Integer getSourceType() {
        return sourceType;
    }

    public AuctionProductInstance setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    public Long getProductId() {
        return productId;
    }

    public AuctionProductInstance setProductId(Long productId) {
        this.productId = productId;
        return this;
    }

    public Integer getBidNum() {
        return bidNum;
    }

    public AuctionProductInstance setBidNum(Integer bidNum) {
        this.bidNum = bidNum;
        return this;
    }

    public Integer getDelayTime() {
        return delayTime;
    }

    public AuctionProductInstance setDelayTime(Integer delayTime) {
        this.delayTime = delayTime;
        return this;
    }

    public Integer getInterceptTimeNode() {
        return interceptTimeNode;
    }

    public AuctionProductInstance setInterceptTimeNode(Integer interceptTimeNode) {
        this.interceptTimeNode = interceptTimeNode;
        return this;
    }

    public Integer getInterceptTimeDay() {
        return interceptTimeDay;
    }

    public AuctionProductInstance setInterceptTimeDay(Integer interceptTimeDay) {
        this.interceptTimeDay = interceptTimeDay;
        return this;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public AuctionProductInstance setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
        return this;
    }

    public Long getGoodsPrice() {
        return goodsPrice;
    }

    public AuctionProductInstance setGoodsPrice(Long goodsPrice) {
        this.goodsPrice = goodsPrice;
        return this;
    }

    public Long getGoodsAgentPrice() {
        return goodsAgentPrice;
    }

    public AuctionProductInstance setGoodsAgentPrice(Long goodsAgentPrice) {
        this.goodsAgentPrice = goodsAgentPrice;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_product_instance";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 拍品实例编号
     */
    public static final String INSTANCE_CODE = "instance_code";

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
     * 主图
     */
    public static final String FIRST_PIC = "first_pic";

    /**
     * 起拍价(单价:分)
     */
    public static final String START_PRICE = "start_price";

    /**
     * 加价幅度(单位:分)
     */
    public static final String MARKUP_RANGE = "markup_range";

    /**
     * 当前价格
     */
    public static final String CURRENT_PRICE = "current_price";

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
     * 截拍时间
     */
    public static final String INTERCEPT_TIME = "intercept_time";

    /**
     * 中拍时间
     */
    public static final String SUCCESS_TIME = "success_time";

    /**
     * 流拍时间
     */
    public static final String LOSE_TIME = "lose_time";

    /**
     * 状态  1-竞拍中  2-在线付款 4-当面交易 8-未付款  16-流拍 32-未及时付款 64-已下架 128-退款
     */
    public static final String STATUS = "status";

    /**
     * 类型   1-自行发布 2-产品库
     */
    public static final String SOURCE_TYPE = "source_type";

    /**
     * 产品标识
     */
    public static final String PRODUCT_ID = "product_id";

    /**
     * 出价次数
     */
    public static final String BID_NUM = "bid_num";

    /**
     * 延迟时间 单位(秒)
     */
    public static final String DELAY_TIME = "delay_time";

    /**
     * 截拍时间节点
     */
    public static final String INTERCEPT_TIME_NODE = "intercept_time_node";

    /**
     * 截拍节点天数
     */
    public static final String INTERCEPT_TIME_DAY = "intercept_time_day";

    /**
     * 商品标识(选择产品库时存在该值)
     */
    public static final String GOODS_ID = "goods_id";

    /**
     * 商品销售价
     */
    public static final String GOODS_PRICE = "goods_price";

    /**
     * 商品供货价
     */
    public static final String GOODS_AGENT_PRICE = "goods_agent_price";


    @Override
    public AuctionProductInstance pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

