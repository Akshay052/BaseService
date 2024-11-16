package com.java.base.BaseService.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @GetMapping("/start")
    String getstarted() {

        return "App is up and running";
    }
}
