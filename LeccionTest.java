import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LeccionTest
{
    @Test
    public void testCrearLeccionGuardaTituloYContenido(){
        Leccion leccion = new Leccion("Busqueda Binaria","Divide el espacio de búsqueda a la mitad en cada paso");
        
        assertEquals("Busqueda Binaria",leccion.getTitulo());
        assertEquals("Divide el espacio de búsqueda a la mitad en cada paso", leccion.getContenido());
    }
    
    @Test
    public void test2(){
        assertThrows(IllegalArgumentException.class, () -> {
            new Leccion("", "Contenido válido");
        });
    }
    
    @Test
    public void testCrearLeccionConContenidoVacioLanzaExcepcion(){
        assertThrows(IllegalArgumentException.class, () -> {
            new Leccion("Dinamic Programming", "");
        });
    }
}
