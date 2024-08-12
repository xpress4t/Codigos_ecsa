package codigo;

import java.util.ArrayList;
import java.util.List;

class Tarea {
    private String nombre;
    private String descripcion;
    private EstadoTarea estado;

    public Tarea(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = EstadoTarea.PENDIENTE;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public EstadoTarea getEstado() {
        return estado;
    }

    public void actualizarEstado(EstadoTarea nuevoEstado) {
        this.estado = nuevoEstado;
    }
}

enum EstadoTarea {
    PENDIENTE,
    EN_PROGRESO,
    COMPLETADA;
}


class EquipoDesarrollo {
    private List<Usuario> miembros;
    private List<Tarea> tareas;

    public EquipoDesarrollo() {
        this.miembros = new ArrayList<>();
        this.tareas = new ArrayList<>();
    }

    public void agregarMiembro(Usuario miembro) {
        miembros.add(miembro);
    }

    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
    }

    public void asignarTarea(Tarea tarea, Usuario asignado) {
        tarea.actualizarEstado(EstadoTarea.EN_PROGRESO);
        asignado.agregarTareaAsignada(tarea);
    }
}


class Usuario {
    private String nombre;
    private List<Tarea> tareasAsignadas;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.tareasAsignadas = new ArrayList<>();
    }

    public void agregarTareaAsignada(Tarea tarea) {
        tareasAsignadas.add(tarea);
    }
}