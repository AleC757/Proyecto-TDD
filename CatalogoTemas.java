import java.util.ArrayList;
public class CatalogoTemas
{
    private ArrayList<Tema>catalogoTemas;
    public CatalogoTemas(){
        this.catalogoTemas=new ArrayList<>();
    }
    public ArrayList<Tema> getTemas(){
        return catalogoTemas;
    }
    public Tema buscarTema(String nombre){
        return buscarTema(0, nombre);
    }
    private Tema buscarTema(int indice, String nombre){
        Tema encontrar=null;
        if(indice>=0 && indice<catalogoTemas.size()){
            if(catalogoTemas.get(indice).getNombre().equals(nombre)){
                encontrar = catalogoTemas.get(indice);
            }
            else{
                encontrar = buscarTema(indice+1, nombre);
            }
        }
        return encontrar;
    }
    public void agregarTema(Tema tema){
        if(tema == null){
            throw new IllegalArgumentException("El tema no puede ser nulo");
        }
        if (buscarTema(0, tema.getNombre())==null){
            catalogoTemas.add(tema);
        }
    }
}
