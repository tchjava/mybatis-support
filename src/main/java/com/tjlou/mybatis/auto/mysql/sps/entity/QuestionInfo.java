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
 * 常见问题信息表
 * </p>
 *
 * @author Gaby
 * @since 2019-08-14
 */
@TableName("question_info")
public class QuestionInfo implements Serializable, IEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 问题
     */
    private String question;
    /**
     * 解答
     */
    private String answer;
    /**
     * 类型 1-金币
     */
    private Integer type;
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
     * 状态  00A-有效 00Z-失效
     */
    private String status;

    public Long getId() {
        return id;
    }

    public QuestionInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getQuestion() {
        return question;
    }

    public QuestionInfo setQuestion(String question) {
        if (question != null)
            question = question.trim();
        this.question = question;
        return this;
    }

    public String getAnswer() {
        return answer;
    }

    public QuestionInfo setAnswer(String answer) {
        if (answer != null)
            answer = answer.trim();
        this.answer = answer;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public QuestionInfo setType(Integer type) {
        this.type = type;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public QuestionInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public QuestionInfo setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public QuestionInfo setStatus(String status) {
        if (status != null)
            status = status.trim();
        this.status = status;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "question_info";
    public static final String ID = "id";

    /**
     * 问题
     */
    public static final String QUESTION = "question";

    /**
     * 解答
     */
    public static final String ANSWER = "answer";

    /**
     * 类型 1-金币
     */
    public static final String TYPE = "type";

    /**
     * 创建时间
     */
    public static final String CREATE_TIME = "create_time";

    /**
     * 修改时间
     */
    public static final String MODIFY_TIME = "modify_time";

    /**
     * 状态  00A-有效 00Z-失效
     */
    public static final String STATUS = "status";

    @Override
    public QuestionInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

