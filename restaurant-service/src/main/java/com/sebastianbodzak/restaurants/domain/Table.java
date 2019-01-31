package com.sebastianbodzak.restaurants.domain;

import java.math.BigInteger;

public class Table extends BaseEntity<BigInteger> {

    private int capacity;

    public Table(BigInteger id, String name, int capacity) {
        super(id, name);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Table{" +
                " id=" + id +
                " name=" + name +
                " capacity=" + capacity +
                '}';
    }
}
