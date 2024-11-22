@pruebalogin1 @Login
Feature: CP-01 - Validar Inicio de sesion

  Background: Validar el inicio de sesion con credenciales validar e invalidas

    Given el usuario navega al sitio web

    @ValidCredentials
    Scenario: 1- Validar con credenciales correctas
      When ingresa credenciales validas
      Then la aplicacion deberia mostrar el modulo principal de productos

    @InValidCredentials
    Scenario: 2 - Validar con credenciales incorrectas
      When  ingresa credenciales invalidas
      Then la aplicacion debe mostrar un mensaje de error