package task;

import model.TestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.TestSection;
import java.util.List;
import static userinterface.TestSection.*;

public class Login implements Task {
    private TestSection testSection;
    private List<TestData> testDataList;


    public Login(List<TestData> credentials) {
        this.testDataList = credentials;
    }

    public static Login inThePageWithThe(List<TestData> credentials) {
        return Tasks.instrumented(Login.class, credentials);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(testSection),
                Enter.theValue(testDataList.get(0).getUsuario()).into(INPUT_NAME_LOGIN),
                Enter.theValue(testDataList.get(0).getContrasena()).into(INPUT_PASSWORD_LOGIN),
                Click.on(SIGN_IN_BUTTON)
        );

    }
}
