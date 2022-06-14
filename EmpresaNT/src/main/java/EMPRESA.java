//Lihuel Troncoso
import java.util.ArrayList;
public class EMPRESA {
    private String nombre;
    private ArrayList<EMPLEADO> empleados;

    public EMPRESA(String n) {
        this.nombre = n;
        empleados = new ArrayList<EMPLEADO>();
    }
    
    public void mostrarEmpleados(){
        for (EMPLEADO e: empleados){
            this.nombre.toUpperCase();
            System.out.println(this.nombre);
            e.descripcion();
            System.out.println("***********************************");
        }
    }
    
    public void añadirEmpleados(EMPLEADO e){
        this.empleados.add(e);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<EMPLEADO> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<EMPLEADO> empleados) {
        this.empleados = empleados;
    }
    
    
}
