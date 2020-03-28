/*
 * Copyright (c) 2020. Witalij Bukatkin
 * Github profile: https://github.com/witalijbukatkin
 */

package ru.argustelecom.task.witalijbukatkin.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Connector extends NamedEntity {
    @ManyToOne
    private Node node;

    private int capacity;

    public Connector() {
    }

    public Connector(Long id, String name, Node node, int capacity) {
        super(id, name);
        this.node = node;
        this.capacity = capacity;
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Connector{" +
                "name=" + getName() +
                ", node=" + node +
                ", capacity=" + capacity +
                '}';
    }
}
