package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 直播行为信息表
 * </p>
 *
 * @author Gaby
 * @since 2020-05-31
 */
@TableName("borrow_action_info")
public class BorrowActionInfo implements Serializable, IEntity {

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
     * 商品标识
     */
    @TableField("goods_id")
    private Long goodsId;
    /**
     * 数量
     */
    private Integer num;

    public Long getId() {
        return id;
    }

    public BorrowActionInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public BorrowActionInfo setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public BorrowActionInfo setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
        return this;
    }

    public Integer getNum() {
        return num;
    }

    public BorrowActionInfo setNum(Integer num) {
        this.num = num;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "borrow_action_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 用户标识
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 商品标识
     */
    public static final String GOODS_ID = "goods_id";

    /**
     * 数量
     */
    public static final String NUM = "num";

    @Override
    public BorrowActionInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

