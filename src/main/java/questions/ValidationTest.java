package questions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static net.serenitybdd.screenplay.questions.Text.*;
import static userinterface.TestSection.FINAL_MESSAGE;

public class ValidationTest implements Question<Boolean> {
    private final String data;

    public ValidationTest(String data) {
        this.data = data;
    }

    public static ValidationTest data(String data) {
        return new ValidationTest(data);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String validation = of(FINAL_MESSAGE).viewedBy(actor).asString();
        System.out.println(data);
        System.out.println(validation);
        return validation.contains(data);
    }
}

