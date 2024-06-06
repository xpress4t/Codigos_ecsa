import java.util.Scanner;
import static java.lang.Math.*;
public class PiedraPapelTijeras{
    public static void main(String[] args){
        Scanner xd=new Scanner(System.in);
        String[] elecciones ={"piedra","papel","tijeras"};
        System.out.println("Juguemos piedra, papel y tijeras.");
        while (true) {
            System.out.println("Escoge piedra, papel o tijeras: ");
            String eleccionUsuario=xd.nextLine();
            int numeroAleatorio=(int)(random()*3);
            String eleccionMaquina=elecciones[numeroAleatorio];
            System.out.println("La computadora escogió "+eleccionMaquina+".");
            if(eleccionUsuario.equals(eleccionMaquina)){
                System.out.println("Esto es un empate, ambos escogieron lo mismo.");
            }else if((eleccionUsuario.equals("piedra") && eleccionMaquina.equals("tijeras")) || (eleccionUsuario.equals("papel") && eleccionMaquina.equals("piedra")) || (eleccionUsuario.equals("tijeras") && eleccionMaquina.equals("papel"))){
                System.out.println("¡Felicitaciones! Le ganaste a la máquina.");
            }else if((eleccionMaquina.equals("piedra") && eleccionUsuario.equals("tijeras")) || (eleccionMaquina.equals("papel") && eleccionUsuario.equals("piedra")) || (eleccionMaquina.equals("tijeras") && eleccionUsuario.equals("papel"))){
                System.out.println("Perdiste, la computadora gana esta ronda.");
            }
            break;
        }
    }
}