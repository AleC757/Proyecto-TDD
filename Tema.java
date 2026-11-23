import java.util.ArrayList;

public class Tema {
    private String nombre;
    private ArrayList<Leccion> lecciones;
    private ArrayList<Ejercicio> ejercicios;

    public Tema(String nombre) {
        validarNombre(nombre);
        this.nombre = nombre.trim();
        this.lecciones = new ArrayList<>();
        this.ejercicios = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Leccion> getLecciones() {
        return lecciones;
    }
    
    private void validarNombre(String nombre) {
        if (nombre == null || "".equals(nombre)) {
            throw new IllegalArgumentException("El nombre no puede estar vacio");
        }
    }

    public void agregarLeccion(Leccion leccion) {
        if (leccion == null) {
            throw new IllegalArgumentException("La leccion no puede estar vacia");
        }
        lecciones.add(leccion);
    }

    public void agregarEjercicio(Ejercicio ejercicio) {
        if (ejercicio == null) {
            throw new IllegalArgumentException("El ejercicio no puede estar vacio");
        }
        ejercicios.add(ejercicio);
    }

    public ArrayList<Ejercicio> getEjercicios() {
        return ejercicios;
    }

}
