/*
 * Copyright (c) 2020. Witalij Bukatkin
 * Github profile: https://github.com/witalijbukatkin
 */

package ru.argustelecom.task.witalijbukatkin.communicationnetwork.entity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.Set;

@Entity
public class Node extends NamedEntity {
    private String region;
    private String street;
    private String house;

    @OneToMany(mappedBy = "node")
    private Set<Connector> connectors;

    public Node(Long id, String name, String region, String street, String house, Set<Connector> connectors) {
        super(id, name);
        this.region = region;
        this.street = street;
        this.house = house;
        this.connectors = connectors;
    }

    public Node(String name, String region, String street, String house) {
        this(null, name, region, street, house, Set.of());
    }

    public Node(){
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public Set<Connector> getConnectors() {
        return connectors;
    }

    public void setConnectors(Set<Connector> connectors) {
        this.connectors = connectors;
    }

    @Override
    public String toString() {
        return "Node{" +
                "name=" + getName() +
                ", region='" + region + '\'' +
                ", street='" + street + '\'' +
                ", house=" + house +
                '}';
    }
}