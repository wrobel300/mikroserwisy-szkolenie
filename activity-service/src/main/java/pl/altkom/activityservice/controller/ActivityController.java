package pl.altkom.activityservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActivityController {

    @Value("${activities}")
    private String activities;


    @GetMapping("/activity")
    @ResponseBody
    public Activity activity() {
        return getActivity();
    }

    private Activity getActivity() {
        String[] sentences = activities.split(",");
        int i = (int) Math.round(Math.random() * (sentences.length - 1));
        return new Activity(sentences[i]);
    }

    public class Activity {
        private String activity;

        public Activity(String activity) {
            this.activity = activity;
        }

        public String getActivity() {
            return activity;
        }
    }

}
