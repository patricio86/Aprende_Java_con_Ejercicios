import java.util.Scanner;

public class Tiempo {

	private String ciudad;
	private int dia;
	private int mes; 
	private int a�o; 
	private String tiempo; 
	private int probabilidadLluvia; 
	private int temperaturaMinima; 
	private int temperaturaMaxima; 
	private int velocidadViento;
	
	public Tiempo(String ciudad, int dia, int mes, int a�o, String tiempo, int probabilidadLluvia,
			int temperaturaMinima, int temperaturaMaxima, int velocidadViento) {
		this.ciudad = ciudad;
		this.dia = dia;
		this.mes = mes;
		this.a�o = a�o;
		this.tiempo = tiempo;
		this.probabilidadLluvia = probabilidadLluvia;
		this.temperaturaMinima = temperaturaMinima;
		this.temperaturaMaxima = temperaturaMaxima;
		this.velocidadViento = velocidadViento;
	}


	public String getCiudad() {
		return ciudad;
	}


	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}


	public int getDia() {
		return dia;
	}


	public void setDia(int dia) {
		this.dia = dia;
	}


	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}


	public int getA�o() {
		return a�o;
	}


	public void setA�o(int a�o) {
		this.a�o = a�o;
	}


	public String getTiempo() {
		return tiempo;
	}


	public void setTiempo(String tiempo) {
		this.tiempo = tiempo;
	}


	public int getProbabilidadLluvia() {
		return probabilidadLluvia;
	}


	public void setProbabilidadLluvia(int probabilidadLluvia) {
		this.probabilidadLluvia = probabilidadLluvia;
	}


	public int getTemperaturaMinima() {
		return temperaturaMinima;
	}


	public void setTemperaturaMinima(int temperaturaMinima) {
		this.temperaturaMinima = temperaturaMinima;
	}


	public int getTemperaturaMaxima() {
		return temperaturaMaxima;
	}


	public void setTemperaturaMaxima(int temperaturaMaxima) {
		this.temperaturaMaxima = temperaturaMaxima;
	}
	

	public int getVelocidadViento() {
		return velocidadViento;
	}


	public void setVelocidadViento(int velocidadViento) {
		this.velocidadViento = velocidadViento;
	}


	@Override
	public String toString() {
		return " [" + ciudad + " " + dia + "-" + mes + "-" + a�o + "] 	" + tiempo
				+ " 	" + probabilidadLluvia + " 	" + temperaturaMinima
				+ " 	" + temperaturaMaxima + " 	" + velocidadViento + "";
	}

	
	
	
}












