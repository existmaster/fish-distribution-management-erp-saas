package fish.distribution.management.erp.saas.external;

import java.util.Date;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(
    name = "product-inventory-management",
    url = "${api.url.product-inventory-management}"
)
public interface InventoryService {
    @RequestMapping(method = RequestMethod.PUT, path = "/inventories/{id}")
    public void manageInventory(@PathVariable("id") String inventoryId);
}
