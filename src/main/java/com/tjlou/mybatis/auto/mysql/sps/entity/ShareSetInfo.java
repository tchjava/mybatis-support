package com.tjlou.mybatis.auto.mysql.sps.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.tjlou.mybatis.base.entity.IEntity;

import java.io.Serializable;

/**
 * <p>
 * 分享设置表
 * </p>
 *
 * @author Gaby
 * @since 2020-02-05
 */
@TableName("share_set_info")
public class ShareSetInfo implements Serializable, IEntity {

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 用户标识
     */
    @TableField("user_account_id")
    private Long userAccountId;
    /**
     * 前缀开启
     */
    @TableField("prefix_set")
    private Integer prefixSet;
    /**
     * 前缀内容
     */
    @TableField("prefix_content")
    private String prefixContent;
    /**
     * 后缀开启
     */
    @TableField("suffix_set")
    private Integer suffixSet;
    /**
     * 后缀内容
     */
    @TableField("suffix_content")
    private String suffixContent;
    /**
     * 价格设置开启
     */
    private Integer price;
    /**
     * 价格设置内容  json格式
     */
    @TableField("price_content")
    private String priceContent;

    public Long getId() {
        return id;
    }

    public ShareSetInfo setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getUserAccountId() {
        return userAccountId;
    }

    public ShareSetInfo setUserAccountId(Long userAccountId) {
        this.userAccountId = userAccountId;
        return this;
    }

    public Integer getPrefixSet() {
        return prefixSet;
    }

    public ShareSetInfo setPrefixSet(Integer prefixSet) {
        this.prefixSet = prefixSet;
        return this;
    }

    public String getPrefixContent() {
        return prefixContent;
    }

    public ShareSetInfo setPrefixContent(String prefixContent) {
        if (prefixContent != null)
            prefixContent = prefixContent.trim();
        this.prefixContent = prefixContent;
        return this;
    }

    public Integer getSuffixSet() {
        return suffixSet;
    }

    public ShareSetInfo setSuffixSet(Integer suffixSet) {
        this.suffixSet = suffixSet;
        return this;
    }

    public String getSuffixContent() {
        return suffixContent;
    }

    public ShareSetInfo setSuffixContent(String suffixContent) {
        if (suffixContent != null)
            suffixContent = suffixContent.trim();
        this.suffixContent = suffixContent;
        return this;
    }

    public Integer getPrice() {
        return price;
    }

    public ShareSetInfo setPrice(Integer price) {
        this.price = price;
        return this;
    }

    public String getPriceContent() {
        return priceContent;
    }

    public ShareSetInfo setPriceContent(String priceContent) {
        if (priceContent != null)
            priceContent = priceContent.trim();
        this.priceContent = priceContent;
        return this;
    }

    /**
     * 表名
     */
    public static final String TABLE_NAME = "share_set_info";
    /**
     * 主键
     */
    public static final String ID = "id";

    /**
     * 用户标识
     */
    public static final String USER_ACCOUNT_ID = "user_account_id";

    /**
     * 前缀开启
     */
    public static final String PREFIX_SET = "prefix_set";

    /**
     * 前缀内容
     */
    public static final String PREFIX_CONTENT = "prefix_content";

    /**
     * 后缀开启
     */
    public static final String SUFFIX_SET = "suffix_set";

    /**
     * 后缀内容
     */
    public static final String SUFFIX_CONTENT = "suffix_content";

    /**
     * 价格设置开启
     */
    public static final String PRICE = "price";

    /**
     * 价格设置内容  json格式
     */
    public static final String PRICE_CONTENT = "price_content";

    @Override
    public ShareSetInfo pkVal(Serializable val) {
        this.id = Long.valueOf(val.toString());
        return this;
    }
}

