package fish.distribution.management.erp.saas.infra;

import fish.distribution.management.erp.saas.domain.*;
import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//<<< Clean Arch / Inbound Adaptor

@RestController
// @RequestMapping(value="/suppliers")
@Transactional
public class SupplierController {

    @Autowired
    SupplierRepository supplierRepository;

    @RequestMapping(
        value = "suppliers/{id}/",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public Supplier acceptSupplyRequest(
        @PathVariable(value = "id") String id,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /supplier/acceptSupplyRequest  called #####");
        Optional<Supplier> optionalSupplier = supplierRepository.findById(id);

        optionalSupplier.orElseThrow(() -> new Exception("No Entity Found"));
        Supplier supplier = optionalSupplier.get();
        supplier.acceptSupplyRequest();

        supplierRepository.save(supplier);
        return supplier;
    }
}
//>>> Clean Arch / Inbound Adaptor
