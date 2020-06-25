package infrastructure.rabbitmq;

import com.fasterxml.jackson.databind.ObjectMapper;
import entities.CheckoutVO;
import infrastructure.database.UserRepository;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQListener {

    @Autowired
    public UserRepository userRepository;

    @RabbitListener(queues = "QUEUE_NAME")
    public void listen(byte[] message) {
        ObjectMapper objectMapper = new ObjectMapper();
        String messageInJson = new String(message);
        try {
            CheckoutVO checkoutVO = objectMapper.readValue(messageInJson, CheckoutVO.class);
            processTransaction();
            userRepository.flush();
            userRepository.save(checkoutVO);

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("I listened a message from RabbitMQ!!");
    }

    private void processTransaction() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Cannot process the transaction");
        }
    }
}
