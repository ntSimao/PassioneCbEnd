package org.PassioneCourier.group2.factoryTest.operation;

import org.PassioneCourier.group2.entity.operation.Delivery;
import org.PassioneCourier.group2.factory.operation.DeliveryFactory;
import org.junit.Test;

/**==============
 *
 * Description: Factory test class for creating a Delivery
 * Author(s): Justin Jenecke
 * Date: 24/11/2020
 *
 ================*/

import static org.junit.jupiter.api.Assertions.*;

public class DeliveryFactoryTest {

    @Test
    public void createDelivery(){

        Delivery delivery = DeliveryFactory.createDelivery(
                "D4002",
                "North",
                80,
                11,
                "1D91",
                "2h01",
                "3V91");

        assertEquals("D4002",delivery.getDeliveryNo());
        assertEquals("North",delivery.getRoute());
        assertEquals(80,delivery.getDistance());
        assertEquals(11,delivery.getStops());
        assertEquals("1D91",delivery.getDriverID());
        assertEquals("2h01",delivery.getHelperID());
        assertEquals("3V91",delivery.getVehicleID());

    }

}