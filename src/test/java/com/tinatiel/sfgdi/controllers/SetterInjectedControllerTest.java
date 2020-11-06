package com.tinatiel.sfgdi.controllers;

import com.tinatiel.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void beforeEach() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new ConstructorGreetingService());
    }


    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}