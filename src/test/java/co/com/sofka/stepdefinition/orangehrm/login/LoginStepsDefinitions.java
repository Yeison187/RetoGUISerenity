package co.com.sofka.stepdefinition.orangehrm.login;


import co.com.sofka.stepdefinition.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static co.com.sofka.questions.login.LoginMessage.loginInvalidCredentials;
import static co.com.sofka.questions.login.WelcomeMessage.welcome;
import static co.com.sofka.tasks.landingpage.OpenLandingPage.openLandingPage;
import static co.com.sofka.tasks.orangehrm.FillPLoginForm.fillPLoginFormForm;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class LoginStepsDefinitions extends Setup {
    private static final String ACTOR_NAME = "Usuario";

    @Given("necesito ingresar al sistema OrangHRM")
    public void ingresoPagina() {
        actorSetupTheBrowser(ACTOR_NAME);
        theActorInTheSpotlight().attemptsTo(
                openLandingPage()
        );
    }

    @When("^ingreso un usuario (.+), una contraseña (.+)$")
    public void ingresoUsuario(String user, String pass)  {
        theActorInTheSpotlight().attemptsTo(
                fillPLoginFormForm()
                        .user(user)
                        .pass(pass)
        );

    }

    @When("^el usuario no ingresa un usuario, ni una contraseña$")
    public void nullCredential()  {
        theActorInTheSpotlight().attemptsTo(
                fillPLoginFormForm()
                        .user("")
                        .pass("")
        );

    }


    @Then("^al dar click en el boton Login (.+)$")
    public void noIngresaSistema(String mensaje) {

        theActorInTheSpotlight().should(
                seeThat(
                        loginInvalidCredentials()
                                .invalidCredentials(mensaje)
                                .is(),equalTo(true)
                )
        );

    }

    @Then("^al dar click en el boton Login, debe ingresar al sistema$")
    public void ingresaSistema() {

        theActorInTheSpotlight().should(
                seeThat(
                        welcome()
                                .welcomeMessage("Dashboard")
                                .is(),equalTo(true)
                )
        );

    }

}
