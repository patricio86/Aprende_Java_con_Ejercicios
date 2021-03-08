import java.util.*;

public class Principal {
	
	static Scanner sc = new  Scanner(System.in);

	public static void main(String[]args) {
		
		Caja dinero[] = {new  Caja("Caja1",0), new  Caja("Caja2",55), new  Caja("Caja3",20) };		
		Caja Cliente = new Caja("Cliente");
		Caja Ruben = new Caja("Ruben");
		Caja Cajero = new Caja("Cajero");
		
		
		System.out.println("Situacion actual: " + dinero[0].getId() + " tiene " + dinero[0].getSaldo() + " €, " + dinero[1].getId() + " tiene " + dinero[1].getSaldo() + " €, " + dinero[2].getId() + " tiene " + dinero[2].getSaldo() + " €, ");
	}
}
