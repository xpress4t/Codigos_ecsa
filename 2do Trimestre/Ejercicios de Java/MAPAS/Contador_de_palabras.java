package MAPAS;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Contador_de_palabras {

	public static void main(String[] args) {
		HashMap<String,Integer> mapa = new LinkedHashMap<>();
		
		String texto = "Hay un verso que me ahoga "
				+ "que me quema la garganta "
				+ "un verso sin voz que canta "
				+ "si el alma se desahoga."
				+ "Este verso solo aboga "
				+ "una quietud placentera,"
				+ "la pluma es mi compañera,"
				+ "el papel mi amigo franco "
				+ "y la inspiración la arranco "
				+ "del centro de mi alma entera."
				+ "La musa jamás espera,"
				+ "ni se atrasa,ni se apura,"
				+ "porque la musa perdura "
				+ "cuando llega verdadera."
				+ "La pluma corre certera "
				+ "a lo largo de un papel,"
				+ "pobre del poeta aquel "
				+ "que no da paso a su musa "
				+ "o que la exprese confusa "
				+ "por los poros de su piel.";
		
		// HAGO UN FOR-EACH PARA RECORRER E LTEXTO Y SEPARAR LAS PALABRAS 
		String[] separando_palabras = texto.replace(",", " ").replace("."," ").toLowerCase().split(" ");
		// Recorro las palbras 1 a 1
		for(String palabras: separando_palabras) {
			if(palabras.length()<0) 
				continue;
				if(mapa.containsKey(palabras)) {
					mapa.put(palabras,mapa.get(palabras)+1);
				}else {
					mapa.put(palabras, 1);
				}
		}
		System.out.println(mapa);
	}
}