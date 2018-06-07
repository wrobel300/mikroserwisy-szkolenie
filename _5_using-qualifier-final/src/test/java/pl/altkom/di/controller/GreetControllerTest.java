package pl.altkom.di.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static pl.altkom.di.service.GreetService.MSG;
import static pl.altkom.di.service.GreetServiceSecondImplementation.SECOND_IMPL;


@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class GreetControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnMsgFromTheSecondImplementation() throws Exception {
        this.mockMvc.perform(get("/greet"))
                .andExpect(status().isOk())
                .andExpect(content().string(MSG+SECOND_IMPL));
    }

}