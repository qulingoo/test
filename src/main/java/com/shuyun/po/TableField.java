package com.shuyun.po;

import java.sql.Types;

/**
 * 表字段
 */
public class TableField {
    private String id;//标识
    private String fieldNameChn;//字段中文名
    private String fieldNameEnd;//字段英文名
    private int type = Types.VARCHAR;//字段类型
    private String length;//长度
    private String accuracy;//精度

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getFieldNameChn() {
        return fieldNameChn;
    }

    public void setFieldNameChn(String fieldNameChn) {
        this.fieldNameChn = fieldNameChn;
    }

    public String getFieldNameEnd() {
        return fieldNameEnd;
    }

    public void setFieldNameEnd(String fieldNameEnd) {
        this.fieldNameEnd = fieldNameEnd;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(String accuracy) {
        this.accuracy = accuracy;
    }
}
