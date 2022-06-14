import java.util.ArrayList;
public class PEDIDO {
    private int costo;
    private ArrayList<DESAYUNO> desayunos;
    private CLIENTE cliente;
    private EMPLEADO empleado;

    public PEDIDO(int costo /*Cliente cliente,*/) {
        this.costo = costo;
        /*this.cliente = cliente;*/
        desayunos  = new ArrayList<>();
    }
    
    public void agregarDesayuno(DESAYUNO d){
        for (DESAYUNO i: desayunos) {
            this.desayunos.add(d);
        }
    }
    
    public int calcCost(){
        int contador = 0;
        
        return contador;
    }
    
    public void mostrarP(){
        System.out.println("Precio: "+this.costo);
        System.out.println("Los desayunos son: ");
        /*System.out.println("El cliente es: "+this.cliente.getNombre());*/
        for (DESAYUNO d: desayunos) {
            d.getDescripcion();
        }
        System.out.println("Para: "+cliente.getNombre());
        System.out.println("Servido por: "+empleado.getNombre());
    }
}
