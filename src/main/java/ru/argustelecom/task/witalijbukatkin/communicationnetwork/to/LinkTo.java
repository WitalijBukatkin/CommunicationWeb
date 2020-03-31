/*
 * Copyright (c) 2020. Witalij Bukatkin
 * Github profile: https://github.com/witalijbukatkin
 */

package ru.argustelecom.task.witalijbukatkin.communicationnetwork.to;

public class LinkTo {
    private Long id;
    private long sourceConnectorId;
    private int sourcePoint;
    private long targetConnectorId;
    private int targetPoint;

    public LinkTo(Long id, Long sourceConnectorId, int sourcePoint, Long targetConnectorId, int targetPoint) {
        this.id = id;
        this.sourceConnectorId = sourceConnectorId;
        this.sourcePoint = sourcePoint;
        this.targetConnectorId = targetConnectorId;
        this.targetPoint = targetPoint;
    }

    public LinkTo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getSourceConnectorId() {
        return sourceConnectorId;
    }

    public void setSourceConnectorId(int sourceConnectorId) {
        this.sourceConnectorId = sourceConnectorId;
    }

    public int getSourcePoint() {
        return sourcePoint;
    }

    public void setSourcePoint(int sourcePoint) {
        this.sourcePoint = sourcePoint;
    }

    public long getTargetConnectorId() {
        return targetConnectorId;
    }

    public void setTargetConnectorId(int targetConnectorId) {
        this.targetConnectorId = targetConnectorId;
    }

    public int getTargetPoint() {
        return targetPoint;
    }

    public void setTargetPoint(int targetPoint) {
        this.targetPoint = targetPoint;
    }

    @Override
    public String toString() {
        return "LinkTo{" +
                "id=" + id +
                ", sourceConnectorId=" + sourceConnectorId +
                ", sourcePoint=" + sourcePoint +
                ", targetConnectorId=" + targetConnectorId +
                ", targetPoint=" + targetPoint +
                '}';
    }
}
