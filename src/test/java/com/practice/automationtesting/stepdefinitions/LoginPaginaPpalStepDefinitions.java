package com.practice.automationtesting.stepdefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import pageobject.PracticePaginaPpalPageObject;
import steps.LoginPaginaPpalStep;

import java.io.IOException;

public class LoginPaginaPpalStepDefinitions {

    @Steps
    LoginPaginaPpalStep loginPaginaPpalStep;


    @Dado("^que el usuario se encuentre en la página web$")
    public void queElUsuarioSeEncuentreEnLaPáginaWeb() {

        loginPaginaPpalStep.openBrowser();

    }


    @Cuando("^ingresa sus credenciales$")
    public void ingresaSusCredenciales() throws IOException {
        loginPaginaPpalStep.clicMyAccount();
        loginPaginaPpalStep.ingresarUsuario();
        loginPaginaPpalStep.ingresarClave();
        loginPaginaPpalStep.clickBtnLogin();


    }

    @Entonces("^se visualiza el panel principal de registro$")
    public void seVisualizaElPanelPrincipalDeRegistro() {
        loginPaginaPpalStep.validarMensaje();
        loginPaginaPpalStep.paginaFormulario();
        //loginPaginaPpalStep.cerrarSesion();

    }
}
