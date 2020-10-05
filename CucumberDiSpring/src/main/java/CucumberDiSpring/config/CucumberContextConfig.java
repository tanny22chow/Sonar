package CucumberDiSpring.config;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.test.context.ContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration(classes = {RootContextConfig.class})
public class CucumberContextConfig {
}
