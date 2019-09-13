package com.gaby.auto.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Gaby
 * @since 2019-09-14
 */
public class BaseDict extends Model<BaseDict> {

    private static final long serialVersionUID=1L;

    /**
     * 数据字典id(主键)
     */
    private String dictId;

    /**
     * 数据字典类别代码
     */
    private String dictTypeCode;

    /**
     * 数据字典类别名称
     */
    private String dictTypeName;

    /**
     * 数据字典项目名称
     */
    private String dictItemName;

    /**
     * 数据字典项目代码(可为空)
     */
    private String dictItemCode;

    /**
     * 排序字段
     */
    private Integer dictSort;

    /**
     * 1:使用 0:停用
     */
    private String dictEnable;

    /**
     * 备注
     */
    private String dictMemo;


    public String getDictId() {
        return dictId;
    }

    public void setDictId(String dictId) {
        this.dictId = dictId;
    }

    public String getDictTypeCode() {
        return dictTypeCode;
    }

    public void setDictTypeCode(String dictTypeCode) {
        this.dictTypeCode = dictTypeCode;
    }

    public String getDictTypeName() {
        return dictTypeName;
    }

    public void setDictTypeName(String dictTypeName) {
        this.dictTypeName = dictTypeName;
    }

    public String getDictItemName() {
        return dictItemName;
    }

    public void setDictItemName(String dictItemName) {
        this.dictItemName = dictItemName;
    }

    public String getDictItemCode() {
        return dictItemCode;
    }

    public void setDictItemCode(String dictItemCode) {
        this.dictItemCode = dictItemCode;
    }

    public Integer getDictSort() {
        return dictSort;
    }

    public void setDictSort(Integer dictSort) {
        this.dictSort = dictSort;
    }

    public String getDictEnable() {
        return dictEnable;
    }

    public void setDictEnable(String dictEnable) {
        this.dictEnable = dictEnable;
    }

    public String getDictMemo() {
        return dictMemo;
    }

    public void setDictMemo(String dictMemo) {
        this.dictMemo = dictMemo;
    }

    public static final String DICT_ID = "dict_id";

    public static final String DICT_TYPE_CODE = "dict_type_code";

    public static final String DICT_TYPE_NAME = "dict_type_name";

    public static final String DICT_ITEM_NAME = "dict_item_name";

    public static final String DICT_ITEM_CODE = "dict_item_code";

    public static final String DICT_SORT = "dict_sort";

    public static final String DICT_ENABLE = "dict_enable";

    public static final String DICT_MEMO = "dict_memo";

    @Override
    protected Serializable pkVal() {
        return this.dictId;
    }

    @Override
    public String toString() {
        return "BaseDict{" +
        "dictId=" + dictId +
        ", dictTypeCode=" + dictTypeCode +
        ", dictTypeName=" + dictTypeName +
        ", dictItemName=" + dictItemName +
        ", dictItemCode=" + dictItemCode +
        ", dictSort=" + dictSort +
        ", dictEnable=" + dictEnable +
        ", dictMemo=" + dictMemo +
        "}";
    }
}
