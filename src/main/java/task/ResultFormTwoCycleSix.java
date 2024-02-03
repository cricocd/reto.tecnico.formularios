package task;
import model.TestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.TestSection;

import java.util.List;

import static userinterface.TestSection.*;

public class ResultFormTwoCycleSix implements Task {


    private TestSection testSection;
    private List<TestData> testDataList;

    public static ResultFormTwoCycleSix withThe() {
        return Tasks.instrumented(ResultFormTwoCycleSix.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(ANSWER_FORM_TWO_CYCLE_SIX)

        );
    }
}