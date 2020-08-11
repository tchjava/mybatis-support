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
 * 拍卖-推广信息表
 * </p>
 *
 * @author Gaby
 * @since 2020-08-10
 */
@TableName("auction_spread_info")
public class AuctionSpreadInfo implements Serializable, IEntity {


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
     * 类型  1-推荐粉丝 2-推荐商家 3-拍品详情  4-超级仓库商品详情  5-永久二维码
     */
    private Long type;
    /**
     * 二维码路径
     */
    private String qrcode;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 唯一key
     */
    private String key;


    public Long getId() {
        return id;
    }

    public AuctionSpreadInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public AuctionSpreadInfo setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Long getType() {
        return type;
    }

    public AuctionSpreadInfo setType(Long type) {
        this.type = type;
        return this;
    }

    public String getQrcode() {
        return qrcode;
    }

    public AuctionSpreadInfo setQrcode(String qrcode) {
        if (qrcode != null)
            qrcode = qrcode.trim();
        this.qrcode = qrcode;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public AuctionSpreadInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getKey() {
        return key;
    }

    public AuctionSpreadInfo setKey(String key) {
        if (key != null)
            key = key.trim();
        this.key = key;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_spread_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 所属用户
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 类型  1-推荐粉丝 2-推荐商家 3-拍品详情  4-超级仓库商品详情  5-永久二维码
     */
    public static final String TYPE = "type";

    /**
     * 二维码路径
     */
    public static final String QRCODE = "qrcode";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 唯一key
     */
    public static final String KEY = "key";


    @Override
    public AuctionSpreadInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

