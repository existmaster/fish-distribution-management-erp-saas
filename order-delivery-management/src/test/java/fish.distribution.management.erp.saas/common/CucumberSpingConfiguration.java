package fish.distribution.management.erp.saas.common;

import fish.distribution.management.erp.saas.OrderDeliveryManagementApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { OrderDeliveryManagementApplication.class })
public class CucumberSpingConfiguration {}
