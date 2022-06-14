public class EMPLEADO extends PERSONA{
    private int sueldoB;

    public EMPLEADO(int sueldoB, String nombre, int edad, String direccion, int documento) {
        super(nombre, edad, direccion, documento);
        this.sueldoB = sueldoB;
    }

    public int getSueldoB() {
        return sueldoB;
    }

    public void setSueldoB(int sueldoB) {
        this.sueldoB = sueldoB;
    }
    
}
