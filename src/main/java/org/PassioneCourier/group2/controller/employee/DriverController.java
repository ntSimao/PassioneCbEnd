package org.PassioneCourier.group2.controller.employee;

import org.PassioneCourier.group2.entity.employee.Driver;
import org.PassioneCourier.group2.service.employee.implementation.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/home/driver")
@RestController
public class DriverController {

    @Autowired
    DriverService dService;

    @RequestMapping(value = "/read/{did}", method = RequestMethod.GET)
    public Driver read(@PathVariable String did){
        return dService.read(did);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Driver create(@RequestBody Driver d){

        return dService.create(d);
    }
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Driver update(@RequestBody Driver d, String du){

        return dService.update(d,du);
    }

    @RequestMapping(value = "/delete/{d}", method = RequestMethod.DELETE)
    public boolean delete(@PathVariable String d){

        return dService.delete(d);
    }

}
