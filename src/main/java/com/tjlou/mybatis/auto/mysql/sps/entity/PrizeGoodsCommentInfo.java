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
 * 抽奖评价表
 * </p>
 *
 * @author Gaby
 * @since 2019-09-09
 */
@TableName("prize_goods_comment_info")
public class PrizeGoodsCommentInfo implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    @TableField("sale_code")
    private String saleCode;
    @TableField("user_account_id")
    private Long userAccountId;
    @TableField("goods_id")
    private Long goodsId;
    @TableField("log_id")
    private Long logId;
    @TableField("order_id")
    private Long orderId;
    private String nickname;
    private String content;
    @TableField("create_time")
    private Date createTime;
    private String status;
    private Integer score;
    private Integer label;
    private String anonymous;
    private String degree;

    public Long getId() {
        return id;
    }

    public PrizeGoodsCommentInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getSaleCode() {
        return saleCode;
    }

    public PrizeGoodsCommentInfo setSaleCode(String saleCode) {
        if (saleCode != null)
            saleCode = saleCode.trim();
        this.saleCode = saleCode;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public PrizeGoodsCommentInfo setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public PrizeGoodsCommentInfo setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
        return this;
    }

    public Long getLogId() {
        return logId;
    }

    public PrizeGoodsCommentInfo setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    public Long getOrderId() {
        return orderId;
    }

    public PrizeGoodsCommentInfo setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }

    public String getNickname() {
        return nickname;
    }

    public PrizeGoodsCommentInfo setNickname(String nickname) {
        if (nickname != null)
            nickname = nickname.trim();
        this.nickname = nickname;
        return this;
    }

    public String getContent() {
        return content;
    }

    public PrizeGoodsCommentInfo setContent(String content) {
        if (content != null)
            content = content.trim();
        this.content = content;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public PrizeGoodsCommentInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public PrizeGoodsCommentInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    public Integer getScore() {
        return score;
    }

    public PrizeGoodsCommentInfo setScore(Integer score) {
        this.score = score;
        return this;
    }

    public Integer getLabel() {
        return label;
    }

    public PrizeGoodsCommentInfo setLabel(Integer label) {
        this.label = label;
        return this;
    }

    public String getAnonymous() {
        return anonymous;
    }

    public PrizeGoodsCommentInfo setAnonymous(String anonymous) {
        if (anonymous != null)
            anonymous = anonymous.trim();
        this.anonymous = anonymous;
        return this;
    }

    public String getDegree() {
        return degree;
    }

    public PrizeGoodsCommentInfo setDegree(String degree) {
        if (degree != null)
            degree = degree.trim();
        this.degree = degree;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "prize_goods_comment_info";
    public static final String ID = "id";

    public static final String SALE_CODE = "sale_code";

    public static final String USER_ACCOUNT_ID = "user_account_id";

    public static final String GOODS_ID = "goods_id";

    public static final String LOG_ID = "log_id";

    public static final String ORDER_ID = "order_id";

    public static final String NICKNAME = "nickname";

    public static final String CONTENT = "content";

    public static final String CREATE_TIME = "create_time";

    public static final String STATUS = "status";

    public static final String SCORE = "score";

    public static final String LABEL = "label";

    public static final String ANONYMOUS = "anonymous";

    public static final String DEGREE = "degree";

    @Override
    public PrizeGoodsCommentInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}
