package org.PassioneCourier.group2.factoryTest;

import org.PassioneCourier.group2.entity.employee.Helper;
import org.PassioneCourier.group2.factory.employee.HelperFactory;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HelperFactoryTest {

    @Test
    public void createHelper (){

        Helper helper = HelperFactory.createHelper(
                "2h01",
                "Buck",
                "Rook",
                "0218888444",
                "8-Harvest-Three");

        assertEquals("2h01",helper.getHelperID());
        assertEquals("Buck",helper.getFirstName());
        assertEquals("Rook",helper.getLastName());
        assertEquals("0218888444",helper.getPhoneNo());
        assertEquals("8-Harvest-Three",helper.getAddress());

    }

}