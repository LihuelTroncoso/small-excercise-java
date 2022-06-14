//Candelaria Slobodiamsky
public class DIRECCION {  //inicializo las variables
    private String calle;
    private int numero;
    private String localidad;
    
    //inicializo el metodo constructor
    public DIRECCION(){ 
        
    }
   //Defino el metodo constructor 
    public DIRECCION(String calle, int numero, String localidad){ 
        this.calle = calle;
        this.numero = numero;
        this.localidad = localidad;
    }

    //inicializo los get y set de cada variable
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
    
    
    //Creo el metodo mostrarDir y muestro los datos en pantalla
    public void mostrarDir(){
        System.out.println("la direccion es: " + calle + " " + numero + " " + localidad);
    }
    
}