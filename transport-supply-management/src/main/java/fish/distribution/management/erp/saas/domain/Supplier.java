package fish.distribution.management.erp.saas.domain;

import fish.distribution.management.erp.saas.TransportSupplyManagementApplication;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Supplier_table")
@Data
//<<< DDD / Aggregate Root
public class Supplier {

    @Id
    private String supplierId;

    @PrePersist
    public void onPrePersist() {}

    public static SupplierRepository repository() {
        SupplierRepository supplierRepository = TransportSupplyManagementApplication.applicationContext.getBean(
            SupplierRepository.class
        );
        return supplierRepository;
    }

    //<<< Clean Arch / Port Method
    public void acceptSupplyRequest() {
        //implement business logic here:

        SupplyRequestAccepted supplyRequestAccepted = new SupplyRequestAccepted(
            this
        );
        supplyRequestAccepted.publishAfterCommit();
    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
