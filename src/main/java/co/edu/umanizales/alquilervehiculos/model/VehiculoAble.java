package co.edu.umanizales.alquilervehiculos.model;
// Define el paquete de la interfaz, organizándola dentro de la capa de modelo del proyecto.

public interface VehiculoAble {
    // Define la interfaz `VehiculoAble`, que establece los métodos que deben implementar las clases que representan vehículos.

    void mostrarVehiculo();
    // Declara el metodo `mostrarVehiculo`, que no tiene implementación en la interfaz (es un metodo abstracto).
    // Este metodo debe ser implementado por cualquier clase que implemente la interfaz `VehiculoAble`.
    // Su propósito es mostrar la información del vehículo (por ejemplo, matrícula, kilómetros recorridos, etc.).

    void realizarMantenimiento();
    // Declara el metodo `realizarMantenimiento`, que también debe ser implementado por cualquier clase que implemente `VehiculoAble`.
    // Este metodo está destinado a realizar el mantenimiento del vehículo, probablemente registrando detalles sobre el mismo.
}
