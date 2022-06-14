public class EJECUTABLE {
    public static void main(String[] args) {
        EMPLEADO jorge = new FREELANCE("Jorge", 4);
        EMPLEADO juan = new MENSUAL("Juan", 'A', 200);
        EMPRESA google = new EMPRESA("Google");
        google.añadirEmpleados(jorge);
        google.añadirEmpleados(juan);
        
        google.mostrarEmpleados();
    }
}