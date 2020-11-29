package org.PassioneCourier.group2.controller.asset;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehicleController {

    @RequestMapping("/home/vehicle")
    String Delivery(){
        return "";
    }
}