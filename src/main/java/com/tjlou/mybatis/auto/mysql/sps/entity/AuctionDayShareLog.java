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
 * 天天竞拍分享记录表
 * </p>
 *
 * @author Gaby
 * @since 2021-01-19
 */
@TableName("auction_day_share_log")
public class AuctionDayShareLog implements Serializable, IEntity {


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
     * 1-分享 2-邀请
     */
    private Integer type;
    /**
     * 分享带来的用户
     */
    @TableField("share_account_id")
    private Long shareAccountId;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;


    public Long getId() {
        return id;
    }

    public AuctionDayShareLog setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public AuctionDayShareLog setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public AuctionDayShareLog setType(Integer type) {
        this.type = type;
        return this;
    }

    public Long getShareAccountId() {
        return shareAccountId;
    }

    public AuctionDayShareLog setShareAccountId(Long shareAccountId) {
        this.shareAccountId = shareAccountId;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public AuctionDayShareLog setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_day_share_log";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 所属用户
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 1-分享 2-邀请
     */
    public static final String TYPE = "type";

    /**
     * 分享带来的用户
     */
    public static final String SHARE_ACCOUNT_ID = "share_account_id";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";


    @Override
    public AuctionDayShareLog pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

