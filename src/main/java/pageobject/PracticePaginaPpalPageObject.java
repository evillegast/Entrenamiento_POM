package pageobject;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://practice.automationtesting.in/test-cases")

public class PracticePaginaPpalPageObject extends PageObject {

    By inpAccount = By.xpath("//a[normalize-space()='My Account']");
    By txtLogin = By.xpath("//input[@id='username']");
    By txtPassword = By.xpath("//input[@id='password']");
    By btnLogin = By.xpath("//input[@name='login']");
    By msgMensajeBienvenida = By.xpath("//strong[normalize-space()='evillegas438']");
    By btnDemoSite = By.xpath("//a[normalize-space()='Demo Site']");
    By btnCerrarSesion = By.xpath("//a[normalize-space()='Logout']");

    public By getInpAccount() {
        return inpAccount;
    }

    public By getTxtLogin() {
        return txtLogin;
    }

    public By getTxtPassword() {
        return txtPassword;
    }

    public By getBtnLogin() {
        return btnLogin;
    }

    public By getMsgMensajeBienvenida() {
        return msgMensajeBienvenida;
    }

    public By getBtnDemoSite() {
        return btnDemoSite;
    }

    public By getBtnCerrarSesion() {
        return btnCerrarSesion;
    }
}


