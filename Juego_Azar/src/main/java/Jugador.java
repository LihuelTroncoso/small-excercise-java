import java.util.ArrayList;
public class Jugador {
    private String nombre;
    private ArrayList<Dado> dados;
    private int puntaje;
    private int fuerza;
    private int defensa;
    private int destreza;
    private int vida;
    private String opcion;
    
    public Jugador(){
        dados = new ArrayList();
    }
    
    public Jugador(int f, int d, int des, int v) {
        dados = new ArrayList();
        this.fuerza = f;
        this.defensa = d;
        this.destreza = des;
        this.vida = v;
    }
    
    public int tirarLosDados(){
        for (Dado d: dados){
            this.puntaje += d.tirarDados();
        }
        return this.puntaje;
    }
    
    public void añadirDado(Dado d){
        this.dados.add(d);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Dado> getDados() {
        return dados;
    }

    public void setDados(ArrayList<Dado> dados) {
        this.dados = dados;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public String getOpcion() {
        return opcion;
    }

    public void setOpcion(String opcion) {
        this.opcion = opcion;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    
    
}
