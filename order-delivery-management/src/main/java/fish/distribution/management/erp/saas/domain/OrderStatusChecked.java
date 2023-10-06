package fish.distribution.management.erp.saas.domain;

import fish.distribution.management.erp.saas.domain.*;
import fish.distribution.management.erp.saas.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class OrderStatusChecked extends AbstractEvent {

    public OrderStatusChecked(Order aggregate) {
        super(aggregate);
    }

    public OrderStatusChecked() {
        super();
    }
}
//>>> DDD / Domain Event
