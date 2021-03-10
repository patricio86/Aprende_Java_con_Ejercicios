import java.util.*;

public class Principal {
	
	 

	public static void main(String[]args) {
		
		Caja dinero[] = {new  Caja("Caja1","Cajero1",0.0), new  Caja("Caja2","Cajero2",55), new  Caja("Caja3","Cajero3",20) };		
		Caja persona1 = new Caja("Cliente");
		Caja persona2 = new Caja("Ruben");
	
		System.out.println("Situacion actual: " + dinero[0].getId() + " tiene " + dinero[0].getSaldo() + " €, " + dinero[1].getId() + " tiene " + dinero[1].getSaldo() + " €, " + dinero[2].getId() + " tiene " + dinero[2].getSaldo() + " €, ");
		persona1.ingresar(dinero);
		System.out.println("Situacion actual: " + dinero[0].getId() + " tiene " + dinero[0].getSaldo() + " €, " + dinero[1].getId() + " tiene " + dinero[1].getSaldo() + " €, " + dinero[2].getId() + " tiene " + dinero[2].getSaldo() + " €, ");
		persona1.ingresar(dinero);
		System.out.println("Situacion actual: " + dinero[0].getId() + " tiene " + dinero[0].getSaldo() + " €, " + dinero[1].getId() + " tiene " + dinero[1].getSaldo() + " €, " + dinero[2].getId() + " tiene " + dinero[2].getSaldo() + " €, ");
		persona1.ingresar(dinero);
		System.out.println("Situacion actual: " + dinero[0].getId() + " tiene " + dinero[0].getSaldo() + " €, " + dinero[1].getId() + " tiene " + dinero[1].getSaldo() + " €, " + dinero[2].getId() + " tiene " + dinero[2].getSaldo() + " €, ");
		persona2.retirar(dinero);
		System.out.println("Situacion actual: " + dinero[0].getId() + " tiene " + dinero[0].getSaldo() + " €, " + dinero[1].getId() + " tiene " + dinero[1].getSaldo() + " €, " + dinero[2].getId() + " tiene " + dinero[2].getSaldo() + " €, ");
		persona1.ingresar(dinero);
		System.out.println("Situacion actual: " + dinero[0].getId() + " tiene " + dinero[0].getSaldo() + " €, " + dinero[1].getId() + " tiene " + dinero[1].getSaldo() + " €, " + dinero[2].getId() + " tiene " + dinero[2].getSaldo() + " €, ");
		Caja.transpasar(dinero);
		
	
	}
	
	
}
