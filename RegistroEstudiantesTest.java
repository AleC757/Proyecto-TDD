
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RegistroEstudiantesTest {
    @Test
    public void testNoPermiteRegistrarDosEstudiantesConMismoCorreo() {
        RegistroEstudiantes registro = new RegistroEstudiantes();

        Estudiante estudiante1 = new Estudiante("Ana", "ana@mail.com");
        Estudiante estudiante2 = new Estudiante("Pedro", "ana@mail.com");

        registro.registrar(estudiante1);
        registro.registrar(estudiante2);

        assertEquals(1, registro.getNumeroDeEstudiantes());
    }
}
