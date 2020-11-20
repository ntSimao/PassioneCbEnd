package org.PassioneCourier.group2.entity.operation;

public class Delivery {

    private String deliveryNo;
    private String route;
    private int distance;
    private int stops;

    private String driverID;
    private String vehicleID;

    protected Delivery() {
    }

    public Delivery(Builder b) {
        this.deliveryNo = b.deliveryNo;
        this.route = b.route;
        this.distance = b.distance;
        this.stops = b.stops;
        this.driverID = b.driverID;
        this.vehicleID = b.vehicleID;
    }

    public String getDeliveryNo() {
        return deliveryNo;
    }

    public String getRoute() {
        return route;
    }

    public int getDistance() {
        return distance;
    }

    public int getStops() {
        return stops;
    }

    public String getDriverID() {
        return driverID;
    }

    public String getVehicleID() {
        return vehicleID;
    }

    public static class Builder{

        private String deliveryNo;
        private String route;
        private int distance;
        private int stops;

        private String driverID;
        private String vehicleID;

        public Builder setDeliveryNo(String deliveryNo) {
            this.deliveryNo = deliveryNo;
            return this;
        }

        public Builder setRoute(String route) {
            this.route = route;
            return this;
        }

        public Builder setDistance(int distance) {
            this.distance = distance;
            return this;
        }

        public Builder setStops(int stops) {
            this.stops = stops;
            return this;
        }

        public Builder setDriverID(String driverID) {
            this.driverID = driverID;
            return this;
        }

        public Builder setVehicleID(String vehicleID) {
            this.vehicleID = vehicleID;
            return this;
        }

        public Builder copy(Delivery d){

            this.deliveryNo = d.deliveryNo;
            this.route = d.route;
            this.distance = d.distance;
            this.stops = d.stops;
            this.driverID = d.driverID;
            this.vehicleID = d.vehicleID;

            return this;
        }

        public Delivery build(){ return new Delivery(this); }

    }

}
