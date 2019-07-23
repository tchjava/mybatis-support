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
 * 充值信息表
 * </p>
 *
 * @author Gaby
 * @since 2019-07-23
 */
@TableName("bill_recharge_info")
public class BillRechargeInfo implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 帐号标识
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 充值订单号
     */
    @TableField("recharge_no")
    private String rechargeNo;
    /**
     * 充值手机号
     */
    private String phone;
    /**
     * 操作人员标识
     */
    @TableField("operator_id")
    private Long operatorId;
    /**
     * 充值金额 单位:分
     */
    @TableField("recharge_num")
    private Integer rechargeNum;
    /**
     * 充值类型 1=充值  2=退款
     */
    @TableField("recharge_type")
    private Integer rechargeType;
    /**
     * 状态  00A-待支付 00B-已支付 00Z--失效
     */
    private String status;
    /**
     * 备注
     */
    private String comment;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 修改时间
     */
    @TableField("modify_time")
    private Date modifyTime;

    public Long getId() {
        return id;
    }

    public BillRechargeInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public BillRechargeInfo setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public String getRechargeNo() {
        return rechargeNo;
    }

    public BillRechargeInfo setRechargeNo(String rechargeNo) {
        if (rechargeNo != null)
            rechargeNo = rechargeNo.trim();
        this.rechargeNo = rechargeNo;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public BillRechargeInfo setPhone(String phone) {
        if (phone != null)
            phone = phone.trim();
        this.phone = phone;
        return this;
    }

    public Long getOperatorId() {
        return operatorId;
    }

    public BillRechargeInfo setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
        return this;
    }

    public Integer getRechargeNum() {
        return rechargeNum;
    }

    public BillRechargeInfo setRechargeNum(Integer rechargeNum) {
        this.rechargeNum = rechargeNum;
        return this;
    }

    public Integer getRechargeType() {
        return rechargeType;
    }

    public BillRechargeInfo setRechargeType(Integer rechargeType) {
        this.rechargeType = rechargeType;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public BillRechargeInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public BillRechargeInfo setComment(String comment) {
        if (comment != null)
            comment = comment.trim();
        this.comment = comment;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public BillRechargeInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public BillRechargeInfo setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "bill_recharge_info";
    public static final String ID = "id";

    /**
     * 帐号标识
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 充值订单号
     */
    public static final String RECHARGE_NO = "recharge_no";

    /**
     * 充值手机号
     */
    public static final String PHONE = "phone";

    /**
     * 操作人员标识
     */
    public static final String OPERATOR_ID = "operator_id";

    /**
     * 充值金额 单位:分
     */
    public static final String RECHARGE_NUM = "recharge_num";

    /**
     * 充值类型 1=充值  2=退款
     */
    public static final String RECHARGE_TYPE = "recharge_type";

    /**
     * 状态  00A-待支付 00B-已支付 00Z--失效
     */
    public static final String STATUS = "status";

    /**
     * 备注
     */
    public static final String COMMENT = "comment";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 修改时间
     */
    public static final String MODIFY_TIME = "modify_time";

    @Override
    public BillRechargeInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

