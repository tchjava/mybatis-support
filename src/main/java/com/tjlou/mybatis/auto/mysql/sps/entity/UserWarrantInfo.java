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
 * 拍卖-用户消保金
 * </p>
 *
 * @author Gaby
 * @since 2020-10-15
 */
@TableName("user_warrant_info")
public class UserWarrantInfo implements Serializable, IEntity {


    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 用户标识
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 总额
     */
    private Long balance;
    /**
     * 冻结额度
     */
    @TableField("thaw_balance")
    private Long thawBalance;
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
    /**
     * 备注
     */
    private String comment;
    /**
     * 信用额度 默认与可用余额一致
     */
    @TableField("credit_limit")
    private Long creditLimit;
    /**
     * 扩展内容
     */
    @TableField("extend_content")
    private String extendContent;
    /**
     * 开通的服务或满足条件
     */
    @TableField("open_service")
    private Long openService;


    public Long getId() {
        return id;
    }

    public UserWarrantInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public UserWarrantInfo setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Long getBalance() {
        return balance;
    }

    public UserWarrantInfo setBalance(Long balance) {
        this.balance = balance;
        return this;
    }

    public Long getThawBalance() {
        return thawBalance;
    }

    public UserWarrantInfo setThawBalance(Long thawBalance) {
        this.thawBalance = thawBalance;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public UserWarrantInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public UserWarrantInfo setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public UserWarrantInfo setComment(String comment) {
        if (comment != null)
            comment = comment.trim();
        this.comment = comment;
        return this;
    }

    public Long getCreditLimit() {
        return creditLimit;
    }

    public UserWarrantInfo setCreditLimit(Long creditLimit) {
        this.creditLimit = creditLimit;
        return this;
    }

    public String getExtendContent() {
        return extendContent;
    }

    public UserWarrantInfo setExtendContent(String extendContent) {
        if (extendContent != null)
            extendContent = extendContent.trim();
        this.extendContent = extendContent;
        return this;
    }

    public Long getOpenService() {
        return openService;
    }

    public UserWarrantInfo setOpenService(Long openService) {
        this.openService = openService;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "user_warrant_info";
    public static final String ID = "id";

    /**
     * 用户标识
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 总额
     */
    public static final String BALANCE = "balance";

    /**
     * 冻结额度
     */
    public static final String THAW_BALANCE = "thaw_balance";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 修改时间
     */
    public static final String MODIFY_TIME = "modify_time";

    /**
     * 备注
     */
    public static final String COMMENT = "comment";

    /**
     * 信用额度 默认与可用余额一致
     */
    public static final String CREDIT_LIMIT = "credit_limit";

    /**
     * 扩展内容
     */
    public static final String EXTEND_CONTENT = "extend_content";

    /**
     * 开通的服务或满足条件
     */
    public static final String OPEN_SERVICE = "open_service";


    @Override
    public UserWarrantInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

