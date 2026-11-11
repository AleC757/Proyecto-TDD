public class Leccion{
    
    private String titulo;
    private String contenido;
    
    public Leccion(String titulo, String contenido){
        validarTextoNoVacio(titulo,"titulo");
        validarTextoNoVacio(contenido,"contenido");
        this.titulo = titulo;
        this.contenido = contenido;
        
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public String getContenido(){
        return contenido;
    }
    
    private void validarTextoNoVacio(String texto, String nombreCampo){
        if(texto == null || texto.trim().isEmpty()){
            throw new IllegalArgumentException("EL " + nombreCampo + "no puede estar vacio");
        }
    }
}