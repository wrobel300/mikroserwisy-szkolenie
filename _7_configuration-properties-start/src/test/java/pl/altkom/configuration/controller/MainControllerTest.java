package pl.altkom.configuration.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
public class MainControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getFoo() throws Exception {
        this.mockMvc.perform(get("/foo"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("foo1")));
    }

    @Test
    public void getBar() throws Exception {
        this.mockMvc.perform(get("/bar"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("bar1")));
    }

    @Test
    public void getX() throws Exception {
        this.mockMvc.perform(get("/x"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("x1")));
    }
}