package com.insurence.cars_insurence.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {


    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }


    @GetMapping("/car_details")
    public String carDetails() {
        return "Car-Registration&year";
    }

    @GetMapping("/car_brand_selection")
    public String carBrandSelection() {
        return "Car-Brand_selection";
    }

    @GetMapping("/car_model_selection")
    public String carModelSelection() {
        return "car-model-selection";
    }

    @GetMapping("/variant_selection")
    public String variantSelection() {
        return "variant-selection";
    }


    @GetMapping("/user_info")
    public String user_info() {
        return "user-info";
    }

    @GetMapping("/plan-selection")
    public String planselecrion() {
        return "plan-selection";
    }


    @GetMapping("/payment-page")
    public String paymentpage() {
        return "payment-page";
    }
}
