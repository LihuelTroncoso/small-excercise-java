import javax.swing.JOptionPane;
public class Ejecutable {
    public static void main(String[] args) {
        Dado d1 = new Dado();
        Dado d2 = new Dado();
        Dado d3 = new Dado();
        Dado d4 = new Dado();
        String[] juegos = {"Juego de dados", "Peleas con dados"};
        String opcion = (String)JOptionPane.showInputDialog(null,"Selecciona una opcion",
        "Elegir", JOptionPane.QUESTION_MESSAGE,null,juegos, juegos[0]);
        switch(opcion){
            case "Juego de dados":
                JuegoDeDados j = new JuegoDeDados();
                Jugador j1 = new Jugador();
                Jugador j2 = new Jugador();
                j1.añadirDado(d1);
                j1.añadirDado(d2);
                j2.añadirDado(d3);
                j2.añadirDado(d4);
                j.setJugador1(j1);
                j.setJugador2(j2);
                j.iniciar();
                j.jugar();
                j.finalizar();
                break;
            case "Peleas con dados":
                PeleasConDados p = new PeleasConDados();
                Jugador jugador = new Jugador(14, 15, 2, 30);
                Monstruo monstruo = new Monstruo(40, 5);
                jugador.añadirDado(d1);
                jugador.añadirDado(d2);
                monstruo.añadirDado(d3);
                monstruo.añadirDado(d4);
                p.setJugador1(jugador);
                p.setMonstruo1(monstruo);
                p.iniciar();
                p.jugar();
                p.finalizar();
                break;
        }
    }
}
