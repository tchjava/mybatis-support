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
 * 拍卖-假货赔付信息表
 * </p>
 *
 * @author Gaby
 * @since 2020-10-16
 */
@TableName("auction_fake_compensate_info")
public class AuctionFakeCompensateInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 所属订单
     */
    @TableField("order_id")
    private Long orderId;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 同意时间
     */
    @TableField("end_time")
    private Date endTime;
    /**
     * 取消时间
     */
    @TableField("cancel_time")
    private Date cancelTime;
    /**
     * 更新时间
     */
    @TableField("update_time")
    private Date updateTime;
    /**
     * 状态 1-申请中 2-同意赔付  4-取消赔付
     */
    private Integer status;
    /**
     * 赔付金额(单位:分)
     */
    @TableField("compen_money")
    private Long compenMoney;
    /**
     * 内容
     */
    private String content;
    /**
     * 凭证 图片数组
     */
    private String credence;


    public Long getId() {
        return id;
    }

    public AuctionFakeCompensateInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getOrderId() {
        return orderId;
    }

    public AuctionFakeCompensateInfo setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public AuctionFakeCompensateInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getEndTime() {
        return endTime;
    }

    public AuctionFakeCompensateInfo setEndTime(Date endTime) {
        this.endTime = endTime;
        return this;
    }

    public Date getCancelTime() {
        return cancelTime;
    }

    public AuctionFakeCompensateInfo setCancelTime(Date cancelTime) {
        this.cancelTime = cancelTime;
        return this;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public AuctionFakeCompensateInfo setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public AuctionFakeCompensateInfo setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public Long getCompenMoney() {
        return compenMoney;
    }

    public AuctionFakeCompensateInfo setCompenMoney(Long compenMoney) {
        this.compenMoney = compenMoney;
        return this;
    }

    public String getContent() {
        return content;
    }

    public AuctionFakeCompensateInfo setContent(String content) {
        if (content != null)
            content = content.trim();
        this.content = content;
        return this;
    }

    public String getCredence() {
        return credence;
    }

    public AuctionFakeCompensateInfo setCredence(String credence) {
        if (credence != null)
            credence = credence.trim();
        this.credence = credence;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_fake_compensate_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 所属订单
     */
    public static final String ORDER_ID = "order_id";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 同意时间
     */
    public static final String END_TIME = "end_time";

    /**
     * 取消时间
     */
    public static final String CANCEL_TIME = "cancel_time";

    /**
     * 更新时间
     */
    public static final String UPDATE_TIME = "update_time";

    /**
     * 状态 1-申请中 2-同意赔付  4-取消赔付
     */
    public static final String STATUS = "status";

    /**
     * 赔付金额(单位:分)
     */
    public static final String COMPEN_MONEY = "compen_money";

    /**
     * 内容
     */
    public static final String CONTENT = "content";

    /**
     * 凭证 图片数组
     */
    public static final String CREDENCE = "credence";


    @Override
    public AuctionFakeCompensateInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

