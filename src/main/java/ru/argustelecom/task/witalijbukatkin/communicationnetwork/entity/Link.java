/*
 * Copyright (c) 2020. Witalij Bukatkin
 * Github profile: https://github.com/witalijbukatkin
 */

package ru.argustelecom.task.witalijbukatkin.communicationnetwork.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Link extends BaseEntity {
    @ManyToOne
    private Connector sourceConnector;
    private int sourcePoint;

    @ManyToOne
    private Connector targetConnector;
    private int targetPoint;

    public Link(){
    }

    public Link(Connector sourceConnector, int sourcePoint, Connector targetConnector, int targetPoint) {
        this.sourceConnector = sourceConnector;
        this.sourcePoint = sourcePoint;
        this.targetConnector = targetConnector;
        this.targetPoint = targetPoint;
    }

    public Connector getSourceConnector() {
        return sourceConnector;
    }

    public void setSourceConnector(Connector sourceConnector) {
        this.sourceConnector = sourceConnector;
    }

    public int getSourcePoint() {
        return sourcePoint;
    }

    public void setSourcePoint(int sourcePoint) {
        this.sourcePoint = sourcePoint;
    }

    public Connector getTargetConnector() {
        return targetConnector;
    }

    public void setTargetConnector(Connector targetConnector) {
        this.targetConnector = targetConnector;
    }

    public int getTargetPoint() {
        return targetPoint;
    }

    public void setTargetPoint(int targetPoint) {
        this.targetPoint = targetPoint;
    }

    @Override
    public String toString() {
        return "Link{" +
                "sourcePoint=" + sourcePoint +
                ", targetPoint=" + targetPoint +
                ", sourceConnector=" + sourceConnector +
                ", targetConnector=" + targetConnector +
                '}';
    }
}
