package com.tjlou.mybatis.auto.mysql.weipai.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 微信机器人运行实例表
 * </p>
 *
 * @author Gaby
 * @since 2019-04-11
 */
@TableName("wpt_robot_run")
public class WptRobotRun implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.INPUT)
    private Long id;
    /**
     * 机器人标识
     */
    @TableField("robot_id")
    private Long robotId;
    /**
     * 机器人名称
     */
    private String name;
    /**
     * 上线时间
     */
    @TableField("start_time")
    private Date startTime;
    /**
     * 下线时间
     */
    @TableField("end_time")
    private Date endTime;
    /**
     * 状态 00A-上线中 00B-已下线
     */
    private String status;

    public Long getId() {
        return id;
    }

    public WptRobotRun setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getRobotId() {
        return robotId;
    }

    public WptRobotRun setRobotId(Long robotId) {
        this.robotId = robotId;
        return this;
    }

    public String getName() {
        return name;
    }

    public WptRobotRun setName(String name) {
        if (name != null)
            name = name.trim();
        this.name = name;
        return this;
    }

    public Date getStartTime() {
        return startTime;
    }

    public WptRobotRun setStartTime(Date startTime) {
        this.startTime = startTime;
        return this;
    }

    public Date getEndTime() {
        return endTime;
    }

    public WptRobotRun setEndTime(Date endTime) {
        this.endTime = endTime;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public WptRobotRun setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "wpt_robot_run";
    public static final String ID = "id";

    /**
     * 机器人标识
     */
    public static final String ROBOT_ID = "robot_id";

    /**
     * 机器人名称
     */
    public static final String NAME = "name";

    /**
     * 上线时间
     */
    public static final String START_TIME = "start_time";

    /**
     * 下线时间
     */
    public static final String END_TIME = "end_time";

    /**
     * 状态 00A-上线中 00B-已下线
     */
    public static final String STATUS = "status";

    @Override
    public WptRobotRun pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

