package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.github.bonigarcia.wdm.WebDriverManager;
import model.SetData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.ValidationTest;
import task.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static userinterface.TestSection.FINAL_MESSAGE;

import userinterface.TestSection;


public class StepDefinitions {

    private final SetData modelData = new SetData();

    @Before
    public void setStage() {
        setTheStage(new OnlineCast());
        theActorCalled("chris");
    }

    @Dado("^Chris tiene una cuenta activa en la aplicacion$")
    public void chrisTieneUnaCuentaActivaEnLaAplicacion()  {
    }

    @Dado("^se loguea correctamente en la pagina con sus credenciales$")
    public void seLogueaCorrectamenteEnLaPaginaConSusCredenciales(DataTable credentials)  {
        theActorCalled("Chris").wasAbleTo(Login.inThePageWithThe(modelData.setData(credentials)));
    }
    @Cuando("el se dirige al primer formulario selecciona el numero correspondiente en el primer ciclo")
    public void elSeDirigeAlPrimerFormularioSeleccionaElNumeroCorrespondienteEnElPrimerCiclo() {
        theActorCalled("Chris").attemptsTo(ResultFormOneCycleOne.withThe());
    }

    @Cuando("el se dirige al segundo formulario selecciona el numero correcto en el primer ciclo")
    public void elSeDirigeAlSegundoFormularioSeleccionaElNumeroCorrectoEnElPrimerCiclo() {
        theActorCalled("Chris").attemptsTo(ResultFormTwoCycleOne.withThe());
    }

    @Cuando("el se dirige al tercer formulario escribe la cantidad de letras correctas en el primer ciclo")
    public void elSeDirigeAlTercerFormularioEscribeLaCantidadDeLetrasCorrectasEnElPrimerCiclo(DataTable credentials) {
        theActorCalled("Chris").wasAbleTo(ResultFormThreeCycleOne.inThePageWithThe(modelData.setData(credentials)));
    }

    @Cuando("el se dirige al cuarto formulario escribe el numero de figuras correcto en  el primer ciclo")
    public void elSeDirigeAlCuartoFormularioEscribeElNumeroDeFigurasCorrectoEnElPrimerCiclo(DataTable amount) {
        theActorCalled("Chris").wasAbleTo(ResultFormFourCycleOne.inThePageWithThe(modelData.setData(amount)));
    }

    @Cuando("el se dirige al primer formulario selecciona el numero correspondiente en el segundo ciclo")
    public void elSeDirigeAlPrimerFormularioSeleccionaElNumeroCorrespondienteEnElSegundoCiclo() {
        theActorCalled("Chris").attemptsTo(ResultFormOneCycleTwo.withThe());
    }

    @Cuando("el se dirige al segundo formulario selecciona el numero correcto en el segundo ciclo")
    public void elSeDirigeAlSegundoFormularioSeleccionaElNumeroCorrectoEnElSegundoCiclo() {
        theActorCalled("Chris").attemptsTo(ResultFormTwoCycleTwo.withThe());
    }

    @Cuando("el se dirige al tercer formulario escribe la cantidad de letras correctas en el segundo ciclo")
    public void elSeDirigeAlTercerFormularioEscribeLaCantidadDeLetrasCorrectasEnElSegundoCiclo(DataTable credentials) {
        theActorCalled("Chris").wasAbleTo(ResultFormThreeCycleTwo.inThePageWithThe(modelData.setData(credentials)));
    }

    @Cuando("el se dirige al cuarto formulario escribe el numero de figuras correcto en  el segundo ciclo")
    public void elSeDirigeAlCuartoFormularioEscribeElNumeroDeFigurasCorrectoEnElSegundoCiclo(DataTable amount) {
        theActorCalled("Chris").wasAbleTo(ResultFormFourCycleTwo.inThePageWithThe(modelData.setData(amount)));
    }

    @Cuando("el se dirige al primer formulario selecciona el numero correspondiente en el tercer ciclo")
    public void elSeDirigeAlPrimerFormularioSeleccionaElNumeroCorrespondienteEnElTercerCiclo() {
        theActorCalled("Chris").attemptsTo(ResultFormOneCycleThree.withThe());
    }

