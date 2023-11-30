import personas.com.personas;
import empleados.com.empleados;
import Asesor.Asesor;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       //El programa creara un arreglo de empleado y un arreglo de asesores

        System.out.println("progrma que crea arreglos de empleados y asesore de una empresa  ");
        System.out.printf("");
        System.out.println("ingrese el numero de empleados que desea agregar");
        int numero_empleado = scanner.nextInt();

        empleados[] empleadosArray = new empleados[numero_empleado];
        for (int i =0; i<numero_empleado;i++){
            System.out.println("ingresa el nombre del empleado;");
            String nombre = scanner.next();
            System.out.println("ingrese la edad ;");
            int edad = scanner.nextInt();
            System.out.println("Ingresa el telefono: ");
            int telefono = scanner.nextInt();
            System.out.println(" ingresa el DNI: ");
            String dni = scanner.next();
            System.out.println("ingrese el sueldo");
            int sueldo = scanner.nextInt();
            System.out.println("ingrese el puesto: ");
            String puesto = scanner.next();;
            System.out.println("Ingrese el departamento");
            String departamento = scanner.next();
            empleadosArray[i] = new empleados(nombre,edad,telefono,dni,sueldo,puesto,departamento);

        }

        System.out.println("Ingrese el numeros de asesores");
        int num_aesores = scanner.nextInt();
        Asesor[]asesoresArray = new Asesor[num_aesores];
        for (int i=0; i<num_aesores;i++){
            System.out.println("ingrese el nombre del asesor;");
            String nombre = scanner.next();
            System.out.println("ingrese la edad;");
            int edad = scanner.nextInt();
            System.out.println("ingrese el telefono del asesor: ");
            int telefono = scanner.nextInt();
            System.out.println("ingrese el id:");
            int id = scanner.nextInt();
            System.out.println("agrege el nombre de la empresa: ");
            String empresa = scanner.next();
            System.out.println("ingrese las horas trabajadas: ");
            int horas_trabajadas = scanner.nextInt();

            asesoresArray[i]= new Asesor(nombre,edad,telefono,id,empresa,horas_trabajadas);
            asesoresArray[i].asignarSueldo();

        }
        for(int i =0; i < num_aesores; i++){
            System.out.println(asesoresArray[i].detallesasesor());

            //buscar asesor de que solo muestre ese asesor


        }













    }
}
