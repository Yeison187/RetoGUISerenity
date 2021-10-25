package co.com.sofka.tasks.orangehrm;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class BrowseToOrange implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

        );
    }

    public static BrowseToOrange browseToOrange(){
        return new BrowseToOrange();
    }
}
