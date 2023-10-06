package fish.distribution.management.erp.saas.domain;

import fish.distribution.management.erp.saas.OrderDeliveryManagementApplication;
import fish.distribution.management.erp.saas.domain.DeliveryRequested;
import fish.distribution.management.erp.saas.domain.OrderPlaced;
import fish.distribution.management.erp.saas.domain.OrderProcessed;
import fish.distribution.management.erp.saas.domain.OrderStatusChecked;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Order_table")
@Data
//<<< DDD / Aggregate Root
public class Order {

    @Id
    private String orderId;

    private String customerId;

    private String productId;

    private Integer quantity;

    private String orderStatus;

    private orderStatusType orderStatusType;

    private Date deliveryDate;

    private String deliveryAddress;

    @PostPersist
    public void onPostPersist() {
        OrderPlaced orderPlaced = new OrderPlaced(this);
        orderPlaced.publishAfterCommit();

        OrderProcessed orderProcessed = new OrderProcessed(this);
        orderProcessed.publishAfterCommit();

        OrderStatusChecked orderStatusChecked = new OrderStatusChecked(this);
        orderStatusChecked.publishAfterCommit();

        DeliveryRequested deliveryRequested = new DeliveryRequested(this);
        deliveryRequested.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static OrderRepository repository() {
        OrderRepository orderRepository = OrderDeliveryManagementApplication.applicationContext.getBean(
            OrderRepository.class
        );
        return orderRepository;
    }
}
//>>> DDD / Aggregate Root
