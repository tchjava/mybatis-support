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
 * 举报信息
 * </p>
 *
 * @author Gaby
 * @since 2020-07-18
 */
@TableName("auction_report_info")
public class AuctionReportInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 举报类型    1-拍品举报  2-廉政举报
     */
    @TableField("report_type")
    private Integer reportType;
    /**
     * 举报原因  1-分类错误  2-涉嫌售假  4-侵权 8-刷单/抬价 16-骚扰/辱骂  32-外网导购   64-图文不符  128-出售违禁品
     */
    @TableField("report_reason")
    private Long reportReason;
    /**
     * 原因名称
     */
    @TableField("reason_name")
    private String reasonName;
    /**
     * 主体类型  1-公司  2-拍品
     */
    @TableField("body_type")
    private Integer bodyType;
    /**
     * 来源标识
     */
    @TableField("source_id")
    private Long sourceId;
    /**
     * 手机号
     */
    private String phone;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 举报人
     */
    @TableField("user_account_id")
    private Long userAccountId;


    public Long getId() {
        return id;
    }

    public AuctionReportInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Integer getReportType() {
        return reportType;
    }

    public AuctionReportInfo setReportType(Integer reportType) {
        this.reportType = reportType;
        return this;
    }

    public Long getReportReason() {
        return reportReason;
    }

    public AuctionReportInfo setReportReason(Long reportReason) {
        this.reportReason = reportReason;
        return this;
    }

    public String getReasonName() {
        return reasonName;
    }

    public AuctionReportInfo setReasonName(String reasonName) {
        if (reasonName != null)
            reasonName = reasonName.trim();
        this.reasonName = reasonName;
        return this;
    }

    public Integer getBodyType() {
        return bodyType;
    }

    public AuctionReportInfo setBodyType(Integer bodyType) {
        this.bodyType = bodyType;
        return this;
    }

    public Long getSourceId() {
        return sourceId;
    }

    public AuctionReportInfo setSourceId(Long sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public AuctionReportInfo setPhone(String phone) {
        if (phone != null)
            phone = phone.trim();
        this.phone = phone;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public AuctionReportInfo setEmail(String email) {
        if (email != null)
            email = email.trim();
        this.email = email;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public AuctionReportInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public AuctionReportInfo setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_report_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 举报类型    1-拍品举报  2-廉政举报
     */
    public static final String REPORT_TYPE = "report_type";

    /**
     * 举报原因  1-分类错误  2-涉嫌售假  4-侵权 8-刷单/抬价 16-骚扰/辱骂  32-外网导购   64-图文不符  128-出售违禁品
     */
    public static final String REPORT_REASON = "report_reason";

    /**
     * 原因名称
     */
    public static final String REASON_NAME = "reason_name";

    /**
     * 主体类型  1-公司  2-拍品
     */
    public static final String BODY_TYPE = "body_type";

    /**
     * 来源标识
     */
    public static final String SOURCE_ID = "source_id";

    /**
     * 手机号
     */
    public static final String PHONE = "phone";

    /**
     * 邮箱
     */
    public static final String EMAIL = "email";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 举报人
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";


    @Override
    public AuctionReportInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

