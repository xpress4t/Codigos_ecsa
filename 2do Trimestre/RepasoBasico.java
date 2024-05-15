public class RepasoBasico {
	//Esto es un comentario que solo acepta una línea
	/*
	 * Esto es un comentario 
	 * que puede ocupar varias líneas
	 * /
	/*
	 * Para declarar una variable y así poder guardarla sigo la siguiente nomenclatura:
	 * tipoDato nombreVariable = valor;
	 * El nombre de la variable siempre tiene que empezar por letra o _
	 */
	
	//Para que aparezca información por pantalla se escribe System.out.println(Información a mostrar)
	
    /*
 * Para acer operaciones  usamos los operadores:
 *  Operadores de comparación:
 *  == Compara 2 variables. Si su valor es igual retorna true. No importa el tipo de dato.
 *  !=      Compara 2 varianles. Si su valor es diferente retorna true. No importa el tipo de dato.
 *       ===     Comparación extricta de 2 variables. Si su valor y tipo de dato es igual retorna true.
 *       !==     Comparación extricta de 2 variables. Si su valor y tipo de dato NO igual retorna true.
 *  >=      Compara si la variable de la izquierda es mayor e igual a la de la derecha. Si es así retorna true
 *       <=      Compara si la variable de la izquierda es menor e igual a la de la derecha. Si es así retorna true
 *  <  Compara si la variable de la izquierda es menor a la de la derecha. Si es así retorna true
 *  > Compara si la variable de la izquierda es mayor a la de la derecha. Si es así retorna true
 * 
 *     Operadores arítmeticos:
 *       +       Suma el valor de la izquierda y de la derecha. Retorna el valor resultante
 *       -       Resta al valor de la izquierda el de la derecha. Retorna el valor resultante
 *       *       Multiplica el valor de la izquierda por el de la derecha. Retorna el valor resultante
 *       /       Divide el valor de la izquierda entre el de la derecha. Retorna el valor resultante
 *       %       Resto del valor de la izquierda y de la derecha. Retorna el valor resultante
 *       ++      Suma 1 al valor de la variable. 
 *       --      Resta 1 al valor de la variable.
 *   
 *   Operadores de asignación:
 *  =       Asigna a la variable(izquierda) el valor (derecha)
 *  +=      Suma el valor(derecha) a la variable(izquierda) y se lo asigna
 *  -=      Resta el valor(derecha) a la variable(izquierda) y se lo asigna
 *  *=      Multiplica el valor(derecha) a la variable(izquierda) y se lo asigna
 *  /=      Divide el valor(derecha) a la variable(izquierda) y se lo asigna
 *   %=      Calcula el resto del valor(derecha) a la variable(izquierda) y se lo asigna
     *    
     *   Operadores booleanos
     *       &&      and     Evaluamos dos valores booleanos
     *       ||      or      Evaluamos dos valores booleanos
     *       !       not     Negamos un valor booleano
	 * 
	 * */
	
	
	/*
	 * Tipos de datos  numéricos:
	 * - short  -> Número entero sin decimales 
	 * - int    -> Número entero sin decimales 
	 * - long   -> Número entero sin decimales 
	 * - float  -> Número entero con decimales
	 * - double -> Número entero con decimales
	 * 
	 * El short puede tener números más pequeños que el int y el int tiene menos números que el long
	 * El float tiene menos números que el double
	 *  
	 * */
	
	short numeroShort = 5;
	int numeroInt = 10;
	long numeroLong = -150000;
	
	float numeroFloat = 45.63f;
	double numeroDouble = 653214.6133;
	
	/*
	 * Tipo de dato booleano
	 * - true
	 * - false
	 * */
	boolean valorTrue = true;
	boolean valorFalse = false;
	
	/*
	 * Tipo de dato de texto
	 * - String -> conjunto de caracteres -> se pone siempre con comillas dobles (")
	 * - char   -> un solo carácter       -> se pone siempre con comillas simples (')
	 * */
	String txt ="Esto es un texto";
	char caracter='c';
	
	
	/*Estructuras de control:
	 * - if
	 * - if else 
	 * - switch case
	 * - while
	 * - do while
	 * - for
	 * */

	/*
	  if(condición a comprobar){
	  
	  	Código que se ejecuta en caso de que sea cierta la condición
	 	
	  }
	 */
	/*
	  if(condición a comprobar){
	  
	  	Código que se ejecuta en caso de que sea cierta la condición
	 	
	  }else{
	  
	  	Código que se ejecuta en caso de que sea falsa la condición
	  
	  }
	 */
	/*
	switch (day) {
    case 1:
        System.out.println("Lunes");
        break;
    case 2:
        System.out.println("Martes");
        break;
    case 3:
        System.out.println("Miércoles");
        break;
    case 4:
        System.out.println("Jueves");
        break;
    case 5:
        System.out.println("Viernes");
        break;
    case 6:
        System.out.println("Sábado");
        break;
    case 7:
        System.out.println("Domingo");
        break;
    default:
        System.out.println("Número no válido");
        break;
	}
    */
	
	/*
	 while(condición){
	 
	 	código que se ejecuta mientras que la condición sea cierta
	 
	 }
	*/
	
	/*
	 
	 do{
	 	código que se ejecuta mientras que la condición sea cierta
	 	Siempre se ejecuta al menos 1 vez
	 }
	 while(condición);
	*/
	
	/*
	 
	 for(variable con la que me voy a mover; condición; cómo me muevo){
		código que se ejecuta mientras que la condición sea cierta
	 }
	 
	 for(int i=0; i<10; i++){
	 
	 }	 
	 
	 */
	
	
	
	
	/*
	 * Funciones básicas de los String
	 * El número de elementos no es lo mismo que la posición -> Uno empieza a contar desde 1 y el otro desde 0. 
	 * Para acceder a sus funciones básicas se usa -> variable.función
	 * 
	 * Para saber cuantos caracteres tiene mi String -> .length()
	 * Para saber el caracter en una posición concreta -> .charAt(posición)
	 * Para sustituir una serie de caracteres por otros -> .replace(caracteres a reemplazar , nuevos caracteres)
	 * Para eliminar los espacios del principio y del final del String -> .trim()
	 * Para poner el texto en mayúsculas -> .toUpperCase()
	 * Para poner el texto en minúsculas -> .toLowerCase()
	 * Para coger solo una parte del texto -> .subString(índice de inicio, índice final) 
	 * 
	 * 
	 * */
	
	/*
	 * Para crear nuestras propias funciones debemos (por ahora) seguir esta sintaxis:
	public static void nombreFuncion(tipoDato1 nombreParametro1,tipoDato1 nombreParametro1){
	cuerpo de la función
	} 

	public static void sumar(int a, int b){
	System.out.println("El resultado de la suma es: "+ a+b)
	}
	 */
}