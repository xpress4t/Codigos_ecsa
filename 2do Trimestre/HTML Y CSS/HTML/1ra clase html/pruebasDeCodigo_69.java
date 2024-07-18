import java.util.Scanner;
import static java.lang.Math.*;
public class pruebasDeCodigo_69{
    public static void main(String[] args){
        Scanner xd=new Scanner(System.in);
        String[] elecciones ={"piedra","papel","tijeras"};
        System.out.println("Juguemos piedra, papel y tijeras.");
        jugarContraPersona();
        jugarContraComputadora(elecciones,eleccionMaquina);
        
        }
    }
    public static boolean jugarContraPersona(){
        while (true) {
            System.out.println("¿Quieres jugar conntra la computadora, o contra una persona? (computadora/persona).");
            
            System.out.println("Escoge piedra, papel o tijeras: ");
            String eleccionPersona=xd.nextLine();
            if(eleccionPersona.equalsIgnoreCase("computadora")){
                System.out.println("Vale, jugarás contra la computadora.");
            }else{
                System.out.println("Vale, jugarás contra una persona.");
            }
            int numeroAleatorio=(int)(random()*3);
            String eleccionMaquina=elecciones[numeroAleatorio];
            System.out.println("La computadora escogió "+eleccionMaquina+".");
            if(eleccionPersona.equals(eleccionMaquina)){
                System.out.println("Esto es un empate, ambos escogieron lo mismo.");
            }else if((eleccionPersona.equals("piedra") && eleccionMaquina.equals("tijeras")) || (eleccionPersona.equals("papel") && eleccionMaquina.equals("piedra")) || (eleccionPersona.equals("tijeras") && eleccionMaquina.equals("papel"))){
                System.out.println("¡Felicitaciones! Le ganaste a la máquina.");
            }else if((eleccionMaquina.equals("piedra") && eleccionPersona.equals("tijeras")) || (eleccionMaquina.equals("papel") && eleccionPersona.equals("piedra")) || (eleccionMaquina.equals("tijeras") && eleccionPersona.equals("papel"))){
                System.out.println("Perdiste, la computadora gana esta ronda.");
            }
            break;
    }

    public static boolean jugarContraComputadora(String[] elecciones,String[] eleccionMaquina){
        while (true) {
            System.out.println("¿Quieres jugar conntra la computadora, o contra una persona? (computadora/persona).");
            
            System.out.println("Escoge piedra, papel o tijeras: ");
            String eleccionUsuario=xd.nextLine();
            if(eleccionUsuario.equalsIgnoreCase("computadora")){
                System.out.println("Vale, jugarás contra la computadora.");
            }else{
                System.out.println("Vale, jugarás contra una persona.");
            }
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