package co.edu.umanizales.alquilervehiculos.model; // Define el paquete al que pertenece esta clase, organizándola en la capa de modelo.

public abstract class AbstractVehiculo { // Define una clase abstracta llamada `AbstractVehiculo`, que actúa como base para diferentes tipos de vehículos.
    protected String matricula; // Atributo protegido que almacena la matrícula del vehículo.
    protected int km; // Atributo protegido que almacena los kilómetros recorridos por el vehículo.
    protected boolean estado; // Atributo protegido que indica si el vehículo está disponible o no.

    public AbstractVehiculo(String matricula, int km, boolean estado) { // Constructor de la clase que inicializa los atributos principales del vehículo.
        this.matricula = matricula; // Asigna el valor del parámetro `matricula` al atributo de la clase.
        this.km = km; // Asigna el valor del parámetro `km` al atributo de la clase.
        this.estado = estado; // Asigna el valor del parámetro `estado` al atributo de la clase.
    }

    public String getMatricula() { // Metodo getter para obtener el valor de la matrícula del vehículo.
        return matricula; // Devuelve el valor del atributo `matricula`.
    }

    public void setMatricula(String matricula) { // Metodo setter para establecer el valor de la matrícula del vehículo.
        this.matricula = matricula; // Asigna el valor proporcionado al atributo `matricula`.
    }

    public int getKm() { // Metodo getter para obtener el valor de los kilómetros recorridos.
        return km; // Devuelve el valor del atributo `km`.
    }

    public void setKm(int km) { // Metodo setter para establecer el valor de los kilómetros recorridos.
        this.km = km; // Asigna el valor proporcionado al atributo `km`.
    }

    public boolean isEstado() { // Metodo getter para obtener el estado del vehículo (disponible o no).
        return estado; // Devuelve el valor del atributo `estado`.
    }

    public void setEstado(boolean estado) { // Metodo setter para establecer el estado del vehículo.
        this.estado = estado; // Asigna el valor proporcionado al atributo `estado`.
    }
}