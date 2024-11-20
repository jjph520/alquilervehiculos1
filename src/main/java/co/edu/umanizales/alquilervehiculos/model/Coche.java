package co.edu.umanizales.alquilervehiculos.model; // Define el paquete al que pertenece esta clase, organizándola en la capa de modelo.

public class Coche extends AbstractVehiculo implements VehiculoAble { // Define la clase `Coche`, que hereda de `AbstractVehiculo` y además implementa la interfaz `VehiculoAble`.
    private boolean extras; // Declara un atributo privado llamado `extras`, que indica si el coche tiene características adicionales (como GPS, aire acondicionado, etc.).

    public Coche(String matricula, int km, boolean estado, boolean extras) { // Constructor que inicializa un objeto `Coche` con matrícula, kilómetros recorridos, estado y si tiene extras o no.
        super(matricula, km, estado); // Llama al constructor de la clase padre (`AbstractVehiculo`) para inicializar los atributos heredados (matrícula, km, estado).
        this.extras = extras; // Asigna el valor del parámetro `extras` al atributo `extras` de la clase.
    }

    public boolean isExtras() { // Metodo getter que devuelve si el coche tiene extras o no.
        return extras; // Devuelve el valor del atributo `extras`.
    }

    public void setExtras(boolean extras) { // Metodo setter para modificar el valor del atributo `extras`.
        this.extras = extras; // Asigna el valor proporcionado al atributo `extras`.
    }

    @Override
    public void mostrarVehiculo() { // Implementación del metodo `mostrarVehiculo()` que muestra información del coche.
        System.out.println("Coche [Matrícula: " + matricula + ", Kilómetros: " + km + ", Extras: " + extras + "]"); // Imprime en la consola los detalles del coche: matrícula, kilómetros y si tiene extras o no.
    }

    @Override
    public void realizarMantenimiento() { // Implementación del metodo `realizarMantenimiento()` que muestra un mensaje de mantenimiento.
        System.out.println("Realizando mantenimiento del coche con matrícula: " + matricula); // Imprime en la consola un mensaje indicando que se está realizando mantenimiento del coche, usando su matrícula.
    }
}