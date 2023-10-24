package com.example.demo.Models.Request;

import com.example.demo.Utils.TableType;

public class Table {

    private Integer capacity;
    private TableType type;

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public TableType getType() {
        return type;
    }

    public void setType(TableType type) {
        this.type = type;
    }
}
