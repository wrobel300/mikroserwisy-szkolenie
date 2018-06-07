package pl.altkom.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static junit.framework.TestCase.fail;
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
    public void shouldSum() throws Exception {
        this.mockMvc.perform(get("/add/3/8"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("11")));
    }

    @Test
    public void shouldSubstract() throws Exception {
        this.mockMvc.perform(get("/subtract/8/5"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("3")));
    }

    @Test
    public void shouldMultiply() throws Exception {
        this.mockMvc.perform(get("/multiple?a=3&b=8"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("24")));
    }

    @Test
    public void shouldDivide() throws Exception {
        this.mockMvc.perform(get("/divide?a=10&b=2"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("5")));
    }
}