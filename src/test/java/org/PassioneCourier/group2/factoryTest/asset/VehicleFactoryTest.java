package org.PassioneCourier.group2.factoryTest.asset;

import org.PassioneCourier.group2.entity.asset.Vehicle;
import org.PassioneCourier.group2.entity.employee.Driver;
import org.PassioneCourier.group2.factory.asset.VehicleFactory;
import org.PassioneCourier.group2.factory.employee.DriverFactory;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**==============
 *
 * Description: Factory test class for creating a Vehicle
 * Author(s): Justin Jenecke
 * Date: 24/11/2020
 *
 ================*/

public class VehicleFactoryTest {

    @Test
    public void createVehicle(){

        Vehicle vehicle = VehicleFactory.createVehicle(
                "1D91",
                "Buck",
                100000,
                80000,
                12000,
                "4D15");

        assertEquals("1D91",vehicle.getID());
        assertEquals("Buck",vehicle.getVehicleCode());
        assertEquals(100000,vehicle.getVehicleKm());
        assertEquals(80000,vehicle.getValue());
        assertEquals(12000,vehicle.getDepreciatedValue());
        assertEquals("4D15",vehicle.getDeviceID());
    }

}
