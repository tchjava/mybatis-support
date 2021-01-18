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
 * 天天竞拍拍品审核日志表
 * </p>
 *
 * @author Gaby
 * @since 2021-01-18
 */
@TableName("auction_day_product_check_log")
public class AuctionDayProductCheckLog implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 申请者
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 所属拍品
     */
    @TableField("product_id")
    private Integer productId;
    /**
     * 申请时间
     */
    @TableField("application_time")
    private Date applicationTime;
    /**
     * 审核时间
     */
    @TableField("check_time")
    private Date checkTime;
    /**
     * 审核状态  1-通过 2-拒绝
     */
    @TableField("check_status")
    private Integer checkStatus;
    /**
     * 审核原因
     */
    private String reason;


    public Long getId() {
        return id;
    }

    public AuctionDayProductCheckLog setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public AuctionDayProductCheckLog setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Integer getProductId() {
        return productId;
    }

    public AuctionDayProductCheckLog setProductId(Integer productId) {
        this.productId = productId;
        return this;
    }

    public Date getApplicationTime() {
        return applicationTime;
    }

    public AuctionDayProductCheckLog setApplicationTime(Date applicationTime) {
        this.applicationTime = applicationTime;
        return this;
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public AuctionDayProductCheckLog setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
        return this;
    }

    public Integer getCheckStatus() {
        return checkStatus;
    }

    public AuctionDayProductCheckLog setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
        return this;
    }

    public String getReason() {
        return reason;
    }

    public AuctionDayProductCheckLog setReason(String reason) {
        if (reason != null)
            reason = reason.trim();
        this.reason = reason;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_day_product_check_log";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 申请者
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 所属拍品
     */
    public static final String PRODUCT_ID = "product_id";

    /**
     * 申请时间
     */
    public static final String APPLICATION_TIME = "application_time";

    /**
     * 审核时间
     */
    public static final String CHECK_TIME = "check_time";

    /**
     * 审核状态  1-通过 2-拒绝
     */
    public static final String CHECK_STATUS = "check_status";

    /**
     * 审核原因
     */
    public static final String REASON = "reason";


    @Override
    public AuctionDayProductCheckLog pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

