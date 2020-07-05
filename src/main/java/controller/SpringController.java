package controller;

import entities.CheckoutVO;
import infrastructure.database.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

@RestController
@ComponentScan(basePackages = {"infrastructure.rabbitmq"})
public class SpringController {

    @Autowired
    public UserRepository userRepository;

    @CrossOrigin
    @GetMapping("/statusTransaction")
    public String statusTransaction(@RequestParam Integer idCheckout) {

        try{
            CheckoutVO statusTransaction = userRepository.getOne(idCheckout);
            return statusTransaction.toString();

        }catch (Exception e) {
            return "your request is processing, please wait!";
        }


    }
}
