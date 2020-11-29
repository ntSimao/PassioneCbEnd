package org.PassioneCourier.group2.controller.employee;

import org.PassioneCourier.group2.entity.employee.Helper;
import org.PassioneCourier.group2.service.employee.implementation.HelperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/home/helper")
@RestController
public class HelperController {

    @Autowired
    HelperService hService;

    @RequestMapping(value = "/read/{did}", method = RequestMethod.GET)
    public Helper read(@PathVariable String did){
        return hService.read(did);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Helper create(@RequestBody Helper d){

        return hService.create(d);
    }
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Helper update(@RequestBody Helper d, String du){

        return hService.update(d,du);
    }

    @RequestMapping(value = "/delete/{d}", method = RequestMethod.DELETE)
    public boolean delete(@PathVariable String d){

        return hService.delete(d);
    }
}
