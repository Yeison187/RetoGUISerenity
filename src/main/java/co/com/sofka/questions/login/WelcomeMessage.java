package co.com.sofka.questions.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userinterfaces.orange.orangeloginmyinfo.*;

public class WelcomeMessage implements Question<Boolean> {
    private String welcome;

    @Override
    public Boolean answeredBy(Actor actor) {
        System.out.println(OPTION_DASHBOARD.resolveFor(actor).getText());
        return (OPTION_DASHBOARD.resolveFor(actor).containsOnlyText(welcome));

    }

    public WelcomeMessage welcomeMessage(String welcome) {
        this.welcome = welcome;
        return this;
    }

    public WelcomeMessage is() {
        return this;
    }

    public static WelcomeMessage welcome() {
        return new WelcomeMessage();
    }

}
