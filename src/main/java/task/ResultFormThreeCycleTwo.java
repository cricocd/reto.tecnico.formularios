package task;
import model.TestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.TestSection;
import java.util.List;

import static userinterface.TestSection.*;

public class ResultFormThreeCycleTwo implements Task {
    private TestSection testSection;
    private List<TestData> testDataList;


    public ResultFormThreeCycleTwo(List<TestData> credentials) {
        this.testDataList = credentials;
    }

    public static ResultFormThreeCycleTwo inThePageWithThe(List<TestData> credentials) {
        return Tasks.instrumented(ResultFormThreeCycleTwo.class, credentials);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(INPUT_FORM_THREE),
                Enter.theValue(testDataList.get(0).getLetrasSegundoCiclo()).into(INPUT_FORM_THREE)
        );

    }
}
