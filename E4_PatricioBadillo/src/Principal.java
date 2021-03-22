import java.util.*;

public class Principal {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[]args) {
		int n, opcion;
		boolean continua = true;
		String fin = "";
		System.out.println("Bienvenido a la gestion de coches");
		System.out.println("#################################");
		System.out.println("Cuantos coches quieres gestionar en el stock");
		n = sc.nextInt();
		Coche [] concesionario = new Coche [n];
		System.out.println("Introduccion de datos de forma aleatoria");
		gestionardatos(concesionario);
		
		do {
			
		
		System.out.println("Menu para saber que stock tenemos segun caracteristicas");
		System.out.println("1. Imprimir datos");
		System.out.println("2. Imprimir coches mas caro");
		System.out.println("3. Obtener coches segun gestor");
		System.out.println("4. Imprimir coste medio coches segun el gestor");
		System.out.println("5. Imprimir coches que tengan menos km de los que diga el gestor");
		System.out.println("6. Imprimir cuantos coches hay de cada tipo");
		System.out.println("7. Imprimir cuantos coches han pasado la ITV o no");
		
		opcion = sc.nextInt();
		
	switch(opcion) {
	case 1:
		imprimirvalores(concesionario);
		System.out.println("¿Quieres seguir filtrando: si o no");
		fin = sc.next();
		if(fin.equalsIgnoreCase("si")) {
			continua = true;
		} else {
			continua = false;
			System.out.println("Adios");
		}
		break;
	case 2:
		imprimircochecaro(concesionario);
		System.out.println("¿Quieres seguir filtrando: si o no");
		fin = sc.next();
		if(fin.equalsIgnoreCase("si")) {
			continua = true;
		} else {
			continua = false;
			System.out.println("Adios");
		}
		break;
	case 3:
		obtenercoches(concesionario,sc);
		System.out.println("¿Quieres seguir filtrando: si o no");
		fin = sc.next();
		if(fin.equalsIgnoreCase("si")) {
			continua = true;
		} else {
			continua = false;
			System.out.println("Adios");
		}
		break;
	case 4:
		obtenercostemedio(concesionario,sc);
		System.out.println("¿Quieres seguir filtrando: si o no");
		fin = sc.next();
		if(fin.equalsIgnoreCase("si")) {
			continua = true;
		} else {
			continua = false;
			System.out.println("Adios");
		}
		break;
	case 5:
		filtrarprecio(concesionario,sc);
		System.out.println("¿Quieres seguir filtrando: si o no");
		fin = sc.next();
		if(fin.equalsIgnoreCase("si")) {
			continua = true;
		} else {
			continua = false;
			System.out.println("Adios");
		}
		break;
	case 6:
		cantidadcoches(concesionario);
		System.out.println("¿Quieres seguir filtrando: si o no");
		fin = sc.next();
		if(fin.equalsIgnoreCase("si")) {
			continua = true;
		} else {
			continua = false;
			System.out.println("Adios");
		}
		break;
	case 7:
		cantidaditv(concesionario);
		System.out.println("¿Quieres seguir filtrando: si o no");
		fin = sc.next();
		if(fin.equalsIgnoreCase("si")) {
			continua = true;
		} else {
			continua = false;
			System.out.println("Adios");
		}
		break;
	}
		
		}while(continua);	
		
		
		
		
	}
	
	public static void gestionardatos(Coche [] concesionario) {
	
		 String modelo = "";
		int antiguedad;
		String color = "";
		String tipocambio = "";
		int cantidadKM;
		int cilindrada = 0;
		int caballaje = 0;
		double precio = 0;
		int opcioncilindrada;
		int opcioncolor;
		int opcioncaballaje;
		int preciobase = 0;
		double cc = 0, cv = 0;
		for(int i=0;i<concesionario.length;i++) {
			System.out.println("Generar de forma aleatoria el modelo");
			int opcionmodelo = (int)(5*(Math.random()+0));
			if(opcionmodelo == 0) {
				modelo = "A1";
				preciobase = 20000;
			}
			
			if(opcionmodelo == 1) {
				modelo = "A3";
				preciobase = 25000;
			}
			
			if(opcionmodelo == 2) {
				modelo = "A4";
				preciobase = 30000;
			}
			
			if(opcionmodelo == 3) {
				modelo = "A5";
				preciobase = 35000;
			}
			
			if(opcionmodelo == 4) {
				modelo = "A7";
				preciobase = 50000;
			}
			
			System.out.println("Generar de forma aleatoria la antigüedad entre 0 y 10 años");
			antiguedad = (int)(11*(Math.random()+0));
			
			System.out.println("Generar de forma aleatoria el color");
			opcioncolor = (int)(5*(Math.random()+0));
			
			if(opcioncolor == 0) {
				color = "Blanco";
				
			}
			
			if(opcioncolor == 1) {
				color = "Negro";
			}
			
			if(opcioncolor == 2) {
				color = "Gris";
			}
			
			if(opcioncolor == 3) {
				color = "Rojo";
			}
			
			if(opcioncolor == 4) {
				color = "Azul";
			}
			
			System.out.println("Generar de forma aleatoria el Tipo de cambio");
			int opcioncambio = (int)(2*(Math.random()+0));
			if(opcioncambio == 0) {
				tipocambio = "Secuencial";
			}
			
			if(opcioncambio == 1) {
				tipocambio = "Automatico";
			}
			
			cantidadKM = (int)(200.000*(Math.random()+50.000));
			
			opcioncilindrada = (int)(4*(Math.random()+0));
			if(opcioncilindrada == 0) {
				cilindrada = 1500;
				cc = 0.8;
			}
			
			if(opcioncilindrada == 1) {
				cilindrada = 1800;
				cc = 0.9;
			}
			
			if(opcioncilindrada == 2) {
				cilindrada = 2000;
				cc = 1;
			}
			
			if(opcioncilindrada == 3) {
				cilindrada = 3000;
				cc = 1.250;
			}
			
			
			opcioncaballaje = (int)(5*(Math.random()+0));
			if(opcioncaballaje == 0) {
				caballaje = 90;
				cv = 0.75;
			}
			
			if(opcioncaballaje == 1) {
				caballaje = 120;
				cv = 0.9;
			}
			
			if(opcioncaballaje == 2) {
				caballaje = 150;
				cv = 1;
			}
			
			if(opcioncaballaje == 3) {
				caballaje = 200;
				cv = 1.25;
			}
			
			if(opcioncaballaje == 4) {
				caballaje = 265;
				cv = 1.5;
			}
			
			if(antiguedad == 0) {
				precio = preciobase * cc * cv * 1;
			}
			
			if(antiguedad == 1) {
				precio = preciobase * cc * cv * 0.9;
			}
			
			if(antiguedad == 2 || antiguedad == 3) {
				precio = preciobase * cc * cv * 0.7;
			}
			
			if(antiguedad == 4 || antiguedad == 5) {
				precio = preciobase * cc * cv * 0.4;
			}
			
			if(antiguedad == 6 || antiguedad == 7 || antiguedad == 8) {
				precio = preciobase * cc * cv * 0.3;
			}
			
			if(antiguedad == 9 || antiguedad == 10) {
				precio = preciobase * cc * cv * 0.2;
			}
			
			
			
			
			
			
					
			concesionario[i] = new Coche(modelo,antiguedad,color,tipocambio,cantidadKM,cilindrada,
					caballaje,precio);
		}
		
	}
	
	
	
	public static void imprimirvalores(Coche [] concesionario) {
		
		for(int i=0;i<concesionario.length;i++) {
			System.out.println(concesionario[i].toString());
		}
		
		
	}
	
	
	public static void imprimircochecaro(Coche [] concesionario) {
		
		double preciomax = 0;
		int pos = 0;
		
		for(int i=0;i<concesionario.length;i++) {
			if(preciomax<concesionario[i].getPrecio()) {
				preciomax = concesionario[i].getPrecio();
				pos = i;
			}
		}
		
		System.out.println("El coche mas caro es: [" + concesionario[pos].getModelo() + " " 
		+ concesionario[pos].getAntiguedad() + "año " + concesionario[pos].getColor() + " " 
				+ concesionario[pos].getTipocambio() + " " + concesionario[pos].getCantidadKM() 
				+ "Km " + concesionario[pos].getCilindrada() + "cc " + concesionario[pos].getCaballaje() + "cv " 
				+ concesionario[pos].getPrecio() + "€]");
		
	}
	
			public static void obtenercoches(Coche [] concesionario, Scanner sc) {
			String buscarmodelo = "";
		
			System.out.println("Introduce un modelo A1/A3/A4/A5/A7");
			buscarmodelo = sc.next();
			
			System.out.println("Los coches " + buscarmodelo + " que tenemos en nuestro concesionario son: ");
			for(int i=0;i<concesionario.length;i++) {
				if(buscarmodelo.equalsIgnoreCase(concesionario[i].getModelo())) {
					System.out.println(" [" + concesionario[i].getModelo() + " " 
							+ concesionario[i].getAntiguedad() + "año " + concesionario[i].getColor() + " " 
									+ concesionario[i].getTipocambio() + " " + concesionario[i].getCantidadKM() 
									+ "Km " + concesionario[i].getCilindrada() + "cc " + concesionario[i].getCaballaje() + "cv " 
									+ concesionario[i].getPrecio() + "€]");
				}
			}
				
			}
			
	
			public static void obtenercostemedio(Coche [] concesionario, Scanner sc) {
				String buscarmodelo = "";
				double suma = 0;
				double media = 0;
				int n = 0;
				System.out.println("Introduce un modelo A1/A3/A4/A5/A7");
				buscarmodelo = sc.next();
				
				System.out.println("Los coches " + buscarmodelo + " que tenemos en nuestro concesionario son: ");
				for(int i=0;i<concesionario.length;i++) {
					if(buscarmodelo.equalsIgnoreCase(concesionario[i].getModelo())) {
						suma = suma + concesionario[i].getPrecio();
						n++;
					}
				}
				
				media = suma/n;
				
				System.out.println("El coste medio de los " + buscarmodelo + " que tenemos en nuestro concesionario es: " + media);
				
			}
	
	
			public static void filtrarprecio(Coche [] concesionario, Scanner sc) {
				int cantkm;
				do {
				System.out.println("Introduce una cantidad de km entre 50000 y 200000 km");
				cantkm = sc.nextInt();
				}while(cantkm < 50000 || cantkm > 200000);
				System.out.println("Los coches que tienen menos de " + cantkm + " Kilometros es : ");
				for(int i=0;i<concesionario.length;i++) {
					if(concesionario[i].getCantidadKM() < cantkm) {
						System.out.println(" [" + concesionario[i].getModelo() + " " 
								+ concesionario[i].getAntiguedad() + "año " + concesionario[i].getColor() + " " 
										+ concesionario[i].getTipocambio() + " " + concesionario[i].getCantidadKM() 
										+ "Km " + concesionario[i].getCilindrada() + "cc " + concesionario[i].getCaballaje() + "cv " 
										+ concesionario[i].getPrecio() + "€]");
					}
				}
				
				
			}
	
	
			public static void cantidadcoches(Coche [] concesionario) {
				int c = 0, n = 0, cn = 0, nn = 0, l = 0;
				for(int i=0;i<concesionario.length;i++) {
					if("A1".equalsIgnoreCase(concesionario[i].getModelo())) {
						c++;
						System.out.println("Del modelo " + concesionario[i].getModelo() + " tenemos (" + c + ") coche:");
						System.out.println(" [" + concesionario[i].getModelo() + " " 
								+ concesionario[i].getAntiguedad() + "año " + concesionario[i].getColor() + " " 
										+ concesionario[i].getTipocambio() + " " + concesionario[i].getCantidadKM() 
										+ "Km " + concesionario[i].getCilindrada() + "cc " + concesionario[i].getCaballaje() + "cv " 
										+ concesionario[i].getPrecio() + "€]");
					}
				}
				
				
				for(int i=0;i<concesionario.length;i++) {
					if("A3".equalsIgnoreCase(concesionario[i].getModelo())) {
						n++;	
					}
					
					System.out.println("Del modelo " + concesionario[i].getModelo() + " tenemos (" + n + ") coche:");
					System.out.println(" [" + concesionario[i].getModelo() + " " 
							+ concesionario[i].getAntiguedad() + "año " + concesionario[i].getColor() + " " 
									+ concesionario[i].getTipocambio() + " " + concesionario[i].getCantidadKM() 
									+ "Km " + concesionario[i].getCilindrada() + "cc " + concesionario[i].getCaballaje() + "cv " 
									+ concesionario[i].getPrecio() + "€]");
				}
				
				for(int i=0;i<concesionario.length;i++) {
					if("A4".equalsIgnoreCase(concesionario[i].getModelo())) {
						cn++;
					}
					
					System.out.println("Del modelo " + concesionario[i].getModelo() + " tenemos (" + n + ") coche:");
					System.out.println(" [" + concesionario[i].getModelo() + " " 
							+ concesionario[i].getAntiguedad() + "año " + concesionario[i].getColor() + " " 
									+ concesionario[i].getTipocambio() + " " + concesionario[i].getCantidadKM() 
									+ "Km " + concesionario[i].getCilindrada() + "cc " + concesionario[i].getCaballaje() + "cv " 
									+ concesionario[i].getPrecio() + "€]");
				}
				
				
				for(int i=0;i<concesionario.length;i++) {
					if("A5".equalsIgnoreCase(concesionario[i].getModelo())) {
						nn++;
					}
					System.out.println("Del modelo " + concesionario[i].getModelo() + " tenemos (" + n + ") coche:");
					System.out.println(" [" + concesionario[i].getModelo() + " " 
							+ concesionario[i].getAntiguedad() + "año " + concesionario[i].getColor() + " " 
									+ concesionario[i].getTipocambio() + " " + concesionario[i].getCantidadKM() 
									+ "Km " + concesionario[i].getCilindrada() + "cc " + concesionario[i].getCaballaje() + "cv " 
									+ concesionario[i].getPrecio() + "€]");
				}
				
				for(int i=0;i<concesionario.length;i++) {
					if("A7".equalsIgnoreCase(concesionario[i].getModelo())) {
						l++;
					}
					System.out.println("Del modelo " + concesionario[i].getModelo() + " tenemos (" + n + ") coche:");
					System.out.println(" [" + concesionario[i].getModelo() + " " 
							+ concesionario[i].getAntiguedad() + "año " + concesionario[i].getColor() + " " 
									+ concesionario[i].getTipocambio() + " " + concesionario[i].getCantidadKM() 
									+ "Km " + concesionario[i].getCilindrada() + "cc " + concesionario[i].getCaballaje() + "cv " 
									+ concesionario[i].getPrecio() + "€]");
				}
				
				
			}
	
	
	public static void cantidaditv(Coche [] concesionario) {
		int c = 0, n = 0, cn = 0, nn = 0, l = 0;
		for(int i=0;i<concesionario.length;i++) {
			if(concesionario[i].getAntiguedad() < 4) {
				c++;
			} else if(concesionario[i].getAntiguedad() == 4) {
				l++;
			} else if(concesionario[i].getAntiguedad() == 6) {
				n++;
			} else if(concesionario[i].getAntiguedad() == 8) {
				cn++;
			} else if(concesionario[i].getAntiguedad() == 10) {
				nn++;
			} 
			
			System.out.println("Cantidad de coches que un no han pasado la ITV (" + c + "):");
			System.out.println(" [" + concesionario[i].getModelo() + " " 
					+ concesionario[i].getAntiguedad() + "año " + concesionario[i].getColor() + " " 
							+ concesionario[i].getTipocambio() + " " + concesionario[i].getCantidadKM() 
							+ "Km " + concesionario[i].getCilindrada() + "cc " + concesionario[i].getCaballaje() + "cv " 
							+ concesionario[i].getPrecio() + "€]");
			System.out.println("Cantidad de coches que un no han pasado la ITV (" + l + "):");
			System.out.println(" [" + concesionario[i].getModelo() + " " 
					+ concesionario[i].getAntiguedad() + "año " + concesionario[i].getColor() + " " 
							+ concesionario[i].getTipocambio() + " " + concesionario[i].getCantidadKM() 
							+ "Km " + concesionario[i].getCilindrada() + "cc " + concesionario[i].getCaballaje() + "cv " 
							+ concesionario[i].getPrecio() + "€]");
			System.out.println("Cantidad de coches que un no han pasado la ITV (" + n + "):");
			System.out.println(" [" + concesionario[i].getModelo() + " " 
					+ concesionario[i].getAntiguedad() + "año " + concesionario[i].getColor() + " " 
							+ concesionario[i].getTipocambio() + " " + concesionario[i].getCantidadKM() 
							+ "Km " + concesionario[i].getCilindrada() + "cc " + concesionario[i].getCaballaje() + "cv " 
							+ concesionario[i].getPrecio() + "€]");
			System.out.println("Cantidad de coches que un no han pasado la ITV (" + cn + "):");
			System.out.println(" [" + concesionario[i].getModelo() + " " 
					+ concesionario[i].getAntiguedad() + "año " + concesionario[i].getColor() + " " 
							+ concesionario[i].getTipocambio() + " " + concesionario[i].getCantidadKM() 
							+ "Km " + concesionario[i].getCilindrada() + "cc " + concesionario[i].getCaballaje() + "cv " 
							+ concesionario[i].getPrecio() + "€]");
			System.out.println("Cantidad de coches que un no han pasado la ITV (" + nn + "):");
			System.out.println(" [" + concesionario[i].getModelo() + " " 
					+ concesionario[i].getAntiguedad() + "año " + concesionario[i].getColor() + " " 
							+ concesionario[i].getTipocambio() + " " + concesionario[i].getCantidadKM() 
							+ "Km " + concesionario[i].getCilindrada() + "cc " + concesionario[i].getCaballaje() + "cv " 
							+ concesionario[i].getPrecio() + "€]");
		}
		
	}
}
