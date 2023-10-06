package fish.distribution.management.erp.saas.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import fish.distribution.management.erp.saas.config.kafka.KafkaProcessor;
import fish.distribution.management.erp.saas.domain.*;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    DeliveryRepository deliveryRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='OrderProcessed'"
    )
    public void wheneverOrderProcessed_OrderProcessedPolicy(
        @Payload OrderProcessed orderProcessed
    ) {
        OrderProcessed event = orderProcessed;
        System.out.println(
            "\n\n##### listener OrderProcessedPolicy : " +
            orderProcessed +
            "\n\n"
        );

        // Sample Logic //
        Order.orderProcessedPolicy(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
