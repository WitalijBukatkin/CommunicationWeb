package ru.argustelecom.task.witalijbukatkin.communicationnetwork.to;

public class NodeTo {
    private Long id;
    private String name;
    private String region;
    private String street;
    private String house;
    private long connectorsCount;
    private long pointsCount;
    private long pointsBusy;

    public NodeTo(Long id, String name, String region, String street, String house, long connectorsCount, long pointsCount, long pointsBusy) {
        this.id = id;
        this.name = name;
        this.region = region;
        this.street = street;
        this.house = house;
        this.connectorsCount = connectorsCount;
        this.pointsCount = pointsCount;
        this.pointsBusy = pointsBusy;
    }

    public NodeTo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public long getConnectorsCount() {
        return connectorsCount;
    }

    public void setConnectorsCount(long connectorsCount) {
        this.connectorsCount = connectorsCount;
    }

    public long getPointsCount() {
        return pointsCount;
    }

    public void setPointsCount(long pointsCount) {
        this.pointsCount = pointsCount;
    }

    public long getPointsBusy() {
        return pointsBusy;
    }

    public void setPointsBusy(long pointsBusy) {
        this.pointsBusy = pointsBusy;
    }

    public long getPointsFree() {
        return pointsCount - pointsBusy;
    }

    @Override
    public String toString() {
        return "NodeTo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", region='" + region + '\'' +
                ", street='" + street + '\'' +
                ", house=" + house +
                ", connectorsCount=" + connectorsCount +
                ", pointsCount=" + pointsCount +
                ", pointsBusy=" + pointsBusy +
                ", pointsFree=" + getPointsFree() +
                '}';
    }
}
