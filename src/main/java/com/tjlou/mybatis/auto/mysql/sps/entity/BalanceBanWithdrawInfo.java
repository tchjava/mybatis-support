package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 余额禁止提现黑名单
 * </p>
 *
 * @author Gaby
 * @since 2021-03-12
 */
@TableName("balance_ban_withdraw_info")
public class BalanceBanWithdrawInfo implements Serializable, IEntity {


    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    @TableField("user_account_id")
    private Long userAccountId;
    private String reason;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public void setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
    }

    public String getReason() {
        return reason;
    }

    public BalanceBanWithdrawInfo setReason(String reason) {
        if (reason != null)
            reason = reason.trim();
        this.reason = reason;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "balance_ban_withdraw_info";
    public static final String ID = "id";

    public static final String USER_ACCOUNT_ID = "user_account_id";

    public static final String REASON = "reason";


    @Override
    public BalanceBanWithdrawInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

