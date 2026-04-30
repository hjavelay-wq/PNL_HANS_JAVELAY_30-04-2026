public class oPersona {
    String nombre;
    int edad;
    String genero;
    String identificacion;

    public oPersona(String nombre, int edad, String genero, String identificacion){
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.identificacion = identificacion;
    }

    public void mostrarinformacion (){
        System.out.println("Nombre" + nombre);
        System.out.println("Edad" + edad);
        System.out.println("Genero" + genero);
        System.out.println("DNI" + identificacion);

    }
}
