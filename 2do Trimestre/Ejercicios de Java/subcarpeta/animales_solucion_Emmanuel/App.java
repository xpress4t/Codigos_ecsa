package animales_solucion_Emmanuel;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gato x = new Gato("Firulais",1);
		Perro y = new Perro("Garfield",2,"Angora");
		
		x.emitirSonido();
		x.arañar();
		x.comer();
		System.out.println("El nombre del gato es "+x.getNombre());
		System.out.println("La edad del gato es "+x.getEdad()+" año");
		
		System.out.println("-----------------------------------------");
		
		y.emitirSonido();
		y.comer();
		y.perseguirCola();
		System.out.println("El nombre del perro es "+y.getNombre());
		System.out.println("La edad del perro es "+y.getEdad());
		System.out.println("La raza del perro es "+y.getRaza());
	}

}
