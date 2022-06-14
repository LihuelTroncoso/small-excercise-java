import javax.swing.JOptionPane;
public class JuegoDeDados implements Jugable{
    private Jugador jugador1, jugador2;
    
    public JuegoDeDados(){
    }

    @Override
    public void jugar() {
        this.jugador1.tirarLosDados();
        this.jugador2.tirarLosDados();
        JOptionPane.showMessageDialog(null,"El jugador " + this.jugador1.getNombre() + " obtuvo el numero: "+this.jugador1.getPuntaje());
        JOptionPane.showMessageDialog(null,"El jugador " + this.jugador2.getNombre() + " obtuvo el numero: "+this.jugador2.getPuntaje());
    }

    @Override
    public void iniciar() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del jugador 1");
        this.jugador1.setNombre(nombre);
        nombre = JOptionPane.showInputDialog("Ingrese el nombre del jugador 2");
        this.jugador2.setNombre(nombre);
    }

    @Override
    public void finalizar() {
        if(this.jugador1.getPuntaje()>this.jugador2.getPuntaje()){
            JOptionPane.showMessageDialog(null, "El ganador es el jugador 1");
        }else{
            if(this.jugador2.getPuntaje()>this.jugador1.getPuntaje()){
                JOptionPane.showMessageDialog(null, "El ganador es el jugador 2");
            }else{
                JOptionPane.showMessageDialog(null, "EMPATE");
            }
        }
    }

    public Jugador getJugador1() {
        return jugador1;
    }

    public void setJugador1(Jugador jugador1) {
        this.jugador1 = jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public void setJugador2(Jugador jugador2) {
        this.jugador2 = jugador2;
    }
    
    
}
