package co.edu.umanizales.alquilervehiculos.controller; // Define el paquete al que pertenece esta clase, organizándola en la capa de controladores.

import co.edu.umanizales.alquilervehiculos.model.Usuario; // Importa la clase Usuario que se utiliza para manejar objetos de tipo usuario.
import co.edu.umanizales.alquilervehiculos.service.GestionUsuariosService; // Importa el servicio encargado de gestionar la lógica de negocio relacionada con los usuarios.
import org.springframework.web.bind.annotation.*; // Importa las anotaciones de Spring necesarias para manejar solicitudes HTTP.

import java.util.List; // Importa la clase List de Java para manejar colecciones de usuarios.

@RestController // Anotación que indica que esta clase es un controlador REST. Permite manejar solicitudes HTTP.
@RequestMapping("/usuarios") // Define la ruta base para todos los endpoints de este controlador.
public class UsuarioController { // Define la clase que actuará como controlador para manejar solicitudes relacionadas con los usuarios.
    private final GestionUsuariosService gestionUsuariosService; // Declara una instancia del servicio de gestión de usuarios que será inyectada.

    public UsuarioController(GestionUsuariosService gestionUsuariosService) { // Constructor de la clase, que recibe el servicio de gestión de usuarios como dependencia.
        this.gestionUsuariosService = gestionUsuariosService; // Asigna el servicio recibido al atributo de la clase para su uso en los métodos.
    }

    // Endpoint para registrar un nuevo usuario
    @PostMapping // Anotación que indica que este metodo responde a solicitudes HTTP POST.
    public void registrarUsuario(@RequestBody Usuario usuario) { // Metodo que recibe un objeto Usuario en el cuerpo de la solicitud y lo registra.
        gestionUsuariosService.registrarUsuario(usuario); // Llama al servicio para registrar el usuario proporcionado.
    }

    // Endpoint para listar todos los usuarios
    @GetMapping // Anotación que indica que este metodo responde a solicitudes HTTP GET.
    public List<Usuario> listarUsuarios() { // Define un metodo que devuelve una lista de usuarios registrados.
        return gestionUsuariosService.listarUsuarios(); // Llama al servicio para obtener la lista de usuarios y la retorna como respuesta.
    }

    // Endpoint para validar un usuario (login)
    @PostMapping("/validar") // Anotación que indica que este metodo responde a solicitudes HTTP POST en la ruta "/usuarios/validar".
    public boolean validarUsuario(@RequestParam String login, @RequestParam String password) { // Metodo que recibe el login (cédula) y contraseña como parámetros de la solicitud.
        return gestionUsuariosService.validarUsuario(login, password); // Llama al servicio para validar las credenciales y retorna el resultado (true/false)
    }
}