@SuiteSms @PlataformaSmsLogin
Feature: CP-03 - Sms Validacion Credenciales

  Background: Validacion Credenciales Correctas

    Given El ususario entra a la plataforma SMS

    @ValidacionCredencialesSMS
    Scenario: 1 - Valida Credenciales correctas
      When ingresa credenciales validas en la plataforma
      Then aplicacion muestra el dashboard de la plataforma

    @ValidacionCredencialesConErrorSMS
    Scenario: 2 - Ingreso Credenciales incorrectas
      When ingresa credenciales invalidas en la plataforma
      Then aplicacion muestra mensaje de error

    @SolicitudCambioClaveSMS
    Scenario: 3 - Cambio de clave
      When presiona opcion cambio de clave
      And  el sistema le solicita el correo electronico
      And  usuario presiona boton envio link recuperacion
      Then correo enviado correctamente