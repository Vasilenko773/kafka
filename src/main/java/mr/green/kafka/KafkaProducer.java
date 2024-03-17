package mr.green.kafka;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@RequiredArgsConstructor
@EnableScheduling
public class KafkaProducer {

    private final KafkaTemplate<String, Object> kafkaTemplate;

    @Scheduled(fixedDelay = 5000)
    public void saveOrder() {
        UUID id = UUID.randomUUID();
        Order order = new Order(id, "Заказ на доставку клиенту");
        kafkaTemplate.send("order_for", order);

    }


    public record Order(UUID id, String name){}
}


