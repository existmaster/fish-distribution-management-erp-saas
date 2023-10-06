package fish.distribution.management.erp.saas.domain;

import fish.distribution.management.erp.saas.domain.*;
import fish.distribution.management.erp.saas.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class DeliveryRequestProcessed extends AbstractEvent {

    public DeliveryRequestProcessed(Delivery aggregate) {
        super(aggregate);
    }

    public DeliveryRequestProcessed() {
        super();
    }
}
//>>> DDD / Domain Event
