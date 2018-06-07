package pl.altkom.configuration.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@TestPropertySource(properties = {"foo=Foo property",
                                    "bar=Bar property",
                                    "x=10"})
public class MainControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    protected Environment env;

    @Test
    public void foo() throws Exception {
        mockMvc.perform(get("/foo"))
                .andExpect(status().isOk())
                .andExpect(content().string(env.getProperty("foo")));
    }

    @Test
    public void bar() throws Exception {
        mockMvc.perform(get("/bar"))
                .andExpect(status().isOk())
                .andExpect(content().string(env.getProperty("bar")));
    }

    @Test
    public void x() throws Exception {
        mockMvc.perform(get("/x"))
                .andExpect(status().isOk())
                .andExpect(content().string(env.getProperty("x")));
    }
}
