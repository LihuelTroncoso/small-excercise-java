//EMPLEADO tiene:
/*
VARIABLES:
sueldo = double;

METODOS:
metodo constructor: EMPLEADO(String nombre, DIRECCION direccion, double sueldo) 
public abstract double calcularCosto()
 public abstract void descripcion()
*/
// Se relaciona con:PERSONA 
//Candelaria Slobodiamsky
public abstract class EMPLEADO extends PERSONA{
    //Establezco variable
    protected double sueldo;
    
    //Armo el constructor de la clase    
    public EMPLEADO(String nombre){
        super(nombre);
    }

    //Establezco el get y set
    public double getSueldo(){
        return sueldo;
    }

    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }
    
    //Creo los metodos abstractos
    public abstract double calcSueldo(); 
    public abstract void descripcion();
    
}
