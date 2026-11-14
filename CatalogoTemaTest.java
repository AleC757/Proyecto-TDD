import static org.junit.jupiter.api.Assertions.*;
/*import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;*/
import org.junit.jupiter.api.Test;


public class CatalogoTemaTest
{
    @Test
    public void testAgregarTemaLoIncluyeEnElCatalogo(){
        CatalogoTemas catalogo = new CatalogoTemas();
        Tema tema = new Tema("Grafos");
        catalogo.agregarTema(tema);
        assertAll(
            () -> assertEquals(1, catalogo.getTemas().size()),
            () -> assertTrue(catalogo.getTemas().contains(tema))
        );
    }
    @Test
    public void testSiSeBuscaUnTemaConNombreExistenteSeDevuelveElMismo(){
        CatalogoTemas catalogo = new CatalogoTemas();
        Tema tema = new Tema("Grafos");
        catalogo.agregarTema(tema);
        assertEquals(tema, catalogo.buscarTema("Grafos"));
    }
    @Test
    public void testSiSeBuscaUnTemaConNombreInexistenteDevuelveNulo(){
        CatalogoTemas catalogo = new CatalogoTemas();
        Tema tema = new Tema("Grafos");
        catalogo.agregarTema(tema);
        assertNull(catalogo.buscarTema("Programacion Dinamica"));
    }
    @Test
    public void testAgregarTemasConElMismoNombreAlCatalogoEvitaDuplicados(){
        CatalogoTemas catalogo = new CatalogoTemas();
        Tema tema = new Tema("Grafos");
        Tema tema2 = new Tema("Grafos");
        catalogo.agregarTema(tema);
        catalogo.agregarTema(tema2);
        assertEquals(1, catalogo.getTemas().size());
    }
}
