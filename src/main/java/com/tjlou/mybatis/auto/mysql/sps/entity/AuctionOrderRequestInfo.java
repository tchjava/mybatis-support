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
 * 拍卖-订单申请延迟表
 * </p>
 *
 * @author Gaby
 * @since 2020-06-22
 */
@TableName("auction_order_request_info")
public class AuctionOrderRequestInfo implements Serializable, IEntity {


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
     * 所属订单
     */
    @TableField("order_id")
    private Long orderId;
    /**
     * 申请状态  1-申请 2-同意 4-拒绝 8-取消
     */
    private Integer status;
    /**
     * 请求类型  1-申请延迟  2-申请当面交易  4-申请延迟发货  8-申请延迟收货
     */
    @TableField("request_type")
    private Integer requestType;
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


    public Long getId() {
        return id;
    }

    public AuctionOrderRequestInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public AuctionOrderRequestInfo setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Long getOrderId() {
        return orderId;
    }

    public AuctionOrderRequestInfo setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public AuctionOrderRequestInfo setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public Integer getRequestType() {
        return requestType;
    }

    public AuctionOrderRequestInfo setRequestType(Integer requestType) {
        this.requestType = requestType;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public AuctionOrderRequestInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public AuctionOrderRequestInfo setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_order_request_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 所属用户
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 所属订单
     */
    public static final String ORDER_ID = "order_id";

    /**
     * 申请状态  1-申请 2-同意 4-拒绝 8-取消
     */
    public static final String STATUS = "status";

    /**
     * 请求类型  1-申请延迟  2-申请当面交易  4-申请延迟发货  8-申请延迟收货
     */
    public static final String REQUEST_TYPE = "request_type";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 修改时间
     */
    public static final String MODIFY_TIME = "modify_time";


    @Override
    public AuctionOrderRequestInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

