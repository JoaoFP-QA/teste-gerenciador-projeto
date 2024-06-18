package testecucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions(
	    dryRun = false,
		monochrome = false,
		features = "src/test/resources/app.feature",
		glue = "testecucumber",
		plugin = {
				"pretty",
				"html:target/Relatorio.html.html"
				
		}
)

public class RunnerTeste {

}
