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
 * 锤定意见反馈表
 * </p>
 *
 * @author Gaby
 * @since 2020-09-04
 */
@TableName("auction_feedback_info")
public class AuctionFeedbackInfo implements Serializable, IEntity {


    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 1-功能BUG 2-界面调整 3-新功能开发 4-意见 5-其他
     */
    private Integer type;
    /**
     * 用户标识
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 聊天内容
     */
    private String content;
    /**
     * 联系电话
     */
    private String phone;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;


    public Long getId() {
        return id;
    }

    public AuctionFeedbackInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public AuctionFeedbackInfo setType(Integer type) {
        this.type = type;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public AuctionFeedbackInfo setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public String getContent() {
        return content;
    }

    public AuctionFeedbackInfo setContent(String content) {
        if (content != null)
            content = content.trim();
        this.content = content;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public AuctionFeedbackInfo setPhone(String phone) {
        if (phone != null)
            phone = phone.trim();
        this.phone = phone;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public AuctionFeedbackInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_feedback_info";
    public static final String ID = "id";

    /**
     * 1-功能BUG 2-界面调整 3-新功能开发 4-意见 5-其他
     */
    public static final String TYPE = "type";

    /**
     * 用户标识
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 聊天内容
     */
    public static final String CONTENT = "content";

    /**
     * 联系电话
     */
    public static final String PHONE = "phone";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";


    @Override
    public AuctionFeedbackInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

