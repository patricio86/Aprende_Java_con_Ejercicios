
public class Caja {

	private String id, nombre;
	private double saldo;
	
	public Caja(String id, double saldo) {
		this.id = id;
		this.saldo = saldo;
	}
	
	public Caja(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
