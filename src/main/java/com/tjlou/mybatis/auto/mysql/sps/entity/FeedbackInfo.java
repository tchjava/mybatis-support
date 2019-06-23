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
 * 意见反馈表
 * </p>
 *
 * @author Gaby
 * @since 2019-06-23
 */
@TableName("feedback_info")
public class FeedbackInfo implements Serializable, IEntity {

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
    private Date intime;

    public Long getId() {
        return id;
    }

    public FeedbackInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public FeedbackInfo setType(Integer type) {
        this.type = type;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public FeedbackInfo setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public String getContent() {
        return content;
    }

    public FeedbackInfo setContent(String content) {
        if (content != null)
            content = content.trim();
        this.content = content;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public FeedbackInfo setPhone(String phone) {
        if (phone != null)
            phone = phone.trim();
        this.phone = phone;
        return this;
    }

    public Date getIntime() {
        return intime;
    }

    public FeedbackInfo setIntime(Date intime) {
        this.intime = intime;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "feedback_info";
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
    public static final String INTIME = "intime";

    @Override
    public FeedbackInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

