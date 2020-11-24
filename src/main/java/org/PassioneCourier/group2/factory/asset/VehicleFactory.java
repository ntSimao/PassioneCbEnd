package org.PassioneCourier.group2.factory.asset;

import org.PassioneCourier.group2.entity.asset.Vehicle;

/**==============
 *
 * Description: Factory class for creating a vehicle
 * Author(s): Justin Jenecke
 * Date: 24/11/2020
 *
 ================*/

public class VehicleFactory {

    public static Vehicle createVehicle(String ID,
                                        String vehicleCode,
                                        String vehicleKm,
                                      //String driverID,
                                        String deviceID){

        Vehicle vehicle = new Vehicle.Builder()
                .setID(ID)
                .setVehicleCode(vehicleCode)
                .setVehicleKm(vehicleKm)
              //.setDriverID(driverID)
                .setDeviceID(deviceID)
                .build();

        return vehicle;
    }

}
