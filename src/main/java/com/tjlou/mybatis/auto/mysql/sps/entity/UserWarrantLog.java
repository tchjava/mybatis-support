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
 * 拍卖-用户消保金日志
 * </p>
 *
 * @author Gaby
 * @since 2020-06-10
 */
@TableName("user_warrant_log")
public class UserWarrantLog implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 用户标识
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 保证金标识
     */
    @TableField("warrant_id")
    private Long warrantId;
    /**
     * 缴纳成功记录标识
     */
    @TableField("success_id")
    private Long successId;
    /**
     * 变动金额 单位:分
     */
    @TableField("change_num")
    private Long changeNum;
    /**
     * 变动类型
     */
    @TableField("change_type")
    private Integer changeType;
    /**
     * 变动时间
     */
    @TableField("change_time")
    private Date changeTime;
    /**
     * 结余金额 单位:分
     */
    @TableField("balance_num")
    private Long balanceNum;
    /**
     * 状态  00A-已缴纳  00B-待审核 00C-待支付-临时态  00Z-失效
     */
    private String status;
    /**
     * 备注
     */
    private String comment;
    /**
     * 缴纳单号
     */
    @TableField("warrant_no")
    private String warrantNo;
    /**
     * 支付类型 1-在线支付 2-余额支付
     */
    @TableField("pay_type")
    private Integer payType;


    public Long getId() {
        return id;
    }

    public UserWarrantLog setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public UserWarrantLog setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Long getWarrantId() {
        return warrantId;
    }

    public UserWarrantLog setWarrantId(Long warrantId) {
        this.warrantId = warrantId;
        return this;
    }

    public Long getSuccessId() {
        return successId;
    }

    public UserWarrantLog setSuccessId(Long successId) {
        this.successId = successId;
        return this;
    }

    public Long getChangeNum() {
        return changeNum;
    }

    public UserWarrantLog setChangeNum(Long changeNum) {
        this.changeNum = changeNum;
        return this;
    }

    public Integer getChangeType() {
        return changeType;
    }

    public UserWarrantLog setChangeType(Integer changeType) {
        this.changeType = changeType;
        return this;
    }

    public Date getChangeTime() {
        return changeTime;
    }

    public UserWarrantLog setChangeTime(Date changeTime) {
        this.changeTime = changeTime;
        return this;
    }

    public Long getBalanceNum() {
        return balanceNum;
    }

    public UserWarrantLog setBalanceNum(Long balanceNum) {
        this.balanceNum = balanceNum;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public UserWarrantLog setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public UserWarrantLog setComment(String comment) {
        if (comment != null)
            comment = comment.trim();
        this.comment = comment;
        return this;
    }

    public String getWarrantNo() {
        return warrantNo;
    }

    public UserWarrantLog setWarrantNo(String warrantNo) {
        if (warrantNo != null)
            warrantNo = warrantNo.trim();
        this.warrantNo = warrantNo;
        return this;
    }

    public Integer getPayType() {
        return payType;
    }

    public UserWarrantLog setPayType(Integer payType) {
        this.payType = payType;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "user_warrant_log";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 用户标识
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 保证金标识
     */
    public static final String WARRANT_ID = "warrant_id";

    /**
     * 缴纳成功记录标识
     */
    public static final String SUCCESS_ID = "success_id";

    /**
     * 变动金额 单位:分
     */
    public static final String CHANGE_NUM = "change_num";

    /**
     * 变动类型
     */
    public static final String CHANGE_TYPE = "change_type";

    /**
     * 变动时间
     */
    public static final String CHANGE_TIME = "change_time";

    /**
     * 结余金额 单位:分
     */
    public static final String BALANCE_NUM = "balance_num";

    /**
     * 状态  00A-已缴纳  00B-待审核 00C-待支付-临时态  00Z-失效
     */
    public static final String STATUS = "status";

    /**
     * 备注
     */
    public static final String COMMENT = "comment";

    /**
     * 缴纳单号
     */
    public static final String WARRANT_NO = "warrant_no";

    /**
     * 支付类型 1-在线支付 2-余额支付
     */
    public static final String PAY_TYPE = "pay_type";


    @Override
    public UserWarrantLog pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}
