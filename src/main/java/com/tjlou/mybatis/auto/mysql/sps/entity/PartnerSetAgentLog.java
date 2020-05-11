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
 * 合伙人设置代理日志表
 * </p>
 *
 * @author Gaby
 * @since 2020-05-11
 */
@TableName("partner_set_agent_log")
public class PartnerSetAgentLog implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 操作者标识
     */
    @TableField("operator_id")
    private Long operatorId;
    /**
     * 用户标识
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 状态 00A-有效 00Z-失效
     */
    private String status;


    public Long getId() {
        return id;
    }

    public PartnerSetAgentLog setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getOperatorId() {
        return operatorId;
    }

    public PartnerSetAgentLog setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public PartnerSetAgentLog setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public PartnerSetAgentLog setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public PartnerSetAgentLog setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "partner_set_agent_log";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 操作者标识
     */
    public static final String OPERATOR_ID = "operator_id";

    /**
     * 用户标识
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 状态 00A-有效 00Z-失效
     */
    public static final String STATUS = "status";


    @Override
    public PartnerSetAgentLog pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

