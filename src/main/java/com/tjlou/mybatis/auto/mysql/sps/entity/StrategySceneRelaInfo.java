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
 * 学堂场景关联信息表
 * </p>
 *
 * @author Gaby
 * @since 2020-07-17
 */
@TableName("strategy_scene_rela_info")
public class StrategySceneRelaInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 重定向类型  1-跳转富文本  2-跳转h5
     */
    @TableField("redirect_type")
    private Integer redirectType;
    /**
     * 业务场景 1-交易服务用户协议 2-交易服务协议 3-隐私保护政策 4-出价补贴说明 5-购买补贴说明
     */
    private Integer scene;
    /**
     * 学堂标识
     */
    @TableField("strategy_id")
    private Long strategyId;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 系统类型  1-超级仓库  2-拍卖
     */
    @TableField("system_type")
    private Integer systemType;


    public Long getId() {
        return id;
    }

    public StrategySceneRelaInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Integer getRedirectType() {
        return redirectType;
    }

    public StrategySceneRelaInfo setRedirectType(Integer redirectType) {
        this.redirectType = redirectType;
        return this;
    }

    public Integer getScene() {
        return scene;
    }

    public StrategySceneRelaInfo setScene(Integer scene) {
        this.scene = scene;
        return this;
    }

    public Long getStrategyId() {
        return strategyId;
    }

    public StrategySceneRelaInfo setStrategyId(Long strategyId) {
        this.strategyId = strategyId;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public StrategySceneRelaInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Integer getSystemType() {
        return systemType;
    }

    public StrategySceneRelaInfo setSystemType(Integer systemType) {
        this.systemType = systemType;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "strategy_scene_rela_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 重定向类型  1-跳转富文本  2-跳转h5
     */
    public static final String REDIRECT_TYPE = "redirect_type";

    /**
     * 业务场景 1-交易服务用户协议 2-交易服务协议 3-隐私保护政策 4-出价补贴说明 5-购买补贴说明
     */
    public static final String SCENE = "scene";

    /**
     * 学堂标识
     */
    public static final String STRATEGY_ID = "strategy_id";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 系统类型  1-超级仓库  2-拍卖
     */
    public static final String SYSTEM_TYPE = "system_type";


    @Override
    public StrategySceneRelaInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

