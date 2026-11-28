public class Estudiante {
    private String nombre;
    private String correo;
    private int leccionesCompletadas;

    public Estudiante(String nombre, String correo) {
        validarTextNoVacio("nombre", nombre);
        validarTextNoVacio("correo", correo);
        validarFormatoDeCorreo(correo);
        this.nombre = nombre;
        this.correo = correo;
        this.leccionesCompletadas = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public int getLeccionesCompletadas() {
        return leccionesCompletadas;
    }

    private void validarTextNoVacio(String campo, String texto) {
        if (texto == null || texto.trim().isEmpty()) {
            throw new IllegalArgumentException("El " + campo + " no puede estar vacio.");
        }
    }

    private void validarFormatoDeCorreo(String correo) {
        if (!correo.contains("@")) {
            throw new IllegalArgumentException("El correo no tiene un formato valido.");
        }
    }
}
