package org.PassioneCourier.group2.entity.employee;

/**==============
 *
 * Description:Concrete Entity for Helper
 * Author(s): Justin Jenecke
 * Date: 20/11/2020
 *
 ================*/

public class Helper {

    private String helperID;
    private String firstName;
    private String lastName;

    private String phoneNo;
    private String address;

    //private String driverID;

    protected Helper() {
    }

    private Helper(Builder b) {
        this.helperID = b.helperID;
        this.firstName = b.firstName;
        this.lastName = b.lastName;
        this.phoneNo = b.phoneNo;
        this.address = b.address;
        //this.driverID = b.driverID;
    }

    public String getHelperID() {
        return helperID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getAddress() {
        return address;
    }

   /* public String getDriverID() {
        return driverID;
    }*/

    @Override
    public String toString() {
        return "Helper{" +
                "helperID='" + helperID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", address='" + address + '\'' +
                //", driverID='" + driverID + '\'' +
                '}';
    }

    public static class Builder{

        private String helperID;
        private String firstName;
        private String lastName;

        private String phoneNo;
        private String address;

        private String driverID;

        public Builder setHelperID(String helperID) {
            this.helperID = helperID;
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

        public Builder setPhoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }
        /*
        public Builder setDriverID(String driverID) {
            this.driverID = driverID;
            return this;
        }
        */

        public Builder copy(Helper h){

            this.helperID = h.helperID;
            this.firstName = h.firstName;
            this.lastName = h.lastName;
            this.phoneNo = h.phoneNo;
            this.address = h.address;
            //this.driverID = h.driverID;

            return this;
        }

        public Helper build(){

            return new Helper(this);

        }

    }

}
