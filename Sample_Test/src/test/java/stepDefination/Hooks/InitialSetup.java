package stepDefination.Hooks;

import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import com.resources.DriverScript;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class InitialSetup {
	
	private WebDriver driver;

    @Before
    public  void beforeScenario() {
        driver = new DriverScript().getDriver();
    }

    @After
    public void afterScenario(Scenario scenario) throws IOException {

        try {
            if (scenario.isFailed()) {
                 byte[] screenshot = ((TakesScreenshot) driver)
                        .getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png");
            }
        } finally {
        		new DriverScript().quitDriver();
        }
    }
}
