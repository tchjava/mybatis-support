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
 * 消息通知信息表
 * </p>
 *
 * @author Gaby
 * @since 2020-03-23
 */
@TableName("message_notice_info")
public class MessageNoticeInfo implements Serializable, IEntity {

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 标题
     */
    private String title;
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
     * 内容
     */
    private String content;
    /**
     * 图片
     */
    private String pic;
    /**
     * 跳转地址
     */
    @TableField("skip_url")
    private String skipUrl;
    /**
     * 通知用户
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 第三方通知token
     */
    @TableField("message_token")
    private String messageToken;

    public Long getId() {
        return id;
    }

    public MessageNoticeInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public MessageNoticeInfo setTitle(String title) {
        if (title != null)
            title = title.trim();
        this.title = title;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public MessageNoticeInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public MessageNoticeInfo setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }

    public String getContent() {
        return content;
    }

    public MessageNoticeInfo setContent(String content) {
        if (content != null)
            content = content.trim();
        this.content = content;
        return this;
    }

    public String getPic() {
        return pic;
    }

    public MessageNoticeInfo setPic(String pic) {
        if (pic != null)
            pic = pic.trim();
        this.pic = pic;
        return this;
    }

    public String getSkipUrl() {
        return skipUrl;
    }

    public MessageNoticeInfo setSkipUrl(String skipUrl) {
        if (skipUrl != null)
            skipUrl = skipUrl.trim();
        this.skipUrl = skipUrl;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public MessageNoticeInfo setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public String getMessageToken() {
        return messageToken;
    }

    public MessageNoticeInfo setMessageToken(String messageToken) {
        if (messageToken != null)
            messageToken = messageToken.trim();
        this.messageToken = messageToken;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "message_notice_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 标题
     */
    public static final String TITLE = "title";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 修改时间
     */
    public static final String MODIFY_TIME = "modify_time";

    /**
     * 内容
     */
    public static final String CONTENT = "content";

    /**
     * 图片
     */
    public static final String PIC = "pic";

    /**
     * 跳转地址
     */
    public static final String SKIP_URL = "skip_url";

    /**
     * 通知用户
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 第三方通知token
     */
    public static final String MESSAGE_TOKEN = "message_token";

    @Override
    public MessageNoticeInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

