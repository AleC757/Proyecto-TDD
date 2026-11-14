import java.util.ArrayList;
public class Ejemplo
{
    private String nombre;
    private ArrayList<String> Pasos;
    public Ejemplo(String nombre){
        this.nombre=nombre;
        this.Pasos=new ArrayList<>();
    }
    public void agregarPaso(String paso){
        if(paso==""){
            throw new IllegalArgumentException("No es un paso válido");
        }
        Pasos.add(paso);
    }
    public ArrayList<String>getPasos(){
        if(Pasos.isEmpty()){
            throw new IllegalArgumentException("No hay pasos");
        }
        return Pasos;
    }
}