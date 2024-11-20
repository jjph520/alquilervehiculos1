package co.edu.umanizales.alquilervehiculos.model;
// Define el paquete al que pertenece esta clase, organizándola en la capa de modelo.

public class TipoUsuario {
    // Define la clase `TipoUsuario`, que representa un tipo de usuario en el sistema.

    private String codigo;
    // Declara un atributo privado `codigo` de tipo `String`, que almacena el código del tipo de usuario.

    private String descripcion;
    // Declara un atributo privado `descripcion` de tipo `String`, que almacena la descripción del tipo de usuario.

    public TipoUsuario(String codigo, String descripcion) {
        // Constructor de la clase `TipoUsuario` que inicializa los objetos con los valores de código y descripción.
        this.codigo = codigo;
        // Asigna el valor del parámetro `codigo` al atributo `codigo` de la clase.
        this.descripcion = descripcion;
        // Asigna el valor del parámetro `descripcion` al atributo `descripcion` de la clase.
    }

    // Getters y Setters
    // No están definidos explícitamente en este código, pero en un escenario común se incluirían para permitir el acceso y modificación de los atributos.

}
