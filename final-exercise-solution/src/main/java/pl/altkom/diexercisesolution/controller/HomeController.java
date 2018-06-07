package pl.altkom.diexercisesolution.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.altkom.diexercisesolution.service.MessageService;

@RestController
public class HomeController {



    @Autowired
    private MessageService messageService;

//    @Autowired
//    public void setMessageService(MessageService messageService) {
//        this.messageService = messageService;
//    }
//
//    @Autowired
//    public HomeController(MessageService messageService) {
//        this.messageService = messageService;
//    }

    @GetMapping("/foo")
    public String getFoo() {
        return messageService.foo();
    }

    @GetMapping("/bar")
    public String getBar() {
        return messageService.bar();
    }

    @GetMapping("/x")
    public String getX() {
        return Integer.toString(messageService.x());
    }

}
