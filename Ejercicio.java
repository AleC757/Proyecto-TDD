enum Dificultad {
    FACIL, MEDIO, DIFICIL
}

public class Ejercicio {
    private String enunciado;
    private String respuesta;

    private Dificultad dificultad;

    public Ejercicio(String enunciado, String respuesta, Dificultad dificultad) {
        validarTextoNoVacio(enunciado, "enunciado");
        validarTextoNoVacio(respuesta, "respuesta");
        this.enunciado = enunciado;
        this.respuesta = respuesta;
        this.dificultad = dificultad;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public Dificultad getDificultad() {
        return dificultad;
    }

    private void validarTextoNoVacio(String texto, String nombreCampo) {
        if (texto == null || texto.trim().isEmpty()) {
            throw new IllegalArgumentException("El " + nombreCampo + " no puede estar vacio");
        }
    }
}
