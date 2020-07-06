package controller;

import entities.CheckoutVO;
import infrastructure.database.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@ComponentScan(basePackages = {"infrastructure.rabbitmq"})
public class SpringController {

    @Autowired
    public UserRepository userRepository;

    @CrossOrigin
    @GetMapping("/statusTransaction")
    public Status statusTransaction(@RequestParam UUID idCheckout) {
        Optional<CheckoutVO> statusTransaction = userRepository.findById(idCheckout);

        if (statusTransaction.isPresent()) {
            return new Status("done");
        }

        return new Status("processing");
    }

    class Status {
        String status;

        Status(String status) {
            this.status = status;
        }
    }
}
