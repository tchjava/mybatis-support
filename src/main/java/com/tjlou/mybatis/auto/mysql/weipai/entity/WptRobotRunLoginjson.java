package com.tjlou.mybatis.auto.mysql.weipai.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 机器运行实例loginJson信息表
 * </p>
 *
 * @author Gaby
 * @since 2019-04-11
 */
@TableName("wpt_robot_run_loginjson")
public class WptRobotRunLoginjson implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.INPUT)
    private Long id;
    /**
     * 机器运行实例标识
     */
    @TableField("run_id")
    private Long runId;
    /**
     * loginJson数据  json格式
     */
    @TableField("data_json")
    private String dataJson;

    public Long getId() {
        return id;
    }

    public WptRobotRunLoginjson setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getRunId() {
        return runId;
    }

    public WptRobotRunLoginjson setRunId(Long runId) {
        this.runId = runId;
        return this;
    }

    public String getDataJson() {
        return dataJson;
    }

    public WptRobotRunLoginjson setDataJson(String dataJson) {
        if (dataJson != null)
            dataJson = dataJson.trim();
        this.dataJson = dataJson;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "wpt_robot_run_loginjson";
    public static final String ID = "id";

    /**
     * 机器运行实例标识
     */
    public static final String RUN_ID = "run_id";

    /**
     * loginJson数据  json格式
     */
    public static final String DATA_JSON = "data_json";

    @Override
    public WptRobotRunLoginjson pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

