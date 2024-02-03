package task;
import model.TestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.TestSection;

import java.util.List;
import static userinterface.TestSection.*;

public class ResultFormOneCycleSeven implements Task {

    private TestSection testSection;
    private List<TestData> testDataList;

    public static ResultFormOneCycleSeven withThe() {
        return Tasks.instrumented(ResultFormOneCycleSeven.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(SELECT_FORM_ONE_CYCLE_ONE),
                Click.on(ANSWER_FORM_ONE_CYCLE_SEVEN)

        );
    }
}