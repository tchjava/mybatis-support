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
 * 用户修改信息日志
 * </p>
 *
 * @author Gaby
 * @since 2020-06-12
 */
@TableName("user_update_log")
public class UserUpdateLog implements Serializable, IEntity {


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
     * 类型  1-修改手机号  2-修改昵称  3-修改身份证
     */
    private Integer type;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 项目类型 1-超级仓库  2-拍卖
     */
    @TableField("project_type")
    private Integer projectType;


    public Long getId() {
        return id;
    }

    public UserUpdateLog setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public UserUpdateLog setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public UserUpdateLog setType(Integer type) {
        this.type = type;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public UserUpdateLog setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Integer getProjectType() {
        return projectType;
    }

    public UserUpdateLog setProjectType(Integer projectType) {
        this.projectType = projectType;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "user_update_log";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 所属用户
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 类型  1-修改手机号  2-修改昵称  3-修改身份证
     */
    public static final String TYPE = "type";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 项目类型 1-超级仓库  2-拍卖
     */
    public static final String PROJECT_TYPE = "project_type";


    @Override
    public UserUpdateLog pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

