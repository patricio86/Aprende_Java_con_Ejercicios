
public class NotaAsignatura {

	private String nombre;
	private int nLeng, nMate, nHisto, nIngles, nLatin, nFilosofia, nFisica;
	
	public NotaAsignatura(String nombre, int nLeng, int nMate, int nHisto, int nIngles, int nLatin, int nFilosofia) {
		this.nombre = nombre;
		this.nLeng = nLeng;
		this.nMate = nMate;
		this.nHisto = nHisto;
		this.nIngles = nIngles;
		this.nLatin = nLatin;
		this.nFilosofia = nFilosofia;
		
	}
	
	public NotaAsignatura(String nombre, int nLeng, int nMate, int nHisto, int nIngles, int nFisica) {
		this.nombre = nombre;
		this.nLeng = nLeng;
		this.nMate = nMate;
		this.nHisto = nHisto;
		this.nIngles = nIngles;
		this.nFisica = nFisica;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getnLeng() {
		return nLeng;
	}

	public void setnLeng(int nLeng) {
		this.nLeng = nLeng;
	}

	public int getnMate() {
		return nMate;
	}

	public void setnMate(int nMate) {
		this.nMate = nMate;
	}

	public int getnHisto() {
		return nHisto;
	}

	public void setnHisto(int nHisto) {
		this.nHisto = nHisto;
	}

	public int getnIngles() {
		return nIngles;
	}

	public void setnIngles(int nIngles) {
		this.nIngles = nIngles;
	}

	public int getnLatin() {
		return nLatin;
	}

	public void setnLatin(int nLatin) {
		this.nLatin = nLatin;
	}

	public int getnFilosofia() {
		return nFilosofia;
	}

	public void setnFilosofia(int nFilosofia) {
		this.nFilosofia = nFilosofia;
	}

	public int getnFisica() {
		return nFisica;
	}

	public void setnFisica(int nFisica) {
		this.nFisica = nFisica;
	}
	
	
	public static void comprobarMejorNotaciencias(NotaAsignatura alumno[]) {
		int notamax = 0;
		String nombre = "";
		for(int i=0;i<alumno.length;i++) {
			if(notamax<alumno[i].getnLeng()) {
				notamax=alumno[i].getnLeng();
				nombre = "Lengua";
			} if (alumno[i].getnLeng()<alumno[i].getnMate()){
				notamax=alumno[i].getnMate();
				nombre = "Matematicas";
			} if (alumno[i].getnMate()<alumno[i].getnHisto()){
				notamax=alumno[i].getnHisto();
				nombre = "Historia";
			} if (alumno[i].getnHisto()<alumno[i].getnIngles()) {
				notamax=alumno[i].getnIngles();
				nombre = "Ingles";
			} if (alumno[i].getnIngles()<alumno[i].getnFisica()) {
				notamax=alumno[i].getnFisica();
				nombre = "Fisica";
			}
		
			System.out.println("La nota de " + alumno[i].getNombre() + " de la asignatura con mayor nota: " + notamax + " de la asignatura " + nombre);
		}
		
	}

	public static void comprobarMejorNotaletras(NotaAsignatura alumno[]) {
		int notamax = 0;
		String nombre = "";
		for(int i=0;i<alumno.length;i++) {
			if(notamax<alumno[i].getnLeng()) {
				notamax=alumno[i].getnLeng();
				nombre = "Lengua";
			} if (alumno[i].getnLeng()<alumno[i].getnMate()){
				notamax=alumno[i].getnMate();
				nombre = "Matematicas";
			} if (alumno[i].getnMate()<alumno[i].getnHisto()){
				notamax=alumno[i].getnHisto();
				nombre = "Historia";
			} if (alumno[i].getnHisto()<alumno[i].getnIngles()) {
				notamax=alumno[i].getnIngles();
				nombre = "Ingles";
			} if (alumno[i].getnIngles()<alumno[i].getnLatin()) {
				notamax=alumno[i].getnLatin();
				nombre = "Latin";
			} if (alumno[i].getnLatin()<alumno[i].getnFilosofia()) {
				notamax=alumno[i].getnFilosofia();
				nombre = "Filosofia";
			}
			
		System.out.println("La nota de " + alumno[i].getNombre() + " de la asignatura con mayor nota: " + notamax + " de la asignatura " + nombre);
		}
		
	
	}
}