    @Cuando("el se dirige al segundo formulario selecciona el numero correcto en el tercer ciclo")
    public void elSeDirigeAlSegundoFormularioSeleccionaElNumeroCorrectoEnElTercerCiclo() {
        theActorCalled("Chris").attemptsTo(ResultFormTwoCycleThree.withThe());
    }

    @Cuando("el se dirige al tercer formulario escribe la cantidad de letras correctas en el tercer ciclo")
    public void elSeDirigeAlTercerFormularioEscribeLaCantidadDeLetrasCorrectasEnElTercerCiclo(DataTable credentials) {
        theActorCalled("Chris").attemptsTo(ResultFormThreeCycleThree.inThePageWithThe(modelData.setData(credentials)));
    }

    @Cuando("el se dirige al cuarto formulario escribe el numero de figuras correcto en el tercer ciclo")
    public void elSeDirigeAlCuartoFormularioEscribeElNumeroDeFigurasCorrectoEnElTercerCiclo(DataTable amount) {
        theActorCalled("Chris").attemptsTo(ResultFormFourCycleThree.inThePageWithThe(modelData.setData(amount)));
    }

    @Cuando("el se dirige al primer formulario selecciona el numero correspondiente en el cuarto ciclo")
    public void elSeDirigeAlPrimerFormularioSeleccionaElNumeroCorrespondienteEnElCuartoCiclo() {
        theActorCalled("Chris").attemptsTo(ResultFormOneCycleFour.withThe());

    }

    @Cuando("el se dirige al segundo formulario selecciona el numero correcto en el cuarto ciclo")
    public void elSeDirigeAlSegundoFormularioSeleccionaElNumeroCorrectoEnElCuartoCiclo() {
        theActorCalled("Chris").attemptsTo(ResultFormTwoCycleFour.withThe());

    }

    @Cuando("el se dirige al tercer formulario escribe la cantidad de letras correctas en el cuarto ciclo")
    public void elSeDirigeAlTercerFormularioEscribeLaCantidadDeLetrasCorrectasEnElCuartoCiclo(DataTable credentials) {
        theActorCalled("Chris").attemptsTo(ResultFormThreeCycleFour.inThePageWithThe(modelData.setData(credentials)));

    }

    @Cuando("el se dirige al cuarto formulario escribe el numero de figuras correcto en  el cuarto ciclo")
    public void elSeDirigeAlCuartoFormularioEscribeElNumeroDeFigurasCorrectoEnElCuartoCiclo(DataTable amount) {
        theActorCalled("Chris").attemptsTo(ResultFormFourCycleFour.inThePageWithThe(modelData.setData(amount)));

    }

    @Cuando("el se dirige al primer formulario selecciona el numero correspondiente en el quinto ciclo")
    public void elSeDirigeAlPrimerFormularioSeleccionaElNumeroCorrespondienteEnElQuintoCiclo() {
        theActorCalled("Chris").attemptsTo(ResultFormOneCycleFive.withThe());
    }

    @Cuando("el se dirige al segundo formulario selecciona el numero correcto en el quinto ciclo")
    public void elSeDirigeAlSegundoFormularioSeleccionaElNumeroCorrectoEnElQuintoCiclo() {
        theActorCalled("Chris").attemptsTo(ResultFormTwoCycleFive.withThe());
    }

    @Cuando("el se dirige al tercer formulario escribe la cantidad de letras correctas en el quinto ciclo")
    public void elSeDirigeAlTercerFormularioEscribeLaCantidadDeLetrasCorrectasEnElQuintoCiclo(DataTable credentials) {
        theActorCalled("Chris").attemptsTo(ResultFormThreeCycleFive.inThePageWithThe(modelData.setData(credentials)));
    }

