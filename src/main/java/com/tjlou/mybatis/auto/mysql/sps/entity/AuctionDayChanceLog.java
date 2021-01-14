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
 * 天天竞拍出价机会记录表
 * </p>
 *
 * @author Gaby
 * @since 2021-01-14
 */
@TableName("auction_day_chance_log")
public class AuctionDayChanceLog implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 实例标识
     */
    @TableField("instance_id")
    private Long instanceId;
    /**
     * 所属用户
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 变动类型  1-赠送  2-使用
     */
    @TableField("change_type")
    private Long changeType;
    /**
     * 变动名称
     */
    @TableField("change_name")
    private String changeName;
    /**
     * 变动次数
     */
    @TableField("change_num")
    private Integer changeNum;
    /**
     * 变动时间
     */
    @TableField("change_time")
    private Date changeTime;
    /**
     * 解释类型 1-官方赠送机会 2-使用出价机会 3-分享好友
     */
    @TableField("explain_type")
    private Integer explainType;
    /**
     * 状态 00A-收入 00C-支出
     */
    private String status;
    /**
     * 备注
     */
    private String comment;


    public Long getId() {
        return id;
    }

    public AuctionDayChanceLog setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getInstanceId() {
        return instanceId;
    }

    public AuctionDayChanceLog setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public AuctionDayChanceLog setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Long getChangeType() {
        return changeType;
    }

    public AuctionDayChanceLog setChangeType(Long changeType) {
        this.changeType = changeType;
        return this;
    }

    public String getChangeName() {
        return changeName;
    }

    public AuctionDayChanceLog setChangeName(String changeName) {
        if (changeName != null)
            changeName = changeName.trim();
        this.changeName = changeName;
        return this;
    }

    public Integer getChangeNum() {
        return changeNum;
    }

    public AuctionDayChanceLog setChangeNum(Integer changeNum) {
        this.changeNum = changeNum;
        return this;
    }

    public Date getChangeTime() {
        return changeTime;
    }

    public AuctionDayChanceLog setChangeTime(Date changeTime) {
        this.changeTime = changeTime;
        return this;
    }

    public Integer getExplainType() {
        return explainType;
    }

    public AuctionDayChanceLog setExplainType(Integer explainType) {
        this.explainType = explainType;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public AuctionDayChanceLog setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public AuctionDayChanceLog setComment(String comment) {
        if (comment != null)
            comment = comment.trim();
        this.comment = comment;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_day_chance_log";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 实例标识
     */
    public static final String INSTANCE_ID = "instance_id";

    /**
     * 所属用户
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 变动类型  1-赠送  2-使用
     */
    public static final String CHANGE_TYPE = "change_type";

    /**
     * 变动名称
     */
    public static final String CHANGE_NAME = "change_name";

    /**
     * 变动次数
     */
    public static final String CHANGE_NUM = "change_num";

    /**
     * 变动时间
     */
    public static final String CHANGE_TIME = "change_time";

    /**
     * 解释类型 1-官方赠送机会 2-使用出价机会 3-分享好友
     */
    public static final String EXPLAIN_TYPE = "explain_type";

    /**
     * 状态 00A-收入 00C-支出
     */
    public static final String STATUS = "status";

    /**
     * 备注
     */
    public static final String COMMENT = "comment";


    @Override
    public AuctionDayChanceLog pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

