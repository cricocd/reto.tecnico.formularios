package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://tasks.evalartapp.com/automatization/")

public class TestSection extends PageObject {

    public static final Target SIGN_IN_BUTTON = Target.the("Boton para iniciar sesion").locatedBy(
            "/html/body/div/div[2]/form/button");
    public static final Target INPUT_NAME_LOGIN = Target.the("donde se escribe el usuario").locatedBy(
            "/html/body/div/div[2]/form/input[1]");
    public static final Target INPUT_PASSWORD_LOGIN = Target.the("donde se escribe la contraseña").locatedBy(
            "/html/body/div/div[2]/form/input[2]");
    public static final Target SELECT_FORM_ONE_CYCLE_ONE = Target.the("donde se despliega la lista del primer formulario").locatedBy(
            "/html/body/div[2]/form/div[1]/div[1]/select");
    public static final Target ANSWER_FORM_ONE_CYCLE_ONE  = Target.the("donde se ingresa la respuesta del primer formulario en el ciclo uno").locatedBy(
            "/html/body/div[2]/form/div[1]/div[1]/select/option[3]");
    public static final Target ANSWER_FORM_TWO_CYCLE_ONE  = Target.the("donde se ingresa la respuesta del segundo formulario en el ciclo uno").locatedBy(
            "/html/body/div[2]/form/div[1]/div[2]/div/label[6]/input");
    public static final Target ANSWER_FORM_ONE_CYCLE_TWO  = Target.the("donde se ingresa la respuesta del primer formulario en el ciclo dos").locatedBy(
            "/html/body/div[2]/form/div[1]/div[1]/select/option[13]");
    public static final Target ANSWER_FORM_TWO_CYCLE_TWO  = Target.the("donde se ingresa la respuesta del segundo formulario en el ciclo dos").locatedBy(
            "/html/body/div[2]/form/div[1]/div[2]/div/label[2]/input");
    public static final Target ANSWER_FORM_ONE_CYCLE_THREE  = Target.the("donde se ingresa la respuesta del primer formulario en el ciclo tres").locatedBy(
            "/html/body/div[2]/form/div[1]/div[1]/select/option[6]");
    public static final Target ANSWER_FORM_TWO_CYCLE_THREE = Target.the("donde se ingresa la respuesta del segundo formulario en el ciclo tres").locatedBy(
            "/html/body/div[2]/form/div[1]/div[2]/div/label[9]/input");
    public static final Target ANSWER_FORM_ONE_CYCLE_FOUR  = Target.the("donde se ingresa la respuesta del c").locatedBy(
            "/html/body/div[2]/form/div[1]/div[1]/select/option[7]");
    public static final Target ANSWER_FORM_TWO_CYCLE_FOUR  = Target.the("donde se ingresa la respuesta del segundo formulario en el ciclo cuatro").locatedBy(
            "/html/body/div[2]/form/div[1]/div[2]/div/label[13]/input");
    public static final Target ANSWER_FORM_ONE_CYCLE_FIVE  = Target.the("donde se ingresa la respuesta del primer formulario en el ciclo cinco").locatedBy(
            "/html/body/div[2]/form/div[1]/div[1]/select/option[22]");

    public static final Target ANSWER_FORM_TWO_CYCLE_FIVE  = Target.the("donde se ingresa la respuesta del segundo formulario en el ciclo cinco").locatedBy(
            "/html/body/div[2]/form/div[1]/div[2]/div/label[11]/input");

    public static final Target ANSWER_FORM_ONE_CYCLE_SIX  = Target.the("donde se ingresa la respuesta del primer formulario en el ciclo seis").locatedBy(
            "/html/body/div[2]/form/div[1]/div[1]/select/option[12]");

    public static final Target ANSWER_FORM_TWO_CYCLE_SIX  = Target.the("donde se ingresa la respuesta del segundo formulario en el ciclo seis").locatedBy(
            "/html/body/div[2]/form/div[1]/div[2]/div/label[12]/input");

    public static final Target ANSWER_FORM_ONE_CYCLE_SEVEN  = Target.the("donde se ingresa la respuesta del primer formulario en el ciclo siete").locatedBy(
            "/html/body/div[2]/form/div[1]/div[1]/select/option[2]");

    public static final Target ANSWER_FORM_TWO_CYCLE_SEVEN  = Target.the("donde se ingresa la respuesta del segundo formulario en el ciclo siete").locatedBy(
            "/html/body/div[2]/form/div[1]/div[2]/div/label[13]/input");

    public static final Target ANSWER_FORM_ONE_CYCLE_EIGTH  = Target.the("donde se ingresa la respuesta del primer formulario en el ciclo ocho").locatedBy(
            "/html/body/div[2]/form/div[1]/div[1]/select/option[4]");

    public static final Target ANSWER_FORM_TWO_CYCLE_EIGTH  = Target.the("donde se ingresa la respuesta del segundo formulario en el ciclo ocho").locatedBy(
            "/html/body/div[2]/form/div[1]/div[2]/div/label[10]/input");

    public static final Target ANSWER_FORM_ONE_CYCLE_NINE  = Target.the("donde se ingresa la respuesta del primer formulario en el ciclo nueve").locatedBy(
            "/html/body/div[2]/form/div[1]/div[1]/select/option[9]");

    public static final Target ANSWER_FORM_TWO_CYCLE_NINE  = Target.the("donde se ingresa la respuesta del segundo formulario en el ciclo nueve").locatedBy(
            "/html/body/div[2]/form/div[1]/div[2]/div/label[9]/input");

    public static final Target ANSWER_FORM_ONE_CYCLE_TEN  = Target.the("donde se ingresa la respuesta del primer formulario en el ciclo diez").locatedBy(
            "/html/body/div[2]/form/div[1]/div[1]/select/option[9]");

    public static final Target ANSWER_FORM_TWO_CYCLE_TEN  = Target.the("donde se ingresa la respuesta del segundo formulario en el ciclo diez").locatedBy(
            "/html/body/div[2]/form/div[1]/div[2]/div/label[14]/input");

    public static final Target INPUT_FORM_THREE = Target.the("donde se ingresan las letras del formulario tres").locatedBy(
            "/html/body/div[2]/form/div[1]/div[3]/textarea");

    public static final Target INPUT_FORM_FOUR = Target.the("donde se ingresa la cantidad de figuras del formulario cuatro").locatedBy(
            "/html/body/div[2]/form/div[1]/div[4]/input");

    public static final Target SEND_BUTTON = Target.the("donde se envia las respuestas de todos los formularios").locatedBy(
            "/html/body/div[2]/form/div[2]/button");
    public static final Target FINAL_MESSAGE = Target.the("donde se obserba el mensaje de finalizacion al haber completado diez ciclos").locatedBy(
            "/html/body/div/div/h1");


}
