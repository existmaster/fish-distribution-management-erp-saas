package fish.distribution.management.erp.saas.domain;

import fish.distribution.management.erp.saas.domain.*;
import fish.distribution.management.erp.saas.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class DeliveryRequested extends AbstractEvent {

    public DeliveryRequested(Order aggregate) {
        super(aggregate);
    }

    public DeliveryRequested() {
        super();
    }
}
//>>> DDD / Domain Event
