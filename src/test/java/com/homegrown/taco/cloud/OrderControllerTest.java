package com.homegrown.taco.cloud;

import com.homegrown.taco.cloud.controller.OrderController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(OrderController.class)
public class OrderControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    private void currentOrder() {
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/order/current");
        try {
            this.mockMvc.perform(requestBuilder)
                    .andExpect(status().isOk())
                    .andExpect(content().string(containsString("Welcome to...")));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
