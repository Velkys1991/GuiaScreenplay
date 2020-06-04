package co.com.AutomatizacionWeb.reto1.runners;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
        features = "src/test/resources/features/reto1.feature",
        tags = "@stories",
        glue = "co.com.AutomatizacionWeb.reto1.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RunnerTags {
}