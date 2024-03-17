package mr.green.consumer1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = "order_for")
    public void receiveOrder(Object order) {
        log.info("MESSAGE RECEIVED {}", order.toString());
        log.debug(order.toString());
    }
}
