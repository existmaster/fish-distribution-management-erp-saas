package fish.distribution.management.erp.saas.domain;

import fish.distribution.management.erp.saas.domain.*;
import fish.distribution.management.erp.saas.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class OrderProcessed extends AbstractEvent {

    public OrderProcessed(Order aggregate) {
        super(aggregate);
    }

    public OrderProcessed() {
        super();
    }
}
//>>> DDD / Domain Event
