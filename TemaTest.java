import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TemaTest
{
    @Test
    public void testTemaRecienCreadoNoTieneLecciones(){
        Tema tema = new Tema("Grafos");
        assertAll(
            () -> assertEquals("Grafos", tema.getNombre()),
            () -> assertTrue(tema.getLecciones().isEmpty())
        );
    }
    
    @Test
    public void testAgregarLeccionLaIncluyeEnLaLista(){
        Tema tema = new Tema("Grafos");
        Leccion leccion = new Leccion("BFS","BFS significa Breadth-First Search");
        tema.agregarLeccion(leccion);
        assertAll(
            () -> assertEquals(1, tema.getLecciones().size()),
            () -> assertTrue(tema.getLecciones().contains(leccion))
        );
    }
    
    @Test
    public void testAgregarLeccionNullLanzaExcepcion(){
        Tema tema = new Tema("Grafos");
        assertAll(
            () -> assertThrows(IllegalArgumentException.class, () ->{
                tema.agregarLeccion(null);
            }),
            () -> assertTrue(tema.getLecciones().isEmpty())
            );
    }
    

}