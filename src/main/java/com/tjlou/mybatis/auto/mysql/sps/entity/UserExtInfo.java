package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 用户信息扩展表
 * </p>
 *
 * @author Gaby
 * @since 2019-09-03
 */
@TableName("user_ext_info")
public class UserExtInfo implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 抽奖次数
     */
    @TableField("prize_num")
    private Integer prizeNum;

    public Long getId() {
        return id;
    }

    public UserExtInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public UserExtInfo setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Integer getPrizeNum() {
        return prizeNum;
    }

    public UserExtInfo setPrizeNum(Integer prizeNum) {
        this.prizeNum = prizeNum;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "user_ext_info";
    public static final String ID = "id";

    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 抽奖次数
     */
    public static final String PRIZE_NUM = "prize_num";

    @Override
    public UserExtInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}
