//Objetos:
//le puedes poner let or const
let persona = {
    nombre: "Emmanuel",
    edad: 20
  };
  //para ver el objeto
  console.log(persona);
  //para cambiar un atributo del objeto(cada uno tiene
  //sus usos)
  persona.nombre = "que";
  persona["nombre"] = "importa";
  //para ver un atributo de un objeto
  console.log(persona.nombre);
   
  //Arrays:
  //un array es un objeto
  let colores = ['rojo', 'verde', 'azul'];
  colores[3] = 1;
  console.log(colores[0]);
  console.log(colores);
  console.log(colores.length);
   
  //Funciones:
  function saludar(){
      console.log('Hola XD');
  }
  saludar();

  //si no pasas un argumento se reemplaza la variable por un undefined
  function saludar_a(nombre){
      console.log('hola '+nombre);
  }
  saludar_a('Pepito');
  saludar_a(2);
  function saludar_varios(nombre1, nombre2){
      console.log('hola '+nombre1+' y '+nombre2);
  }
  saludar_varios('el CD', 'el mas CD');
  //return
  function potencia_cuadrada(numero){
      numero *= numero;
      return numero;
  }
  let resultado = potencia_cuadrada(3);
  console.log('al cuadrado es: '+resultado);