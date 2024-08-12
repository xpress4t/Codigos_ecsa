package codigo;

public class Main {
    public static void main(String[] args) {
        EquipoDesarrollo equipo = new EquipoDesarrollo();

        Usuario usuario1 = new Usuario("Juan");
        Usuario usuario2 = new Usuario("Maria");

        equipo.agregarMiembro(usuario1);
        equipo.agregarMiembro(usuario2);

        Tarea tarea1 = new Tarea("Implementar función X", "Descripción detallada de la tarea 1");
        Tarea tarea2 = new Tarea("Corregir errores en módulo Y", "Descripción detallada de la tarea 2");

        equipo.agregarTarea(tarea1);
        equipo.agregarTarea(tarea2);

        equipo.asignarTarea(tarea1, usuario1);
        equipo.asignarTarea(tarea2, usuario2);
    }
}