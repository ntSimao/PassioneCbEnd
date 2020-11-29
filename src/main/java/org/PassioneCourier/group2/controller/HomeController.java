package org.PassioneCourier.group2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/home")
@RestController
public class HomeController {

    String home(){ return "Hello World!"; }

}
