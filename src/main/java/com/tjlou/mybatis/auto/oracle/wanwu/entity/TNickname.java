package com.tjlou.mybatis.auto.oracle.wanwu.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * ${table.comment}
 * </p>
 *
 * @author Gaby
 * @since 2020-04-23
 */
@TableName("T_NICKNAME")
public class TNickname implements Serializable, IEntity {


    @TableField("NICKNAME")
    private String nickname;
    @TableField("STATE")
    private String state;


    public String getNickname() {
        return nickname;
    }

    public TNickname setNickname(String nickname) {
        if (nickname != null)
            nickname = nickname.trim();
        this.nickname = nickname;
        return this;
    }

    public String getState() {
        return state;
    }

    public TNickname setState(String state) {
        if (state != null)
            state = state.trim();
        this.state = state;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "T_NICKNAME";
    public static final String NICKNAME = "NICKNAME";

    public static final String STATE = "STATE";


    @Override
    public TNickname pkVal(Serializable val) {
        return this;
    }
}

