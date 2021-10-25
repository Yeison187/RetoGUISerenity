package co.com.sofka.stepdefinition.orangehrm;

import co.com.sofka.stepdefinition.Setup;
import co.com.sofka.tasks.orangehrm.FillCommentForm;
import co.com.sofka.tasks.orangehrm.ModuloBuzz;
import io.cucumber.java.en.*;

import static co.com.sofka.tasks.landingpage.OpenLandingPage.openLandingPage;
import static co.com.sofka.tasks.orangehrm.BrowseToOrange.browseToOrange;
import static co.com.sofka.tasks.orangehrm.FillCommentForm.fillCommentForm;
import static co.com.sofka.tasks.orangehrm.FillPLoginForm.fillPLoginFormForm;
import static co.com.sofka.tasks.orangehrm.ModuloBuzz.moduloBuzz;
import static javax.servlet.http.HttpServletResponse.SC_OK;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class ModuloBuzzSteps extends Setup {
    private static final String ACTOR_NAME = "Student";
    @Given("^el usuario necesita comertar,compartir dar like, inicia sesion el usuario (.+), con la contraseña (.+)$")
    public void necesitoDarLikeComentarYCompartirElTercerPostMasComentado(String user, String pass) {
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
    @When("abro el tercer post mas comentado del modulo buzz")
    public void clikPost() {
        theActorInTheSpotlight().attemptsTo(
                moduloBuzz()

        );

    }
    @Then("^podre dar like, comentar: (.+) y compartir$")
    public void addLikeCommentShere(String comentario) {
        theActorInTheSpotlight().attemptsTo(
                fillCommentForm().
                        comment(comentario)

        );

    }


}
