package com.gaby.auto.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Gaby
 * @since 2019-09-14
 */
public class Customer extends Model<Customer> {

    private static final long serialVersionUID=1L;

    /**
     * 客户编号(主键)
     */
    @TableId(value = "cust_id", type = IdType.AUTO)
    private Long custId;

    /**
     * 客户名称(公司名称)
     */
    private String custName;

    /**
     * 负责人id
     */
    private Long custUserId;

    /**
     * 创建人id
     */
    private Long custCreateId;

    /**
     * 客户信息来源
     */
    private String custSource;

    /**
     * 客户所属行业
     */
    private String custIndustry;

    /**
     * 客户级别
     */
    private String custLevel;

    /**
     * 联系人
     */
    private String custLinkman;

    /**
     * 固定电话
     */
    private String custPhone;

    /**
     * 移动电话
     */
    private String custMobile;

    private String custZipcode;

    private String custAddress;

    /**
     * 创建时间
     */
    private LocalDateTime custCreatetime;


    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public Long getCustUserId() {
        return custUserId;
    }

    public void setCustUserId(Long custUserId) {
        this.custUserId = custUserId;
    }

    public Long getCustCreateId() {
        return custCreateId;
    }

    public void setCustCreateId(Long custCreateId) {
        this.custCreateId = custCreateId;
    }

    public String getCustSource() {
        return custSource;
    }

    public void setCustSource(String custSource) {
        this.custSource = custSource;
    }

    public String getCustIndustry() {
        return custIndustry;
    }

    public void setCustIndustry(String custIndustry) {
        this.custIndustry = custIndustry;
    }

    public String getCustLevel() {
        return custLevel;
    }

    public void setCustLevel(String custLevel) {
        this.custLevel = custLevel;
    }

    public String getCustLinkman() {
        return custLinkman;
    }

    public void setCustLinkman(String custLinkman) {
        this.custLinkman = custLinkman;
    }

    public String getCustPhone() {
        return custPhone;
    }

    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone;
    }

    public String getCustMobile() {
        return custMobile;
    }

    public void setCustMobile(String custMobile) {
        this.custMobile = custMobile;
    }

    public String getCustZipcode() {
        return custZipcode;
    }

    public void setCustZipcode(String custZipcode) {
        this.custZipcode = custZipcode;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    public LocalDateTime getCustCreatetime() {
        return custCreatetime;
    }

    public void setCustCreatetime(LocalDateTime custCreatetime) {
        this.custCreatetime = custCreatetime;
    }

    public static final String CUST_ID = "cust_id";

    public static final String CUST_NAME = "cust_name";

    public static final String CUST_USER_ID = "cust_user_id";

    public static final String CUST_CREATE_ID = "cust_create_id";

    public static final String CUST_SOURCE = "cust_source";

    public static final String CUST_INDUSTRY = "cust_industry";

    public static final String CUST_LEVEL = "cust_level";

    public static final String CUST_LINKMAN = "cust_linkman";

    public static final String CUST_PHONE = "cust_phone";

    public static final String CUST_MOBILE = "cust_mobile";

    public static final String CUST_ZIPCODE = "cust_zipcode";

    public static final String CUST_ADDRESS = "cust_address";

    public static final String CUST_CREATETIME = "cust_createtime";

    @Override
    protected Serializable pkVal() {
        return this.custId;
    }

    @Override
    public String toString() {
        return "Customer{" +
        "custId=" + custId +
        ", custName=" + custName +
        ", custUserId=" + custUserId +
        ", custCreateId=" + custCreateId +
        ", custSource=" + custSource +
        ", custIndustry=" + custIndustry +
        ", custLevel=" + custLevel +
        ", custLinkman=" + custLinkman +
        ", custPhone=" + custPhone +
        ", custMobile=" + custMobile +
        ", custZipcode=" + custZipcode +
        ", custAddress=" + custAddress +
        ", custCreatetime=" + custCreatetime +
        "}";
    }
}
