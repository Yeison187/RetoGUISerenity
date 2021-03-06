package co.com.sofka.runner.orangehrm;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features/orangehrm"},
        glue = {"co.com.sofka.stepdefinition.orangehrm"}

)
public class OrangeHrmRunner {
}
