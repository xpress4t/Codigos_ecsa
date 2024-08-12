package Jugador;

import java.util.ArrayList;
import java.util.HashMap;

public class Jugador {
	protected double bonificadorDañoRecibido;
	protected double bonificadorCuracion;
	protected double bonificacionDañoProducido;
	private Arma armaPrincipal;
	private Arma armaSecundaria;
	private HashMap<TipoHabilidad, ArrayList<Habilidad>> habilidadesDisponibles;
	private HashMap<TipoHabilidad, ArrayList<Habilidad>> habilidadesEquipadas;
	private String nombre;
	private int nivel;
	private double puntosEscudo;
	private double puntosDeVida;
	private int puntosDeMana;
	private boolean estaVivo;

	public Jugador(String nombre) {
		bonificadorDañoRecibido = 1.0;
		bonificadorCuracion = 1.0;
		bonificacionDañoProducido = 1.0;
		habilidadesDisponibles = new HashMap<TipoHabilidad, ArrayList<Habilidad>>();
		habilidadesEquipadas = new HashMap<TipoHabilidad, ArrayList<Habilidad>>();

		// Inicializar las listas vacías para cada tipo de habilidad
		habilidadesDisponibles.put(TipoHabilidad.ATAQUE, new ArrayList<Habilidad>());
		habilidadesDisponibles.put(TipoHabilidad.DEFENSA, new ArrayList<Habilidad>());
		habilidadesDisponibles.put(TipoHabilidad.CURACION, new ArrayList<Habilidad>());

		habilidadesEquipadas.put(TipoHabilidad.ATAQUE, new ArrayList<Habilidad>());
		habilidadesEquipadas.put(TipoHabilidad.DEFENSA, new ArrayList<Habilidad>());
		habilidadesEquipadas.put(TipoHabilidad.CURACION, new ArrayList<Habilidad>());

		this.nombre = nombre;
		this.nivel = 1;
		this.puntosDeVida = 100;
		this.puntosDeMana = 100;
		this.puntosEscudo = 0;
		this.estaVivo = true;
	}

	public void agregarArmaPrincipal(Arma arma) {
		if (!this.estaVivo) {
			System.err.println("El jugador está muerto, por lo que no puede hacer nada");
			return;
		}
		armaPrincipal = arma;
		System.out.println(
				"El jugador '" + this.nombre + "' se ha equipado en la mano principal el arma " + arma.getNombre());
	}

	public void agregarArmaSecundaria(Arma arma) {
		if (!this.estaVivo) {
			System.err.println("El jugador está muerto, por lo que no puede hacer nada");
			return;
		}
		armaSecundaria = arma;
		System.out.println(
				"El jugador '" + this.nombre + "' se ha equipado en la mano secundaria el arma " + arma.getNombre());
	}

	public void eliminarArmaPrincipal() {
		if (!this.estaVivo) {
			System.err.println("El jugador está muerto, por lo que no puede hacer nada");
			return;
		}
		armaPrincipal = null;
		System.out.println("El jugador '" + this.nombre + "' se ha desequipado el arma de la mano principal");
	}

	public void eliminArmaSecundaria(Arma arma) {
		if (!this.estaVivo) {
			System.err.println("El jugador está muerto, por lo que no puede hacer nada");
			return;
		}
		armaSecundaria = null;
		System.out.println("El jugador '" + this.nombre + "' se ha desequipado el arma de la mano secundaria");
	}

	public void aprenderHabilidad(Habilidad habilidad) {
		if (!this.estaVivo) {
			System.err.println("El jugador está muerto, por lo que no puede hacer nada");
			return;
		}
		if (!habilidadesDisponibles.get(habilidad.getTipoHabilidad()).contains(habilidad)) {
			habilidadesDisponibles.get(habilidad.getTipoHabilidad()).add(habilidad);
		}
	}

