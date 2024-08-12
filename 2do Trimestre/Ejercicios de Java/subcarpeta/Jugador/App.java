package Jugador;

public class App {

	public static void main(String[] args) {

		Habilidad ataqueBasico = new Habilidad("Ataque Básico", "Un ataque básico", 10, 10, TipoHabilidad.ATAQUE);
		Habilidad defensaBasico = new Habilidad("Defensa Básico", "Una defensa básica", 5, 5, TipoHabilidad.DEFENSA);
		Habilidad curacionBasico = new Habilidad("Curación Básico", "Una curación básica", 15, 15,
				TipoHabilidad.CURACION);

		Habilidad ataqueMedia = new Habilidad("Ataque Media", "Un ataque potente", 20, 20, TipoHabilidad.ATAQUE);
		Habilidad defensaMedia = new Habilidad("Defensa Media", "Una defensa avanzada", 10, 10, TipoHabilidad.DEFENSA);
		Habilidad curacionMedia = new Habilidad("Curación Media", "Una curación moderada", 30, 30,
				TipoHabilidad.CURACION);

		Habilidad ataquePoderoso = new Habilidad("Ataque Poderoso", "Un ataque muy poderoso", 30, 30,
				TipoHabilidad.ATAQUE);
		Habilidad defensaPoderoso = new Habilidad("Defensa Poderoso", "Una defensa superior", 15, 15,
				TipoHabilidad.DEFENSA);
		Habilidad curacionPoderoso = new Habilidad("Curación Poderoso", "Una curación intensa", 45, 45,
				TipoHabilidad.CURACION);

		Habilidad ataqueExperto = new Habilidad("Ataque Experta", "Un ataque mágico", 25, 25, TipoHabilidad.ATAQUE);
		Habilidad defensaExperto = new Habilidad("Defensa Experta", "Una defensa mágica", 12, 12,
				TipoHabilidad.DEFENSA);
		Habilidad curacionExperto = new Habilidad("Curación Experta", "Una curación mágica", 40, 40,
				TipoHabilidad.CURACION);

		Habilidad ataqueEpico = new Habilidad("Ataque Épico", "Un ataque de relámpago", 50, 80, TipoHabilidad.ATAQUE);
		Habilidad defensaEpica = new Habilidad("Defensa Épica", "Una defensa épica", 18, 18, TipoHabilidad.DEFENSA);
		Habilidad curacionEpica = new Habilidad("Curación Épica", "Una curación épica", 50, 50, TipoHabilidad.CURACION);

		Arma espada = new ArmaMelee("Espada", 15);
		Arma lanza = new ArmaMelee("Lanza", 10);
		Arma hacha = new ArmaMelee("Hacha", 18);
		Arma cuchillo = new ArmaMelee("Cuchillo", 8);
		Arma martillo = new ArmaMelee("Martillo", 20);
		Arma maza = new ArmaMelee("Maza", 22);

		Arma arco = new ArmaDistancia("Arco", 12);
		Arma varitaMagica = new ArmaDistancia("Varita Mágica", 14);
		Arma ballesta = new ArmaDistancia("Ballesta", 16);

		Jugador dps = new Dps("Te miro y te ataco");
		Jugador tanque = new Tanque("Erl tanque");
		Jugador heler = new Heler("Doctor muerte");

		dps.agregarArmaPrincipal(espada);
		dps.agregarArmaSecundaria(arco);

		tanque.agregarArmaPrincipal(maza);
		tanque.agregarArmaSecundaria(ballesta);

		heler.agregarArmaPrincipal(cuchillo);
		heler.agregarArmaSecundaria(varitaMagica);

		//Primero lo aprendo y luego lo equipo
		dps.aprenderHabilidad(ataqueBasico);
		dps.aprenderHabilidad(ataqueMedia);
		dps.aprenderHabilidad(defensaBasico);
		dps.aprenderHabilidad(ataqueBasico);		
		dps.aprenderHabilidad(ataqueEpico);
		//Las equipo para poder usarlas
		dps.equiparHabilidad(ataqueBasico);
		dps.equiparHabilidad(ataqueMedia);
		dps.equiparHabilidad(defensaBasico);
		dps.equiparHabilidad(curacionBasico);//Esta hbailidad no está aprendida por lo que no se puede aprender
		dps.equiparHabilidad(ataqueEpico);

		
		//Primero lo aprendo y luego lo equipo
		tanque.aprenderHabilidad(defensaBasico);
		tanque.aprenderHabilidad(defensaMedia);
		tanque.aprenderHabilidad(ataqueBasico);
		tanque.aprenderHabilidad(curacionBasico);
		//Las equipo para poder usarlas
		tanque.equiparHabilidad(defensaBasico);
		tanque.equiparHabilidad(defensaMedia);
		tanque.equiparHabilidad(ataqueBasico);
		tanque.equiparHabilidad(curacionBasico);
		
		//Primero lo aprendo y luego lo equipo
		heler.aprenderHabilidad(curacionMedia);
		heler.aprenderHabilidad(curacionEpica);
		heler.aprenderHabilidad(ataqueBasico);
		heler.aprenderHabilidad(defensaBasico);
		//Las equipo para poder usarlas
		heler.equiparHabilidad(curacionMedia);
		heler.equiparHabilidad(curacionEpica);
		heler.equiparHabilidad(ataqueBasico);
		heler.equiparHabilidad(defensaBasico);

		
		System.out.println("\n\n");
		// Turno 1: Jugador DPS ataca a Jugador Tanque
		dps.atacar(tanque); // DPS ataca al Tanque con su ataque básico
		dps.usarHabilidad(ataqueBasico, tanque); // DPS utiliza una habilidad de ataque media
		dps.usarHabilidad(ataqueMedia, tanque); // DPS utiliza una habilidad de ataque media
		dps.usarHabilidad(curacionMedia, dps); // DPS utiliza una habilidad de curación media
		dps.usarHabilidad(ataqueEpico, heler); // DPS utiliza una habilidad de ataque epico
		dps.usarHabilidad(ataqueEpico, tanque); // DPS utiliza una habilidad de ataque epico
		dps.atacar(heler); // DPS ataca al heler con su ataque básico
		dps.info();
		System.out.println("\n\n");
		
		tanque.info();
		// Turno 2: Jugador Tanque ataca a Jugador Heler
		tanque.usarHabilidad(defensaMedia, tanque); // Tanque utiliza una habilidad de defensa media
		tanque.atacar(heler); // Tanque ataca al Heler con su ataque básico
		tanque.usarHabilidad(ataqueBasico, heler); // Tanque utiliza una habilidad de ataque básico
		tanque.info();
		System.out.println("\n\n");
		
		heler.info();
		// Turno 3: Jugador Heler ataca a Jugador DPS
		heler.usarHabilidad(curacionMedia, tanque); // Heler utiliza una habilidad de curación media
		heler.usarHabilidad(curacionMedia, heler); // Heler utiliza una habilidad de curación media
		heler.atacar(dps); // Heler ataca al DPS con su ataque básico
		heler.usarHabilidad(ataqueEpico, dps); // Heler utiliza una habilidad de ataque básico
		heler.info();
		System.out.println("\n\n");
		
		//ResultadoFinal
		System.out.println("Resultado final");
		dps.info();
		System.out.println("\n");
		tanque.info();
		System.out.println("\n");
		heler.info();


	}

}
