package org.PassioneCourier.group2.entity.employee;

/**==============
 *
 * Description:Concrete Entity for Vehicle
 * Author(s): Justin Jenecke, Yaseen Levy
 * Date: 20/11/2020
 *
 ================*/

public class Driver {

    private String driverID;
    private String firstName;
    private String lastName;
    private String licenceCode;

    private String phoneNo;
    private String address;

    //private String vehicleID;
    //private String helperID;

    protected Driver() {
    }

    private Driver(Builder builder) {

        this.driverID = builder.driverID;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.licenceCode = builder.licenceCode;
        this.phoneNo = builder.phoneNo;
        this.address = builder.address;
        //this.vehicleID = builder.vehicleID;
        //this.helperID = builder.helperID;
    }

    public String getDriverID() { return driverID; }

    public String getFirstName() { return firstName; }

    public String getLastName() { return lastName; }

    public String getLicenceCode() { return licenceCode; }

    public String getPhoneNo() { return phoneNo; }

    public String getAddress() { return address; }

    //public String getVehicleID() { return vehicleID; }

    //public String getHelperID() { return helperID; }

    @Override
    public String toString() {
        return "Driver{" +
                "driverID='" + driverID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", licenceCode='" + licenceCode + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", address='" + address + '\'' +
                //", vehicleID='" + vehicleID + '\'' +
                // ", helperID='" + helperID + '\'' +
                '}';
    }

    // ------  public static inner class  ------

    public static class Builder {

        private String driverID;
        private String firstName;
        private String lastName;
        private String licenceCode;

        private String phoneNo;
        private String address;

        //private String vehicleID;
        //private String helperID;

        public Builder setDriverID(String driverID) {
            this.driverID = driverID;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setLicenceCode(String licenceCode) {
            this.licenceCode = licenceCode;
            return this;
        }

        public Builder setPhoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        /*
        public Builder setVehicleID(String vehicleID) {
            this.vehicleID = vehicleID;
            return this;
        }


        public Builder setHelperID(String helperID) {
            this.helperID = helperID;
            return this;
        }
        */

        public Builder copy(Driver d) {

            this.driverID = d.driverID;
            this.firstName = d.firstName;
            this.lastName = d.lastName;
            this.licenceCode = d.licenceCode;
            this.phoneNo = d.phoneNo;
            this.address = d.address;
            //this.vehicleID = d.vehicleID;
            //this.helperID = d.helperID;

            return this;
        }

        public Driver build() {
            return new Driver(this);
        }

    }

}
