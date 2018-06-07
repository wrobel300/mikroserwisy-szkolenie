package pl.altkom.diexercisesolution.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static pl.altkom.diexercisesolution.FinalExerciseSolutionApplication.DEV_PROFILE;

@RunWith(SpringRunner.class)
@ActiveProfiles(DEV_PROFILE)
@SpringBootTest
@AutoConfigureMockMvc
public class HomeControllerDefProfileTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnFooMsgForDevProfile() throws Exception {
        this.mockMvc.perform(get("/foo"))
                .andExpect(status().isOk())
                .andExpect(content().string("An example foo value - dev profile"));
    }

    @Test
    public void shouldReturnBarMsgForDevProfile() throws Exception {
        this.mockMvc.perform(get("/bar"))
                .andExpect(status().isOk())
                .andExpect(content().string("An example bar value - dev profile"));
    }

    @Test
    public void shouldReturnDefaultX() throws Exception {
        this.mockMvc.perform(get("/x"))
                .andExpect(status().isOk())
                .andExpect(content().string("999"));
    }

}