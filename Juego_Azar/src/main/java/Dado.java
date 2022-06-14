public class Dado {
    private int resultado;
    
    Dado(){
        
    }
    
    public int tirarDados(){
        this.resultado = (int) (Math.random()*6);
        return resultado;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
}
