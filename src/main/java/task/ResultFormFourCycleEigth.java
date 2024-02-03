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

public class ResultFormFourCycleEigth implements Task {
    private TestSection testSection;
    private List<TestData> testDataList;


    public ResultFormFourCycleEigth(List<TestData> credentials) {
        this.testDataList = credentials;
    }

    public static ResultFormFourCycleEigth inThePageWithThe(List<TestData> credentials) {
        return Tasks.instrumented(ResultFormFourCycleEigth.class, credentials);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(INPUT_FORM_FOUR),
                Enter.theValue(testDataList.get(0).getFigurasOctavoCiclo()).into(INPUT_FORM_FOUR),
                Click.on(SEND_BUTTON)

        );

    }
}