	public void equiparHabilidad(Habilidad habilidad) {
		if (!this.estaVivo) {
			System.err.println("El jugador está muerto, por lo que no puede hacer nada");
			return;
		}
		if (habilidadesDisponibles.get(habilidad.getTipoHabilidad()).contains(habilidad)) {
			habilidadesDisponibles.get(habilidad.getTipoHabilidad()).remove(habilidad);
			habilidadesEquipadas.get(habilidad.getTipoHabilidad()).add(habilidad);
			System.out.println(this.nombre + ", ya puedes usar " + habilidad.getNombre());
		} else {
			System.out.println(this.nombre + ", la habilidad " + habilidad.getNombre()
					+ " no está disponible o ya la tienes equipada");
		}
	}

	public void desequiparHabilidad(Habilidad habilidad) {
		if (!this.estaVivo) {
			System.err.println("El jugador está muerto, por lo que no puede hacer nada");
			return;
		}
		if (habilidadesEquipadas.get(habilidad.getTipoHabilidad()).contains(habilidad)) {
			habilidadesDisponibles.get(habilidad.getTipoHabilidad()).add(habilidad);
			habilidadesEquipadas.get(habilidad.getTipoHabilidad()).remove(habilidad);
			System.out.println("Ya no puedes usar " + habilidad.getNombre());
		} else {
			System.out.println("La habilidad " + habilidad.getNombre() + " no está disponible o no la tienes equipada");
		}
	}

	public void atacar(Jugador objetivo) {
		if (!this.estaVivo) {
			System.err.println("El jugador está muerto, por lo que no puede hacer nada");
			return;
		}
		double dañoInfligido = 0;
		dañoInfligido += this.armaPrincipal != null ? this.armaPrincipal.getDaño() * this.bonificacionDañoProducido : 0;
		dañoInfligido += this.armaSecundaria != null ? this.armaSecundaria.getDaño() * this.bonificacionDañoProducido
				: 0;
		dañoInfligido = Math.ceil(dañoInfligido);
		System.out.println(
				this.nombre + "¡Realiza ataque! " + objetivo.getNombre() + " inflinge " + dañoInfligido + " de daño.");
		objetivo.recibirDañoFisico(dañoInfligido);
	}

	public void usarHabilidad(Habilidad habilidad, Jugador objetivo) {
		if (!this.estaVivo) {
			System.err.println("El jugador está muerto, por lo que no puede hacer nada");
			return;
		}
		if (habilidadesEquipadas.get(habilidad.getTipoHabilidad()).contains(habilidad)) {
			if (habilidad.getCosteMana() > this.puntosDeMana) {
				System.err.println("No tienes mana suficiente para usar " + habilidad.getNombre());
				return;
			}
			this.puntosDeMana -= habilidad.getCosteMana();
			switch (habilidad.getTipoHabilidad()) {
			case ATAQUE:
				objetivo.recibirDañoFisico(habilidad.getPuntos() * bonificadorDañoRecibido);
				System.out.println(
						this.nombre + " usa la habilidad " + habilidad.getNombre() + " en " + objetivo.getNombre()
								+ " y inflige " + (habilidad.getPuntos() * bonificadorDañoRecibido) + " de daño.");
				break;
			case DEFENSA:
				objetivo.recibirEscudo(habilidad.getPuntos());
				System.out.println(this.nombre + " usa la habilidad " + habilidad.getNombre() + " en sí mismo y recibe "
						+ habilidad.getPuntos() + " de escudo.");
				break;
			case CURACION:
				objetivo.recibirCuracion(habilidad.getPuntos() * bonificadorCuracion);
				System.out.println(
						this.nombre + " usa la habilidad " + habilidad.getNombre() + " en " + objetivo.getNombre()
								+ " y cura " + (habilidad.getPuntos() * bonificadorCuracion) + " de vida.");
				break;
			}
		} else {
			System.err
					.println("El jugador " + this.nombre + " no tiene equipada la habilidad " + habilidad.getNombre());
		}
	}

	public void recibirEscudo(int puntos) {
		if (!this.estaVivo) {
			System.err.println("El jugador está muerto, por lo que no puede hacer nada");
			return;
		}
		this.puntosEscudo += puntos;
	}

