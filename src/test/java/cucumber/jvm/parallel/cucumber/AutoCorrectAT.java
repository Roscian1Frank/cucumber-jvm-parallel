package cucumber.jvm.parallel.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "target/test-classes/cucumber/examples/", tags = {"@autocorrect"}, format = {"html:target/cucumber-report/autocorrect"})
public class AutoCorrectAT {
}
