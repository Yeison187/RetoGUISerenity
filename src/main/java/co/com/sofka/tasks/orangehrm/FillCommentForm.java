package co.com.sofka.tasks.orangehrm;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.sofka.userinterfaces.orange.orangeloginmyinfo.*;

public class FillCommentForm implements Task {

    private String comment;


    public FillCommentForm comment(String comment) {
        this.comment = comment;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(


                Scroll.to(BOX_COMMENT),
                Enter.theValue(comment).into(BOX_COMMENT),

                Scroll.to(BUTTON_COMMENT),
                Click.on(BUTTON_COMMENT),

                Scroll.to(SHARE_COMMENT),
                Click.on(SHARE_COMMENT),

                Scroll.to(CONFIRM_SHARE_COMMENT),
                Click.on(CONFIRM_SHARE_COMMENT)



        );


    }

    public static FillCommentForm fillCommentForm(){
        return new FillCommentForm();
    }
}
