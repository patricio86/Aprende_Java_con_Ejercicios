
public class Coche {

	private String modelo;
	private int antiguedad;
	private String color;
	private String tipocambio;
	private int cantidadKM;
	private int cilindrada;
	private int caballaje;
	private double precio;
	
	public Coche(String modelo, int antiguedad, String color, String tipocambio, int cantidadKM, int cilindrada,
			int caballaje, double precio) {
		this.modelo = modelo;
		this.antiguedad = antiguedad;
		this.color = color;
		this.tipocambio = tipocambio;
		this.cantidadKM = cantidadKM;
		this.cilindrada = cilindrada;
		this.caballaje = caballaje;
		this.precio = precio;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTipocambio() {
		return tipocambio;
	}

	public void setTipocambio(String tipocambio) {
		this.tipocambio = tipocambio;
	}

	public int getCantidadKM() {
		return cantidadKM;
	}

	public void setCantidadKM(int cantidadKM) {
		this.cantidadKM = cantidadKM;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public int getCaballaje() {
		return caballaje;
	}

	public void setCaballaje(int caballaje) {
		this.caballaje = caballaje;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return " [" + modelo + " 	" + antiguedad + "año 	" + color + " 	"
				+ tipocambio + " 	" + cantidadKM + "Km 	" + cilindrada + "cc	" + caballaje
				+ " 	" + precio + "€]";
	}
	
	
	
	
}
