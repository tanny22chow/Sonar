package CucumberDiSpring.steps;

import CucumberDiSpring.DTO.Credential;
import CucumberDiSpring.config.RootContextConfig;
import CucumberDiSpring.constants.CommonConstants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;


@CucumberContextConfiguration
@ContextConfiguration(classes={RootContextConfig.class})
public class DemoSteps {
    @Autowired
    Credential credential;
    @Autowired
    CommonConstants constants;
    @Given("the creds")
    public void the_creds() {
        credential.setId("My Id"); credential.setPwd("My pwd");
        System.out.println(credential.getId()+"------"+credential.getPwd());
    }
    @When("hit the endpoint")
    public void hit_the_endpoint() {
        System.out.println(constants.endpoint);
    }
    @Then("Purge happens")
    public void purge_happens() {
        System.out.println("purged with"+credential.getId());
    }

}
