import java.util.ArrayList;

public class Tema
{
    private String nombre;
    private ArrayList<Leccion> lecciones;
    public Tema(String nombre){
        this.nombre=nombre; 
        this.lecciones= new ArrayList<>();
    }

    public String getNombre(){
        return nombre;
    }
    public ArrayList<Leccion> getLecciones(){
        return lecciones;
    }
    
    public void agregarLeccion(Leccion leccion){
        if(leccion == null){
            throw new IllegalArgumentException("La leccion no puede estar vacia");
        }
        lecciones.add(leccion);
    }
    
}
