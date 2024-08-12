package codigo;
public class Examen {
	/*
	 * Crea una función que pida un array de Strings y un String como 2ª parámetro
	 * Devuelve el array que contenga SOLO los elementos del 1ª array que sean 
	 * diferentes al String del parámetro
	 * 
	 * Crea una función que pida un array del tipo que quieras y un 2ª 
	 * parámetro del mismo tipo(no array).
	 * Dime cuantos valores del 2ª parámetro hay en el array
	 * 
	 * Crea una función que pida un array de números decimales.
	 * Calcúleme la media de los valores el array	
	 * 
	 */

	public static void main(String[] args) {
		String[] array={"adios","esto","es","python"};
		String cadena="python";
		arrayYstring(array,cadena);
		String[] newArray=arrayYstring(array,cadena);
		for(int i=0;i<newArray.length;i++) {
			System.out.println(newArray[i]);
		}
	}
	public static String[] arrayYstring(String[] array,String cadena) {
		int nuevoTam=0;
		for(int i=0;i<array.length;i++) {
			if(!array[i].equalsIgnoreCase(cadena)) {
				nuevoTam++;
			}
		}
		
		String[]newArray = new String[nuevoTam];
		int indiceElemento=0;
		for(int i=0;i<array.length;i++) {
			if(!array[i].equalsIgnoreCase(cadena)) {
				newArray[indiceElemento]=array[i];
				indiceElemento++;
			}
		}
		return newArray;
	}
}
