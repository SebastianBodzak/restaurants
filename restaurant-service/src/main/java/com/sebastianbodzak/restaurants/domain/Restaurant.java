package com.sebastianbodzak.restaurants.domain;

import java.util.List;

public class Restaurant extends BaseEntity<String> {

    private List<Table> tables;

    public Restaurant(String id, String name, List<Table> tables) {
        super(id, name);
        this.tables = tables;
    }

    public List<Table> getTables() {
        return tables;
    }

    public void setTables(List<Table> tables) {
        this.tables = tables;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                " id=" + id +
                " name=" + name +
                " tables=" + tables +
                '}';
    }
}
