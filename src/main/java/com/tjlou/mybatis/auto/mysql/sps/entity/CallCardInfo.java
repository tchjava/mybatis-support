package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 名片信息表
 * </p>
 *
 * @author Gaby
 * @since 2020-02-14
 */
@TableName("call_card_info")
public class CallCardInfo implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 所属用户
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 头像
     */
    @TableField("head_img")
    private String headImg;
    /**
     * 用户昵称
     */
    private String nickname;
    /**
     * 公司昵称
     */
    @TableField("cpy_nick")
    private String cpyNick;
    /**
     * 工作
     */
    private String job;
    /**
     * 手机号
     */
    private String phone;
    /**
     * QQ号
     */
    private String qq;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 地址
     */
    private String address;
    /**
     * 网址
     */
    private String url;
    /**
     * 公司简介
     */
    @TableField("cpy_summary")
    private String cpySummary;
    /**
     * 微信号
     */
    @TableField("we_chat")
    private String weChat;

    public Long getId() {
        return id;
    }

    public CallCardInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public CallCardInfo setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public String getHeadImg() {
        return headImg;
    }

    public CallCardInfo setHeadImg(String headImg) {
        if (headImg != null)
            headImg = headImg.trim();
        this.headImg = headImg;
        return this;
    }

    public String getNickname() {
        return nickname;
    }

    public CallCardInfo setNickname(String nickname) {
        if (nickname != null)
            nickname = nickname.trim();
        this.nickname = nickname;
        return this;
    }

    public String getCpyNick() {
        return cpyNick;
    }

    public CallCardInfo setCpyNick(String cpyNick) {
        if (cpyNick != null)
            cpyNick = cpyNick.trim();
        this.cpyNick = cpyNick;
        return this;
    }

    public String getJob() {
        return job;
    }

    public CallCardInfo setJob(String job) {
        if (job != null)
            job = job.trim();
        this.job = job;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public CallCardInfo setPhone(String phone) {
        if (phone != null)
            phone = phone.trim();
        this.phone = phone;
        return this;
    }

    public String getQq() {
        return qq;
    }

    public CallCardInfo setQq(String qq) {
        if (qq != null)
            qq = qq.trim();
        this.qq = qq;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public CallCardInfo setEmail(String email) {
        if (email != null)
            email = email.trim();
        this.email = email;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public CallCardInfo setAddress(String address) {
        if (address != null)
            address = address.trim();
        this.address = address;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public CallCardInfo setUrl(String url) {
        if (url != null)
            url = url.trim();
        this.url = url;
        return this;
    }

    public String getCpySummary() {
        return cpySummary;
    }

    public CallCardInfo setCpySummary(String cpySummary) {
        if (cpySummary != null)
            cpySummary = cpySummary.trim();
        this.cpySummary = cpySummary;
        return this;
    }

    public String getWeChat() {
        return weChat;
    }

    public CallCardInfo setWeChat(String weChat) {
        if (weChat != null)
            weChat = weChat.trim();
        this.weChat = weChat;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "call_card_info";
    public static final String ID = "id";

    /**
     * 所属用户
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 头像
     */
    public static final String HEAD_IMG = "head_img";

    /**
     * 用户昵称
     */
    public static final String NICKNAME = "nickname";

    /**
     * 公司昵称
     */
    public static final String CPY_NICK = "cpy_nick";

    /**
     * 工作
     */
    public static final String JOB = "job";

    /**
     * 手机号
     */
    public static final String PHONE = "phone";

    /**
     * QQ号
     */
    public static final String QQ = "qq";

    /**
     * 邮箱
     */
    public static final String EMAIL = "email";

    /**
     * 地址
     */
    public static final String ADDRESS = "address";

    /**
     * 网址
     */
    public static final String URL = "url";

    /**
     * 公司简介
     */
    public static final String CPY_SUMMARY = "cpy_summary";

    /**
     * 微信号
     */
    public static final String WE_CHAT = "we_chat";

    @Override
    public CallCardInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

