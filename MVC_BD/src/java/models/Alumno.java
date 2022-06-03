package models;

public class Alumno {
    private String nombre;
    private String apellido;
    private double promedio;
    
    public Alumno(String n, String a, double p){
        this.nombre = n;
        this.apellido = a;
        this.promedio = p;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
    
}
