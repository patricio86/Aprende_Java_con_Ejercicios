import java.util.Scanner;

public class Caja {

	private String id, nombre;
	private double saldo;
	
	public Caja(String id, String nombre, double saldo) {
		this.id = id;
		this.saldo = saldo;
		this.nombre = nombre;
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
	
	public void ingresar(Caja dinero[]) {
		Scanner sc = new  Scanner(System.in);
		double saldoingresar;
		int numcaja;
		do {
		System.out.println("Elige una caja por la que quieras pasar:_ \n 0 (Caja 1) \n 1 (Caja 2) \n 2 (Caja 3) ");
		numcaja = sc.nextInt();
		}while(numcaja < 0 || numcaja > 2);
		System.out.println("Cantidad a pagar:_");
		saldoingresar = sc.nextDouble();
		int ingresado = (int) (dinero[numcaja].getSaldo() + saldoingresar);
		dinero[numcaja].setSaldo(ingresado);
		System.out.println("El cliente pasa por la " + dinero[numcaja].getId() + " e ingresa " + saldoingresar);
	}
	
	public void retirar(Caja dinero[]) {
		Scanner sc = new  Scanner(System.in);
		double saldoretirar;
		int numcaja;
		System.out.println("Cantidad a retirar por Ruben:_");
		saldoretirar = sc.nextDouble();
		do {
		System.out.println("Elige una caja por la que quieras pasar:_ \n 0 (Caja 1) \n 1 (Caja 2) \n 2 (Caja 3) ");
		numcaja = sc.nextInt();
		}while(numcaja < 0 || numcaja > 2);
		int retirado = (int) (dinero[numcaja].getSaldo() - saldoretirar);
		dinero[numcaja].setSaldo(retirado);
		System.out.println("Baja Ruben y retira " + saldoretirar + " de la " + dinero[numcaja].getId());
	}
	
	public static void transpasar(Caja dinero[]) {
		Scanner sc = new  Scanner(System.in);
		double saldotranspasar;
		int numcaja1, numcaja2;
		do {
		System.out.println("Elige una caja que quieres retirar dinero:_ \n 0 (Caja 1) \n 1 (Caja 2) \n 2 (Caja 3) ");
		numcaja1 = sc.nextInt();
		}while(numcaja1 < 0 || numcaja1 > 2);
		do {
		System.out.println("Elige una caja para ingresar ese dinero:_ \n 0 (Caja 1) \n 1 (Caja 2) \n 2 (Caja 3) ");
		numcaja2 = sc.nextInt();
		}while(numcaja2 < 0 || numcaja2 > 2);
		System.out.println("Cantidad a transpasar por el " + dinero[numcaja1].getNombre() + ":_");
		saldotranspasar = sc.nextDouble();
		int retirado = (int) (dinero[numcaja1].getSaldo() - saldotranspasar);
		dinero[numcaja1].setSaldo(retirado);
		int ingresado = (int) (dinero[numcaja2].getSaldo() + saldotranspasar);
		dinero[numcaja2].setSaldo(ingresado);
		System.out.println("El " + dinero[numcaja2].getNombre() + " de la " + dinero[numcaja2].getId() + " le pide " + saldotranspasar + " al " + dinero[numcaja1].getNombre() + " de la " + dinero[numcaja1].getId());
	}
}
