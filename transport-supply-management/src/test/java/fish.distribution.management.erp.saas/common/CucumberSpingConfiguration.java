package fish.distribution.management.erp.saas.common;

import fish.distribution.management.erp.saas.TransportSupplyManagementApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { TransportSupplyManagementApplication.class })
public class CucumberSpingConfiguration {}
