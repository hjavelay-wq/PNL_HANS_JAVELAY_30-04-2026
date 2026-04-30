import java.util.HashMap;
import java.util.Map;

public class oPaciente extends oPersona {
    private Map<String, String> historialMedico;

    public oPaciente(String nombre, int edad, String genero, String identificacion) {
        super(nombre, edad, genero, identificacion);
        this.historialMedico = new HashMap<>();
    }

    public void agregarHistorial(String motivo, String detalles) {
        historialMedico.put(motivo, detalles);
    }

    public void mostrarHistorial() {
        System.out.println("Historial Medico de " + nombre + ":");
        for (Map.Entry<String, String> entry : historialMedico.entrySet()) {
            System.out.println("Motivo: " + entry.getKey() + " -- Detalles: " + entry.getValue());
        }
    }
}