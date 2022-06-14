//Agustin Villalba
import java.time.LocalDate;
import java.util.ArrayList;
public class VENTA {
    private int nroVenta;
    private ArrayList<PRODUCTO> productos = new ArrayList();
    private LocalDate fecha = null;
    private float precioTotal;
    private int prodTotales;

    //constructor clase venta
    public VENTA(LocalDate fecha, int n){
        this.fecha = fecha;
        this.nroVenta = n;
    }
    
    //se toma el valor de cada producto en el arrayList productos y se va sumando en "valor"
    public float calcularPrecio(){
        float valor = 0;
        for(PRODUCTO Prd: productos){
            valor += Prd.getPrecio();
        }
        this.precioTotal = valor;
        return valor;
    }
    
    //se agrega 1 por cada producto en el arrayList productos
    public int totalProd(){
        int prodTot = 0;
        for(PRODUCTO P: productos){
            prodTot += 1;
        }
        prodTotales = prodTot;
        return prodTotales;
    }
    //el usuario ingresa un producto y se va guardando en "productos" como parametro
    public void añadirProd(PRODUCTO Prd){
        productos.add(Prd);
    }
    
    public void ticket(){
        System.out.println("Ticket "+this.nroVenta);
        System.out.println("Fecha: "+this.fecha);
        for (PRODUCTO p: productos){
            p.mostrarDatos();
        }
        System.out.println("-----------------------------");
        System.out.println("Total a pagar: "+this.calcularPrecio());
        System.out.println("Total productos: "+this.totalProd());
        System.out.println("-----------------------------");
    }
    //Getters y Setters
    public float getPrecio() {
        return this.precioTotal;
    }

    public void setPrecio(float valorProd) {
        this.precioTotal= valorProd;
    }

    public int getProdTotales() {
        return prodTotales;
    }

    public void setProdTotales(int prodTotales) {
        this.prodTotales = prodTotales;
    }
}
