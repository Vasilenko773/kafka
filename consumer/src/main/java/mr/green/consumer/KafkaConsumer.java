package mr.green.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = "order_for")
    public void receiveOrder(Order order) {
        log.info("");
        log.debug(order.toString());
    }

    public record Order(UUID id, String name){}
}
