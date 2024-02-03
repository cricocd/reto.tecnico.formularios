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

public class ResultFormThreeCycleSix implements Task {
    private TestSection testSection;
    private List<TestData> testDataList;


    public ResultFormThreeCycleSix(List<TestData> credentials) {
        this.testDataList = credentials;
    }

    public static ResultFormThreeCycleSix inThePageWithThe(List<TestData> credentials) {
        return Tasks.instrumented(ResultFormThreeCycleSix.class, credentials);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(INPUT_FORM_THREE),
                Enter.theValue(testDataList.get(0).getLetrasSextoCiclo()).into(INPUT_FORM_THREE)
        );

    }
}
