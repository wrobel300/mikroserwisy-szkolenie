package pl.altkom.fortunecookieservice.controller;

import com.jayway.jsonpath.JsonPath;
import net.minidev.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

@RestController
public class FortuneController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/fortune")
    @ResponseBody
    public Fortune Fortune() {
        return getFortune();
    }

    private Fortune getFortune() {
        String fortune = getDataFromService("DECISION-SERVICE", "/decision") + " " + getDataFromService("ACTIVITY-SERVICE", "/activity");
        return new Fortune(fortune);
    }


    public String getDataFromService(String service, String path) {
        List<ServiceInstance> list = discoveryClient.getInstances(service);

        if (list != null && list.size() > 0) {
            URI uri = list.get(0).getUri().resolve(path);
            if (uri != null) {
                String responseInJSON = (new RestTemplate()).getForObject(uri, String.class).concat(path);
                return convertJSONResponseToSentence(responseInJSON);
            }
        }
        return null;
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
