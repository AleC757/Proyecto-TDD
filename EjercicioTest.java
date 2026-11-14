
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EjercicioTest {
    @Test
    public void testCrearEjercicioGuardaEnunciadoRespuestaYDificultad() {
        Ejercicio ejercicio = new Ejercicio("Cuanto es 2 + 3?", "5", Dificultad.FACIL);
        assertEquals("Cuanto es 2 + 3?", ejercicio.getEnunciado());
        assertEquals("5", ejercicio.getRespuesta());
        assertEquals(Dificultad.FACIL, ejercicio.getDificultad());
    }
    @Test
    public void testCrearEjercicioConEnunciadoVacioLanzaExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Ejercicio("", "Contenido Valido", Dificultad.FACIL);
        });
    }
    @Test
    public void testCrearEjercicioConRespuestaVaciaLanzaExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Ejercicio("Contenido Valido", "", Dificultad.FACIL);
        });
    }
}
