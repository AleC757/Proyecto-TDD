import java.util.ArrayList;

public class RegistroEstudiantes {
    private ArrayList<Estudiante> estudiantes;

    public RegistroEstudiantes() {
        estudiantes = new ArrayList<Estudiante>();
    }

    public void registrar(Estudiante estudiante) {
        for (Estudiante e : estudiantes) {
            if (e.getCorreo().equals(estudiante.getCorreo())) {
                return;
            }
        }

        estudiantes.add(estudiante);
    }

    public int getNumeroDeEstudiantes() {
        return estudiantes.size();
    }
}
