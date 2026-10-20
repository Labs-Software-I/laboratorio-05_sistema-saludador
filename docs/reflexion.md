# Reflexión sobre la práctica de laboratorio: Desarrollo de una aplicación JavaFX

## 1. Introducción

Durante el desarrollo de esta práctica de laboratorio se trabajó en la creación de una aplicación de escritorio utilizando Java y JavaFX. El objetivo fue comprender la estructura básica de un proyecto Java, identificar la función de sus principales archivos y directorios, y poner en funcionamiento una interfaz gráfica que permitiera solicitar información al usuario y generar un saludo personalizado.

Además de la implementación de la aplicación, la práctica permitió explorar herramientas de desarrollo como Visual Studio Code, Maven y Maven Wrapper, así como comprender el proceso de compilación y ejecución de un proyecto Java.

## 2. Retos encontrados

Uno de los principales retos fue comprender la organización de un proyecto Java y la responsabilidad de cada uno de sus componentes. Al inicio, fue necesario identificar la diferencia entre los archivos que contienen el código fuente, los destinados a la documentación y aquellos que permiten configurar el proyecto.

Otro reto importante fue la configuración del entorno de desarrollo y la ejecución de la aplicación. Inicialmente, al intentar ejecutar el comando `mvn clean javafx:run`, PowerShell indicó que no reconocía el comando `mvn`. Esto generó dudas sobre la necesidad de instalar Maven y sobre la configuración del entorno. Posteriormente, se identificó que el proyecto contaba con Maven Wrapper, por lo que no era necesario instalar Maven globalmente. 

Esta experiencia permitió comprender la importancia de interpretar los mensajes de error, realizar pruebas controladas y buscar soluciones de manera progresiva, en lugar de modificar o reinstalar herramientas sin conocer la causa del problema.

## 3. Descubrimientos y aprendizajes

Uno de los aprendizajes más importantes fue comprender que Java, Maven y Maven Wrapper cumplen funciones diferentes.

Java proporciona el entorno necesario para ejecutar los programas y las herramientas para compilar el código fuente. Maven, por su parte, administra la construcción del proyecto y sus dependencias. Maven Wrapper permite utilizar una versión específica de Maven definida por el propio proyecto, sin necesidad de contar con una instalación global de esta herramienta.

También se comprendió que los comandos de ejecución pueden variar según el entorno y la configuración del equipo. Por ejemplo, `mvn clean javafx:run` requiere que el comando `mvn` esté disponible en el `PATH`, mientras que `.\mvnw.cmd clean javafx:run` ejecuta directamente el archivo del Wrapper ubicado en la raíz del proyecto.

Otro descubrimiento fue la importancia de organizar adecuadamente los archivos y directorios. Una estructura clara facilita el mantenimiento del software, la identificación de errores y la incorporación de nuevas funcionalidades.

Finalmente, la práctica permitió reconocer que desarrollar software no consiste únicamente en escribir código. También implica configurar herramientas, comprender la estructura del proyecto, interpretar errores y verificar que la aplicación funcione correctamente.

## 4. Estructura del software

El proyecto se organizó siguiendo una estructura compatible con Maven, separando el código fuente de los archivos de configuración y documentación.

La estructura principal del proyecto es la siguiente:

```text
sistema-saludador/
├── .mvn/
│   └── wrapper/
│       ├── maven-wrapper.jar
│       └── maven-wrapper.properties
├── docs/
│   └── reflexion.md
├── prompts/
│   ├── prompt_01.txt
│   └── prompt_02.txt
├── src/main/java/com/saludador/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── saludador/
│       │           ├── controlador/
│       │           │   └── Controlador.java
│       │           ├── modelo/
│       │           │   └── Estudiante.java
│       │           └── servicio/
│       │                └── Saludador.java
│       └── resources/
│           └── com/
│               └── saludador/
│                   └── vista.fxml
├── mvnw              
├── mvnw.cmd 
├── pom.xml
└── README.md
```

Cada elemento tiene una función específica:

