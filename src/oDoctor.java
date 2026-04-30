import java.util.ArrayList;
import java.util.List;

public class oDoctor extends oPersona {
    private String especialidad;
    private String numeroDeLicencia;
    private List<oPaciente> pacientes;

    public oDoctor(String nombre, int edad, String genero, String identificacion,
                  String especialidad, String numeroDeLicencia) {
        super(nombre, edad, genero, identificacion);
        this.especialidad = especialidad;
        this.numeroDeLicencia = numeroDeLicencia;
        this.pacientes = new ArrayList<>();
    }

    public void agregarPaciente(oPaciente paciente) {
        pacientes.add(paciente);
    }

    public void mostrarPacientes() {
        System.out.println("Pacientes del Dr. " + nombre + ":");
        for (oPaciente p : pacientes) {
            System.out.println("- " + p.nombre);
        }
    }
}