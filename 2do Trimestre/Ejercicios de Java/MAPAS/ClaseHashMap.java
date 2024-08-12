package MAPAS;

import java.util.HashMap;

public class ClaseHashMap {

	public static void main(String[] args) {
		// Siempre tenemos que rellenar el "<>" del HashMap
		/*
		 * El primer dato siempre será números o strings --> Float, Integer, String, Double, etc 
		 */
		HashMap<String,Integer> mapa = new HashMap<>();
		HashMap<Integer,String> mapa2 = new HashMap<>();
		
		mapa.put("I",1);
		mapa.put("II",2);
		mapa.put("III",3);
		mapa.put("IV",4);
		mapa.put("V",5);
		mapa.put("VI",6);
		mapa.put("VII",7);
		mapa.put("VIII",8);
		mapa.put("IX",9);
		mapa.put("X",10);
		
		mapa2.put(501, "El valor es 501");
		mapa2.put(501, "El valor es 502");
		mapa2.put(510, null);
		
		System.out.println(mapa);
		System.out.println("----------------------------------------------------------------------------");
		System.out.println(mapa2);
		System.out.println("----------------------------------------------------------------------------");
		System.out.println(mapa2.get(510));
		System.out.println("----------------------------------------------------------------------------");
		
		
		// Borra todo el registro, no una parte
		
		
		mapa2.remove(501);
		System.out.println(mapa2.get(501));
		System.out.println("----------------------------------------------------------------------------");
		System.out.println(mapa2);
		System.out.println("----------------------------------------------------------------------------");
		System.out.println(mapa2.containsKey(501));
		System.out.println("----------------------------------------------------------------------------");
		// Nos dice si está vacio o no
		System.out.println(mapa2.isEmpty());
		System.out.println("----------------------------------------------------------------------------");
		// Nos dice cuantos pares de clave valor hay
		System.out.println(mapa.entrySet());
		System.out.println("----------------------------------------------------------------------------");
		
		System.out.println(mapa2.entrySet());
		System.out.println("----------------------------------------------------------------------------");
		
		for(Integer clave: mapa2.keySet()) {
			System.out.println("La clave es: "+clave+ " y el valor asociado es: "+mapa.get(clave));
		}
		
		System.out.println("----------------------------------------------------------------------------");
		
		for(String valor: mapa2.values()) {
			System.out.println(valor);
		}
		
		System.out.println("----------------------------------------------------------------------------");
		
		// Le estoy pasando una funcion la cual recibe 2 parametros,
		// el primero asociado a la clave y el segundo al valor
		
		// funcion flecha en JavaScript
		mapa2.forEach((clave,valor)->{
			System.out.println("La clave es: "+ clave+" y el valor asociado es: "+mapa.get(clave));
		});
	}

}
