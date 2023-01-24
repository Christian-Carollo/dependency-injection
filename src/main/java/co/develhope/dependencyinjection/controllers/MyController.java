package co.develhope.dependencyinjection.controllers;

import co.develhope.dependencyinjection.services.MyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private MyService service;

    public MyController(MyService service) {
        System.out.println("MyController costruttore è stato chiamato");
        this.service = service;
    }

    @GetMapping
    public String helloMsg(){
        return "Salve da Develhope, grazie per averci scelto!";
    }

    @GetMapping("/getName")
    public String getName(){
        System.out.println("MyService.getName è stato chiamato");
        return service.getName();
    }

}
