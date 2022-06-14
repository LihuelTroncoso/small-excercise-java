import java.util.ArrayList;
public class Monstruo {
    private int vida;
    private int fuerza;
    private ArrayList<Dado> dados;

    public Monstruo(int vida, int fuerza) {
        this.vida = vida;
        this.fuerza = fuerza;
        this.dados = new ArrayList();
    }
    
    public int calcularFuerza(){
        for (Dado d: dados){
            this.fuerza += d.tirarDados();
        }
        return this.fuerza;
    }
    
    public void añadirDado(Dado d){
        this.dados.add(d);
    }
    
    public ArrayList<Dado> getDados() {
        return dados;
    }

    public void setDados(ArrayList<Dado> dados) {
        this.dados = dados;
    }
    
    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }
    
    
}
