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
 * 余额日志表
 * </p>
 *
 * @author Gaby
 * @since 2019-07-17
 */
@TableName("bill_balance_log")
public class BillBalanceLog implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 余额标识
     */
    @TableField("blance_id")
    private Long blanceId;
    /**
     * 帐号标识
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 来源标识   购物-订单标识     退款-退款标识
     */
    @TableField("source_id")
    private Long sourceId;
    /**
     * 变动类型  1-购物  2-收款  4-转账(转入)  8-转账(转出)  16-充值 32-退款 64-提现
     */
    @TableField("change_type")
    private Integer changeType;
    /**
     * 变动金额  单位:分
     */
    @TableField("change_num")
    private Integer changeNum;
    /**
     * 变动结余  单位:分
     */
    @TableField("blance_num")
    private Integer blanceNum;
    /**
     * 变动时间
     */
    @TableField("change_time")
    private Date changeTime;
    /**
     * 备注
     */
    private String comment;

    public Long getId() {
        return id;
    }

    public BillBalanceLog setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getBlanceId() {
        return blanceId;
    }

    public BillBalanceLog setBlanceId(Long blanceId) {
        this.blanceId = blanceId;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public BillBalanceLog setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Long getSourceId() {
        return sourceId;
    }

    public BillBalanceLog setSourceId(Long sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    public Integer getChangeType() {
        return changeType;
    }

    public BillBalanceLog setChangeType(Integer changeType) {
        this.changeType = changeType;
        return this;
    }

    public Integer getChangeNum() {
        return changeNum;
    }

    public BillBalanceLog setChangeNum(Integer changeNum) {
        this.changeNum = changeNum;
        return this;
    }

    public Integer getBlanceNum() {
        return blanceNum;
    }

    public BillBalanceLog setBlanceNum(Integer blanceNum) {
        this.blanceNum = blanceNum;
        return this;
    }

    public Date getChangeTime() {
        return changeTime;
    }

    public BillBalanceLog setChangeTime(Date changeTime) {
        this.changeTime = changeTime;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public BillBalanceLog setComment(String comment) {
        if (comment != null)
            comment = comment.trim();
        this.comment = comment;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "bill_balance_log";
    public static final String ID = "id";

    /**
     * 余额标识
     */
    public static final String BLANCE_ID = "blance_id";

    /**
     * 帐号标识
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 来源标识   购物-订单标识     退款-退款标识
     */
    public static final String SOURCE_ID = "source_id";

    /**
     * 变动类型  1-购物  2-收款  4-转账(转入)  8-转账(转出)  16-充值 32-退款 64-提现
     */
    public static final String CHANGE_TYPE = "change_type";

    /**
     * 变动金额  单位:分
     */
    public static final String CHANGE_NUM = "change_num";

    /**
     * 变动结余  单位:分
     */
    public static final String BLANCE_NUM = "blance_num";

    /**
     * 变动时间
     */
    public static final String CHANGE_TIME = "change_time";

    /**
     * 备注
     */
    public static final String COMMENT = "comment";

    @Override
    public BillBalanceLog pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

