package fish.distribution.management.erp.saas.infra;

import fish.distribution.management.erp.saas.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class SupplierHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Supplier>> {

    @Override
    public EntityModel<Supplier> process(EntityModel<Supplier> model) {
        model.add(
            Link.of(model.getRequiredLink("self").getHref() + "/").withRel("")
        );

        return model;
    }
}
