package co.edu.umanizales.alquilervehiculos.model;
// Define el paquete de la clase, organizándola dentro de la capa de modelo del proyecto.

public class Usuario {
    // Define la clase `Usuario`, que representa a un usuario en el sistema de alquiler de vehículos.

    private String cedula; // Login del usuario
    // Declara un atributo privado `cedula` de tipo `String`, que almacena el número de cédula del usuario (funciona como login).

    private String nombre;
    // Declara un atributo privado `nombre` de tipo `String`, que almacena el nombre completo del usuario.

    private String password;
    // Declara un atributo privado `password` de tipo `String`, que almacena la contraseña del usuario.

    // Constructor de la clase `Usuario` que recibe tres parámetros: `cedula`, `nombre` y `password`.
    public Usuario(String cedula, String nombre, String password) {
        this.cedula = cedula;  // Inicializa el atributo `cedula` con el valor recibido en el parámetro `cedula`.
        this.nombre = nombre;  // Inicializa el atributo `nombre` con el valor recibido en el parámetro `nombre`.
        this.password = password;  // Inicializa el atributo `password` con el valor recibido en el parámetro `password`.
    }

    // Getters y Setters
    // Métodos para obtener (getter) y modificar (setter) los valores de los atributos.

    public String getCedula() {
        return cedula;  // Devuelve el valor del atributo `cedula`.
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;  // Asigna el valor del parámetro `cedula` al atributo `cedula`.
    }

    public String getNombre() {
        return nombre;  // Devuelve el valor del atributo `nombre`.
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;  // Asigna el valor del parámetro `nombre` al atributo `nombre`.
    }

    public String getPassword() {
        return password;  // Devuelve el valor del atributo `password`.
    }

    public void setPassword(String password) {
        this.password = password;  // Asigna el valor del parámetro `password` al atributo `password`.
    }
}
