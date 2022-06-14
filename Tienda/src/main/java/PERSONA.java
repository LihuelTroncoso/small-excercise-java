public class PERSONA {
    private String nombre;
    private int edad;
    private String direccion;
    private int documento;

    public PERSONA(String nombre, int edad, String direccion, int documento) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.documento = documento;
    }
    
    public void mostrarMisDatos(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Edad: "+this.edad);
        System.out.println("Direccion: "+this.direccion);
        System.out.println("Documento: "+this.documento);
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getDocumento() {
        return documento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }
    
}
