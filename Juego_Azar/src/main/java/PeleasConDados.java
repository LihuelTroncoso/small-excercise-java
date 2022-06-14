import javax.swing.JOptionPane;
public class PeleasConDados implements Jugable{
    private Jugador jugador1;
    private Monstruo monstruo1;
    
    public PeleasConDados(){
    }
    
    @Override
    public void iniciar() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del jugador");
        this.jugador1.setNombre(nombre);
    }
    
    public void jugar() {
        JOptionPane.showMessageDialog(null, "¡Ha aparecido un monstruo y debes acabar con él!");
        String[] opciones = {"Atacar", "Defender", "Esquivar"};
        while(this.monstruo1.getVida()>0 && this.jugador1.getVida()>0){
            this.jugador1.setPuntaje(0);
            this.monstruo1.setFuerza(0);
            String opcion = (String)JOptionPane.showInputDialog(null,"Selecciona una opcion",
            "Elegir", JOptionPane.QUESTION_MESSAGE,null,opciones, opciones[0]);
            this.jugador1.setOpcion(opcion);
            this.jugador1.tirarLosDados();
            this.monstruo1.calcularFuerza();
            JOptionPane.showMessageDialog(null,"El jugador " + this.jugador1.getNombre() + " sacó un: "+this.jugador1.getPuntaje());
            switch(opcion){
                case "Atacar":
                    if(this.monstruo1.getVida()<0){
                        break;
                    }
                    this.jugador1.setPuntaje(this.jugador1.getFuerza()+this.jugador1.getPuntaje());
                    JOptionPane.showMessageDialog(null, "Se suma a su fuerza, dando un total de: "+this.jugador1.getPuntaje());
                    this.monstruo1.setVida(this.monstruo1.getVida()-this.jugador1.getPuntaje());
                    JOptionPane.showMessageDialog(null, "La vida actual del monstruo es: "+this.monstruo1.getVida());
                    JOptionPane.showMessageDialog(null,"El monstruo te ataca y realiza "+this.monstruo1.getFuerza()+" de daño");
                    this.jugador1.setVida(this.jugador1.getVida()-this.monstruo1.getFuerza());
                    break;
                case "Defender":
                    this.jugador1.setPuntaje(this.jugador1.getDefensa()+this.jugador1.getPuntaje());
                    JOptionPane.showMessageDialog(null, "Se suma a su defensa, dando un total de: "+this.jugador1.getPuntaje());
                    JOptionPane.showMessageDialog(null,"El monstruo te ataca y realiza "+this.monstruo1.getFuerza()+" de daño");
                    this.monstruo1.setFuerza(this.monstruo1.getFuerza()-this.jugador1.getPuntaje());
                    if(this.monstruo1.getFuerza()<0){
                        this.monstruo1.setFuerza(0);
                    }
                    JOptionPane.showMessageDialog(null, "Pero has defendido, por lo que su daño se reduce a: "+this.monstruo1.getFuerza());
                    this.jugador1.setVida(this.jugador1.getVida()-this.monstruo1.getFuerza());
                    break;
                case "Esquivar":
                    this.jugador1.setPuntaje(this.jugador1.getDestreza()+this.jugador1.getPuntaje());
                    JOptionPane.showMessageDialog(null, "Se suma a su destreza, dando un total de: "+this.jugador1.getPuntaje());
                    JOptionPane.showMessageDialog(null,"El monstruo te ataca y realiza "+this.monstruo1.getFuerza()+" de daño");
                    if(this.jugador1.getPuntaje()>this.monstruo1.getFuerza()){
                        JOptionPane.showMessageDialog(null,"Pero eres mas rápido y logras esquivarlo, por lo que no recibes daño");
                    }else{
                        JOptionPane.showMessageDialog(null,"No logras esquivar su ataque, recibes "+this.monstruo1.getFuerza()+" puntos de daño");
                        this.jugador1.setVida(this.jugador1.getVida()-this.monstruo1.getFuerza());
                        
                    }
                    break;
            }
            System.out.println(opcion);
            JOptionPane.showMessageDialog(null, "Te quedan "+this.jugador1.getVida()+" puntos de vida");
        }
    }
    
    public void finalizar() {
        if(this.monstruo1.getVida()<0){
            JOptionPane.showMessageDialog(null,"¡Has vencido al monstruo!");
        }
        if(this.jugador1.getVida()<0){
            JOptionPane.showMessageDialog(null,"Has muerto... Suerte la proxima!");
        }
    }

    public Jugador getJugador1() {
        return jugador1;
    }

    public void setJugador1(Jugador jugador1) {
        this.jugador1 = jugador1;
    }

    public Monstruo getMonstruo1() {
        return monstruo1;
    }

    public void setMonstruo1(Monstruo monstruo1) {
        this.monstruo1 = monstruo1;
    }
    
}
