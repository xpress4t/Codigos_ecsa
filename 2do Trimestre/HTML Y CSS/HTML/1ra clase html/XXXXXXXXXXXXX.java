import java.util.Scanner;
public class XXXXXXXXXXXXX {
    /*
     * 1.- Preguntar al usuario si quiere jugar contra la máquina u otro usuario.
     * 2.- Imprimir una matriz de 3x3 sin elementos, o poniendo "-" en los lugares vacíos.
     * 3.- Si escogió contra una máquina u otro usuario, preguntarle qué casilla quiere escoger
     *     para así imprimir una "X" o una "O".
     * 4.- Para el caso que sea otro usuario, pedirle también qué casilla quiere escoger, y si
     *     una de las casillas escogidas ya está ocupada, pedirle que ingrese una posición diferente.
     * 5.- Si nos ponemos exquisitos con el código, podría agregarle excepciones, así nos salta un error
     *     por si el usuario ingresa un dato no válido.
     * 6.- Para el caso que sea contra una máquina, hacer un recorrido y que imprima una "X" o "O" 
     *     en una posición aleatoria, siempre y cuando sea diferente de la posición ya escogida por 
     *     el primer usuario(yo).
     * 7.- Luego hacer un bucle donde haga un recorrido y que compare cuando haya 3 "X" o 3 "O",
     *     en caso no se encuentren 3 datos iguales, declarar la partida como un empate.  
     * 8.- Finalmente, si  alguno consigue hacer un "O O O" o "X X X", declararlo como ganador.
     * 
     */
    public static void main(String[] args) {
        int [][] tabla=new int[3][3];
        System.out.println("¡Bienvenido al juego de Tres en Raya!");
        escogerContrincante();
        for(int i=0;i<3;i++) {
			System.out.println("------------------");
			for(int j=0;j<3;j++) {
				tabla[i][j]=;
				System.out.print("|");
				System.out.print(" "+tabla[i][j]+"  ");  
			}
			System.out.println("");
		}
    }
    public static boolean escogerContrincante(){
        while (true) {
            Scanner scan= new Scanner(System.in);
            System.out.println("¿Quieres jugar contra una persona, o una máquina?");
            String eleccionJugador=scan.nextLine();
        }
    }
}
