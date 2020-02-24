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
 * 文章-推荐人信息表(绑定给上下级关系)
 * </p>
 *
 * @author Gaby
 * @since 2020-02-24
 */
@TableName("article_agent_info")
public class ArticleAgentInfo implements Serializable, IEntity {


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
     * 推荐人用户标识
     */
    private Long agent;
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
    /**
     * 状态 00A-有效 00Z-失效
     */
    private String status;


    public Long getId() {
        return id;
    }

    public ArticleAgentInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public ArticleAgentInfo setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Long getAgent() {
        return agent;
    }

    public ArticleAgentInfo setAgent(Long agent) {
        this.agent = agent;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public ArticleAgentInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public ArticleAgentInfo setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public ArticleAgentInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "article_agent_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 用户标识
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 推荐人用户标识
     */
    public static final String AGENT = "agent";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 修改时间
     */
    public static final String MODIFY_TIME = "modify_time";

    /**
     * 状态 00A-有效 00Z-失效
     */
    public static final String STATUS = "status";


    @Override
    public ArticleAgentInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

