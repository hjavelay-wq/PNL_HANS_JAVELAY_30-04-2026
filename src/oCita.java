public class oCita {
    private oPaciente paciente;
    private oDoctor doctor;
    private String fecha;
    private String hora;
    private String motivo;

    public oCita(oPaciente paciente, oDoctor doctor, String fecha, String hora, String motivo) {
        this.paciente = paciente;
        this.doctor = doctor;
        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;
    }

    public void detallesCita() {
        System.out.println("+++ Detalles de la Cita +++");
        System.out.println("Paciente: " + paciente.nombre);
        System.out.println("Doctor: " + doctor.nombre);
        System.out.println("Fecha: " + fecha);
        System.out.println("Hora: " + hora);
        System.out.println("Motivo: " + motivo);
    }

    public void cambiarFechaHora(String nuevaFecha, String nuevaHora) {
        this.fecha = nuevaFecha;
        this.hora = nuevaHora;
    }
}