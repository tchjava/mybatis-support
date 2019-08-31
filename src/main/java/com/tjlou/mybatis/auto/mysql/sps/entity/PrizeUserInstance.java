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
 * 抽奖用户实例表
 * </p>
 *
 * @author Gaby
 * @since 2019-08-31
 */
@TableName("prize_user_instance")
public class PrizeUserInstance implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 商品记录标识
     */
    @TableField("log_id")
    private Long logId;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 用户标识
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 重叠次数
     */
    private Integer overlap;

    public Long getId() {
        return id;
    }

    public PrizeUserInstance setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getLogId() {
        return logId;
    }

    public PrizeUserInstance setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public PrizeUserInstance setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public PrizeUserInstance setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Integer getOverlap() {
        return overlap;
    }

    public PrizeUserInstance setOverlap(Integer overlap) {
        this.overlap = overlap;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "prize_user_instance";
    public static final String ID = "id";

    /**
     * 商品记录标识
     */
    public static final String LOG_ID = "log_id";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 用户标识
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 重叠次数
     */
    public static final String OVERLAP = "overlap";

    @Override
    public PrizeUserInstance pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

