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
 * 拍品收藏信息表
 * </p>
 *
 * @author Gaby
 * @since 2020-06-05
 */
@TableName("auction_collect_info")
public class AuctionCollectInfo implements Serializable, IEntity {


    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 用户标识
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 拍品实例标识
     */
    @TableField("product_instance_id")
    private Long productInstanceId;
    /**
     * 发拍者
     */
    @TableField("product_account_id")
    private Long productAccountId;
    /**
     * 状态 00A-已收藏 00Z-已取消
     */
    private String status;
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

    public AuctionCollectInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public AuctionCollectInfo setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Long getProductInstanceId() {
        return productInstanceId;
    }

    public AuctionCollectInfo setProductInstanceId(Long productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }

    public Long getProductAccountId() {
        return productAccountId;
    }

    public AuctionCollectInfo setProductAccountId(Long productAccountId) {
        this.productAccountId = productAccountId;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public AuctionCollectInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public AuctionCollectInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public AuctionCollectInfo setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_collect_info";
    public static final String ID = "id";

    /**
     * 用户标识
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 拍品实例标识
     */
    public static final String PRODUCT_INSTANCE_ID = "product_instance_id";

    /**
     * 发拍者
     */
    public static final String PRODUCT_ACCOUNT_ID = "product_account_id";

    /**
     * 状态 00A-已收藏 00Z-已取消
     */
    public static final String STATUS = "status";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 修改时间
     */
    public static final String MODIFY_TIME = "modify_time";


    @Override
    public AuctionCollectInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

