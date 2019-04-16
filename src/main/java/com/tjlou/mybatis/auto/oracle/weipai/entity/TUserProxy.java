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
@TableName("T_USER_PROXY")
public class TUserProxy implements Serializable, IEntity {

    @TableId(value = "USERID", type = IdType.INPUT)
    @TableField("USERID")
    private Long userid;
    @TableField("XM")
    private String xm;
    @TableField("ZH")
    private String zh;
    @TableField("MM")
    private String mm;
    @TableField("INTIME")
    private Date intime;
    @TableField("STATE")
    private String state;
    @TableField("JF")
    private Double jf;
    @TableField("DPSL")
    private Double dpsl;
    @TableField("BZ")
    private String bz;
    @TableField("ZXBZ")
    private String zxbz;
    @TableField("LOGINTIME")
    private Date logintime;
    @TableField("LOGINIP")
    private String loginip;
    @TableField("ROLEID")
    private String roleid;

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getXm() {
        return xm;
    }

    public TUserProxy setXm(String xm) {
        if (xm != null)
            xm = xm.trim();
        this.xm = xm;
        return this;
    }

    public String getZh() {
        return zh;
    }

    public TUserProxy setZh(String zh) {
        if (zh != null)
            zh = zh.trim();
        this.zh = zh;
        return this;
    }

    public String getMm() {
        return mm;
    }

    public TUserProxy setMm(String mm) {
        if (mm != null)
            mm = mm.trim();
        this.mm = mm;
        return this;
    }

    public Date getIntime() {
        return intime;
    }

    public TUserProxy setIntime(Date intime) {
        this.intime = intime;
        return this;
    }

    public String getState() {
        return state;
    }

    public TUserProxy setState(String state) {
        if (state != null)
            state = state.trim();
        this.state = state;
        return this;
    }

    public Double getJf() {
        return jf;
    }

    public TUserProxy setJf(Double jf) {
        this.jf = jf;
        return this;
    }

    public Double getDpsl() {
        return dpsl;
    }

    public TUserProxy setDpsl(Double dpsl) {
        this.dpsl = dpsl;
        return this;
    }

    public String getBz() {
        return bz;
    }

    public TUserProxy setBz(String bz) {
        if (bz != null)
            bz = bz.trim();
        this.bz = bz;
        return this;
    }

    public String getZxbz() {
        return zxbz;
    }

    public TUserProxy setZxbz(String zxbz) {
        if (zxbz != null)
            zxbz = zxbz.trim();
        this.zxbz = zxbz;
        return this;
    }

    public Date getLogintime() {
        return logintime;
    }

    public TUserProxy setLogintime(Date logintime) {
        this.logintime = logintime;
        return this;
    }

    public String getLoginip() {
        return loginip;
    }

    public TUserProxy setLoginip(String loginip) {
        if (loginip != null)
            loginip = loginip.trim();
        this.loginip = loginip;
        return this;
    }

    public String getRoleid() {
        return roleid;
    }

    public TUserProxy setRoleid(String roleid) {
        if (roleid != null)
            roleid = roleid.trim();
        this.roleid = roleid;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "T_USER_PROXY";
    public static final String USERID = "USERID";

    public static final String XM = "XM";

    public static final String ZH = "ZH";

    public static final String MM = "MM";

    public static final String INTIME = "INTIME";

    public static final String STATE = "STATE";

    public static final String JF = "JF";

    public static final String DPSL = "DPSL";

    public static final String BZ = "BZ";

    public static final String ZXBZ = "ZXBZ";

    public static final String LOGINTIME = "LOGINTIME";

    public static final String LOGINIP = "LOGINIP";

    public static final String ROLEID = "ROLEID";

    @Override
    public TUserProxy pkVal(Serializable val) {
        this.userid = Long.valueOf(val.toString());
        return this;
    }
}

