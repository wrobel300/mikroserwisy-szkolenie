package pl.altkom.di.controller;

import com.sun.xml.internal.bind.v2.TODO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.fail;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest(properties = "spring.xml")
@AutoConfigureMockMvc
@ActiveProfiles("xml")
// TODO 10 ustaw profil w teście na "xml"
// TODO 11 ustaw context aplikacji na spring.xml
// TODO 12 ustaw użyte w teście propertisy na service.properties, użyj @TestPropertySource
@TestPropertySource(properties = "service.properties")
public class GreetControllerXMLConfigTest {

    @Value("${service.second.implementation.msg}")
    private String secondImplMsg;
    // TODO 13 zdefiniuj pole klasy do użycia w metodzie testu
    // String secondImplMsg
    // użyj @Value do ładowania wartości z service.properties

    @Autowired
    private MockMvc mockMvc;

    // TODO 14 oznacz metodę jako testową
    @Test
    public void shouldReturnSecondImplMsgForXmlProfile() throws Exception {

        this.mockMvc.perform(get("/greet"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("Hello World from the second implementation")));
        // TODO 15 użyj mockMvc:
        // 'strzał' GET na URI /greet
        // oczekuje 200 i String'a:
        // MSG + " " + secondImplMsg
    }
}