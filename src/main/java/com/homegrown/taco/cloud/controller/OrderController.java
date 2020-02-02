package com.homegrown.taco.cloud.controller;

import com.homegrown.taco.cloud.model.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping(path = "/order")
public class OrderController {

    @GetMapping("/current")
    private String currentOrder(Model model) {
        model.addAttribute("order", new Order());
        return "orderForm";
    }

    @PostMapping()
    private String processOrder(Order order){

        return "redirect:/";
    }
}