	// Método para recibir daño
	public void recibirDañoFisico(double daño) {
		if (!this.estaVivo) {
			System.err.println("El jugador está muerto, por lo que no puede hacer nada");
			return;
		}
		double dañoRecibido = Math.ceil(daño * bonificadorDañoRecibido) - this.puntosEscudo;
		puntosDeVida -= dañoRecibido;
		if (puntosDeVida <= 0) {
			puntosDeVida = 0; // No puede tener puntos de vida negativos
			System.out.println(this.nombre + " ha sido derrotado.");
			this.estaVivo = false;
		} else {
			System.out.println(this.nombre + " recibe " + dañoRecibido + " de daño y tiene " + puntosDeVida
					+ " puntos de vida restantes.");
		}
	}

	// Método para recibir curación
	public void recibirCuracion(double curacion) {
		if (!this.estaVivo) {
			System.err.println("El jugador está muerto, por lo que no puede hacer nada");
			return;
		}
		puntosDeVida += curacion;
		if (puntosDeVida > 100) {
			puntosDeVida = 100; // No puede tener más de 100 puntos de vida
		}
		System.out.println(this.nombre + " recibe " + curacion + " de curación y tiene " + puntosDeVida
				+ " puntos de vida restantes.");
	}

	public void info() {
		System.out.println("El jugador '" + this.nombre + "' tiene " + this.puntosDeVida + " de vida");
		System.out.println("El jugador '" + this.nombre + "' tiene " + this.puntosDeMana + " de mana");
		System.out.println("El jugador '" + this.nombre + "' tiene " + this.puntosEscudo + " de escudo");
		System.out.println("El jugador '" + this.nombre + "'" + (this.estaVivo ? "sigue vivo" : "ha muerto"));
	}

	public double getBonificadorDañoRecibido() {
		return bonificadorDañoRecibido;
	}

	public void setBonificadorDañoRecibido(double bonificadorDañoRecibido) {
		this.bonificadorDañoRecibido = bonificadorDañoRecibido;
	}

	public double getBonificadorCuracion() {
		return bonificadorCuracion;
	}

	public void setBonificadorCuracion(double bonificadorCuracion) {
		this.bonificadorCuracion = bonificadorCuracion;
	}

	public double getBonificacionDañoProducido() {
		return bonificacionDañoProducido;
	}

	public void setBonificacionDañoProducido(double bonificacionDañoProducido) {
		this.bonificacionDañoProducido = bonificacionDañoProducido;
	}

	public Arma getArmaPrincipal() {
		return armaPrincipal;
	}

	public void setArmaPrincipal(Arma armaPrincipal) {
		this.armaPrincipal = armaPrincipal;
	}

	public Arma getArmaSecundaria() {
		return armaSecundaria;
	}

	public void setArmaSecundaria(Arma armaSecundaria) {
		this.armaSecundaria = armaSecundaria;
	}

	public HashMap<TipoHabilidad, ArrayList<Habilidad>> getHabilidadesDisponibles() {
		return habilidadesDisponibles;
	}

	public void setHabilidadesDisponibles(HashMap<TipoHabilidad, ArrayList<Habilidad>> habilidadesDisponibles) {
		this.habilidadesDisponibles = habilidadesDisponibles;
	}

	public HashMap<TipoHabilidad, ArrayList<Habilidad>> getHabilidadesEquipadas() {
		return habilidadesEquipadas;
	}

	public void setHabilidadesEquipadas(HashMap<TipoHabilidad, ArrayList<Habilidad>> habilidadesEquipadas) {
		this.habilidadesEquipadas = habilidadesEquipadas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public double getPuntosEscudo() {
		return puntosEscudo;
	}

	public void setPuntosEscudo(double puntosEscudo) {
		this.puntosEscudo = puntosEscudo;
	}

	public double getPuntosDeVida() {
		return puntosDeVida;
	}

	public void setPuntosDeVida(double puntosDeVida) {
		this.puntosDeVida = puntosDeVida;
	}

	public int getPuntosDeMana() {
		return puntosDeMana;
	}

	public void setPuntosDeMana(int puntosDeMana) {
		this.puntosDeMana = puntosDeMana;
	}

	public boolean isEstaVivo() {
		return estaVivo;
	}

	public void setEstaVivo(boolean estaVivo) {
		this.estaVivo = estaVivo;
	}

}
