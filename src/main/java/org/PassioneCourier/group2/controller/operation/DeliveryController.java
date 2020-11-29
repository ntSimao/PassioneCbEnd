package org.PassioneCourier.group2.controller.operation;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeliveryController {

    @RequestMapping("/home/delivery")
    String Delivery(){
        return "";
    }

}
