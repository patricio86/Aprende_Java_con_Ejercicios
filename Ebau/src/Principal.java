import java.util.*;

public class Principal {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[]args) {
		
		int opcionmenu;
		boolean continua =true;
		String fin;
		System.out.println("#######Bienvenido al programa#######, \n #######para calcular la media de las notas#######");
		System.out.println("####################################################");
		System.out.println("####################################################");
		NotaAsignatura alumno[] = new NotaAsignatura[2];
		do {
		System.out.println("Elije una de los dos opciones para \n 1 - Registrar y saber las medias de los alumnos de letras. \n 2 - Registrar y saber las medias de los alumnos de letras.");
		opcionmenu = sc.nextInt();
		switch(opcionmenu) {
			case 1:
				registraraleatorioletras(alumno);
				NotaAsignatura.comprobarMejorNotaletras(alumno);
				System.out.println("Desea continuar con la filtracion ¿SI o NO?:_");
				fin = sc.next();
				if(fin.equalsIgnoreCase("si")) {
					continua = true;
				}else {
					continua = false;
					System.out.println("Adios");
				}
				break;
			case 2:
				registraraleatoriociencias(alumno);
				NotaAsignatura.comprobarMejorNotaciencias(alumno);
				System.out.println("Desea continuar con la filtracion ¿SI o NO?:_");
				fin = sc.next();
				if(fin.equalsIgnoreCase("si")) {
					continua = true;
				}else {
					continua = false;
					System.out.println("Adios");
				}
				break;
		}
		}while(continua == true);
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
