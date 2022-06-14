//Candelaria Slobodiamsky
//Crear metodo para obtener cantidad vendida en pesos y en productos de TODAS las ventas
import java.util.ArrayList;

public class SUPERMERCADO {
    //inicializo las variables 
    private String nombre;
    private int numeroSucursal; 
    private DIRECCION direccion;   
    private CATALOGO catalogo;
    private ArrayList<VENTA> ventas = new ArrayList<VENTA>();

    //aca abajo defino el objeto
    public SUPERMERCADO(String nombre, int numeroSucursal, DIRECCION direccion){
        this.nombre = nombre;
        this.numeroSucursal = numeroSucursal;
        this.direccion = direccion;
    }
    
    public void agregarVentas(VENTA venta){
        this.ventas.add(venta);
    }
    
    public float calcTotalVentas(){
        float total = 0;
        for(VENTA v: ventas){
            total += v.getPrecio();
        }
        return total;
    }
    
    public int calcTotalProductos(){
        int total = 0;
        for(VENTA v: ventas){
            total += v.getProdTotales();
        }
        return total;
    }
    
    public void mostrarVentas(){
        System.out.println("-------------------------------------------------");
        System.out.println("Total productos vendidos: "+this.calcTotalProductos()+"|");
        System.out.println("Total ventas: "+this.calcTotalVentas()+"|");
        System.out.println("-------------------------------------------------");
    }
    //trae el dato a pantalla e inicializo los set y get
    public String getNombre() {
        return nombre;
    }
   //this es que pertenece a esta clase
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroSucursal() {
        return numeroSucursal;
    }

    public void setNumeroSucursal(int numeroSucursal) {
        this.numeroSucursal = numeroSucursal;
    }

    public DIRECCION getDireccion() {
        return direccion;
    }

    public void setDireccion(DIRECCION direccion) {
        this.direccion = direccion;
    }

    public CATALOGO getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(CATALOGO catalogo) {
        this.catalogo = catalogo;
    }

    public ArrayList<VENTA> getVentas() {
        return ventas;
    }

    public void setVentas(ArrayList<VENTA> ventas) {
        this.ventas = ventas;
    }
} 
