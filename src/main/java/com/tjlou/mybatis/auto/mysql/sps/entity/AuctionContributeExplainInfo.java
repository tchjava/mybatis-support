package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 贡献计划表
 * </p>
 *
 * @author Gaby
 * @since 2021-07-12
 */
@TableName("auction_contribute_explain_info")
public class AuctionContributeExplainInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 计划名称
     */
    @TableField("explain_name")
    private String explainName;
    /**
     * 开始统计时间
     */
    @TableField("start_time")
    private Date startTime;
    /**
     * 结束统计时间
     */
    @TableField("end_time")
    private Date endTime;
    /**
     * 排行榜展示数量
     */
    @TableField("rank_num")
    private Integer rankNum;
    /**
     * 股份数
     */
    @TableField("holding_value")
    private Long holdingValue;
    /**
     * 股份比例
     */
    @TableField("holding_ratio")
    private BigDecimal holdingRatio;
    /**
     * 邀请用户股份比例
     */
    @TableField("invite_user_ratio")
    private BigDecimal inviteUserRatio;
    /**
     * 邀请商家股份比例
     */
    @TableField("invite_supplier_ratio")
    private BigDecimal inviteSupplierRatio;
    /**
     * 自己购买股份比例
     */
    @TableField("self_buy_ratio")
    private BigDecimal selfBuyRatio;
    /**
     * 自己卖出股份比例
     */
    @TableField("self_sell_ratio")
    private BigDecimal selfSellRatio;
    /**
     * 是否使用 1-使用 0-未使用
     */
    private Integer status;
    /**
     * 计划背景图
     */
    @TableField("background_image")
    private String backgroundImage;
    /**
     * 是否预定  1-预定 0-未预定
     */
    private Integer fix;
    /**
     * 正在计算中  1-正在 0-计算完成
     */
    private Integer compute;


    public Long getId() {
        return id;
    }

    public AuctionContributeExplainInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getExplainName() {
        return explainName;
    }

    public AuctionContributeExplainInfo setExplainName(String explainName) {
        if (explainName != null)
            explainName = explainName.trim();
        this.explainName = explainName;
        return this;
    }

    public Date getStartTime() {
        return startTime;
    }

    public AuctionContributeExplainInfo setStartTime(Date startTime) {
        this.startTime = startTime;
        return this;
    }

    public Date getEndTime() {
        return endTime;
    }

    public AuctionContributeExplainInfo setEndTime(Date endTime) {
        this.endTime = endTime;
        return this;
    }

    public Integer getRankNum() {
        return rankNum;
    }

    public AuctionContributeExplainInfo setRankNum(Integer rankNum) {
        this.rankNum = rankNum;
        return this;
    }

    public Long getHoldingValue() {
        return holdingValue;
    }

    public AuctionContributeExplainInfo setHoldingValue(Long holdingValue) {
        this.holdingValue = holdingValue;
        return this;
    }

    public BigDecimal getHoldingRatio() {
        return holdingRatio;
    }

    public AuctionContributeExplainInfo setHoldingRatio(BigDecimal holdingRatio) {
        this.holdingRatio = holdingRatio;
        return this;
    }

    public BigDecimal getInviteUserRatio() {
        return inviteUserRatio;
    }

    public AuctionContributeExplainInfo setInviteUserRatio(BigDecimal inviteUserRatio) {
        this.inviteUserRatio = inviteUserRatio;
        return this;
    }

    public BigDecimal getInviteSupplierRatio() {
        return inviteSupplierRatio;
    }

    public AuctionContributeExplainInfo setInviteSupplierRatio(BigDecimal inviteSupplierRatio) {
        this.inviteSupplierRatio = inviteSupplierRatio;
        return this;
    }

    public BigDecimal getSelfBuyRatio() {
        return selfBuyRatio;
    }

    public AuctionContributeExplainInfo setSelfBuyRatio(BigDecimal selfBuyRatio) {
        this.selfBuyRatio = selfBuyRatio;
        return this;
    }

    public BigDecimal getSelfSellRatio() {
        return selfSellRatio;
    }

    public AuctionContributeExplainInfo setSelfSellRatio(BigDecimal selfSellRatio) {
        this.selfSellRatio = selfSellRatio;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public AuctionContributeExplainInfo setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public String getBackgroundImage() {
        return backgroundImage;
    }

    public AuctionContributeExplainInfo setBackgroundImage(String backgroundImage) {
        if (backgroundImage != null)
            backgroundImage = backgroundImage.trim();
        this.backgroundImage = backgroundImage;
        return this;
    }

    public Integer getFix() {
        return fix;
    }

    public AuctionContributeExplainInfo setFix(Integer fix) {
        this.fix = fix;
        return this;
    }

    public Integer getCompute() {
        return compute;
    }

    public AuctionContributeExplainInfo setCompute(Integer compute) {
        this.compute = compute;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_contribute_explain_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 计划名称
     */
    public static final String EXPLAIN_NAME = "explain_name";

    /**
     * 开始统计时间
     */
    public static final String START_TIME = "start_time";

    /**
     * 结束统计时间
     */
    public static final String END_TIME = "end_time";

    /**
     * 排行榜展示数量
     */
    public static final String RANK_NUM = "rank_num";

    /**
     * 股份数
     */
    public static final String HOLDING_VALUE = "holding_value";

    /**
     * 股份比例
     */
    public static final String HOLDING_RATIO = "holding_ratio";

    /**
     * 邀请用户股份比例
     */
    public static final String INVITE_USER_RATIO = "invite_user_ratio";

    /**
     * 邀请商家股份比例
     */
    public static final String INVITE_SUPPLIER_RATIO = "invite_supplier_ratio";

    /**
     * 自己购买股份比例
     */
    public static final String SELF_BUY_RATIO = "self_buy_ratio";

    /**
     * 自己卖出股份比例
     */
    public static final String SELF_SELL_RATIO = "self_sell_ratio";

    /**
     * 是否使用 1-使用 0-未使用
     */
    public static final String STATUS = "status";

    /**
     * 计划背景图
     */
    public static final String BACKGROUND_IMAGE = "background_image";

    /**
     * 是否预定  1-预定 0-未预定
     */
    public static final String FIX = "fix";

    /**
     * 正在计算中  1-正在 0-计算完成
     */
    public static final String COMPUTE = "compute";


    @Override
    public AuctionContributeExplainInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

