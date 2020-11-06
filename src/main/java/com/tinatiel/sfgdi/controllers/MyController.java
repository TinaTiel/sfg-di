package com.tinatiel.sfgdi.controllers;

import com.tinatiel.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHowdy() {
        return greetingService.sayGreeting();
    }

}
