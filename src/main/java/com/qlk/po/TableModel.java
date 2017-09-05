package com.qlk.po;

/**
 * 表模型
 */
public class TableModel {
    private String id;
    private String tableNameChn;
    private String tableNameEng;
    private String describes;

    @Override
    public String toString() {
        return "TableModel{" +
                "id='" + id + '\'' +
                ", tableNameChn='" + tableNameChn + '\'' +
                ", tableNameEng='" + tableNameEng + '\'' +
                ", describes='" + describes + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTableNameChn() {
        return tableNameChn;
    }

    public void setTableNameChn(String tableNameChn) {
        this.tableNameChn = tableNameChn;
    }

    public String getTableNameEng() {
        return tableNameEng;
    }

    public void setTableNameEng(String tableNameEng) {
        this.tableNameEng = tableNameEng;
    }

    public String getDescribes() {
        return describes;
    }

    public void setDescribes(String describes) {
        this.describes = describes;
    }
}
