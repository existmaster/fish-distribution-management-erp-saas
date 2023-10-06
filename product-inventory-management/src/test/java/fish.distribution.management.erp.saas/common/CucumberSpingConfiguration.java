package fish.distribution.management.erp.saas.common;

import fish.distribution.management.erp.saas.ProductInventoryManagementApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { ProductInventoryManagementApplication.class })
public class CucumberSpingConfiguration {}
