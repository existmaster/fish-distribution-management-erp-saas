package fish.distribution.management.erp.saas.domain;

import fish.distribution.management.erp.saas.OrderDeliveryManagementApplication;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Delivery_table")
@Data
//<<< DDD / Aggregate Root
public class Delivery {

    @Id
    private String deliveryId;

    private String orderId;

    private String status;

    private statusType statusType;

    private String trackingNumber;

    @PrePersist
    public void onPrePersist() {}

    public static DeliveryRepository repository() {
        DeliveryRepository deliveryRepository = OrderDeliveryManagementApplication.applicationContext.getBean(
            DeliveryRepository.class
        );
        return deliveryRepository;
    }

    //<<< Clean Arch / Port Method
    public void processDeliveryRequest() {
        //implement business logic here:

        DeliveryRequestProcessed deliveryRequestProcessed = new DeliveryRequestProcessed(
            this
        );
        deliveryRequestProcessed.publishAfterCommit();
    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
