package co.com.sofka.stepdefinition.orangehrm.myinfo.dependents;

import co.com.sofka.stepdefinition.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static co.com.sofka.tasks.landingpage.OpenLandingPage.openLandingPage;
import static co.com.sofka.tasks.orangehrm.BrowseToOrange.browseToOrange;
import static co.com.sofka.tasks.orangehrm.FillDepedentsForm.fillDependentsForm;
import static co.com.sofka.tasks.orangehrm.FillPLoginForm.fillPLoginFormForm;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class DependentsStepDefinition extends Setup {

    private static final String ACTOR_NAME = "Student";

    @Given("^el usuario necesita agregar una nueva dependencia, inicia sesion el usuario (.+), la contraseña (.+)")
    public void ingresoUsuario(String user, String pass) throws InterruptedException {
        actorSetupTheBrowser(ACTOR_NAME);
        theActorInTheSpotlight().attemptsTo(
                openLandingPage()
        );

        theActorInTheSpotlight().attemptsTo(
                browseToOrange()
        );

        theActorInTheSpotlight().attemptsTo(
                fillPLoginFormForm()
                        .user(user)
                        .pass(pass)
        );

    }



    @When("^da clic el boton add del area Assigned Dependents, diligencia los campos (.+),(.+),(.+)$")
    public void diligenciarFormulario(String name, String relations ,String birth) {
        theActorInTheSpotlight().attemptsTo(
                fillDependentsForm()
                        .name(name)
                        .relationship(relations)
                        .birth(birth)
        );
    }

    @Then("^debe mostra el mensaje: (.+)$")
    public void guardarDependencia(String message) {

    }

}
