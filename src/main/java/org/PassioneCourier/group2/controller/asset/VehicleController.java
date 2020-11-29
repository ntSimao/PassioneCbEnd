package org.PassioneCourier.group2.controller.asset;

import org.PassioneCourier.group2.entity.asset.Vehicle;
import org.PassioneCourier.group2.service.asset.implementation.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/home/vehicle")
@RestController
public class VehicleController {

    @Autowired
    VehicleService vService;

    @RequestMapping(value = "/read/{id}", method = RequestMethod.GET)
    public Vehicle read(@PathVariable String vid){
        return vService.read(vid);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Vehicle create(@RequestBody Vehicle v){

        return vService.create(v);
    }
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Vehicle update(@RequestBody Vehicle v, String vu){

        return vService.update(v,vu);
    }

    @RequestMapping(value = "/delete/{d}", method = RequestMethod.DELETE)
    public boolean delete(@PathVariable String vd){

        return vService.delete(vd);
    }
}