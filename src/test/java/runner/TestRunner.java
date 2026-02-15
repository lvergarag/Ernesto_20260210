package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        // Agregamos "hooks" si creaste esa carpeta, si no, deja solo "steps" y "core"
        glue = {"steps", "core", "hooks"}, 
        plugin = {
                "pretty",
                "html:target/cucumber-reports/report.html"
        },
        monochrome = true
)
public class TestRunner {
}