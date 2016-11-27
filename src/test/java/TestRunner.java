import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by gorobec on 27.11.16.
 */
@RunWith(Cucumber.class)
@CucumberOptions(format = {"pretty", "json:target/cucumber/html/",
        "html:target/cucumber"}, tags = {"@Main"})
public class TestRunner {
}
