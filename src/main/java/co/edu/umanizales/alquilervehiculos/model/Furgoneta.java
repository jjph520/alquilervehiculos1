package co.edu.umanizales.alquilervehiculos.model;
// Define el paquete al que pertenece esta clase, organizándola en la capa de modelo.

public class Furgoneta extends AbstractVehiculo implements VehiculoAble {
    // Define la clase `Furgoneta`, que hereda de `AbstractVehiculo` e implementa la interfaz `VehiculoAble`.

    private short capacidad;
    // Declara un atributo privado `capacidad` de tipo `short`, que representa la capacidad de carga de la furgoneta en toneladas.

    public Furgoneta(String matricula, int km, boolean estado, short capacidad) {
        // Constructor de la clase `Furgoneta` que inicializa el objeto con los valores de matrícula, kilómetros recorridos, estado y capacidad.
        super(matricula, km, estado);
        // Llama al constructor de la clase `AbstractVehiculo` para inicializar los atributos heredados (matrícula, kilómetros y estado).
        this.capacidad = capacidad;
        // Asigna el valor del parámetro `capacidad` al atributo `capacidad` de la clase.
    }

    public short getCapacidad() {
        // Metodo getter que devuelve la capacidad de carga de la furgoneta.
        return capacidad;
        // Devuelve el valor del atributo `capacidad`.
    }

    public void setCapacidad(short capacidad) {
        // Metodo setter para modificar la capacidad de carga de la furgoneta.
        this.capacidad = capacidad;
        // Asigna el valor proporcionado al atributo `capacidad`.
    }

    @Override
    public void mostrarVehiculo() {
        // Implementación del metodo `mostrarVehiculo()` que muestra la información de la furgoneta.
        System.out.println("Furgoneta [Matrícula: " + matricula + ", Kilómetros: " + km + ", Capacidad: " + capacidad + " toneladas]");
        // Imprime en la consola los detalles de la furgoneta: matrícula, kilómetros recorridos y capacidad de carga.
    }

    @Override
    public void realizarMantenimiento() {
        // Implementación del me    todo `realizarMantenimiento()` que muestra un mensaje de mantenimiento específico para la furgoneta.
        System.out.println("Realizando mantenimiento de la furgoneta con matrícula: " + matricula);
        // Imprime en la consola un mensaje indicando que se está realizando mantenimiento de la furgoneta, usando su matrícula.
    }
}
