import java.time.LocalDate;
public class EJECUTABLE {
    public static void main(String[] args) {
        //Productos
        PRODUCTO p1 = new PRODUCTO("Yerba", 200);
        PRODUCTO p2 = new PRODUCTO("Azucar", 130, true);
        PRODUCTO_E p3 = new PRODUCTO_E("Papel Higienico", 100, 20);
        PRODUCTO_E p4 = new PRODUCTO_E("Carne", 300, 10);
        PRODUCTO_E p5 = new PRODUCTO_E("Leche", 100, 20);
        PRODUCTO p6 = new PRODUCTO("Coca-Cola", 200);
        //Supermercado
        DIRECCION direccionDio = new DIRECCION("Av. Monroe", 5055, "CABA");
        SUPERMERCADO dio = new SUPERMERCADO("Dio", 23, direccionDio);
        //Creo 5 ventas
        VENTA v1 = new VENTA(LocalDate.now(), 1);
        v1.añadirProd(p6);
        v1.añadirProd(p2);
        v1.añadirProd(p1);
        v1.ticket();
        VENTA v2 = new VENTA(LocalDate.now(), 2);
        v2.añadirProd(p3);
        v2.añadirProd(p5);
        v2.añadirProd(p4);
        v2.ticket();
        VENTA v3 = new VENTA(LocalDate.now(), 3);
        v3.añadirProd(p1);
        v3.ticket();
//        VENTA v4 = new VENTA(LocalDate.now());
//        VENTA v5 = new VENTA(LocalDate.now());
        //Ganancias del supermercado
        dio.agregarVentas(v1);
        dio.agregarVentas(v2);
        dio.agregarVentas(v3);
        dio.mostrarVentas();
        //Lista de ventas
    }
}