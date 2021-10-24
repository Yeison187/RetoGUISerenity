package co.com.sofka.stepdefinition.orangehrm;

import co.com.sofka.exceptions.practiceform.ValidationTextDoNotMatch;
import co.com.sofka.stepdefinition.Setup;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static co.com.sofka.exceptions.practiceform.ValidationTextDoNotMatch.VALIDATION_DO_NOT_MATCH;
import static co.com.sofka.questions.practiceform.PracticeForm.practiceForm;
import static co.com.sofka.tasks.landingpage.OpenLandingPage.openLandingPage;
import static co.com.sofka.tasks.practiceform.BrowseToPracticeForm.browseToPracticeForm;
import static co.com.sofka.tasks.practiceform.FillPracticeForm.fillPracticeForm;
import static co.com.sofka.userinterfaces.practiceform.PracticeForm.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import static org.hamcrest.CoreMatchers.equalTo;

public class DependentsStepDefinition extends Setup {

    private static final String ACTOR_NAME = "Student";

    @Given("el usuario necesito ingresar al sistema OrangHRM")
    public void ingresoSistema() {
        actorSetupTheBrowser(ACTOR_NAME);
        theActorInTheSpotlight().attemptsTo(
                openLandingPage()
        );
    }

    @When("^ingresa el usuario (.+), la contraseña (.+)$")
    public void ingresoUsuario(String user, String pass) throws InterruptedException {
        theActorInTheSpotlight().attemptsTo(
                browseToPracticeForm()
        );

        theActorInTheSpotlight().attemptsTo(
                fillPracticeForm()
                        .user(user)
                        .pass(pass)



        );

    }


    @Then("^al dar click en el boton Login, debe ingresar al sistema$")
    public void ingresaSistema() {

    }



    @Given("necesito agregar una nueva dependencia")
    public void nuevaDependencia() {

    }

    @When("^doy clic en el boton add del area Assigned Dependents,diligencio todos los campos (.+),(.+),(.+)$")
    public void diligenciarFormulario(String name, String dependents,String birth) {

    }

    @When("doy clic sobre el boton save")
    public void guardarDependencia() {

    }

    @Given("necesito agregar un nuevo archivo")
    public void nuevoArchivo() {

    }

    @When("^doy clic en el boton add del area Assigned Attachments,adjunto el archivo (.+)$")
    public void adjuntarArchivo(String ruta){

    }

    @When("^diligencio el campo comment (.+), doy clic sobre el boton save$")
    public void subirArchivo(String comentario) {

    }

    @Then("^se debe mostra el mensaje: (.+)$")
    public void confirmarProcesoExitoso(String mensaje) {

    }




}
