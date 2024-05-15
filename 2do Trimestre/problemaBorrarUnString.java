/*
 * CREA UNA FUNCION QUE PIDA UN ARRAY DE STRINGS Y UN STRING COMO 2° PARÁMETRO
 * DEVUELVE EL ARRAY QUE CONTENGA SOLO LOS ELEMENTOS DEL 1° ARRAY QUE 
 * SEAN DIFERENTES AL STRING DEL PARÁMETRO
 * 
 * CREA UNA FUNCION QUE PIDA UN ARRAY DEL TIPO QUE QUIERAS Y UN 2° PARÁMETRO
 * DEL MISMO TIPO (NO ARRAY)
 * DIME CUANTOS DEL 2° PARAMETRO HAY EN EL ARRAY
 * 
 * CREA UNA FUNCION QUDE PIDA UN ARRAY DE NUMEROS DECIMALES
 * Y CALCULAR LA MEDIA DE LOS VALORES DEL ARRAY
 * 
 */
public class problemaBorrarUnString {
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
