package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 拍卖用户表(原拓展表)
 * </p>
 *
 * @author Gaby
 * @since 2020-08-20
 */
@TableName("auction_user_info")
public class AuctionUserInfo implements Serializable, IEntity {


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
     * 个性签名
     */
    @TableField("personal_sign")
    private String personalSign;


    public Long getId() {
        return id;
    }

    public AuctionUserInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public AuctionUserInfo setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public String getPersonalSign() {
        return personalSign;
    }

    public AuctionUserInfo setPersonalSign(String personalSign) {
        if (personalSign != null)
            personalSign = personalSign.trim();
        this.personalSign = personalSign;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_user_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 所属用户
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 个性签名
     */
    public static final String PERSONAL_SIGN = "personal_sign";


    @Override
    public AuctionUserInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