    @Cuando("el se dirige al cuarto formulario escribe el numero de figuras correcto en  el quinto ciclo")
    public void elSeDirigeAlCuartoFormularioEscribeElNumeroDeFigurasCorrectoEnElQuintoCiclo(DataTable amount) {
        theActorCalled("Chris").attemptsTo(ResultFormFourCycleFive.inThePageWithThe(modelData.setData(amount)));
    }

    @Cuando("el se dirige al primer formulario selecciona el numero correspondiente en el sexto ciclo")
    public void elSeDirigeAlPrimerFormularioSeleccionaElNumeroCorrespondienteEnElSextoCiclo() {
        theActorCalled("Chris").attemptsTo(ResultFormOneCycleSix.withThe());
    }

    @Cuando("el se dirige al segundo formulario selecciona el numero correcto en el sexto ciclo")
    public void elSeDirigeAlSegundoFormularioSeleccionaElNumeroCorrectoEnElSextoCiclo() {
        theActorCalled("Chris").attemptsTo(ResultFormTwoCycleSix.withThe());
    }

    @Cuando("el se dirige al tercer formulario escribe la cantidad de letras correctas en el sexto ciclo")
    public void elSeDirigeAlTercerFormularioEscribeLaCantidadDeLetrasCorrectasEnElSextoCiclo(DataTable credentials) {
        theActorCalled("Chris").attemptsTo(ResultFormThreeCycleSix.inThePageWithThe(modelData.setData(credentials)));
    }

    @Cuando("el se dirige al cuarto formulario escribe el numero de figuras correcto en  el sexto ciclo")
    public void elSeDirigeAlCuartoFormularioEscribeElNumeroDeFigurasCorrectoEnElSextoCiclo(DataTable amount) {
        theActorCalled("Chris").attemptsTo(ResultFormFourCycleSix.inThePageWithThe(modelData.setData(amount)));
    }

    @Cuando("el se dirige al primer formulario selecciona el numero correspondiente en el septimo ciclo")
    public void elSeDirigeAlPrimerFormularioSeleccionaElNumeroCorrespondienteEnElSeptimoCiclo() {
        theActorCalled("Chris").attemptsTo(ResultFormOneCycleSeven.withThe());
    }

    @Cuando("el se dirige al segundo formulario selecciona el numero correcto en el septimo ciclo")
    public void elSeDirigeAlSegundoFormularioSeleccionaElNumeroCorrectoEnElSeptimoCiclo() {
        theActorCalled("Chris").attemptsTo(ResultFormTwoCycleSeven.withThe());
    }

    @Cuando("el se dirige al tercer formulario escribe la cantidad de letras correctas en el septimo ciclo")
    public void elSeDirigeAlTercerFormularioEscribeLaCantidadDeLetrasCorrectasEnElSeptimoCiclo(DataTable credentials) {
        theActorCalled("Chris").attemptsTo(ResultFormThreeCycleSeven.inThePageWithThe(modelData.setData(credentials)));
    }

    @Cuando("el se dirige al cuarto formulario escribe el numero de figuras correcto en  el septimo ciclo")
    public void elSeDirigeAlCuartoFormularioEscribeElNumeroDeFigurasCorrectoEnElSeptimoCiclo(DataTable amount) {
        theActorCalled("Chris").attemptsTo(ResultFormFourCycleSeven.inThePageWithThe(modelData.setData(amount)));
    }

    @Cuando("el se dirige al primer formulario selecciona el numero correspondiente en el octavo ciclo")
    public void elSeDirigeAlPrimerFormularioSeleccionaElNumeroCorrespondienteEnElOctavoCiclo() {
        theActorCalled("Chris").attemptsTo(ResultFormOneCycleEigth.withThe());
    }

    @Cuando("el se dirige al segundo formulario selecciona el numero correcto en el octavo ciclo")
    public void elSeDirigeAlSegundoFormularioSeleccionaElNumeroCorrectoEnElOctavoCiclo() {
        theActorCalled("Chris").attemptsTo(ResultFormTwoCycleEigth.withThe());
    }

