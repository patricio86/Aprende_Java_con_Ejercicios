import java.util.*;

public class Principal {
	
	 

	public static void main(String[]args) {
		
		Caja dinero[] = {new  Caja("Caja1","Cajero1",0.0), new  Caja("Caja2","Cajero2",55), new  Caja("Caja3","Cajero3",20) };		
		Caja persona1 = new Caja("Cliente",0.0,0.0);
		Caja persona2 = new Caja("Ruben",0.0,0.0);
	
		System.out.println("Situacion actual: " + dinero[0].getId() + " tiene " + dinero[0].getSaldo() + " €, " + dinero[1].getId() + " tiene " + dinero[1].getSaldo() + " €, " + dinero[2].getId() + " tiene " + dinero[2].getSaldo() + " €, ");
		System.out.println(persona1.ingresar(dinero));
		System.out.println(" El " + persona1.getNombre() + " pasar por " + dinero[0].getId() + " e ingresa 50€");	
		
		System.out.println(persona2.ingresar(dinero));
		System.out.println(persona2.getNombre() + " pasa por " + dinero[0].getId() + " y retira 50€");
		
		
	}
	
	
}
