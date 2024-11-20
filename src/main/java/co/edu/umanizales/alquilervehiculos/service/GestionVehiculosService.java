package co.edu.umanizales.alquilervehiculos.service;
// Define el paquete de la clase, organizándola dentro de la capa de servicio del proyecto.

import co.edu.umanizales.alquilervehiculos.model.AbstractVehiculo;
// Importa la clase `AbstractVehiculo`, que es la clase base para los vehículos (coche, moto, furgoneta, etc.).

import org.springframework.stereotype.Service;
// Importa la anotación `@Service` de Spring, que indica que esta clase es un servicio de negocio, responsable de la lógica relacionada con la gestión de vehículos.

import java.util.ArrayList;
import java.util.List;
// Importa las clases `ArrayList` y `List` de Java para almacenar y manejar una lista de vehículos.

@Service
// La anotación `@Service` indica que esta clase es un **servicio de negocio**, encargado de la lógica de la gestión de vehículos en el sistema.
public class GestionVehiculosService {

    private final List<AbstractVehiculo> vehiculos = new ArrayList<>();
    // Declara una lista privada llamada `vehiculos` que almacenará objetos de tipo `AbstractVehiculo`. Esta lista sirve para almacenar los vehículos registrados en el sistema.

    // Metodo para registrar un vehículo
    public void registrarVehiculo(AbstractVehiculo vehiculo) {
        vehiculos.add(vehiculo);
        // Añade el objeto `vehiculo` a la lista `vehiculos`. Este metodo permite registrar un nuevo vehículo en el sistema.
    }

    // Metodo para listar todos los vehículos
    public List<AbstractVehiculo> listarVehiculos() {
        return vehiculos;
        // Devuelve la lista completa de vehículos almacenados en `vehiculos`, permitiendo obtener todos los vehículos registrados.
    }
}
