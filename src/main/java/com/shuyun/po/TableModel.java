package com.shuyun.po;

public class TableModel {
    private String id;

    private String tableNameChn;

    private String tableNameEng;

    private String describes;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTableNameChn() {
        return tableNameChn;
    }

    public void setTableNameChn(String tableNameChn) {
        this.tableNameChn = tableNameChn == null ? null : tableNameChn.trim();
    }

    public String getTableNameEng() {
        return tableNameEng;
    }

    public void setTableNameEng(String tableNameEng) {
        this.tableNameEng = tableNameEng == null ? null : tableNameEng.trim();
    }

    public String getDescribes() {
        return describes;
    }

    public void setDescribes(String describes) {
        this.describes = describes == null ? null : describes.trim();
    }
}