package com.tjlou.mybatis.auto.weipai.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * ${table.comment}
 * </p>
 *
 * @author Gaby
 * @since 2019-04-08
 */
@TableName("T_BUSSINES_USER_SUGGEST")
public class TBussinesUserSuggest implements Serializable, IEntity {

    @TableField("SUGGEST_ID")
    private String suggestId;
    @TableField("PHONE")
    private String phone;
    @TableField("WECHAT")
    private String wechat;
    @TableField("CONTENT")
    private String content;
    @TableField("INTIME")
    private Date intime;
    @TableField("NICKNAME")
    private String nickname;

    public String getSuggestId() {
        return suggestId;
    }

    public TBussinesUserSuggest setSuggestId(String suggestId) {
        if (suggestId != null)
            suggestId = suggestId.trim();
        this.suggestId = suggestId;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public TBussinesUserSuggest setPhone(String phone) {
        if (phone != null)
            phone = phone.trim();
        this.phone = phone;
        return this;
    }

    public String getWechat() {
        return wechat;
    }

    public TBussinesUserSuggest setWechat(String wechat) {
        if (wechat != null)
            wechat = wechat.trim();
        this.wechat = wechat;
        return this;
    }

    public String getContent() {
        return content;
    }

    public TBussinesUserSuggest setContent(String content) {
        if (content != null)
            content = content.trim();
        this.content = content;
        return this;
    }

    public Date getIntime() {
        return intime;
    }

    public TBussinesUserSuggest setIntime(Date intime) {
        this.intime = intime;
        return this;
    }

    public String getNickname() {
        return nickname;
    }

    public TBussinesUserSuggest setNickname(String nickname) {
        if (nickname != null)
            nickname = nickname.trim();
        this.nickname = nickname;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "T_BUSSINES_USER_SUGGEST";
    public static final String SUGGEST_ID = "SUGGEST_ID";

    public static final String PHONE = "PHONE";

    public static final String WECHAT = "WECHAT";

    public static final String CONTENT = "CONTENT";

    public static final String INTIME = "INTIME";

    public static final String NICKNAME = "NICKNAME";

    @Override
    public TBussinesUserSuggest pkVal(Serializable val) {
        return this;
    }
}

