package fish.distribution.management.erp.saas.external;

import java.util.Date;
import lombok.Data;

@Data
public class Inventory {

    private String inventoryId;
    private String productId;
    private Integer quantity;
    private Date expiryDate;
}
