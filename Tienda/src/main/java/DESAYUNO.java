public class DESAYUNO {
    private int precio;
    private String descripcion;

    public DESAYUNO(int precio, String descripcion) {
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
