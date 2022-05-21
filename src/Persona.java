import java.time.LocalDate;
import java.time.Period;

class Persona {
    private String nombre;
    private String apellido;
    private String mail;
    private int edad;
    private LocalDate fechaNacimiento;

    //Constructor
    public Persona(String nombre, String apellido, String mail, int edad, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        //Modificación de la edad, por el cálculo en años entre la fecha dada y la de nacimiento.
        this.edad = Period.between(fechaNacimiento, LocalDate.of(2021, 9, 21)).getYears();
        this.fechaNacimiento = fechaNacimiento;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }

    public String getMail() {
        return mail;
    }

    public int getEdad() {
        return edad;
    }


    //Métodos
    public String mostrarNombre(){

        return this.getApellido() + " " + this.getNombre();
    }
    public Boolean esMayorDeEdad(){
        return  (this.edad > 18);
    }


}
