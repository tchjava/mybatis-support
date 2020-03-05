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
 * 合伙人-金币明细表
 * </p>
 *
 * @author Gaby
 * @since 2020-03-05
 */
@TableName("partner_coin_log")
public class PartnerCoinLog implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 库币标识
     */
    @TableField("partner_coin_id")
    private Long partnerCoinId;
    /**
     * 用户标识
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 来源标识
     */
    @TableField("source_id")
    private Long sourceId;
    /**
     * 附加参数
     */
    private String attach;
    /**
     * 变动类型 1-订单(待收款) 2-收款  4-退款 8-退还 16-开通代理 32-奖励 64-提现
     */
    @TableField("change_type")
    private Integer changeType;
    /**
     * 变动数量
     */
    @TableField("change_num")
    private Long changeNum;
    /**
     * 变动时间
     */
    @TableField("change_time")
    private Date changeTime;
    /**
     * 剩余余额
     */
    private Long balance;
    /**
     * 状态 00A-收入   00B-交易中冻结   00C-支出   00D-超消保金冻结  00E-审核中 00Z-失效
     */
    private String status;
    /**
     * 备注
     */
    private String comment;


    public Long getId() {
        return id;
    }

    public PartnerCoinLog setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getPartnerCoinId() {
        return partnerCoinId;
    }

    public PartnerCoinLog setPartnerCoinId(Long partnerCoinId) {
        this.partnerCoinId = partnerCoinId;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public PartnerCoinLog setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Long getSourceId() {
        return sourceId;
    }

    public PartnerCoinLog setSourceId(Long sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    public String getAttach() {
        return attach;
    }

    public PartnerCoinLog setAttach(String attach) {
        if (attach != null)
            attach = attach.trim();
        this.attach = attach;
        return this;
    }

    public Integer getChangeType() {
        return changeType;
    }

    public PartnerCoinLog setChangeType(Integer changeType) {
        this.changeType = changeType;
        return this;
    }

    public Long getChangeNum() {
        return changeNum;
    }

    public PartnerCoinLog setChangeNum(Long changeNum) {
        this.changeNum = changeNum;
        return this;
    }

    public Date getChangeTime() {
        return changeTime;
    }

    public PartnerCoinLog setChangeTime(Date changeTime) {
        this.changeTime = changeTime;
        return this;
    }

    public Long getBalance() {
        return balance;
    }

    public PartnerCoinLog setBalance(Long balance) {
        this.balance = balance;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public PartnerCoinLog setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public PartnerCoinLog setComment(String comment) {
        if (comment != null)
            comment = comment.trim();
        this.comment = comment;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "partner_coin_log";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 库币标识
     */
    public static final String PARTNER_COIN_ID = "partner_coin_id";

    /**
     * 用户标识
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 来源标识
     */
    public static final String SOURCE_ID = "source_id";

    /**
     * 附加参数
     */
    public static final String ATTACH = "attach";

    /**
     * 变动类型 1-订单(待收款) 2-收款  4-退款 8-退还 16-开通代理 32-奖励 64-提现
     */
    public static final String CHANGE_TYPE = "change_type";

    /**
     * 变动数量
     */
    public static final String CHANGE_NUM = "change_num";

    /**
     * 变动时间
     */
    public static final String CHANGE_TIME = "change_time";

    /**
     * 剩余余额
     */
    public static final String BALANCE = "balance";

    /**
     * 状态 00A-收入   00B-交易中冻结   00C-支出   00D-超消保金冻结  00E-审核中 00Z-失效
     */
    public static final String STATUS = "status";

    /**
     * 备注
     */
    public static final String COMMENT = "comment";


    @Override
    public PartnerCoinLog pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

