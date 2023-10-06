package fish.distribution.management.erp.saas.domain;

import fish.distribution.management.erp.saas.ProductInventoryManagementApplication;
import fish.distribution.management.erp.saas.domain.ProductManaged;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Product_table")
@Data
//<<< DDD / Aggregate Root
public class Product {

    @Id
    private String productId;

    private String productName;

    private Money price;

    private Integer stockQuantity;

    @PostPersist
    public void onPostPersist() {
        ProductManaged productManaged = new ProductManaged(this);
        productManaged.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static ProductRepository repository() {
        ProductRepository productRepository = ProductInventoryManagementApplication.applicationContext.getBean(
            ProductRepository.class
        );
        return productRepository;
    }
}
//>>> DDD / Aggregate Root
