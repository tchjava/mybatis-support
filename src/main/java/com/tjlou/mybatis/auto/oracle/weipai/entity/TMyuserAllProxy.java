package com.tjlou.mybatis.auto.oracle.weipai.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * ${table.comment}
 * </p>
 *
 * @author Gaby
 * @since 2019-04-15
 */
@TableName("T_MYUSER_ALL_PROXY")
public class TMyuserAllProxy implements Serializable, IEntity {
    @TableField("USERID")
    private String userid;
    @TableField("OPENID")
    private String openid;
    /**
     * 小号昵称
     */
    @TableField("NICKNAME")
    private String nickname;
    /**
     * 头像
     */
    @TableField("HEADIMGURL")
    private String headimgurl;
    @TableField("SID")
    private String sid;
    /**
     * 小号cookie
     */
    @TableField("USER_COOKIE")
    private String userCookie;
    @TableField("LOGINTIME")
    private Date logintime;
    /**
     * 手机号码
     */
    @TableField("PHONE")
    private String phone;
    @TableField("ZXBZ")
    private String zxbz;
    @TableField("URI")
    private String uri;
    /**
     * 违约率
     */
    @TableField("WYL")
    private String wyl;
    /**
     * 退货率
     */
    @TableField("THL")
    private String thl;
    /**
     * 积分
     */
    @TableField("JF")
    private String jf;
    /**
     * 等级
     */
    @TableField("DJ")
    private String dj;
    @TableField("CJCS")
    private String cjcs;
    @TableField("SSR")
    private String ssr;
    @TableField("PROXYUSERID")
    private Long proxyuserid;

    public String getUserid() {
        return userid;
    }

    public TMyuserAllProxy setUserid(String userid) {
        if (userid != null)
            userid = userid.trim();
        this.userid = userid;
        return this;
    }

    public String getOpenid() {
        return openid;
    }

    public TMyuserAllProxy setOpenid(String openid) {
        if (openid != null)
            openid = openid.trim();
        this.openid = openid;
        return this;
    }

    public String getNickname() {
        return nickname;
    }

    public TMyuserAllProxy setNickname(String nickname) {
        if (nickname != null)
            nickname = nickname.trim();
        this.nickname = nickname;
        return this;
    }

    public String getHeadimgurl() {
        return headimgurl;
    }

    public TMyuserAllProxy setHeadimgurl(String headimgurl) {
        if (headimgurl != null)
            headimgurl = headimgurl.trim();
        this.headimgurl = headimgurl;
        return this;
    }

    public String getSid() {
        return sid;
    }

    public TMyuserAllProxy setSid(String sid) {
        if (sid != null)
            sid = sid.trim();
        this.sid = sid;
        return this;
    }

    public String getUserCookie() {
        return userCookie;
    }

    public TMyuserAllProxy setUserCookie(String userCookie) {
        if (userCookie != null)
            userCookie = userCookie.trim();
        this.userCookie = userCookie;
        return this;
    }

    public Date getLogintime() {
        return logintime;
    }

    public TMyuserAllProxy setLogintime(Date logintime) {
        this.logintime = logintime;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public TMyuserAllProxy setPhone(String phone) {
        if (phone != null)
            phone = phone.trim();
        this.phone = phone;
        return this;
    }

    public String getZxbz() {
        return zxbz;
    }

    public TMyuserAllProxy setZxbz(String zxbz) {
        if (zxbz != null)
            zxbz = zxbz.trim();
        this.zxbz = zxbz;
        return this;
    }

    public String getUri() {
        return uri;
    }

    public TMyuserAllProxy setUri(String uri) {
        if (uri != null)
            uri = uri.trim();
        this.uri = uri;
        return this;
    }

    public String getWyl() {
        return wyl;
    }

    public TMyuserAllProxy setWyl(String wyl) {
        if (wyl != null)
            wyl = wyl.trim();
        this.wyl = wyl;
        return this;
    }

    public String getThl() {
        return thl;
    }

    public TMyuserAllProxy setThl(String thl) {
        if (thl != null)
            thl = thl.trim();
        this.thl = thl;
        return this;
    }

    public String getJf() {
        return jf;
    }

    public TMyuserAllProxy setJf(String jf) {
        if (jf != null)
            jf = jf.trim();
        this.jf = jf;
        return this;
    }

    public String getDj() {
        return dj;
    }

    public TMyuserAllProxy setDj(String dj) {
        if (dj != null)
            dj = dj.trim();
        this.dj = dj;
        return this;
    }

    public String getCjcs() {
        return cjcs;
    }

    public TMyuserAllProxy setCjcs(String cjcs) {
        if (cjcs != null)
            cjcs = cjcs.trim();
        this.cjcs = cjcs;
        return this;
    }

    public String getSsr() {
        return ssr;
    }

    public TMyuserAllProxy setSsr(String ssr) {
        if (ssr != null)
            ssr = ssr.trim();
        this.ssr = ssr;
        return this;
    }

    public Long getProxyuserid() {
        return proxyuserid;
    }

    public void setProxyuserid(Long proxyuserid) {
        this.proxyuserid = proxyuserid;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "T_MYUSER_ALL_PROXY";
    public static final String USERID = "USERID";

    public static final String OPENID = "OPENID";

    /**
     * 小号昵称
     */
    public static final String NICKNAME = "NICKNAME";

    /**
     * 头像
     */
    public static final String HEADIMGURL = "HEADIMGURL";

    public static final String SID = "SID";

    /**
     * 小号cookie
     */
    public static final String USER_COOKIE = "USER_COOKIE";

    public static final String LOGINTIME = "LOGINTIME";

    /**
     * 手机号码
     */
    public static final String PHONE = "PHONE";

    public static final String ZXBZ = "ZXBZ";

    public static final String URI = "URI";

    /**
     * 违约率
     */
    public static final String WYL = "WYL";

    /**
     * 退货率
     */
    public static final String THL = "THL";

    /**
     * 积分
     */
    public static final String JF = "JF";

    /**
     * 等级
     */
    public static final String DJ = "DJ";

    public static final String CJCS = "CJCS";

    public static final String SSR = "SSR";

    public static final String PROXYUSERID = "PROXYUSERID";

    @Override
    public TMyuserAllProxy pkVal(Serializable val) {
        return this;
    }
}

