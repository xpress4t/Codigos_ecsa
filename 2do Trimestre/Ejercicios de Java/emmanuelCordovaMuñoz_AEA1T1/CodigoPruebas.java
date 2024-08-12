package emmanuelCordovaMuñoz_AEA1T1;
/*
		 * System.out.println(DiasSemana.DOMINGO);
		DiasSemana ds = DiasSemana.LUNES;
		switch (ds) {
		case LUNES:
			break;
		case MARTES:
			break;
		case MIERCOLES:
			break;
		case JUEVES:
			break;
		case VIERNES:
			break;	
		case SABADO:
			break;	
		case DOMINGO:
			break;
		default:
			break;
		}
		 */
public class CodigoPruebas {
	public static void main(String[] args) {
		// System.out.println(DiasSemana.DOMINGO);
		DiasSemana ds = DiasSemana.LUNES;
		System.out.println(ds.getValor());
		
		for(DiasSemana d: DiasSemana.values()) {
			System.out.println(d);
		}
		System.out.println(DiasSemana.valueOf("LUNES").getValor());
	}
}