- **`src/main/java/`**: contiene el código fuente principal de la aplicación.
- **`com/saludador/`**: representa la organización del paquete Java al que pertenecen las clases de la aplicación.
- **`MainApp.java`**: contiene el punto de entrada de la aplicación JavaFX y se encarga de iniciar la interfaz gráfica.
- **`Controlador.java`**: gestiona las acciones de la interfaz y la lógica asociada a la interacción con el usuario.
- **`Estudiante.java`**: Representa los datos que ingresa el estudiante para recibir un saludo.
- **`pom.xml`**: define la configuración de Maven, las dependencias y los complementos necesarios para construir y ejecutar el proyecto.
- **`.mvn/wrapper/`**, **`mvnw`** y **`mvnw.cmd`**: permiten utilizar Maven Wrapper en diferentes entornos.
- **`docs/`**: almacena el documento de reflexión sobre la práctica.
- **`prompts/`**: conserva los prompts utilizados durante el proceso de desarrollo asistido.

Esta organización permite separar las responsabilidades y facilita la comprensión del proyecto. También establece una base para incorporar nuevas clases, funcionalidades y pruebas en el futuro.

## 5. Funcionamiento de la aplicación

La aplicación desarrollada permite solicitar información al usuario para generar un saludo personalizado. El flujo general consiste en iniciar la interacción, solicitar los datos requeridos y presentar un mensaje utilizando la información ingresada.

Durante este proceso se trabajó con datos como el nombre, la edad y la selección de AM o PM. También se consideró la importancia de validar las entradas para evitar que valores incorrectos afecten el funcionamiento del programa.

La práctica permitió reconocer la utilidad de las interfaces gráficas para facilitar la interacción entre el usuario y el software, en comparación con programas que reciben y presentan información exclusivamente mediante la consola.

Asimismo, se comprendió la importancia de separar la lógica de interacción de la clase encargada de iniciar la aplicación, favoreciendo una estructura más organizada y fácil de mantener.

## 6. Compilación y ejecución

La compilación y ejecución constituyeron una parte fundamental de la práctica, ya que permitieron comprobar si el código y la configuración del proyecto eran correctos.

Inicialmente, se intentó ejecutar la aplicación mediante el comando:

```powershell
mvn clean javafx:run
```

Sin embargo, el sistema indicó que `mvn` no era reconocido. Después de revisar los archivos del proyecto, se encontró que este incluía Maven Wrapper, por lo que se utilizó el siguiente comando:

```powershell
.\mvnw.cmd clean javafx:run
```

El comando utiliza el Wrapper para ejecutar Maven y realizar las tareas necesarias. La instrucción `clean` elimina los archivos generados en compilaciones anteriores, mientras que `javafx:run` permite ejecutar la aplicación JavaFX mediante el complemento configurado en el proyecto.

Esta experiencia demostró que los problemas de ejecución no siempre se deben a errores en el código fuente. También pueden estar relacionados con la configuración del entorno, las rutas de los archivos o la forma en que se ejecutan las herramientas.

## 7. Uso de herramientas de asistencia

Durante la práctica se utilizó una herramienta de asistencia basada en inteligencia artificial para apoyar la organización del proyecto, la implementación de la aplicación y la solución de inconvenientes técnicos.

Su utilización permitió obtener orientación sobre la estructura de Maven, la configuración de JavaFX y los comandos necesarios para compilar y ejecutar el programa. Sin embargo, fue necesario ejecutar las instrucciones, observar los resultados y comunicar los errores para avanzar en la solución.

Esta experiencia permitió reconocer que las herramientas de inteligencia artificial pueden facilitar el aprendizaje y acelerar determinadas tareas, pero sus recomendaciones deben verificarse en el entorno real de desarrollo. Comprender las soluciones propuestas sigue siendo fundamental para adquirir autonomía como desarrollador.

## 8. Conclusiones

La práctica permitió adquirir una comprensión inicial del desarrollo de aplicaciones de escritorio con Java y JavaFX, así como de la organización de un proyecto basado en Maven.

Se aprendió a identificar la función de los principales archivos y directorios, a reconocer las diferencias entre Java, Maven y Maven Wrapper, y a utilizar comandos para compilar y ejecutar una aplicación.

Uno de los aprendizajes más significativos fue la resolución del problema relacionado con la ejecución del Wrapper desde la ruta original del proyecto. Mediante pruebas controladas se comprobó que la aplicación podía ejecutarse desde una ubicación alternativa, lo que permitió orientar la solución sin necesidad de reinstalar Java o Maven.

En conclusión, esta práctica no solo contribuyó al aprendizaje de herramientas y conceptos técnicos, sino que también permitió desarrollar habilidades para diagnosticar problemas, interpretar mensajes de error y trabajar de manera organizada. Estos conocimientos constituyen una base importante para abordar proyectos de software más complejos durante el desarrollo de la carrera.