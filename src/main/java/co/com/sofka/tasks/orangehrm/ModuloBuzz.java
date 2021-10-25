package co.com.sofka.tasks.orangehrm;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
;import static co.com.sofka.userinterfaces.orange.orangeloginmyinfo.*;

public class ModuloBuzz implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(BUZZ_MODUL),
                Click.on(BUZZ_MODUL),

                Scroll.to(MOST_LIKE_POST),
                Click.on(MOST_LIKE_POST),

                Scroll.to(POST_THREE),
                Click.on(POST_THREE),

                Click.on(LIKE),
                Click.on(LIKE_POST)








        );

    }
    public static ModuloBuzz moduloBuzz(){
        return new ModuloBuzz();
    }
}
