package pl.altkom.di.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import pl.altkom.di.JavaConfig;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static pl.altkom.di.service.GreetService.MSG;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("java")
@ContextConfiguration(classes = {JavaConfig.class})
public class GreetControllerJavaConfigTest {

    @Value("${service.first.implementation.msg}")
    public String firstImplMsg;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnfirstImplMsgForJavaProfile() throws Exception {
        this.mockMvc.perform(get("/greet"))
                .andExpect(status().isOk())
                .andExpect(content().string(MSG + " " + firstImplMsg));
    }
}