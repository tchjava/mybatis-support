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
 * 商品评价表
 * </p>
 *
 * @author Gaby
 * @since 2019-07-05
 */
@TableName("goods_comment_info")
public class GoodsCommentInfo implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 商品编号
     */
    @TableField("sale_code")
    private String saleCode;
    /**
     * 用户标识
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 商品标识
     */
    @TableField("goods_id")
    private Long goodsId;
    /**
     * 用户昵称
     */
    private String nickname;
    /**
     * 评价内容
     */
    private String content;
    /**
     * 评价时间
     */
    private Date intime;
    /**
     * 状态(00A-有效,00Z-失效)
     */
    private String status;
    /**
     * 评分
     */
    private Integer score;
    /**
     * 标签  1-物超所值 2-物流给力 4-服务贴心 8-包装精美 16-捡到漏了 32-值得信赖
     */
    private Integer label;
    /**
     * 是否匿名  1-匿名  0-不匿名
     */
    private String anonymous;
    /**
     * 好中差评价  00A-好评  00B-中评 00C-差评
     */
    private String degree;

    public Long getId() {
        return id;
    }

    public GoodsCommentInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getSaleCode() {
        return saleCode;
    }

    public GoodsCommentInfo setSaleCode(String saleCode) {
        if (saleCode != null)
            saleCode = saleCode.trim();
        this.saleCode = saleCode;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public GoodsCommentInfo setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public GoodsCommentInfo setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
        return this;
    }

    public String getNickname() {
        return nickname;
    }

    public GoodsCommentInfo setNickname(String nickname) {
        if (nickname != null)
            nickname = nickname.trim();
        this.nickname = nickname;
        return this;
    }

    public String getContent() {
        return content;
    }

    public GoodsCommentInfo setContent(String content) {
        if (content != null)
            content = content.trim();
        this.content = content;
        return this;
    }

    public Date getIntime() {
        return intime;
    }

    public GoodsCommentInfo setIntime(Date intime) {
        this.intime = intime;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public GoodsCommentInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    public Integer getScore() {
        return score;
    }

    public GoodsCommentInfo setScore(Integer score) {
        this.score = score;
        return this;
    }

    public Integer getLabel() {
        return label;
    }

    public GoodsCommentInfo setLabel(Integer label) {
        this.label = label;
        return this;
    }

    public String getAnonymous() {
        return anonymous;
    }

    public GoodsCommentInfo setAnonymous(String anonymous) {
        if (anonymous != null)
            anonymous = anonymous.trim();
        this.anonymous = anonymous;
        return this;
    }

    public String getDegree() {
        return degree;
    }

    public GoodsCommentInfo setDegree(String degree) {
        if (degree != null)
            degree = degree.trim();
        this.degree = degree;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "goods_comment_info";
    public static final String ID = "id";

    /**
     * 商品编号
     */
    public static final String SALE_CODE = "sale_code";

    /**
     * 用户标识
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 商品标识
     */
    public static final String GOODS_ID = "goods_id";

    /**
     * 用户昵称
     */
    public static final String NICKNAME = "nickname";

    /**
     * 评价内容
     */
    public static final String CONTENT = "content";

    /**
     * 评价时间
     */
    public static final String INTIME = "intime";

    /**
     * 状态(00A-有效,00Z-失效)
     */
    public static final String STATUS = "status";

    /**
     * 评分
     */
    public static final String SCORE = "score";

    /**
     * 标签  1-物超所值 2-物流给力 4-服务贴心 8-包装精美 16-捡到漏了 32-值得信赖
     */
    public static final String LABEL = "label";

    /**
     * 是否匿名  1-匿名  0-不匿名
     */
    public static final String ANONYMOUS = "anonymous";

    /**
     * 好中差评价  00A-好评  00B-中评 00C-差评
     */
    public static final String DEGREE = "degree";

    @Override
    public GoodsCommentInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

