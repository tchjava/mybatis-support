package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 举报拓展信息
 * </p>
 *
 * @author Gaby
 * @since 2020-07-18
 */
@TableName("auction_report_ext_info")
public class AuctionReportExtInfo implements Serializable, IEntity {


    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 所属举报信息
     */
    @TableField("report_id")
    private Long reportId;
    /**
     * 举报内容
     */
    private String content;
    /**
     * 凭证 含图片以及视频 默认{}
     */
    private String credence;


    public Long getId() {
        return id;
    }

    public AuctionReportExtInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getReportId() {
        return reportId;
    }

    public AuctionReportExtInfo setReportId(Long reportId) {
        this.reportId = reportId;
        return this;
    }

    public String getContent() {
        return content;
    }

    public AuctionReportExtInfo setContent(String content) {
        if (content != null)
            content = content.trim();
        this.content = content;
        return this;
    }

    public String getCredence() {
        return credence;
    }

    public AuctionReportExtInfo setCredence(String credence) {
        if (credence != null)
            credence = credence.trim();
        this.credence = credence;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "auction_report_ext_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 所属举报信息
     */
    public static final String REPORT_ID = "report_id";

    /**
     * 举报内容
     */
    public static final String CONTENT = "content";

    /**
     * 凭证 含图片以及视频 默认{}
     */
    public static final String CREDENCE = "credence";


    @Override
    public AuctionReportExtInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

