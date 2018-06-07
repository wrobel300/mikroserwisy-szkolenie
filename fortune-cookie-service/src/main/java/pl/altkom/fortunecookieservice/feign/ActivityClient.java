package pl.altkom.fortunecookieservice.feign;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "ACTIVITY-SERVICE", fallback = ActivityFallback.class)
@RibbonClient("ACTIVITY-SERVICE")
public interface ActivityClient {
    @GetMapping("/activity")
    String getResponse();
}
