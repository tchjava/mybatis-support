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
 * 拍品评价表
 * </p>
 *
 * @author Gaby
 * @since 2020-06-26
 */
@TableName("instance_comment_info")
public class InstanceCommentInfo implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 订单标识
     */
    @TableField("order_id")
    private Long orderId;
    /**
     * 用户标识
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 实例标识
     */
    @TableField("instance_id")
    private Long instanceId;
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
    /**
     * 图片
     */
    private String images;

    public Long getId() {
        return id;
    }

    public InstanceCommentInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getOrderId() {
        return orderId;
    }

    public InstanceCommentInfo setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public InstanceCommentInfo setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Long getInstanceId() {
        return instanceId;
    }

    public InstanceCommentInfo setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getNickname() {
        return nickname;
    }

    public InstanceCommentInfo setNickname(String nickname) {
        if (nickname != null)
            nickname = nickname.trim();
        this.nickname = nickname;
        return this;
    }

    public String getContent() {
        return content;
    }

    public InstanceCommentInfo setContent(String content) {
        if (content != null)
            content = content.trim();
        this.content = content;
        return this;
    }

    public Date getIntime() {
        return intime;
    }

    public InstanceCommentInfo setIntime(Date intime) {
        this.intime = intime;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public InstanceCommentInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    public Integer getScore() {
        return score;
    }

    public InstanceCommentInfo setScore(Integer score) {
        this.score = score;
        return this;
    }

    public Integer getLabel() {
        return label;
    }

    public InstanceCommentInfo setLabel(Integer label) {
        this.label = label;
        return this;
    }

    public String getAnonymous() {
        return anonymous;
    }

    public InstanceCommentInfo setAnonymous(String anonymous) {
        if (anonymous != null)
            anonymous = anonymous.trim();
        this.anonymous = anonymous;
        return this;
    }

    public String getDegree() {
        return degree;
    }

    public InstanceCommentInfo setDegree(String degree) {
        if (degree != null)
            degree = degree.trim();
        this.degree = degree;
        return this;
    }

    public String getImages() {
        return images;
    }

    public InstanceCommentInfo setImages(String images) {
        if (images != null)
            images = images.trim();
        this.images = images;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "instance_comment_info";
    public static final String ID = "id";

    /**
     * 订单标识
     */
    public static final String ORDER_ID = "order_id";

    /**
     * 用户标识
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 实例标识
     */
    public static final String INSTANCE_ID = "instance_id";

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

    /**
     * 图片
     */
    public static final String IMAGES = "images";

    @Override
    public InstanceCommentInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

