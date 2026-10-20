# Sistema saludador

Aplicación de escritorio en JavaFX que saluda al estudiante por su nombre y menciona su edad, según la hora exacta en formato de 12 horas (AM/PM).

## Requisitos

- JDK 17 o superior
- Maven 3.8 o superior (Opcional)
- Variable de entorno `JAVA_HOME` apuntando al JDK (Ej: `C:\Program Files\Java\jdk-25.0.4.1`)

## Cómo ejecutar

Desde la carpeta `sistema-saludador`:

```bash
mvn clean javafx:run
```

Si Maven no se encuentra instalado, puedes usar:

```powershell
.\mvnw.cmd clean javafx:run
```

## Uso

1. Haz clic en **Solicitar saludo**.
2. Ingresa nombre, edad, hora (1 a 12), minutos (0 a 59) y AM o PM.
3. El sistema muestra un saludo personalizado.
4. Si cancelas o ingresas un dato inválido, puedes intentarlo de nuevo.

## Estructura de archivos
```
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