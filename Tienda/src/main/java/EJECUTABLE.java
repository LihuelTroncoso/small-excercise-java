public class EJECUTABLE {
    public static void main(String[] args) {
        CLIENTE c1 = new CLIENTE(2, "Juan", 23, "Allvarez Tomas 1980", 24567893);
        DESAYUNO huevosRevueltos = new DESAYUNO(1000,"Huevos Revueltos");
        DESAYUNO cafeConLeche = new DESAYUNO(1000,"Cafe con Leche");
        DESAYUNO[] todos = new DESAYUNO[3];
        /*todos[0] = huevosRevueltos;
        todos[1] = cafeConLeche;*/
        PEDIDO pedido1 = new PEDIDO(2000, todos);
        
        
        DESAYUNO tostadas = new DESAYUNO(1000, "Tostadas");
        pedido1.agregarDesayuno(tostadas);
        pedido1.agregarDesayuno(huevosRevueltos);
        pedido1.mostrarP();
    }
}
