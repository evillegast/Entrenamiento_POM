package steps;

import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import pageobject.PracticePaginaPpalPageObject;
import utils.InjecionDatos;

import java.io.IOException;

import static org.junit.Assert.assertThat;

public class LoginPaginaPpalStep {

    PracticePaginaPpalPageObject practicePaginaPpalPageObject = new PracticePaginaPpalPageObject();
    InjecionDatos injecionDatos = new InjecionDatos();
    private static final String NOMBRE_EXCEL="Datos.xlsx";
    private static final String NOMBRE_HOJA="usuarios";

    @Step
    public void openBrowser(){
    practicePaginaPpalPageObject.open();

    }
    @Step
    public void clicMyAccount(){
        practicePaginaPpalPageObject.getDriver().findElement(practicePaginaPpalPageObject.getInpAccount()).click();
    }

    @Step
    public void ingresarUsuario() throws IOException {
        practicePaginaPpalPageObject.getDriver().findElement(practicePaginaPpalPageObject.getTxtLogin()).click();
        practicePaginaPpalPageObject.getDriver().findElement(practicePaginaPpalPageObject.getTxtLogin()).sendKeys(injecionDatos.obtenerDatos(NOMBRE_EXCEL,NOMBRE_HOJA, 1, 0));
    }

    @Step
    public void ingresarClave() throws IOException {
        practicePaginaPpalPageObject.getDriver().findElement(practicePaginaPpalPageObject.getTxtPassword()).sendKeys(injecionDatos.obtenerDatos(NOMBRE_EXCEL,NOMBRE_HOJA, 1, 1));
    }

    @Step
    public void clickBtnLogin(){
        practicePaginaPpalPageObject.getDriver().findElement(practicePaginaPpalPageObject.getBtnLogin()).click();
    }

    @Step
    public void validarMensaje(){
        practicePaginaPpalPageObject.getDriver().findElement(practicePaginaPpalPageObject.getMsgMensajeBienvenida());
        assertThat(practicePaginaPpalPageObject.getDriver().findElement(practicePaginaPpalPageObject.getMsgMensajeBienvenida()).isDisplayed(), Matchers.is(true));
    }

    @Step
    public void paginaFormulario(){
        practicePaginaPpalPageObject.getDriver().findElement(practicePaginaPpalPageObject.getBtnDemoSite()).click();
    }

    @Step
    public void cerrarSesion(){
        practicePaginaPpalPageObject.getDriver().findElement(practicePaginaPpalPageObject.getBtnCerrarSesion()).click();
    }

}
