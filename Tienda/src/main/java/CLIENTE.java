public class CLIENTE extends PERSONA{
    private int cantPedidos;

    public CLIENTE(int cantPedidos, String nombre, int edad, String direccion, int documento) {
        super(nombre, edad, direccion, documento);
        this.cantPedidos = cantPedidos;
    }

    public int getCantPedidos() {
        return cantPedidos;
    }

    public void setCantPedidos(int cantPedidos) {
        this.cantPedidos = cantPedidos;
    }
    
}
