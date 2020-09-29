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
 * 锤定鉴定地址信息表
 * </p>
 *
 * @author Gaby
 * @since 2020-09-29
 */
@TableName("auction_check_address_info")
public class AuctionCheckAddressInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 省
     */
    @TableField("addr_1")
    private Long addr1;
    /**
     * 市
     */
    @TableField("addr_2")
    private Long addr2;
    /**
     * 县/区
     */
    @TableField("addr_3")
    private Long addr3;
    /**
     * 详细地址(不带省市县)
     */
    private String address;
    /**
     * 联系人
     */
    @TableField("link_man")
    private String linkMan;
    /**
     * 手机号
     */
    @TableField("link_phone")
    private String linkPhone;
    /**
     * 编码
     */
    private String code;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 状态  00A-普通  00B-默认
     */
    private String status;


    public Long getId() {
        return id;
    }

    public AuctionCheckAddressInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getAddr1() {
        return addr1;
    }

    public AuctionCheckAddressInfo setAddr1(Long addr1) {
        this.addr1 = addr1;
        return this;
    }

    public Long getAddr2() {
        return addr2;
    }

    public AuctionCheckAddressInfo setAddr2(Long addr2) {
        this.addr2 = addr2;
        return this;
    }

    public Long getAddr3() {
        return addr3;
    }

    public AuctionCheckAddressInfo setAddr3(Long addr3) {
        this.addr3 = addr3;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public AuctionCheckAddressInfo setAddress(String address) {
        if (address != null)
            address = address.trim();
        this.address = address;
        return this;
    }

    public String getLinkMan() {
        return linkMan;
    }

    public AuctionCheckAddressInfo setLinkMan(String linkMan) {
        if (linkMan != null)
            linkMan = linkMan.trim();
        this.linkMan = linkMan;
        return this;
    }

    public String getLinkPhone() {
        return linkPhone;
    }

    public AuctionCheckAddressInfo setLinkPhone(String linkPhone) {
        if (linkPhone != null)
            linkPhone = linkPhone.trim();
        this.linkPhone = linkPhone;
        return this;
    }

    public String getCode() {
        return code;
    }

    public AuctionCheckAddressInfo setCode(String code) {
        if (code != null)
            code = code.trim();
        this.code = code;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public AuctionCheckAddressInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public AuctionCheckAddressInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_check_address_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 省
     */
    public static final String ADDR_1 = "addr_1";

    /**
     * 市
     */
    public static final String ADDR_2 = "addr_2";

    /**
     * 县/区
     */
    public static final String ADDR_3 = "addr_3";

    /**
     * 详细地址(不带省市县)
     */
    public static final String ADDRESS = "address";

    /**
     * 联系人
     */
    public static final String LINK_MAN = "link_man";

    /**
     * 手机号
     */
    public static final String LINK_PHONE = "link_phone";

    /**
     * 编码
     */
    public static final String CODE = "code";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 状态  00A-普通  00B-默认
     */
    public static final String STATUS = "status";


    @Override
    public AuctionCheckAddressInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

