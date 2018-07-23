package stepDefination;

import com.resources.DriverScript;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import stepDefination.Hooks.*;


@RunWith(ExtendedCucumberRunner.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-results", "usage:target/cucumber-results/cucumber-usage.json",
                "junit:target/cucumber-results/cucumber-results.xml", "json:target/cucumber-results/cucumber.json",
                "com.cucumber.listener.ExtentCucumberFormatter:target/vimalSelvam-cucumberReport/report.html"},

        features = { "src/test/Features/" }
        //glue = { "./src/test/java/stepDefination" },
        //tags = {""}
)
public class TestRunner {

        @BeforeSuite
        public static void setUp() {
                // TODO: Add your pre-processing

        }
}
