package empleados.com;
import personas.com.personas;
public class empleados extends personas {
    String dni;
    int sueldo;


    public empleados(String dni, int sueldo) {
        this.dni = dni;
        this.sueldo = sueldo;
    }

    public empleados(String nombre, int edad, int telefono, String dni, int sueldo) {
        super(nombre, edad, telefono);
        this.dni = dni;
        this.sueldo = sueldo;
    }


    @Override
    public String toString() {
        return "empleados{" +
                "dni='" + dni + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }
}
