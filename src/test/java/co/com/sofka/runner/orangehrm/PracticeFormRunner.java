package co.com.sofka.runner.orangehrm;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features/orangehrm/dependents.feature"},
        glue = {"co.com.sofka.stepdefinition.orangehrm"},
        tags = {"not @ignore"}
)
public class PracticeFormRunner {
}
