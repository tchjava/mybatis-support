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
 * 中奖信息表
 * </p>
 *
 * @author Gaby
 * @since 2019-09-05
 */
@TableName("prize_win_info")
public class PrizeWinInfo implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 日志标识
     */
    @TableField("log_id")
    private Long logId;
    /**
     * 用户标识
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 中奖时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 兑奖码
     */
    @TableField("redemption_code")
    private String redemptionCode;

    public Long getId() {
        return id;
    }

    public PrizeWinInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getLogId() {
        return logId;
    }

    public PrizeWinInfo setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public PrizeWinInfo setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public PrizeWinInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getRedemptionCode() {
        return redemptionCode;
    }

    public PrizeWinInfo setRedemptionCode(String redemptionCode) {
        if (redemptionCode != null)
            redemptionCode = redemptionCode.trim();
        this.redemptionCode = redemptionCode;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "prize_win_info";
    public static final String ID = "id";

    /**
     * 日志标识
     */
    public static final String LOG_ID = "log_id";

    /**
     * 用户标识
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 中奖时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 兑奖码
     */
    public static final String REDEMPTION_CODE = "redemption_code";

    @Override
    public PrizeWinInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

