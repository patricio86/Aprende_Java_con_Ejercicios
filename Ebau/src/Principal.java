import java.util.*;

public class Principal {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[]args) {
		
	
		System.out.println("#######Bienvenido al programa#######, \n #######para calcular la media de las notas#######");
		System.out.println("####################################################");
		System.out.println("####################################################");

		
			NotaAsignatura alumno[] = new NotaAsignatura[2];
			registraraleatorioletras(alumno);
			//registraraleatoriociencias(alumno);
			NotaAsignatura.comprobarMejorNotaletras(alumno);
			//NotaAsignatura.comprobarMejorNotaciencias(alumno);
	}
											
	

	public static void registraraleatorioletras(NotaAsignatura alumno[]) {
		String nombre;
		int nLeng, nMate, nHisto, nIngles, nLatin, nFilosofia;
		for(int i=0;i<alumno.length;i++) {
			System.out.println("Introduce un nombre");
			nombre = sc.next();
			System.out.println("Nota programacion");
			nLeng = (int)(11*(Math.random())+0);
			System.out.println("Nota de Bases de Datos");
			nMate = (int)(11*(Math.random())+0);
			System.out.println("Nota de Sistemas");
			nHisto = (int)(11*(Math.random())+0);
			System.out.println("Nota de Entornos");
			nIngles = (int)(11*(Math.random())+0);
			System.out.println("Nota de Fol");
			nLatin = (int)(11*(Math.random())+0);
			System.out.println("Nota de Ingles");
			nFilosofia = (int)(11*(Math.random())+0);
			
		alumno[i] = new NotaAsignatura(nombre, nLeng, nMate, nHisto, nIngles, nLatin, nFilosofia);
		System.out.println("Proceso de obtencion de notas terminado para: " + alumno[i].getNombre());
		}
	}
	
	public static void registraraleatoriociencias(NotaAsignatura alumno[]) {
		 String nombre;
		 int nLeng, nMate, nHisto, nIngles, nFisica;
		for(int i=0;i<alumno.length;i++) {
			System.out.println("Introduce un nombre");
			nombre = sc.next();
			System.out.println("Nota programacion");
			nLeng = (int)(11*(Math.random())+0);
			System.out.println("Nota de Bases de Datos");
			nMate = (int)(11*(Math.random())+0);
			System.out.println("Nota de Sistemas");
			nHisto = (int)(11*(Math.random())+0);
			System.out.println("Nota de Entornos");
			nIngles = (int)(11*(Math.random())+0);
			System.out.println("Nota de Fol");
			nFisica = (int)(11*(Math.random())+0);
			
		alumno[i] = new NotaAsignatura(nombre, nLeng, nMate, nHisto, nIngles, nFisica);
		System.out.println("Proceso de obtencion de notas terminado para: " + alumno[i].getNombre());
		}
	}
	
	
	
}
