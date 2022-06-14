//Leonardo Santagata
public class PRODUCTO {
    protected String nombre;
    protected double precio;
    protected boolean preciosCui = false;
    
    public PRODUCTO(String n, double p){
        this.nombre=n;
        this.precio=p;
    }
    
    public PRODUCTO(String n, double p, boolean pre){
        this.nombre=n;
        this.precio=p;
        this.preciosCui=pre;
    }
    
    public void mostrarDatos(){
        System.out.println(this.nombre);
        System.out.println("$"+this.precio);
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    public double getPrecio()
    {
        return precio;
    }
    
    public void setPrecio(int precio)
    {
        this.precio=precio;
    }

    public boolean getPreciosCui() {
        return preciosCui;
    }

    public void setPreciosCui(boolean preciosCui) {
        this.preciosCui = preciosCui;
    }
    
    
}
