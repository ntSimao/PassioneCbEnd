package org.PassioneCourier.group2.controller.employee;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelperController {

    @RequestMapping("/home/helper")
    String Delivery(){
        return "";
    }
}
