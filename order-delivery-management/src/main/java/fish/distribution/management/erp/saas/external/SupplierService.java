package fish.distribution.management.erp.saas.external;

import java.util.Date;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(
    name = "transport-supply-management",
    url = "${api.url.transport-supply-management}"
)
public interface SupplierService {
    @RequestMapping(method = RequestMethod.PUT, path = "/suppliers/{id}")
    public void acceptSupplyRequest(@PathVariable("id") String supplierId);
}
