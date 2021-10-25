package co.com.sofka.tasks.orangehrm;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static co.com.sofka.userinterfaces.orange.orangeloginmyinfo.*;


public class FillAttachmentsForm implements Task {
    private String ruta;
    private String comment;

    public FillAttachmentsForm ruta(String ruta) {
        this.ruta = System.getProperty("user.dir")+ruta;
        return this;
    }

    public FillAttachmentsForm comment(String comment) {
        this.comment = comment;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(MY_INFO),
                Click.on(MY_INFO),

                Scroll.to(DEPENDENTS),
                Click.on(DEPENDENTS),

                Scroll.to(ADD_ATTACHSMENT),
                Click.on(ADD_ATTACHSMENT),

                Enter.keyValues(ruta).into(ADD_FILE),

                Enter.theValue(comment).into(COMMENT),
                Scroll.to(UPLOAD),
                Click.on(UPLOAD)

        );

    }

    public static FillAttachmentsForm fillAttachentsForm() {
        return new FillAttachmentsForm();
    }
}
