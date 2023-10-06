package fish.distribution.management.erp.saas.domain;

import fish.distribution.management.erp.saas.domain.*;
import fish.distribution.management.erp.saas.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class SupplyRequestAccepted extends AbstractEvent {

    public SupplyRequestAccepted(Supplier aggregate) {
        super(aggregate);
    }

    public SupplyRequestAccepted() {
        super();
    }
}
//>>> DDD / Domain Event
