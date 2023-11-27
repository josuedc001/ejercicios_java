import personas.com.personas;
import empleados.com.empleados;

public class Main {
    public static void main(String[] args) {
       personas persona1  = new personas("josue",22,2222222);

       empleados empleado1 = new empleados("edgar",21,22829923,"DROP1",5000);

        System.out.println(persona1.toString2());
        System.out.println(empleado1.toString());
        System.out.println(empleado1.toString2());









    }
}
