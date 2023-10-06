package fish.distribution.management.erp.saas.domain;

import fish.distribution.management.erp.saas.domain.*;
import fish.distribution.management.erp.saas.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class InventoryManaged extends AbstractEvent {

    public InventoryManaged(Inventory aggregate) {
        super(aggregate);
    }

    public InventoryManaged() {
        super();
    }
}
//>>> DDD / Domain Event
