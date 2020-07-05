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
 * 补贴签到信息表
 * </p>
 *
 * @author Gaby
 * @since 2020-07-05
 */
@TableName("subsidies_sign_info")
public class SubsidiesSignInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 所属用户
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 签名时间
     */
    @TableField("sign_time")
    private Date signTime;
    /**
     * 邀请者
     */
    @TableField("inviter_id")
    private Long inviterId;
    /**
     * 状态 00A-有效  00Z-失效
     */
    private String status;


    public Long getId() {
        return id;
    }

    public SubsidiesSignInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public SubsidiesSignInfo setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Date getSignTime() {
        return signTime;
    }

    public SubsidiesSignInfo setSignTime(Date signTime) {
        this.signTime = signTime;
        return this;
    }

    public Long getInviterId() {
        return inviterId;
    }

    public SubsidiesSignInfo setInviterId(Long inviterId) {
        this.inviterId = inviterId;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public SubsidiesSignInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "subsidies_sign_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 所属用户
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 签名时间
     */
    public static final String SIGN_TIME = "sign_time";

    /**
     * 邀请者
     */
    public static final String INVITER_ID = "inviter_id";

    /**
     * 状态 00A-有效  00Z-失效
     */
    public static final String STATUS = "status";


    @Override
    public SubsidiesSignInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

