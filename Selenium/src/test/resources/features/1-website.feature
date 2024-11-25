@pruebaEureka @Website
Feature: CP-01 - Validar contenido del sitio web

  Scenario: 1 - Muestra la cantidad de etiquetas H1 e imprime los textos existentes en ellas
    When el usuario navega al sitio web
    Then la aplicacion debe mostrar la cantidad de etiquetas H1 y sus textos

  Scenario: 2 - Cuenta la cantidad de etiquetas de párrafo (<p>) que existen en el sitio
    When el usuario navega al sitio web
    Then la aplicacion debe mostrar la cantidad de etiquetas de párrafo p

#  Scenario: 3 - Validar el título del sitio
#    Given el usuario navega al sitio web
#    Then el título del sitio debe ser "Inicio - Banco Central de Chile"

  Scenario: 4 - Indicar el valor encontrado en la UF, UTM, Dólar observado y Euro
    When el usuario navega al sitio web
    Then la aplicacion debe mostrar los valores encontrados en la UF, UTM, Dólar observado y Euro