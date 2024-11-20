package co.edu.umanizales.alquilervehiculos.controller; // Define el paquete al que pertenece esta clase, organizándola en la capa de controladores.

import co.edu.umanizales.alquilervehiculos.model.AbstractVehiculo; // Importa la clase AbstractVehiculo que se usará para representar los vehículos.
import co.edu.umanizales.alquilervehiculos.service.GestionVehiculosService; // Importa el servicio encargado de gestionar la lógica de negocio de los vehículos.
import org.springframework.web.bind.annotation.*; // Importa las anotaciones de Spring necesarias para definir endpoints REST

import java.util.List; // Importa la clase List de Java para manejar colecciones de vehículos.


@RestController // Anotación que indica que esta clase es un controlador REST. Permite manejar solicitudes HTTP.
@RequestMapping("/vehiculos") // Define la ruta base para todos los endpoints de este controlador. En este caso, los endpoints estarán disponibles bajo "/vehiculos"
public class AlquilerVehiculosController { // Define la clase que actuará como controlador para manejar solicitudes relacionadas con vehículos.
    private final GestionVehiculosService gestionVehiculosService; // Declara una instancia del servicio de gestión de vehículos que será inyectada.

    public AlquilerVehiculosController(GestionVehiculosService gestionVehiculosService) { // Constructor de la clase, que recibe el servicio de gestión de vehículos como dependencia.
        this.gestionVehiculosService = gestionVehiculosService; // Asigna el servicio recibido al atributo de la clase para su uso en los métodos
    }

    @GetMapping // Anotación que indica que este metodo responde a solicitudes HTTP GET.
    public List<AbstractVehiculo> listarVehiculos() { // Define un metodo que devuelve una lista de vehículos almacenados.
        return gestionVehiculosService.listarVehiculos(); // Llama al servicio para obtener la lista de vehículos y la retorna como respuesta.
    }

    @PostMapping // Anotación que indica que este metodo responde a solicitudes HTTP POST.
    public void registrarVehiculo(@RequestBody AbstractVehiculo vehiculo) { // Define un metodo que recibe un vehículo en el cuerpo de la solicitud para registrarlo.
        gestionVehiculosService.registrarVehiculo(vehiculo); // Llama al servicio para registrar el vehículo proporcionado.
    }
}