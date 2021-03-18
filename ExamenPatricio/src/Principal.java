import java.util.Scanner;

public class Principal {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[]args) {
		
		Tiempo meteo [] = new Tiempo [2];
		String opcion1;
		boolean continua = true;
			
		System.out.println("Bienvenido al programa de gestion:_");
		System.out.println("###################################");
		System.out.println("1º.- Introducir datos");
		System.out.println("###################################");
		System.out.println("###################################");
		System.out.println("###################################");
		
		introducirdatos(meteo);
		
		do {
			
		System.out.println("Bienvenido al programa de gestion:_");
		System.out.println("###################################");
		System.out.println("1 .- Imprimir datos");
		System.out.println("2 .- Imprimir dia semana con mayor probabilidad");
		System.out.println("3 .- Imprimir dia con una determinada prevision");
		System.out.println("4 .- Imprimir temperatura media de cada uno de los dias");
		System.out.println("5 .- Imprimir temperatura media por separado de los dias");
		System.out.println("6 .- Imprimir cantidad de los dias con una determinada prevision");
		System.out.println("7 .- Imprimir dias peligrosos");	
		
	
		int opcion = sc.nextInt();
		
		
			
		switch(opcion) {
					case 1:
						imprimir(meteo);
						System.out.println("Quieres seguir filtrando ¿Si o No?");
						opcion1 = sc.next();
						if(opcion1.equalsIgnoreCase("si")){
							continua = true;
						} else {
							continua = false;
							System.out.println("Adios");
						}
						break;
					case 2:
						imprimirdia(meteo);
						System.out.println("Quieres seguir filtrando ¿Si o No?");
						opcion1 = sc.next();
						if(opcion1.equalsIgnoreCase("si")){
							continua = true;
						} else {
							continua = false;
							System.out.println("Adios");
						}
						break;
					case 3:
						prevision(meteo);
						System.out.println("Quieres seguir filtrando ¿Si o No?");
						opcion1 = sc.next();
						if(opcion1.equalsIgnoreCase("si")){
							continua = true;
						} else {
							continua = false;
							System.out.println("Adios");
						}
						break;
					case 4:
						mediatempdias(meteo);
						System.out.println("Quieres seguir filtrando ¿Si o No?");
						opcion1 = sc.next();
						if(opcion1.equalsIgnoreCase("si")){
							continua = true;
						} else {
							continua = false;
							System.out.println("Adios");
						}
						break;
					case 5:
						mediatemptotales(meteo);
						System.out.println("Quieres seguir filtrando ¿Si o No?");
						opcion1 = sc.next();
						if(opcion1.equalsIgnoreCase("si")){
							continua = true;
						} else {
							continua = false;
							System.out.println("Adios");
						}
						break;
					case 6:
						contartipotiempo(meteo);
						System.out.println("Quieres seguir filtrando ¿Si o No?");
						opcion1 = sc.next();
						if(opcion1.equalsIgnoreCase("si")){
							continua = true;
						} else {
							continua = false;
							System.out.println("Adios");
						}
						break;
					case 7:
						contartipopeligroso(meteo);
						System.out.println("Quieres seguir filtrando ¿Si o No?");
						opcion1 = sc.next();
						if(opcion1.equalsIgnoreCase("si")){
							continua = true;
						} else {
							continua = false;
							System.out.println("Adios");
						}
						break;
							}
					
		} while(continua = true);
		
	}
	
	
	public static void introducirdatos(Tiempo meteo []) {
		
		String ciudad;
		int dia;
		int mes;
		int año;
		int probabilidadLluvia = 0;
		int temperaturaMinima;
		int temperaturaMaxima;
		int velocidadViento;
		int opciontiempo;
		String tiempo = "";
		
		for(int i=0; i<meteo.length;i++) {
			System.out.println("Introduce Ciudad: ");
			 ciudad = sc.next();
			 System.out.println("Introduce dia(int): ");
			dia = sc.nextInt();
			System.out.println("Introduce mes(int): ");
			mes = sc.nextInt();
			System.out.println("Introduce año(int): ");
			año = sc.nextInt();
			System.out.println("Introduce tiempo [Nubes,sol,niebla,lluvia] de forma aleatoria: ");
			opciontiempo = (int)(3*(Math.random()+0));
			
					if(opciontiempo == 0) {	
						tiempo = "NUBES";
						
					} 
					
					if (opciontiempo == 1) {
						tiempo = "SOL";
						
					} 
					
					if (opciontiempo == 2){
						tiempo = "NIEBLA";
						
					} 
					
					if (opciontiempo == 3) {
						tiempo = "LLUVIA";
						
					}
					
					System.out.println(tiempo);
				if(tiempo.equalsIgnoreCase("NUBES") || tiempo.equalsIgnoreCase("SOL") || tiempo.equalsIgnoreCase("NIEBLA")) {
					probabilidadLluvia = (int)(51*(Math.random()+0));
				}
				
				if(tiempo.equalsIgnoreCase("LLUVIA")) {
					probabilidadLluvia = (int)(101*(Math.random()+50));
				}
				
			System.out.println(" TempMin/TempMax/VelocidadViento de forma aleatoria");
			temperaturaMinima = (int)(36*(Math.random()+0));
			do  {
				temperaturaMaxima = (int)(36*(Math.random()+0));
			} while (temperaturaMinima>temperaturaMaxima);
			
			velocidadViento = (int)(26*(Math.random()+0));
			
			meteo [i] = new Tiempo(ciudad, dia, mes, año, tiempo, probabilidadLluvia, temperaturaMinima, temperaturaMaxima, velocidadViento);
		}
			}
	
	public static void imprimir(Tiempo meteo []) {

		for(int i=0; i<meteo.length;i++) {
			System.out.println(meteo[i].toString());
		}
	
	}
	
	// Ejercicio4
		public static void imprimirdia(Tiempo meteo []) {
			int mayorprob = 0;
			int aux = 0;
			for(int i=0; i<meteo.length;i++) {
				if(mayorprob<meteo[i].getProbabilidadLluvia()) {
					mayorprob=meteo[i].getProbabilidadLluvia();
					aux = i;
				}
				
			}
				System.out.println("El dia de la semana con mayor probabilidad de lluvia en " + meteo[aux].getCiudad() + " "
						+ " " + meteo[aux].getDia() + "-" + meteo[aux].getMes() + "-" + meteo[aux].getAño() + " con un " + mayorprob + "%");	
		

		}
		
		public static void prevision(Tiempo meteo []) {
			String prevision;
			Scanner sc = new Scanner(System.in);
			System.out.println("introduce SOL/NUBES/NIEBLA/LLUVIA");
			prevision = sc.next();
			
			System.out.print("Los dias con ");
				for(int i=0;i<meteo.length;i++) {
					if(prevision.equalsIgnoreCase(meteo[i].getTiempo())) {
						System.out.println(meteo[i].getTiempo() + " son " + meteo[i].getCiudad() + " " + meteo[i].getDia() + "-" + meteo[i].getMes() + "-" + meteo[i].getAño());			
				}
			}
			
			
			
		}
		
		public static void mediatempdias(Tiempo meteo []) {
			
			double media = 0;
			double suma = 0;
			for(int i=0; i<meteo.length; i++) {
				suma = (meteo[i].getTemperaturaMaxima() + meteo[i].getTemperaturaMinima());
				media = suma/2;
			System.out.println( meteo[i].getCiudad() + " " + meteo[i].getDia() + "-" + meteo[i].getMes() + "-" + meteo[i].getAño() + " Temperatura media " + media);
		}
			
	}


		public static void mediatemptotales(Tiempo meteo []) {
			
			int mediamax = 0;
			int mediamin = 0;
			int sumamax = 0;
			int sumamin = 0;
			
			for(int i=0; i<meteo.length; i++) {
				sumamax = (sumamax + meteo[i].getTemperaturaMaxima());
				sumamin = (sumamin + meteo[i].getTemperaturaMinima());	
		}
			mediamax = sumamax/7;
			mediamin = sumamin/7;
			
		System.out.println(" Temperatura Maxima media " + mediamax);
		System.out.println(" Temperatura Minima media " + mediamin);
	}
		
		
	
	
		public static void contartipotiempo(Tiempo meteo []) {
			int i = 1, n = 0, s = 0, ni = 0, l = 0;
			for(i=1; i<meteo.length; i++) {
				if("NUBES".equalsIgnoreCase(meteo[i].getTiempo())) {
					n++;
					System.out.println("Dias " + meteo[i].getTiempo() + " " + n + " " + meteo[i].getCiudad() + " "
							+ " " + meteo[i].getDia() + "-" + meteo[i].getMes() + "-" + meteo[i].getAño());
				}
				
		
				if("SOL".equalsIgnoreCase(meteo[i].getTiempo())) {
					s++;
				System.out.println("Dias " + meteo[i].getTiempo() + " "  + s + " " + meteo[i].getCiudad() + " "
							+ " " + meteo[i].getDia() + "-" + meteo[i].getMes() + "-" + meteo[i].getAño());
				
				}	
				
				
				if("NIEBLA".equalsIgnoreCase(meteo[i].getTiempo())) {
					ni++;
				System.out.println("Dias " + meteo[i].getTiempo() + " " + ni + " " + meteo[i].getCiudad() + " "
							+ " " + meteo[i].getDia() + "-" + meteo[i].getMes() + "-" + meteo[i].getAño());
					
				}
				
				
				if("LLUVIA".equalsIgnoreCase(meteo[i].getTiempo())) {
					l++;
				System.out.println("Dias " + meteo[i].getTiempo() + " " + l + " " + meteo[i].getCiudad() + " "
							+ " " + meteo[i].getDia() + "-" + meteo[i].getMes() + "-" + meteo[i].getAño());
		
				}	
			}
			
			
			
			
			
			
			
			
			
		}
		
		public static void contartipopeligroso(Tiempo meteo []) {
			for(int i=0; i<meteo.length; i++) {
				if(meteo[i].getTemperaturaMinima()<=5 || meteo[i].getVelocidadViento()>=20) {
					System.out.println(meteo[i].getCiudad() + " "
							+ " " + meteo[i].getDia() + "-" + meteo[i].getMes() + "-" + meteo[i].getAño() + " "  + meteo[i].getVelocidadViento() + " Km/h");
					
					System.out.println(meteo[i].getCiudad() + " "
							+ " " + meteo[i].getDia() + "-" + meteo[i].getMes() + "-" + meteo[i].getAño() + " " + meteo[i].getTemperaturaMinima() + " ºC");
				} else {
					System.out.println("No hay datos");
				}
			}

		}
}
