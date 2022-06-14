//Lihuel Troncoso
import java.util.ArrayList;
public class CATALOGO {
    private ArrayList<PRODUCTO> listaProductos = new ArrayList<PRODUCTO>();
    
    public CATALOGO(ArrayList<PRODUCTO> p){
        this.listaProductos = p;
    }
    
    public void mostrarProductos(){
        for (PRODUCTO i: listaProductos) {
            System.out.println(i.getNombre());
        }
    }
    
    public void agregarProducto(PRODUCTO p){
        this.listaProductos.add(p);
    }
}
