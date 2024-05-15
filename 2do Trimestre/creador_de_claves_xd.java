import java.util.Random;
import java.util.Scanner;

public class creador_de_claves_xd {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
		Random rd = new Random();
		int longitud=pedirLongitud(scan);
		String contraseña="";
		
		String caracteres = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz0123456789()[]{}<>¡!¿?ºª·&^*¨Ç;'.,:_|@\\#~¬€$-+*/%=";
        String clave_generada=generarContraseña(rd,longitud,caracteres);
        
        do {
        	clave_generada=generarContraseña(rd,longitud,caracteres);
        	System.out.println(clave_generada);
        	break;
        }while(!verificarContraseña(contraseña));
        System.out.println("contraseña: "+clave_generada);
    }

    public static int pedirLongitud(Scanner scan) {
    	int longitud;
        do{
        	System.out.print("Ingrese una longitud entre 12 y 20 para su contraseña: ");
            try {
                longitud = scan.nextInt();
                if(longitud<12 || longitud>20) {
                	System.out.println("Este número no se encuentra en el rango de 12 a 20.");
                }
            } catch (Exception e) {
                System.err.println("Error, ingrese un dato válido.");
                scan.next();
                longitud=0;
            }
        }while(longitud<12 || longitud>20);
        return longitud;
    }
    
    public static String generarContraseña(Random rd,int longitud,String caracteres) {
    	String clave_generada="";
    	for(int i=0;i<longitud;i++) {
    		int indice = rd.nextInt(caracteres.length());
    		char cadena = caracteres.charAt(indice);
    		clave_generada+=cadena;
    	}
    	return clave_generada;
    }
    
    public static boolean verificarContraseña (String contraseña) {
    	int contador_de_letras=0;
    	int contador_de_numeros=0;
    	int contador_de_caracteres_especiales=0;
    	for(int i=0;i<contraseña.length();i++) {
    		if(Character.isLetter(contraseña.charAt(i))) {
    			contador_de_letras++;
    		}else if(Character.isDigit(contraseña.charAt(i))) {
    			contador_de_numeros++;
    		}else {
    			contador_de_caracteres_especiales++;
    		}
    	}
    	
    	if(contador_de_letras>=3 && contador_de_numeros>=3 && contador_de_caracteres_especiales>=3) {
    		return true;
    	}else {
    		return false;
    	}
    }
}










