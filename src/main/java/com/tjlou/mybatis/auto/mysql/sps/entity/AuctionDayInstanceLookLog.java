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
 * 天天竞拍拍品查看表
 * </p>
 *
 * @author Gaby
 * @since 2021-01-15
 */
@TableName("auction_day_instance_look_log")
public class AuctionDayInstanceLookLog implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 所属实例
     */
    @TableField("instance_id")
    private Long instanceId;
    /**
     * 所属用户
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;


    public Long getId() {
        return id;
    }

    public AuctionDayInstanceLookLog setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getInstanceId() {
        return instanceId;
    }

    public AuctionDayInstanceLookLog setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public AuctionDayInstanceLookLog setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public AuctionDayInstanceLookLog setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_day_instance_look_log";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 所属实例
     */
    public static final String INSTANCE_ID = "instance_id";

    /**
     * 所属用户
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";


    @Override
    public AuctionDayInstanceLookLog pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

