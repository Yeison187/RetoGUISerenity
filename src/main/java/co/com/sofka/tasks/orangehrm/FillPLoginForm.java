package co.com.sofka.tasks.orangehrm;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static co.com.sofka.userinterfaces.orange.orangeloginmyinfo.*;

public class FillPLoginForm implements Task {

    private String user;
    private String pass;

    public FillPLoginForm user(String user) {
        this.user = user;
        return this;
    }

    public FillPLoginForm pass(String pass) {
        this.pass = pass;
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
                Click.on(SUBMIT)


        );

    }

    public static FillPLoginForm fillPLoginFormForm(){
        return new FillPLoginForm();
    }
}
