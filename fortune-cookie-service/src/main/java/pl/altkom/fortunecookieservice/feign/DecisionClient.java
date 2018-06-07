package pl.altkom.fortunecookieservice.feign;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "DECISION-SERVICE", fallback = DecisionFallback.class)
@RibbonClient("DECISION-SERVICE")
public interface DecisionClient {
    @GetMapping("/decision")
    String getResponse();
}
