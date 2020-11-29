package org.PassioneCourier.group2.controller.asset;

import org.PassioneCourier.group2.entity.asset.Device;
import org.PassioneCourier.group2.service.asset.implementation.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RequestMapping("/home/device")
@RestController
public class DeviceController {

    @Autowired
    DeviceService dService;

    @RequestMapping(value = "/read/{did}", method = RequestMethod.GET)
    public Device read(@PathVariable String did){
        return dService.read(did);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Device create(@RequestBody Device d){

        return dService.create(d);
    }
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Device update(@RequestBody Device d, String du){

        return dService.update(d,du);
    }

    @RequestMapping(value = "/delete/{d}", method = RequestMethod.DELETE)
    public boolean delete(@PathVariable String d){

        return dService.delete(d);
    }
}
