package emmanuelCordovaMuñoz_AEA1T1;
/*
 *	HACER UNA LISTA DE NÚMEROS CON for NORMAL Y CON for each
	Y TAMBIÉN UNA LISTA QUE QUITE EL NÚMERO (COMO 1) REPETIDO
	y LUEGO HICIMOS EJERCICIO DE QUITAR TODOS LOS NÚMEROS REPETIDOS
	DE UNA LISTA CON NÚMEROS ALEATORIOS 
	
	Emanuel: solo se que hicieron listas
Adrián: Si, básicamente un ej era imprimirlo, usar bucles for y for each y 
luego poner cosas repetidas y eliminarlas
Adrián: Usando las funciones básicas
 */
import java.util.ArrayList;
import java.util.List;
public class huevadas_2 {
	public static void main(String[] args) {
		
		// ArrayList ES UNA CLASE, 
		// NO TIENE LÍMITE DEFINIDO COMO LOS Arrays
		ArrayList<String> aLst = new ArrayList<String>();
		// PODEMOS CAMBIAR A OTRA IMPLEMENTACIÓN
		// SIN CAMBIAR EL CÓDIGO QUE USA LA LISTA
		List<Integer> lst = new ArrayList<Integer>();
		
		// ArrayList<listas> primera=new ArrayList<listas>();
		
		//FUNCIONES
			aLst.add("txt 1");
			aLst.add("txt 2");
			aLst.add("txt 3");
			aLst.add("txt 4");
			aLst.add("txt 5");
			aLst.add("txt 6");
			aLst.add(3, null);
		//aLst.add(10, "AAAA");
			
			String elemento =aLst.get(2);
			System.out.println(elemento);
			
			System.out.println("Para imprimir un dato concreto:"+aLst.get(5));
			System.out.println("Para imprimir todo el arrayList:"+aLst);
			System.out.println("Para saber cuántos datos tiene el arrayList:"+aLst.size());
			System.out.println(aLst.set(0, "Nuevo TxT"));
			System.out.println("Para imprimir todo el arrayList:"+aLst);
			
		//PARA VACIAR
		//aLst.clear();
				
			System.out.println("Para imprimir todo el arrayList:"+aLst);
		//PARA VER SI ESTÁ VACÍA(DEVUELVE UN boolean)
			System.out.println(aLst.isEmpty());
			
		//VER SI ESTÁ DENTRO DEL arrayList
			System.out.println(aLst.contains("txt 2"));
				
			aLst.add("txt 2");
			System.out.println("Para imprimir todo el arrayList:"+aLst);
				
		//SOLO ME DICE DONDE ESTÁ EL PRIMERO
			System.out.println(aLst.indexOf("txt 2"));
			
			System.out.println(aLst.lastIndexOf("txt 2"));
	}
}