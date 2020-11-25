package org.PassioneCourier.group2.factoryTest.asset;

import org.PassioneCourier.group2.entity.asset.Device;
import org.PassioneCourier.group2.factory.asset.DeviceFactory;
import org.junit.Test;


import static org.junit.jupiter.api.Assertions.*;

/**==============
 *
 * Description: Factory test class for creating a Device
 * Author(s): Justin Jenecke
 * Date: 24/11/2020
 *
 ================*/

public class DeviceFactoryTest {

    @Test
    public void createDevice(){

        Device device = DeviceFactory.createDevice(
                "4D15",
                "Buck",
                "Block",
                80000,
                12000,
                "1D91");

        assertEquals("1D91",device.getVehicleID());
        assertEquals("Buck",device.getModel());
        assertEquals("Block",device.getManufacturer());
        assertEquals(80000,device.getValue());
        assertEquals(12000,device.getDepreciatedValue());
        assertEquals("4D15",device.getID());

    }

}