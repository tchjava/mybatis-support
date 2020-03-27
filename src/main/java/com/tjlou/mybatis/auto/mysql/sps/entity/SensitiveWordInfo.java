package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 敏感词汇信息表
 * </p>
 *
 * @author Gaby
 * @since 2020-03-27
 */
@TableName("sensitive_word_info")
public class SensitiveWordInfo implements Serializable, IEntity {


    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 敏感词
     */
    private String word;
    /**
     * 类型 1：标题  2-描述  4-昵称 8-聊天内容
     */
    private Integer type;
    /**
     * 小写敏感词
     */
    @TableField("lower_word")
    private String lowerWord;


    public Long getId() {
        return id;
    }

    public SensitiveWordInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public String getWord() {
        return word;
    }

    public SensitiveWordInfo setWord(String word) {
        if (word != null)
            word = word.trim();
        this.word = word;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public SensitiveWordInfo setType(Integer type) {
        this.type = type;
        return this;
    }

    public String getLowerWord() {
        return lowerWord;
    }

    public SensitiveWordInfo setLowerWord(String lowerWord) {
        if (lowerWord != null)
            lowerWord = lowerWord.trim();
        this.lowerWord = lowerWord;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "sensitive_word_info";
    public static final String ID = "id";

    /**
     * 敏感词
     */
    public static final String WORD = "word";

    /**
     * 类型 1：标题  2-描述  4-昵称 8-聊天内容
     */
    public static final String TYPE = "type";

    /**
     * 小写敏感词
     */
    public static final String LOWER_WORD = "lower_word";


    @Override
    public SensitiveWordInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

