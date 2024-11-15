@SuiteSms @PlataformaSmsEnvioUnitario
Feature: CP-04 - Sms Envio Unitario

  Background: Validar el envio de un SMS

    Given El ususario entra a la plataforma SMS
    When ingresa credenciales validas en la plataforma

      @EnvioUnitarioSMS
      Scenario: 1 - Envio Unitario de SMS
        And ingresa a la opcion SMS
        And ingresa a la opcion Envio Unitario
        And click en nuevo mensaje
        And ingressa informacion del mensaje
        And click en boton gestionar
        And click en boton confirmar
        Then Muestra Mensaje Enviado