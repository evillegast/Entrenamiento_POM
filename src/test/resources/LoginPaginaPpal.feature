#language: es

Característica: ingresar a la pagina web
  Para validar los datos del usuario

  @EscenarioLogin
  Escenario:  Acceso  la pagina Principal
    Dado  que el usuario se encuentre en la página web
    Cuando ingresa sus credenciales
    Entonces se visualiza el panel principal de registro



