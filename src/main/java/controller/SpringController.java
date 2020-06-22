package controller;

import entities.UserVO;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ComponentScan(basePackages = {"infrastructure.rabbitmq"})
public class SpringController {

    @PostMapping("/user")
    public String saveUser(@RequestBody UserVO payload) {
        return "hello";
    }
}
