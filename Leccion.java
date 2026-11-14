import java.util.ArrayList;
public class Leccion{
    
    private String titulo;
    private String contenido;
    private ArrayList<Ejemplo> ejemplos;
    
    public Leccion(String titulo, String contenido){
        validarTextoNoVacio(titulo,"titulo");
        validarTextoNoVacio(contenido,"contenido");
        this.titulo = titulo;
        this.contenido = contenido;
        this.ejemplos = new ArrayList<>();
        
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public String getContenido(){
        return contenido;
    }
    public ArrayList<Ejemplo> getEjemplos(){
        return ejemplos;
    }
    public void agregarEjemplo(Ejemplo ejemplo){
        ejemplos.add(ejemplo);
    }
    private void validarTextoNoVacio(String texto, String nombreCampo){
        if(texto == null || texto.trim().isEmpty()){
            throw new IllegalArgumentException("EL " + nombreCampo + "no puede estar vacio");
        }
    }
}