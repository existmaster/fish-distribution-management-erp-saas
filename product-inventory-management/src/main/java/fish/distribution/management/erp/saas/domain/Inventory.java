package fish.distribution.management.erp.saas.domain;

import fish.distribution.management.erp.saas.ProductInventoryManagementApplication;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Inventory_table")
@Data
//<<< DDD / Aggregate Root
public class Inventory {

    @Id
    private String inventoryId;

    private String productId;

    private Integer quantity;

    private Date expiryDate;

    @PrePersist
    public void onPrePersist() {}

    public static InventoryRepository repository() {
        InventoryRepository inventoryRepository = ProductInventoryManagementApplication.applicationContext.getBean(
            InventoryRepository.class
        );
        return inventoryRepository;
    }

    //<<< Clean Arch / Port Method
    public void manageInventory() {
        //implement business logic here:

        InventoryManaged inventoryManaged = new InventoryManaged(this);
        inventoryManaged.publishAfterCommit();
    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
