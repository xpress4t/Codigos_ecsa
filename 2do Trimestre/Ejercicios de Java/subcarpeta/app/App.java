package app;

import clases.Coche;

public class App {
	public static void main(String[] args) {
		Coche cocheNuevo = new Coche(2,"Porsche",4,"negro espacial",true,2,false);
		Coche cocheNuevo1 = new Coche(2,"Ferrari",4,"rojo",true,2,false);
		Coche cocheNuevo2 = new Coche(2,"Mercedes Benz",4,"plata",true,2,false);
		
		// Coche[] arrayNuevo = new Coche[5];
		// ArrayList<Coche> arrayListCoche = new ArrayList<Coche>();
		
		System.out.println("La marca del primer coche es: "+cocheNuevo.marca);
		System.out.println("La marca del segundo coche es: "+cocheNuevo1.marca);
		System.out.println("La marca del tercer coche es: "+cocheNuevo2.marca);
		
		System.out.println("--------------------------------------------------");
		
		System.out.println("El color del primer coche es: "+cocheNuevo.color);
		System.out.println("El color del segundo coche es: "+cocheNuevo1.color);
		System.out.println("El color del tercer coche es: "+cocheNuevo2.color);
		
		System.out.println("--------------------------------------------------");
		
		Coche[] arrayCoche = new Coche[3];
		arrayCoche[0]=cocheNuevo;
		arrayCoche[1]=cocheNuevo1;
		arrayCoche[2]=cocheNuevo2;
		
		for(Coche c:arrayCoche) {
			System.out.println("El color es: "+c.color);
		}
		System.out.println("--------------------------------------------------");
		
		cocheNuevo.color="Amarillo";
		System.out.println("El nuevo color del primer coche es: "+cocheNuevo.color);
		
	}
}
