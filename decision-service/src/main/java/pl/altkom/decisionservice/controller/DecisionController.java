package pl.altkom.decisionservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DecisionController {

    @Value("${decisions}")
    private String decisions;

    @GetMapping("/decision")
    @ResponseBody
    public Decision decision() {
        return getDecision();
    }

    private Decision getDecision() {
        String[] sentences = decisions.split(",");
        int i = (int) Math.round(Math.random() * (sentences.length - 1));
        return new Decision(sentences[i]);
    }

    class Decision {
        private String decision;

        public Decision(String decision) {
            this.decision = decision;
        }

        public String getDecision() {
            return decision;
        }
    }

}
