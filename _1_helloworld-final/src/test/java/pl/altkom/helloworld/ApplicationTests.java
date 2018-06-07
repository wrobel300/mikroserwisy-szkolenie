package pl.altkom.helloworld;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;


import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest
public class ApplicationTests {


    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnDefaultMessage() throws Exception {
        this.mockMvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("Hello, World!")));
    }

    @Test
    public void shouldReturnHelloWithNamePassedAsParam() throws Exception {
        this.mockMvc.perform(get("/hello?name=Kitty"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("Hello, Kitty")));
    }

}

