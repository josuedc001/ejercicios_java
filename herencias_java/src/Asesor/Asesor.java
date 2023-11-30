package Asesor;
import personas.com.personas;

// la extends persona me permite acceder a los atributos de la clase personas
public class Asesor extends personas{
    int costo_hora = 150;
  int id;
  String empresa;
  int horas_trabajadas;
  int sueldo;


    public Asesor(String nombre, int edad, int telefono, String id, String empresa, int horas_trabajadas) {

    }
    // la palabra super nos permite usar los atributos de otra clase para ya no reescribir los mismos atributos
    public Asesor(String nombre, int edad, int telefono, int id, String empresa, int horas_trabajadas) {
        super(nombre, edad, telefono);
        this.id = id;
        this.empresa = empresa;
        this.horas_trabajadas = horas_trabajadas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getHoras_trabajadas() {
        return horas_trabajadas;
    }

    public void setHoras_trabajadas(int horas_trabajadas) {
        this.horas_trabajadas = horas_trabajadas;
    }


    public String toStringAsesor() {
        return "Asesor{" +
                "id=" + id +
                ", empresa='" + empresa + '\'' +
                ", horas_trabajadas=" + horas_trabajadas +
                '}';
    }

    public void asignarSueldo(){
        this.sueldo = horas_trabajadas * costo_hora;
    }
    public String detallesasesor(){
        return "datos asesor {  " + "Nombre " + getNombre() + "Edad: " + getEdad() + "telefono: "+ getTelefono() + "sueldo: " + sueldo;
    }


}
