package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 拍卖用户维度表
 * </p>
 *
 * @author Gaby
 * @since 2020-08-12
 */
@TableName("auction_user_dimension_info")
public class AuctionUserDimensionInfo implements Serializable, IEntity {


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
     * 专属粉丝
     */
    private Long exclusiveNum;
    /**
     * 关注粉丝
     */
    private Long followNum;
    /**
     * 拓展字段
     */
    @TableField("attr_1")
    private Long attr1;
    /**
     * 拓展字段
     */
    @TableField("attr_2")
    private Long attr2;
    /**
     * 拓展字段
     */
    @TableField("attr_3")
    private Long attr3;
    /**
     * 拓展字段
     */
    @TableField("attr_4")
    private Long attr4;
    /**
     * 拓展字段
     */
    @TableField("attr_5")
    private Long attr5;
    /**
     * 拓展字段
     */
    @TableField("attr_6")
    private Long attr6;
    /**
     * 拓展字段
     */
    @TableField("attr_7")
    private Long attr7;
    /**
     * 拓展字段
     */
    @TableField("attr_8")
    private Long attr8;
    /**
     * 拓展字段
     */
    @TableField("attr_9")
    private Long attr9;


    public Long getId() {
        return id;
    }

    public AuctionUserDimensionInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public AuctionUserDimensionInfo setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Long getExclusiveNum() {
        return exclusiveNum;
    }

    public AuctionUserDimensionInfo setExclusiveNum(Long exclusiveNum) {
        this.exclusiveNum = exclusiveNum;
        return this;
    }

    public Long getFollowNum() {
        return followNum;
    }

    public AuctionUserDimensionInfo setFollowNum(Long followNum) {
        this.followNum = followNum;
        return this;
    }

    public Long getAttr1() {
        return attr1;
    }

    public AuctionUserDimensionInfo setAttr1(Long attr1) {
        this.attr1 = attr1;
        return this;
    }

    public Long getAttr2() {
        return attr2;
    }

    public AuctionUserDimensionInfo setAttr2(Long attr2) {
        this.attr2 = attr2;
        return this;
    }

    public Long getAttr3() {
        return attr3;
    }

    public AuctionUserDimensionInfo setAttr3(Long attr3) {
        this.attr3 = attr3;
        return this;
    }

    public Long getAttr4() {
        return attr4;
    }

    public AuctionUserDimensionInfo setAttr4(Long attr4) {
        this.attr4 = attr4;
        return this;
    }

    public Long getAttr5() {
        return attr5;
    }

    public AuctionUserDimensionInfo setAttr5(Long attr5) {
        this.attr5 = attr5;
        return this;
    }

    public Long getAttr6() {
        return attr6;
    }

    public AuctionUserDimensionInfo setAttr6(Long attr6) {
        this.attr6 = attr6;
        return this;
    }

    public Long getAttr7() {
        return attr7;
    }

    public AuctionUserDimensionInfo setAttr7(Long attr7) {
        this.attr7 = attr7;
        return this;
    }

    public Long getAttr8() {
        return attr8;
    }

    public AuctionUserDimensionInfo setAttr8(Long attr8) {
        this.attr8 = attr8;
        return this;
    }

    public Long getAttr9() {
        return attr9;
    }

    public AuctionUserDimensionInfo setAttr9(Long attr9) {
        this.attr9 = attr9;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_user_dimension_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 所属用户
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 专属粉丝
     */
    public static final String EXCLUSIVENUM = "exclusiveNum";

    /**
     * 关注粉丝
     */
    public static final String FOLLOWNUM = "followNum";

    /**
     * 拓展字段
     */
    public static final String ATTR_1 = "attr_1";

    /**
     * 拓展字段
     */
    public static final String ATTR_2 = "attr_2";

    /**
     * 拓展字段
     */
    public static final String ATTR_3 = "attr_3";

    /**
     * 拓展字段
     */
    public static final String ATTR_4 = "attr_4";

    /**
     * 拓展字段
     */
    public static final String ATTR_5 = "attr_5";

    /**
     * 拓展字段
     */
    public static final String ATTR_6 = "attr_6";

    /**
     * 拓展字段
     */
    public static final String ATTR_7 = "attr_7";

    /**
     * 拓展字段
     */
    public static final String ATTR_8 = "attr_8";

    /**
     * 拓展字段
     */
    public static final String ATTR_9 = "attr_9";


    @Override
    public AuctionUserDimensionInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

