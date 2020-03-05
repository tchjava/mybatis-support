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
 * 合伙人-余额日志表
 * </p>
 *
 * @author Gaby
 * @since 2020-03-05
 */
@TableName("partner_balance_log")
public class PartnerBalanceLog implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 所属余额
     */
    @TableField("balance_id")
    private Long balanceId;
    /**
     * 用户
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 变动类型  1-提现 2-金币兑换
     */
    @TableField("change_type")
    private Integer changeType;
    /**
     * 变动时间
     */
    @TableField("change_time")
    private Date changeTime;
    /**
     * 变动数据
     */
    @TableField("change_num")
    private Long changeNum;
    /**
     * 附参
     */
    private String attach;
    /**
     * 来源标识
     */
    @TableField("source_id")
    private Long sourceId;
    /**
     * 结余余额(单位:分)
     */
    @TableField("balance_num")
    private Long balanceNum;
    /**
     * 状态   00A-收入  00B-交易冻结 00C-支出
     */
    private String status;
    /**
     * 备注
     */
    private String comment;


    public Long getId() {
        return id;
    }

    public PartnerBalanceLog setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getBalanceId() {
        return balanceId;
    }

    public PartnerBalanceLog setBalanceId(Long balanceId) {
        this.balanceId = balanceId;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public PartnerBalanceLog setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Integer getChangeType() {
        return changeType;
    }

    public PartnerBalanceLog setChangeType(Integer changeType) {
        this.changeType = changeType;
        return this;
    }

    public Date getChangeTime() {
        return changeTime;
    }

    public PartnerBalanceLog setChangeTime(Date changeTime) {
        this.changeTime = changeTime;
        return this;
    }

    public Long getChangeNum() {
        return changeNum;
    }

    public PartnerBalanceLog setChangeNum(Long changeNum) {
        this.changeNum = changeNum;
        return this;
    }

    public String getAttach() {
        return attach;
    }

    public PartnerBalanceLog setAttach(String attach) {
        if (attach != null)
            attach = attach.trim();
        this.attach = attach;
        return this;
    }

    public Long getSourceId() {
        return sourceId;
    }

    public PartnerBalanceLog setSourceId(Long sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    public Long getBalanceNum() {
        return balanceNum;
    }

    public PartnerBalanceLog setBalanceNum(Long balanceNum) {
        this.balanceNum = balanceNum;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public PartnerBalanceLog setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public PartnerBalanceLog setComment(String comment) {
        if (comment != null)
            comment = comment.trim();
        this.comment = comment;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "partner_balance_log";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 所属余额
     */
    public static final String BALANCE_ID = "balance_id";

    /**
     * 用户
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 变动类型  1-提现 2-金币兑换
     */
    public static final String CHANGE_TYPE = "change_type";

    /**
     * 变动时间
     */
    public static final String CHANGE_TIME = "change_time";

    /**
     * 变动数据
     */
    public static final String CHANGE_NUM = "change_num";

    /**
     * 附参
     */
    public static final String ATTACH = "attach";

    /**
     * 来源标识
     */
    public static final String SOURCE_ID = "source_id";

    /**
     * 结余余额(单位:分)
     */
    public static final String BALANCE_NUM = "balance_num";

    /**
     * 状态   00A-收入  00B-交易冻结 00C-支出
     */
    public static final String STATUS = "status";

    /**
     * 备注
     */
    public static final String COMMENT = "comment";


    @Override
    public PartnerBalanceLog pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

