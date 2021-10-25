package co.com.sofka.questions.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userinterfaces.orange.orangeloginmyinfo.MESSAGE_LOGIN;

public class LoginMessage implements Question<Boolean> {

    private String invalidCredentials;

    @Override
    public Boolean answeredBy(Actor actor) {
        return (MESSAGE_LOGIN.resolveFor(actor).containsOnlyText(invalidCredentials));
    }
    public LoginMessage invalidCredentials(String invalidCredentials){
        this.invalidCredentials=invalidCredentials;
        return this;
    }
    public LoginMessage is(){
        return this;
    }
    public static LoginMessage loginInvalidCredentials(){
        return new LoginMessage();
    }
}
