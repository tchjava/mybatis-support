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
 * 天天竞拍拍品私有机会信息表
 * </p>
 *
 * @author Gaby
 * @since 2021-01-14
 */
@TableName("auction_day_private_chance_info")
public class AuctionDayPrivateChanceInfo implements Serializable, IEntity {


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
     * 所属实例
     */
    @TableField("instance_id")
    private Long instanceId;
    /**
     * 实例编号
     */
    @TableField("instance_code")
    private String instanceCode;
    /**
     * 机会次数
     */
    @TableField("chance_num")
    private Integer chanceNum;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;


    public Long getId() {
        return id;
    }

    public AuctionDayPrivateChanceInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public AuctionDayPrivateChanceInfo setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Long getInstanceId() {
        return instanceId;
    }

    public AuctionDayPrivateChanceInfo setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getInstanceCode() {
        return instanceCode;
    }

    public AuctionDayPrivateChanceInfo setInstanceCode(String instanceCode) {
        if (instanceCode != null)
            instanceCode = instanceCode.trim();
        this.instanceCode = instanceCode;
        return this;
    }

    public Integer getChanceNum() {
        return chanceNum;
    }

    public AuctionDayPrivateChanceInfo setChanceNum(Integer chanceNum) {
        this.chanceNum = chanceNum;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public AuctionDayPrivateChanceInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_day_private_chance_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 所属用户
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 所属实例
     */
    public static final String INSTANCE_ID = "instance_id";

    /**
     * 实例编号
     */
    public static final String INSTANCE_CODE = "instance_code";

    /**
     * 机会次数
     */
    public static final String CHANCE_NUM = "chance_num";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";


    @Override
    public AuctionDayPrivateChanceInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

