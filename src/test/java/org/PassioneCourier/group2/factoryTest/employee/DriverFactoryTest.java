package org.PassioneCourier.group2.factoryTest.employee;

import org.PassioneCourier.group2.entity.employee.Driver;
import org.PassioneCourier.group2.factory.employee.DriverFactory;
import org.junit.Test;

/**==============
 *
 * Description: Factory test class for creating a Driver
 * Author(s): Justin Jenecke
 * Date: 24/11/2020
 *
 ================*/

import static org.junit.jupiter.api.Assertions.*;

public class DriverFactoryTest {

    @Test
    public void createDriver(){

        Driver driver = DriverFactory.createDriver(
                "1D91",
                "Buck",
                "Rook",
                "2",
                "0218888444",
                "8-Harvest-Three");

        assertEquals("2h01",driver.getDriverID());
        assertEquals("Buck",driver.getFirstName());
        assertEquals("Rook",driver.getLastName());
        assertEquals("2",driver.getLicenceCode());
        assertEquals("0218888444",driver.getPhoneNo());
        assertEquals("8-Harvest-Three",driver.getAddress());
    }

}