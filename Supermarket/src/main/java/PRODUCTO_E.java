//Leonardo Santagata
public class PRODUCTO_E extends PRODUCTO {
    private int descuento;
    
    public PRODUCTO_E(String n, double p,int d){
        super(n, p);
        this.descuento=d;
    }
    
    public void aplicarDesc(){
        this.precio = this.descuento*100/this.precio;
    }

    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Con un descuento de: "+this.descuento);
        aplicarDesc();
        System.out.println("Precio al descontado ("+this.nombre+") : $"+this.precio);
    }
}