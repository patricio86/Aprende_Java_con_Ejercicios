import java.util.*;
public class Examen {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[]args) {
		int opcion, opcionmenu, opcionsalir;
		String [][] videojuegos = new String [11][9];
		
		System.out.println("######Bienvenido a la Tienda de VIDEOJUEGOS:######");
		System.out.println("##################################################");
		System.out.println("Elija una opcion para ver la estadisticas, para comprar un juego:");
		System.out.println("\n(1) Rellene la tabla primeramente y luego elije una opcion:");
		do {
		opcion = sc.nextInt();
		}while(opcion < 1 || opcion > 5);
		
		switch(opcion) {
		case 1:
				rellenartabla(videojuegos);
				break;
		}
		do {
		do {
			System.out.println("\n(2) Imprime la tabla \n(3) Que videojuego comprar por mi edad \n(4) Ver precio \n(5) Ver Precio medio y Critica media");
			opcionmenu = sc.nextInt();
		}while(opcionmenu < 2 || opcionmenu > 5);
		switch(opcionmenu) {
				case 2:
				imprimirtabla(videojuegos);
				break;
				case 3:
				compraredad(videojuegos);
				break;
				case 4:
				videoprecio(videojuegos);
				break;
				case 5:
				preciomedio(videojuegos);
				break;
		}
		
		System.out.println("Quieres seguir fltrando: \n(1) SI \n(2)");
		opcionsalir = sc.nextInt();
		}while(opcionsalir == 1);
	
	}
	
		public static void rellenartabla (String [][] tabla) {
			
			tabla[0][0] = "Titulo"; tabla[0][1] = "Plataforma";tabla[0][2] = "Tematica"; tabla[0][3] = "Compañia"; tabla[0][4] = "EdadPegi"; tabla[0][5] = "Online"; tabla[0][6] = "Precio"; tabla[0][7] = "Disponible"; tabla[0][8] = "Critica";
			tabla[1][0] = "Flight Simulator"; tabla[1][1] = "PC";tabla[1][2] = "Simulador"; tabla[1][3] = "Microsoft"; tabla[1][4] = "7"; tabla[1][5] = "NO"; tabla[1][6] = "25"; tabla[1][7] = "SI"; tabla[1][8] = "5";
			tabla[2][0] = "W3"; tabla[2][1] = "PC"; tabla[2][2] = "RPG"; tabla[2][3] = "LittleBigPlanet"; tabla[2][4] = "16"; tabla[2][5] = "SI"; tabla[2][6] = "33"; tabla[2][7] = "NO"; tabla[2][8] = "4";
			tabla[3][0] = "WDLegion"; tabla[3][1] = "Multi";tabla[3][2] = "Historia"; tabla[3][3] = "Ubisoft"; tabla[3][4] = "12"; tabla[3][5] = "SI"; tabla[3][6] = "49"; tabla[3][7] = "NO"; tabla[3][8] = "4";
			tabla[4][0] = "ACreedValhalia"; tabla[4][1] = "Multi";tabla[4][2] = "Historia"; tabla[4][3] = "Ubisoft"; tabla[4][4] = "16"; tabla[4][5] = "SI"; tabla[4][6] = "59"; tabla[4][7] = "SI"; tabla[4][8] = "5";
			tabla[5][0] = "Sackboy"; tabla[5][1] = "Consola";tabla[5][2] = "Plataforma"; tabla[5][3] = "LittleBigPlanet"; tabla[5][4] = "3"; tabla[5][5] = "SI"; tabla[5][6] = "19"; tabla[5][7] = "NO"; tabla[5][8] = "3";
			tabla[6][0] = "DemonsSouts"; tabla[6][1] = "Consola";tabla[6][2] = "Historia"; tabla[6][3] = "Ubisoft"; tabla[6][4] = "12"; tabla[6][5] = "NO"; tabla[6][6] = "29"; tabla[6][7] = "SI"; tabla[6][8] = "7";
			tabla[7][0] = "GOTsushima"; tabla[7][1] = "Multi";tabla[7][2] = "Historia"; tabla[7][3] = "Sony"; tabla[7][4] = "16"; tabla[7][5] = "NO"; tabla[7][6] = "49"; tabla[7][7] = "SI"; tabla[7][8] = "6";
			tabla[8][0] = "FinalFantasy"; tabla[8][1] = "Multi";tabla[8][2] = "Historia"; tabla[8][3] = "Sony"; tabla[8][4] = "12"; tabla[8][5] = "NO"; tabla[8][6] = "39"; tabla[8][7] = "SI"; tabla[8][8] = "6";
			tabla[9][0] = "Cyberpunk"; tabla[9][1] = "Multi";tabla[9][2] = "Historia"; tabla[9][3] = "CDProject"; tabla[9][4] = "12"; tabla[9][5] = "SI"; tabla[9][6] = "69"; tabla[9][7] = "SI"; tabla[9][8] = "6";
			tabla[10][0] = "TLU2"; tabla[10][1] = "Consola";tabla[10][2] = "Plataforma"; tabla[10][3] = "NaugtyDogs"; tabla[10][4] = "16"; tabla[10][5] = "NO"; tabla[10][6] = "59"; tabla[10][7] = "SI"; tabla[10][8] = "9";
		}
		
		
		public static void imprimirtabla(String [][] tabla) {
			
			System.out.println("   " + tabla[0][0] + " " + tabla[0][1] + " " +  tabla[0][2] + " " + tabla[0][3] + " " + tabla[0][4] + " " + tabla[0][5] + " " + tabla[0][6] + " " + tabla[0][7] + " " + tabla[0][8]);
		for(int i=1;i<tabla.length;i++) {
			for(int j=0;j<tabla[i].length;j++) {
				System.out.print("   ["   +   tabla[i][j] + "] ");
			}
			System.out.println();
		}
		
		}
		
		public static void compraredad(String [][] tabla) {
			System.out.println("Introducir una edad:");
			int edad = sc.nextInt();
			for(int i=1;i<tabla.length;i++) {
					if(Integer.parseInt(tabla[i][4]) <= edad) {
						if (edad == 3) {
							System.out.println(tabla[i][0]);
						} else if (edad <= 7) {
							System.out.println(tabla[i][0]);
						} else if (edad <= 12) {
							System.out.println(tabla[i][0]);
						} else if (edad <= 16) {
							System.out.println(tabla[i][0]);
						} else if (edad >= 16 ) {
							System.out.println(tabla[i][0]);
						}
							
						
				}
				
			}
		}
		
		
		public static void videoprecio(String [][] tabla) {
			int precio;
			do {
			System.out.println("Introducir un precio:");
			precio = sc.nextInt();
			}while(precio < 5 || precio > 70);
			for(int i=1;i<tabla.length;i++) {
				if(Integer.parseInt(tabla[i][6]) < precio) {
						System.out.println(tabla[i][0]);
				}
			
			}
			
			
		}
			
		
		public static void preciomedio(String [][] tabla) {
			int suma = 0;
			int media = 0;
			int media2 = 0;
			int critica = 0;
			for(int i=1;i<tabla.length;i++) {
				for(int j=1;j<tabla[i].length;j++) {
					suma = suma + Integer.parseInt(tabla[i][6]);
				}
				media = suma / (tabla[i].length - 1);
			}
			System.out.println("El precio medio es: " + media);
			for(int i=1;i<tabla.length;i++) {
				for(int j=1;j<tabla[i].length;j++) {
					critica = critica + Integer.parseInt(tabla[i][8]);
				}
				media2 = critica / (tabla[i].length - 1);
			}
			System.out.println("La critica media es: " + media2);
		}
		
		
		
	}
