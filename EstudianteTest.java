import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EstudianteTest {
    @Test
    public void testCrearEstudianteConDatosValidos() {
        String nombre = "Ana";
        String correo = "ana@mail.com";

        Estudiante estudiante = new Estudiante(nombre, correo);

        assertEquals("Ana", estudiante.getNombre());
        assertEquals("ana@mail.com", estudiante.getCorreo());
        assertEquals(0, estudiante.getLeccionesCompletadas());
    }

    @Test
    public void testNombreVacioLanzaExcepcion() {
        String nombre = "";
        String correo = "ana@mail.com";

        assertThrows(IllegalArgumentException.class, () -> {
            new Estudiante(nombre, correo);
        });
    }

    @Test
    public void testFormatoDeCorreoInvalidoLanzaExcepcion() {
        String nombre = "Ana";
        String correo = "ana.mail.com";
        assertThrows(IllegalArgumentException.class, () -> {
            new Estudiante(nombre, correo);
        });
    }
}
