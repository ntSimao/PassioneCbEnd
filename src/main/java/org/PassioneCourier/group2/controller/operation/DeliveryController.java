package org.PassioneCourier.group2.controller.operation;

import org.PassioneCourier.group2.entity.operation.Delivery;
import org.PassioneCourier.group2.service.operation.implementation.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DeliveryController {

    @Autowired
    DeliveryService deliveryService;

    @RequestMapping(value = "/read/{did}", method = RequestMethod.GET)
    public Delivery read(@PathVariable String did){
        return deliveryService.read(did);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Delivery create(@RequestBody Delivery d){

        return deliveryService.create(d);
    }
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Delivery update(@RequestBody Delivery d, String du){

        return deliveryService.update(d,du);
    }

    @RequestMapping(value = "/delete/{d}", method = RequestMethod.DELETE)
    public boolean delete(@PathVariable String d){

        return deliveryService.delete(d);
    }

}
