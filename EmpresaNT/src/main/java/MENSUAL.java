//Agustin Villalba
import java.util.Scanner;

public class MENSUAL extends EMPLEADO{
    Scanner teclado = new Scanner(System.in);
    private char cargo;
    private int cantHoras;

    public MENSUAL(String nombre, char cargo, int cantHoras) {
        super(nombre);
        this.cargo = cargo;
        this.cantHoras = cantHoras;
    }
    
    @Override
    public double calcSueldo(){      
        switch(cargo){
            case 'A':
                this.sueldo = cantHoras * 1500;
                break;
            case 'B':
                this.sueldo = cantHoras * 2000;
                break;
            case 'C':
                this.sueldo = cantHoras * 3500;
                break;
        }
        
        return this.sueldo;
    }
    
    @Override
    public void descripcion(){
        System.out.println("--------------------------------------");
        System.out.println("NUEVOS TIEMPOS");
        if(this.cargo == 'A'){
            System.out.println("- " + this.nombre + " | - Auxiliar Admin");
        }if(this.cargo == 'B'){
            System.out.println("- " + this.nombre + " | - Jefe de Sección");
        }if(this.cargo == 'C'){
            System.out.println("- " + this.nombre + " | - Gerente");
        }
        System.out.println("*****************************************");
        System.out.println("Sueldo: " + calcSueldo());
        System.out.println("--------------------------------------");
    }
}
