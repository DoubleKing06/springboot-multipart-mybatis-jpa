package com.example.more.datasources.entity.zentao;


public class BugInfo {
    private String status;
    private int count;

    @Override
    public String toString() {
        return "BugInfo{" +
                "status='" + status + '\'' +
                ", count=" + count +
                '}';
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
