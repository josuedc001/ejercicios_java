package empleados.com;
import personas.com.personas;


public class empleados extends personas {
    String dni;
    int sueldo;
    String puesto;
    String departamento;

    //agregar al metodo constructor los atributos

   // constructor vacio
    public empleados() {

    }
    //constructor getter
    public empleados(String nombre, int edad, int telefono, String dni, int sueldo, String puesto, String departamento) {
        super(nombre, edad, telefono);
        this.dni = dni;
        this.sueldo = sueldo;
        this.puesto = puesto;
        this.departamento = departamento;
    }

    //constructor toString

    public String toStringempleado() {
        return "empleados{" +
                "dni='" + dni + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }
}
