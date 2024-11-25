# Programa Eureka 2024 - Prueba Técnica

## Criterios de aceptación.
- Este ejercicio consiste en realizar un test automático sobre un sitio web.
- La solución debe ser agregada a un repositorio GitHub.
- El repositorio debe incluir un archivo README que indique los pasos para poder ejecutarlo, indicando todos los completos que sean necesarios para ejecutar el 
aplicativo.
- El stack tecnológico a utilizar en este caso es Java con Selenium y Cucumber como complementos a las acciones.


## Ejercicio 1
 - Crear un método o rutina que abra el browser y muestre el sitio del Banco Central (http//www.bcentral.cl).
 - Muestra la cantidad de etiquetas H1 e imprime los textos existentes en ellas.
 - Cuenta la cantidad de etiquetas de párrafo (< p >) que existen en el sitio.
 - Validar que el título del sitio sea ” Inicio - Banco Central de Chile”. Si lo es debe indicar “Título correcto!!”, si no, debe mostrar “Error en el título”.
 - Finalmente, indicar el valor encontrado en la UF, UTM, Dólar observado y Euro.

## Ejercicio 2
### En esta sección se pide realizar una colección llamada “API CMF” que contenga una serie de request.
 - Request 1: “Dólar año anterior”
   * URL: https://api.cmfchile.cl/apisbifv3/recursos_api/dolar/2022?apikey={APIKEY}&formato=json
   * Por medio de API tests, crear las siguientes validaciones a la respuesta.
   * Validar que la respuesta se procese por debajo de 500 milisegundos
   * Validar que la respuesta contenga un texto que diga “Dolares”
   * Validar que la respuesta contenga un dato para el 31 de agosto de 2022.
 - Request 2: “Euro día actual”
   * URL: https://api.cmfchile.cl/apisbifv3/recursos_api/euro?apikey={APIKEY}&formato=json
   * Por medio de API tests, crear las siguientes validaciones a la respuesta.
   * Validar que la respuesta contenta un encabezado "Content-Type" en el header
   * Validar que la respuesta contenga un texto que diga “Euros”
   * Validar que la respuesta no contine valores nulos en los campos Valor y Fecha


## El proyecto está organizado en los siguientes directorios:

- /Prueba técnica QA Postman: archivos Json del Ejercicio 2
- /Selenium: Proyecto relacionado al Ejercicio 1

## Requisitos Previos
- Para visualizar los archivos JSON de Postman es necesario tener instalado el aplicativo POSTMAN.
- Para ejecutar el proyecto de Selenium es necesario realizar lo siguiente:
  1. **Java Development Kit (JDK)**: Asegúrate de tener la versión 23 o compatible instalada.
  2. **Maven**: Herramienta de automatización utilizada.
  3. **Java IDE**: Se recomienda usar IntelliJ IDEA o Eclipse.

## Pasos para Descargar y Ejecutar el Proyecto

1. **Clonar el Repositorio**
- git clone https://github.com/Sebasrdh/Prueba-TecnicaQA-Eureka.git
   cd tu_repositorio

2. **Acceder al directorio del proyecto:**
   - cd Prueba-TecnicaQA-Eureka

2. **Instalar las Dependencias**
  Mven manejará las dependencias automáticamente. Verifica que el archivo `pom.xml` esté correctamente configurado para tu entorno.
 * mvn clean install

3. **Ejecutar las pruebas**
   Para ejecutar las pruebas automatizadas del ejercicio 1 se debe ingresar a la siguiente ruta del proyecto /Selenium/src/test/java
   Dentro de esta ruta debemos dar clic derecho al archivo Runner y posteriormente clic en Run 'Runner'

Actualmente dentro de este proyecto la prueba **Validar que el título del sitio sea ” Inicio - Banco Central de Chile”. Si lo es debe indicar “Título correcto!!”, si no, debe mostrar “Error en el título”.** se encuentra comentada, ya que, esta al ejecutarla genera errores, se esta trabajando para solucionarlo.

