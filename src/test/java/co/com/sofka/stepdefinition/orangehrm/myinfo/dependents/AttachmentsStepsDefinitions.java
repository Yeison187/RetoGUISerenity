package co.com.sofka.stepdefinition.orangehrm.myinfo.dependents;

import co.com.sofka.stepdefinition.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static co.com.sofka.tasks.landingpage.OpenLandingPage.openLandingPage;
import static co.com.sofka.tasks.orangehrm.BrowseToOrange.browseToOrange;
import static co.com.sofka.tasks.orangehrm.FillAttachmentsForm.fillAttachentsForm;
import static co.com.sofka.tasks.orangehrm.FillPLoginForm.fillPLoginFormForm;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AttachmentsStepsDefinitions extends Setup {
    private static final String ACTOR_NAME = "Student";

    @Given("^el usuario necesita agregar una nueva Attachments, inicia sesion el usuario (.+), la contraseña (.+)$")
    public void nuevoArchivo(String user, String pass) {
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

    @When("^da clic en Add Attachmentsadjunto, adjunta el archivo (.+), diligencio el campo comment (.+)$")
    public void adjuntarArchivo(String ruta, String comentario){
        System.out.println(ruta);
        theActorInTheSpotlight().attemptsTo(
                fillAttachentsForm()
                        .ruta(ruta)
                        .comment(comentario)

        );

    }

    @Then("^se debe mostra el mensaje: (.+)$")
    public void confirmarProcesoExitoso(String mensaje) {

    }
}
