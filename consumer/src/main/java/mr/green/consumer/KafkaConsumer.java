package mr.green.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = "order", groupId = "mr.green")
    public void receiveOrder(String message) {
        log.info("MESSAGE RECEIVED {}",message);
        log.debug(message);
        //TODO Корректно сконфигурировать Consumer
    }

    public record Order(UUID id, String name){}
}
