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
 * 地址信息表
 * </p>
 *
 * @author Gaby
 * @since 2019-06-20
 */
@TableName("address_info")
public class AddressInfo implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 用户标识
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 省
     */
    private Integer addr1;
    /**
     * 市
     */
    private Integer addr2;
    /**
     * 区/县
     */
    private Integer addr3;
    /**
     * 具体地址
     */
    private String address;
    /**
     * 联系人
     */
    private String linkman;
    /**
     * 手机号码
     */
    private String phone;
    /**
     * 邮编
     */
    private String code;
    /**
     * 创建时间
     */
    private Date intime;

    public Long getId() {
        return id;
    }

    public AddressInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public AddressInfo setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Integer getAddr1() {
        return addr1;
    }

    public AddressInfo setAddr1(Integer addr1) {
        this.addr1 = addr1;
        return this;
    }

    public Integer getAddr2() {
        return addr2;
    }

    public AddressInfo setAddr2(Integer addr2) {
        this.addr2 = addr2;
        return this;
    }

    public Integer getAddr3() {
        return addr3;
    }

    public AddressInfo setAddr3(Integer addr3) {
        this.addr3 = addr3;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public AddressInfo setAddress(String address) {
        if (address != null)
            address = address.trim();
        this.address = address;
        return this;
    }

    public String getLinkman() {
        return linkman;
    }

    public AddressInfo setLinkman(String linkman) {
        if (linkman != null)
            linkman = linkman.trim();
        this.linkman = linkman;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public AddressInfo setPhone(String phone) {
        if (phone != null)
            phone = phone.trim();
        this.phone = phone;
        return this;
    }

    public String getCode() {
        return code;
    }

    public AddressInfo setCode(String code) {
        if (code != null)
            code = code.trim();
        this.code = code;
        return this;
    }

    public Date getIntime() {
        return intime;
    }

    public AddressInfo setIntime(Date intime) {
        this.intime = intime;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "address_info";
    public static final String ID = "id";

    /**
     * 用户标识
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 省
     */
    public static final String ADDR1 = "addr1";

    /**
     * 市
     */
    public static final String ADDR2 = "addr2";

    /**
     * 区/县
     */
    public static final String ADDR3 = "addr3";

    /**
     * 具体地址
     */
    public static final String ADDRESS = "address";

    /**
     * 联系人
     */
    public static final String LINKMAN = "linkman";

    /**
     * 手机号码
     */
    public static final String PHONE = "phone";

    /**
     * 邮编
     */
    public static final String CODE = "code";

    /**
     * 创建时间
     */
    public static final String INTIME = "intime";

    @Override
    public AddressInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

