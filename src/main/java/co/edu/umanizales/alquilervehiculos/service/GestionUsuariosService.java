package co.edu.umanizales.alquilervehiculos.service;
// Define el paquete de la clase, organizándola dentro de la capa de servicio del proyecto.

import co.edu.umanizales.alquilervehiculos.model.Usuario;
// Importa la clase `Usuario` para poder trabajar con los objetos de tipo `Usuario`.

import org.springframework.stereotype.Service;
// Importa la anotación `@Service` de Spring, que indica que esta clase es un servicio de negocio en la arquitectura de Spring.

import java.util.ArrayList;
import java.util.List;
// Importa las clases `ArrayList` y `List` de Java para almacenar y manejar una lista de usuarios.

@Service
// La anotación `@Service` indica que esta clase es un servicio, que es responsable de la lógica de negocio relacionada con los usuarios en el sistema.
public class GestionUsuariosService {

    private final List<Usuario> lstUsuarios = new ArrayList<>();
    // Declara una lista privada llamada `lstUsuarios` que almacenará los objetos de tipo `Usuario` registrados en el sistema.

    // Metodo para registrar un usuario
    public void registrarUsuario(Usuario usuario) {
        lstUsuarios.add(usuario);
        // Añade el objeto `usuario` a la lista `lstUsuarios`. Este metodo se utiliza para registrar un nuevo usuario en el sistema.
    }

    // Metodo para listar todos los usuarios
    public List<Usuario> listarUsuarios() {
        return lstUsuarios;
        // Devuelve la lista completa de usuarios almacenados en `lstUsuarios`.
    }

    // Metodo para validar el inicio de sesión
    public boolean validarUsuario(String login, String password) {
        for (Usuario usuario : lstUsuarios) {
            // Recorre todos los usuarios en la lista `lstUsuarios`.
            if (usuario.getCedula().equals(login) && usuario.getPassword().equals(password)) {
                // Si encuentra un usuario cuyo login (cédula) y contraseña coinciden con los valores proporcionados, retorna `true` (inicio de sesión válido).
                return true;
            }
        }
        return false;
        // Si no se encuentra ningún usuario con las credenciales correctas, retorna `false` (inicio de sesión inválido).
    }
}