    @Cuando("el se dirige al tercer formulario escribe la cantidad de letras correctas en el octavo ciclo")
    public void elSeDirigeAlTercerFormularioEscribeLaCantidadDeLetrasCorrectasEnElOctavoCiclo(DataTable credentials) {
        theActorCalled("Chris").attemptsTo(ResultFormThreeCycleEigth.inThePageWithThe(modelData.setData(credentials)));
    }

    @Cuando("el se dirige al cuarto formulario escribe el numero de figuras correcto en  el octavo ciclo")
    public void elSeDirigeAlCuartoFormularioEscribeElNumeroDeFigurasCorrectoEnElOctavoCiclo(DataTable amount) {
        theActorCalled("Chris").attemptsTo(ResultFormFourCycleEigth.inThePageWithThe(modelData.setData(amount)));
    }

    @Cuando("el se dirige al primer formulario selecciona el numero correspondiente en el noveno ciclo")
    public void elSeDirigeAlPrimerFormularioSeleccionaElNumeroCorrespondienteEnElNovenoCiclo() {
        theActorCalled("Chris").attemptsTo(ResultFormOneCycleNine.withThe());
    }

    @Cuando("el se dirige al segundo formulario selecciona el numero correcto en el noveno ciclo")
    public void elSeDirigeAlSegundoFormularioSeleccionaElNumeroCorrectoEnElNovenoCiclo() {
        theActorCalled("Chris").attemptsTo(ResultFormTwoCycleNine.withThe());
    }

    @Cuando("el se dirige al tercer formulario escribe la cantidad de letras correctas en el noveno ciclo")
    public void elSeDirigeAlTercerFormularioEscribeLaCantidadDeLetrasCorrectasEnElNovenoCiclo(DataTable credentials) {
        theActorCalled("Chris").attemptsTo(ResultFormThreeCycleNine.inThePageWithThe(modelData.setData(credentials)));
    }

    @Cuando("el se dirige al cuarto formulario escribe el numero de figuras correcto en  el noveno ciclo")
    public void elSeDirigeAlCuartoFormularioEscribeElNumeroDeFigurasCorrectoEnElNovenoCiclo(DataTable amount) {
        theActorCalled("Chris").attemptsTo(ResultFormFourCycleNine.inThePageWithThe(modelData.setData(amount)));
    }

    @Cuando("el se dirige al primer formulario selecciona el numero correspondiente en el decimo ciclo")
    public void elSeDirigeAlPrimerFormularioSeleccionaElNumeroCorrespondienteEnElDecimoCiclo() {
        theActorCalled("Chris").attemptsTo(ResultFormOneCycleTen.withThe());
    }

    @Cuando("el se dirige al segundo formulario selecciona el numero correcto en el decimo ciclo")
    public void elSeDirigeAlSegundoFormularioSeleccionaElNumeroCorrectoEnElDecimoCiclo() {
        theActorCalled("Chris").attemptsTo(ResultFormTwoCycleTen.withThe());
    }

    @Cuando("el se dirige al tercer formulario escribe la cantidad de letras correctas en el decimo ciclo")
    public void elSeDirigeAlTercerFormularioEscribeLaCantidadDeLetrasCorrectasEnElDecimoCiclo(DataTable credentials) {
        theActorCalled("Chris").attemptsTo(ResultFormThreeCycleTen.inThePageWithThe(modelData.setData(credentials)));
    }

    @Cuando("el se dirige al cuarto formulario escribe el numero de figuras correcto en  el decimo ciclo")
    public void elSeDirigeAlCuartoFormularioEscribeElNumeroDeFigurasCorrectoEnElDecimoCiclo(DataTable amount) {
        theActorCalled("Chris").attemptsTo(ResultFormFourCycleTen.inThePageWithThe(modelData.setData(amount)));
    }
    @Entonces("envia la informacion continua el ciclo y puede ver el mensaje {string}")
    public void enviaLaInformacionContinuaElCicloYPuedeVerElMensaje(String mensajeFinal) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidationTest.data(mensajeFinal)));
    }
    @After
    public void closeDriver(){
        WebDriverManager.chromedriver().quit();
    }

}
