package mr.green.consumer1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = "order", groupId = "mr.green")
    public void receiveOrder(String message) {
        log.info("MESSAGE RECEIVED FOR 1 CONSUMER {}", message);
        log.debug(message);
    }
}
