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

public class ResultFormFourCycleOne implements Task {
    private TestSection testSection;
    private List<TestData> testDataList;


    public ResultFormFourCycleOne(List<TestData> credentials) {
        this.testDataList = credentials;
    }

    public static ResultFormFourCycleOne inThePageWithThe(List<TestData> credentials) {
        return Tasks.instrumented(ResultFormFourCycleOne.class, credentials);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(INPUT_FORM_FOUR),
                Enter.theValue(testDataList.get(0).getFigurasPrimerCiclo()).into(INPUT_FORM_FOUR),
                Click.on(SEND_BUTTON)

        );

    }
}
