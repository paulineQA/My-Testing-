package pl.sda.testgda25;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = "pretty",
        features = "src/test/java/pl/sda/testgda25/features/facebook" +
                ""

)
public class CUCUMBERrunner extends AbstractTestNGCucumberTests {
}
