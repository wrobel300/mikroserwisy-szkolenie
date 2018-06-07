package pl.altkom.fortunecookieservice.controller;

import com.jayway.jsonpath.JsonPath;
import net.minidev.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pl.altkom.fortunecookieservice.feign.ActivityClient;
import pl.altkom.fortunecookieservice.feign.DecisionClient;

@RestController
public class FortuneController {

    @Autowired
    private ActivityClient activityClient;

    @Autowired
    private DecisionClient decisionClient;

    @GetMapping("/fortune")
    @ResponseBody
    public Fortune Fortune() {
        return getFortune();
    }

    private Fortune getFortune() {
        String fortune = convertJSONResponseToSentence(decisionClient.getResponse()) + " " + convertJSONResponseToSentence(activityClient.getResponse());
        return new Fortune(fortune);
    }


    private String convertJSONResponseToSentence(String responseInJSON) {
        JSONArray jsonArray = JsonPath.read(responseInJSON, "$..*");
        return (String) jsonArray.get(0);
    }

    class Fortune {
        private String fortune;

        public Fortune(String fortune) {
            this.fortune = fortune;
        }

        public String getFortune() {
            return fortune;
        }
    }

}
