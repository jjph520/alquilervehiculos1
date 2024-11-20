package co.edu.umanizales.alquilervehiculos.model;
// Define el paquete al que pertenece esta clase, organizándola en la capa de modelo.

public class Moto extends AbstractVehiculo implements VehiculoAble {
    // Define la clase `Moto`, que hereda de `AbstractVehiculo` e implementa la interfaz `VehiculoAble`.

    private boolean casco;
    // Declara un atributo privado `casco` de tipo `boolean`, que indica si la moto tiene un casco incluido.

    public Moto(String matricula, int km, boolean estado, boolean casco) {
        // Constructor de la clase `Moto` que inicializa el objeto con los valores de matrícula, kilómetros recorridos, estado y casco.
        super(matricula, km, estado);
        // Llama al constructor de la clase `AbstractVehiculo` para inicializar los atributos heredados (matrícula, kilómetros y estado).
        this.casco = casco;
        // Asigna el valor del parámetro `casco` al atributo `casco` de la clase.
    }

    public boolean isCasco() {
        // Metodo getter que devuelve si la moto tiene casco o no.
        return casco;
        // Devuelve el valor del atributo `casco`.
    }

    public void setCasco(boolean casco) {
        // Metodo setter para modificar el atributo `casco` de la moto.
        this.casco = casco;
        // Asigna el valor proporcionado al atributo `casco`.
    }

    @Override
    public void mostrarVehiculo() {
        // Implementación del metodo `mostrarVehiculo()` que muestra la información de la moto.
        System.out.println("Moto [Matrícula: " + matricula + ", Kilómetros: " + km + ", Casco: " + casco + "]");
        // Imprime en la consola los detalles de la moto: matrícula, kilómetros recorridos y si tiene casco.
    }

    @Override
    public void realizarMantenimiento() {
        // Implementación del metodo `realizarMantenimiento()` que muestra un mensaje de mantenimiento específico para la moto.
        System.out.println("Realizando mantenimiento de la moto con matrícula: " + matricula);
        // Imprime en la consola un mensaje indicando que se está realizando mantenimiento de la moto, usando su matrícula.
    }
}
