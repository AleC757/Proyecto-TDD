import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
public class EjemploTest
{
    @Test
    public void testLosPasosSeGuardanEnElOrdenEnElQueSeAgregan(){
        Ejemplo ejemplo = new Ejemplo("BFS en 4 nodos");
        ArrayList<String> pasos = new ArrayList<>();
        pasos.add("Elegir un nodo raiz");
        pasos.add("Visitar nodos vecinos no visitados");
        pasos.add("Marcar nodo raiz como visitado");
        ejemplo.agregarPaso("Elegir un nodo raiz");
        ejemplo.agregarPaso("Visitar nodos vecinos no visitados");
        ejemplo.agregarPaso("Marcar nodo raiz como visitado");
        assertEquals(ejemplo.getPasos(), pasos);
    }
    @Test
    public void testSeMuestraUnaExcepcionCuandoElEjemploNoTienePasos(){
        Ejemplo ejemplo = new Ejemplo("BFS en 4 nodos");
        assertThrows(IllegalArgumentException.class, () ->{
                ejemplo.getPasos();
            });
    }
    @Test
    public void testSeMuestraUnaExcepcionAlAgregarUnPasoVacio(){
        Ejemplo ejemplo = new Ejemplo("BFS en 4 nodos");
        assertThrows(IllegalArgumentException.class, () -> {
            ejemplo.agregarPaso("");
        });
    }
    @Test
    public void testAgregarUnEjemploAUnaLeccionLoHaceParteDeLosEjemplosDeLaLeccion(){
        Leccion leccion = new Leccion("BFS", "BFS significa Breadth-First Search");
        Ejemplo ejemplo = new Ejemplo("BFS en 4 nodos");
        ejemplo.agregarPaso("Elegir un nodo raiz");
        ejemplo.agregarPaso("Visitar nodos vecinos no visitados");
        ejemplo.agregarPaso("Marcar nodo raiz como visitado");
        leccion.agregarEjemplo(ejemplo);
        assertTrue(leccion.getEjemplos().contains(ejemplo));
    }
}