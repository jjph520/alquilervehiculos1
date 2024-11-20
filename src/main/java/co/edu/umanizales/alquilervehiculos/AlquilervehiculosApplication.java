package co.edu.umanizales.alquilervehiculos;
// Define el paquete de la clase, organizándola dentro del paquete principal del proyecto "alquilervehiculos".

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// Importa las clases necesarias de Spring Boot. `SpringApplication` se usa para iniciar la aplicación,
// y `@SpringBootApplication` es la anotación principal que habilita la configuración automática, la detección de componentes y la configuración de Spring.

@SpringBootApplication
// La anotación `@SpringBootApplication` marca esta clase como la principal clase de configuración para una aplicación Spring Boot.
// Esta anotación habilita varias configuraciones y facilita la creación de la aplicación.

public class AlquilervehiculosApplication {
    // Define la clase principal `AlquilervehiculosApplication` que se usará para ejecutar la aplicación Spring Boot.

    public static void main(String[] args) {
        // El metodo `main` es el punto de entrada principal de la aplicación.

        SpringApplication.run(AlquilervehiculosApplication.class, args);
        // Llama al metodo `run` de la clase `SpringApplication`, que arranca la aplicación Spring Boot.
        // Le pasa la clase `AlquilervehiculosApplication.class` como argumento para indicar que esta es la clase de configuración principal de la aplicación.
        // `args` permite que los parámetros de la línea de comandos sean pasados a la aplicación al momento de iniciarla.
    }
}
