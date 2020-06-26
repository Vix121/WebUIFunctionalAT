package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features",
        glue = {"stepdefinitions", "hooks"},
        tags = {"@testOne"},
        plugin = {"pretty"}
)

public class CucmberRunner {

}
