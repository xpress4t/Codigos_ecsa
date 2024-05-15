public class variables{
	public static void main(String[] args) {
		String txt = "HOLA buenos DÍAS";
		System.out.println(txt.charAt(0));

		char caracter =  txt.charAt(3); // caracter = txt.charAt(3) = 'A';
		System.out.println(caracter);
		String txt1 = "zzzaaavccc";
		System.out.println("El número de caracteres del string es: "+txt.length());
		//IMPRIMIENDO DESDE EL CARACTER 5
		System.out.println(txt.substring(5));
		// IMPRIMIENDO DESDE EL CARACTER 5 HASTA EL 11
		System.out.println(txt.substring(5,11));
		// IMPRIMIENDO DIFERENTES CARACTERES PARA FORMAR UNA PALABRA CON SENTIDO
		System.out.println(txt.substring(0,1)+txt.substring(6, 8)+txt.substring(15,15)+txt.substring(10,11)+txt.substring(1, 2));
		//PARA PASAR EL TEXTO DE MAYUSCULAS A MINUSCULAS
		String txtMinusculas = txt.toLowerCase();
		System.out.println(txtMinusculas);
		//PARA PASAR EL TEXTO DE MINUSCULAS A MAYUSCULAS
		String txtMayusculas = txtMinusculas.toUpperCase();
		System.out.println(txtMayusculas);
		//REEMPLAZANDO LA LETRA a POR LA LETRA z
		String txtReemplazado = txt1.replace('a', 'z');
		System.out.println(txtReemplazado);
		//REEMPLAZANDO LOS ESPACIOS EN BLANCO POR EL NUMERO 1
		System.out.println(txt.replace(' ','1').toUpperCase());
		//REEMPLAZANDO LA PALBRA "HOLA" POR LA PALABRA "Adios", PERO AL UTILIZAR EL .toUppperCase(), LA PALABRA "Adios" SE CONVERTIRÁ A MAYÚSCULA
		System.out.println(txt.replace("HOLA", "Adios").toUpperCase());
		//QUITANDO LOS ESPACIOS EN BLANCO DEL INICIO Y EL FINAL DEL STRING
		String txt2 = "   Ho la   ";
		System.out.println(""+txt2.trim()+"!");
		System.out.println("---------------------------");
		String txt3 = "Hola";
		String txt4 = "Hola";
			
		//Forma correcta de comparar dos string
		if (txt3.equals(txt4)==false) {
			System.out.println("Los string son iguales");
		}else {
			System.out.println("Los string son diferentes");
		}
		System.out.println("---------------------------");
			
		for (int i1=0;i1<txt.length();i1++) {

			System.out.println(txt.charAt(i1));
		}
		System.out.println("---------------------------");
			
		for (int i1=txt.length()-1;i1>=0;i1--) {
		    System.out.println(txt.charAt(i1));
		}

		System.out.println("---------------------------");
		
		System.out.println("PARES");

		System.out.println("---------------------------");
			
		for (int i1=0;i1<txt.length();i1++) {
			if (i1%2==0) {
				System.out.println(txt.charAt(i1));
			}	
		}
		System.out.println("---------------------------");
			
		for (int i2=txt.length()-1;i2>=0;i2--) {
			System.out.println(txt.charAt(i2));
		}	
		System.out.println("---------------------------");
			
		for (int i2=((txt.length())/2)-1;i2>=0;i2--) {
			System.out.println(txt.charAt(i2));
		}
	}	
}

