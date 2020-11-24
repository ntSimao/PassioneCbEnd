package org.PassioneCourier.group2.entity.asset;

import org.apache.maven.model.Build;
/**==============
 *
 * Description:Concrete Entity for Vehicle
 * Author(s): Justin Jenecke,
 * Date: 20/11/2020
 *
 ================*/

public class Vehicle {

    private String ID;
    private String vehicleCode;
    private String vehicleKm;

    //private String driverID;
    private String deviceID;

    protected Vehicle() {
    }

    public Vehicle(Builder b) {

        this.ID = b.ID;
        this.vehicleCode = b.vehicleCode;
        this.vehicleKm = b.vehicleKm;
      //  this.driverID = b.driverID;
        this.deviceID = b.deviceID;
    }

    public String getID() {
        return ID;
    }

    public String getVehicleCode() {
        return vehicleCode;
    }

    public String getVehicleKm() {
        return vehicleKm;
    }

   /* public String getDriverID() {
        return driverID;
    }*/

    public String getDeviceID() {
        return deviceID;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "ID='" + ID + '\'' +
                ", vehicleCode='" + vehicleCode + '\'' +
                ", vehicleKm='" + vehicleKm + '\'' +
               // ", driverID='" + driverID + '\'' +
                ", deviceID='" + deviceID + '\'' +
                '}';
    }

    // ------  public static inner class  ------
    public static class Builder{

        private String ID;
        private String vehicleCode;
        private String vehicleKm;

        private String driverID;
        private String deviceID;

        public Builder setID(String ID) {
            this.ID = ID;
            return this;
        }

        public Builder setVehicleCode(String vehicleCode) {
            this.vehicleCode = vehicleCode;
            return this;
        }

        public Builder setVehicleKm(String vehicleKm) {
            this.vehicleKm = vehicleKm;
            return this;
        }
        /*
        public Builder setDriverID(String driverID) {
            this.driverID = driverID;
            return this;
        }*/

        public Builder setDeviceID(String deviceID) {
            this.deviceID = deviceID;
            return this;
        }

        public Builder copy(Vehicle v) {

            this.ID = v.ID;
            this.vehicleCode = v.vehicleCode;
            this.vehicleKm = v.vehicleKm;
            //this.driverID = v.driverID;
            this.deviceID = v.deviceID;

            return this;

        }

        public  Vehicle build(){

            return new Vehicle(this);
        }

    }

}
