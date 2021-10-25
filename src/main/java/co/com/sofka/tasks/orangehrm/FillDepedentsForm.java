package co.com.sofka.tasks.orangehrm;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.sofka.userinterfaces.orange.orangeloginmyinfo.*;


public class FillDepedentsForm implements Task {

    private String birth;
    private String name;
    private String relationship;


    public FillDepedentsForm birth(String birth) {
        this.birth = birth;
        return this;
    }

    public FillDepedentsForm name(String name) {
        this.name = name;
        return this;
    }

    public FillDepedentsForm relationship(String relationship) {
        this.relationship = relationship;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Scroll.to(MY_INFO),
                Click.on(MY_INFO),

                Scroll.to(DEPENDENTS),
                Click.on(DEPENDENTS),

                Scroll.to(ADD_DEPENDENTS),
                Click.on(ADD_DEPENDENTS),

                Scroll.to(NAME_DEPENDENTS),
                Enter.theValue(name).into(NAME_DEPENDENTS),

                SelectFromOptions.byVisibleText(relationship).from(SELECT_RELATIONSHIP),

                Scroll.to(BIRTH),
                Enter.theValue(birth).into(BIRTH),

                Scroll.to(SAVE_DEPENDENTS),
                Click.on(SAVE_DEPENDENTS)


        );
    }

    public static FillDepedentsForm fillDependentsForm() {
        return new FillDepedentsForm();
    }

}
