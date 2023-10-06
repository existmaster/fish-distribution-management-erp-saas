package fish.distribution.management.erp.saas.domain;

import fish.distribution.management.erp.saas.domain.*;
import fish.distribution.management.erp.saas.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class ProductManaged extends AbstractEvent {

    public ProductManaged(Product aggregate) {
        super(aggregate);
    }

    public ProductManaged() {
        super();
    }
}
//>>> DDD / Domain Event
