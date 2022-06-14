public class PERSONA {
    //Atributos
    protected String nombre;
    //Métodos
    public PERSONA(String nombre){
        this.nombre = nombre;
    }
    public void mostrarSusDatos(){
        System.out.println("Su nombre es: "+this.nombre);
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}
