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
 * @since 2019-12-30
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
    /**
     * 首页二维码
     */
    @TableField("home_qrcode")
    private String homeQrcode;
    /**
     * 代理申请二维码
     */
    @TableField("agent_qrcode")
    private String agentQrcode;


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

    public String getHomeQrcode() {
        return homeQrcode;
    }

    public UserExtInfo setHomeQrcode(String homeQrcode) {
        if (homeQrcode != null)
            homeQrcode = homeQrcode.trim();
        this.homeQrcode = homeQrcode;
        return this;
    }

    public String getAgentQrcode() {
        return agentQrcode;
    }

    public UserExtInfo setAgentQrcode(String agentQrcode) {
        if (agentQrcode != null)
            agentQrcode = agentQrcode.trim();
        this.agentQrcode = agentQrcode;
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

    /**
     * 首页二维码
     */
    public static final String HOME_QRCODE = "home_qrcode";

    /**
     * 代理申请二维码
     */
    public static final String AGENT_QRCODE = "agent_qrcode";


    @Override
    public UserExtInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

