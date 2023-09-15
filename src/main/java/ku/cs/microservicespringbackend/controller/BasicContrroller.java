package ku.cs.microservicespringbackend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicContrroller {
    @RequestMapping("/")
    public String greeting(){
        return "hello world";
    }
}
