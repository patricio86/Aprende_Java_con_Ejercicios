import java.util.Scanner;

public class Caja {

	private String id, nombre;
	private double saldo;
	
	public Caja(String id, String nombre, double saldo) {
		this.id = id;
		this.saldo = saldo;
	}
	
	public Caja(String nombre, double ingresar, double retirar) {
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
	
	public double ingresar(Caja dinero[]) {
		double saldoingresar;
		System.out.println("Cantidad a pagar:_");
		Scanner sc = new  Scanner(System.in);
		saldoingresar = sc.nextDouble();
		System.out.println("Elige una caja por la que quieras pasar:_ \n 1 \n 2 \n 3 ");
		int numcaja = sc.nextInt();
		double suma = saldoingresar + dinero[numcaja].getSaldo();
		double totalcaja = dinero[numcaja].getSaldo() + suma;
		return totalcaja;
	}
	
	public double retirar(Caja dinero[]) {
		double saldoretirar;
		System.out.println("Cantidad a pagar:_");
		Scanner sc = new  Scanner(System.in);
		saldoretirar = sc.nextDouble();
		System.out.println("Elige una caja por la que quieras pasar:_ \n 1 \n 2 \n 3 ");
		int numcaja = sc.nextInt();
		double quita = dinero[numcaja].getSaldo() - saldoretirar;
		double totalcaja = dinero[numcaja].getSaldo() - quita;
		return totalcaja;
	}
	
	
}
