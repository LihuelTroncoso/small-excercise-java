/*
FREELANCE TIENE:

VARIABLES:
cantProductos= INT

METODOS:
CONSTRUCTOR
calcSueldo(): double
descripcion: void
 */
//Leonardo Santagata
public class FREELANCE extends EMPLEADO {
    private int cantProyectos;

    public FREELANCE(String nombre, int cantProyectos) {
        super(nombre);
        this.cantProyectos = cantProyectos;
        this.sueldo = 15500;
    }

    @Override
    public double calcSueldo()
    {
        this.sueldo*=this.cantProyectos;
        return this.sueldo;
    }
    
    @Override
    public void descripcion()
    {
        System.out.println("--------------------------------------");
        System.out.println("NUEVOS TIEMPOS");
        System.out.println("-"+this.nombre+", Proyectos realizados: "+this.cantProyectos);
        System.out.println("**************************************");
        System.out.println(this.calcSueldo());
        System.out.println("--------------------------------------");
    }    
    
    
}
