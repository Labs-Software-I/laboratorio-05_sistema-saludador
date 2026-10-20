# Sistema saludador

Aplicación de escritorio en JavaFX que saluda al estudiante por su nombre y menciona su edad, según la hora del día (AM/PM).

## Requisitos

- JDK 17 o superior
- Maven 3.8 o superior
- Variable de entorno `JAVA_HOME` apuntando al JDK (en este equipo: `C:\Program Files\Java\jdk-25.0.4.1`)

## Cómo ejecutar

Desde la carpeta `sistema-saludador`:

```bash
mvn clean javafx:run
```

En PowerShell, si Maven o Java no se encuentran, puedes usar:

```powershell
$env:JAVA_HOME = "C:\Program Files\Java\jdk-25.0.4.1"
mvn clean javafx:run
```

## Uso

1. Haz clic en **Solicitar saludo**.
2. Ingresa nombre, edad y si la hora es AM o PM.
3. El sistema muestra un saludo personalizado.
4. Si cancelas o ingresas un dato inválido, puedes intentarlo de nuevo.
