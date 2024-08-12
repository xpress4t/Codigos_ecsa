package codigo;

import java.util.Iterator;

public class variables{
	public static void main(String[] args) {
		
			String txt = "HOLA BUENOS DÍAS";
			System.out.println(txt.charAt(3));
			
			char caracter = txt.charAt(3);
			System.out.println(caracter);
			
			String txt1 = "aaaaaaaaaaaaaaaaabbbbbbbbbbbcccccc";
			System.out.println("El número de caracteres del string es: "+txt.length());
	
			System.out.println(txt.substring(5));
			
			System.out.println(txt.substring(5,12));
														
			String txtMinusculas = txt.toLowerCase();
			
			System.out.println(txtMinusculas);
			
			String txtMayusculas = txtMinusculas.toUpperCase();
			
			System.out.println(txtMayusculas);
			
			String txtReemplazado = txt1.replace('a', 'z');
			System.out.println(txtReemplazado);
			System.out.println(txt.replace('_','1').toUpperCase());
			System.out.println(txt.replace("HOLA", "Adios").toUpperCase());
			
			String txt2 = "   Ho la   ";
			System.out.println(""+txt2.trim()+"'");
			
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

