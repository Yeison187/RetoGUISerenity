package co.com.sofka.tasks.practiceform;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.conditions.Check;
import org.openqa.selenium.Keys;

import static co.com.sofka.userinterfaces.practiceform.PracticeForm.*;
import static co.com.sofka.util.Gender.*;

public class FillPracticeForm implements Task {

    private String user;
    private String pass;
    private String ruta = System.getProperty("user.dir")+"\\src\\test\\resources\\File\\Archivo_prueba_2.docx";
    private String birth;


    public FillPracticeForm user(String user) {
        this.user = user;
        return this;
    }

    public FillPracticeForm pass(String pass) {
        this.pass = pass;
        return this;
    }

    public FillPracticeForm ruta(String ruta) {
        this.ruta = ruta;
        return this;
    }

    public FillPracticeForm birth(String birth) {
        this.birth = birth;
        return this;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Scroll.to(USER_NAME),
                Enter.theValue(user).into(USER_NAME),

                Scroll.to(PASSWORD),
                Enter.theValue(this.pass).into(PASSWORD),

                Scroll.to(SUBMIT),
                Click.on(SUBMIT),

                Scroll.to(MY_INFO),
                Click.on(MY_INFO),

                Scroll.to(DEPENDENTS),
                Click.on(DEPENDENTS),

                Scroll.to(ADD_DEPENDENTS),
                Click.on(ADD_DEPENDENTS),

                Scroll.to(NAME_DEPENDENTS),
                Enter.theValue(this.pass).into(NAME_DEPENDENTS),

                SelectFromOptions.byVisibleText("Child").from(SELECT_RELATIONSHIP),

                Scroll.to(BIRTH),
                Enter.theValue("2021-10-03").into(BIRTH),

                Scroll.to(SAVE_DEPENDENTS),
                Click.on(SAVE_DEPENDENTS),

                Scroll.to(ADD_ATTACHSMENT),
                Click.on(ADD_ATTACHSMENT),


                Enter.keyValues(ruta).into(ADD_FILE),


                Enter.theValue("Prueba").into(COMMENT),

                Scroll.to(UPLOAD),
                Click.on(UPLOAD)









        );

    }

    public static FillPracticeForm fillPracticeForm(){
        return new FillPracticeForm();
    }
}
