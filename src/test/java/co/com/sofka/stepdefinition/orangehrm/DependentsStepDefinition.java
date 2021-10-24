package co.com.sofka.stepdefinition.orangehrm;

import co.com.sofka.stepdefinition.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static co.com.sofka.tasks.landingpage.OpenLandingPage.openLandingPage;
import static co.com.sofka.tasks.practiceform.FillAttachmentsForm.fillAttachentsForm;
import static co.com.sofka.tasks.practiceform.BrowseToOrange.browseToOrange;
import static co.com.sofka.tasks.practiceform.FillDepedentsForm.fillDependentsForm;
import static co.com.sofka.tasks.practiceform.FillPracticeForm.fillPracticeForm;

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
                fillPracticeForm()
                        .user(user)
                        .pass(pass)


        );

    }


    @When("^da clic el boton add del area Assigned Dependents$")
    public void ingresaSistema() {

    }


    @When("^diligencia los campos (.+),(.+),(.+)$")
    public void diligenciarFormulario(String name, String relations ,String birth) {
        theActorInTheSpotlight().attemptsTo(
                fillDependentsForm()
                        .name(name)
                        .relationship(relations)
                        .birth(birth),
                fillAttachentsForm()
                        .ruta("\\src\\test\\resources\\File\\Archivo_prueba_1.docx")
                        .comment("comentario")



        );
    }

    @When("doy clic sobre el boton save")
    public void guardarDependencia() {

    }

    @Given("necesita agregar un nuevo archivo, da clic en el boton add del area Assigned Attachments")
    public void nuevoArchivo() {

    }

    @When("^adjunto el archivo (.+), diligencio el campo comment (.+)$")
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
