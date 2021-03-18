import java.util.*;

public class Principal {

	static Scanner sc = new Scanner(System.in);

	
	public static void main(String[]args) {
		
		int acumulado = 0;
		Pregunta millonario [] = new Pregunta [15];
			
		
		rellenarpregusta(millonario);
		pregustar(millonario, acumulado);
	}
	
	
	public static void rellenarpregusta(Pregunta millonario []) {
		
		
		millonario [0] = new Pregunta("1. ¿ Quién fue el primer presidente de la democracia española tras el franquismo?"," \n a. Adolfo Suárez"," \n b. Manuel Azaña"," \n c. Carlos Arias Navarro"," \n d. Felipe Gonzalez","a",100);
		millonario [1] = new Pregunta("2. ¿La invasión de qué fortaleza por parte de los revolucionarios es considerada como el punto de inicio de la Revolución Francesa?"," \n a.Toma de la Bastilla."," \n b. Versailles"," \n c. Torre Eiffel"," \n d. Sacro Coeur","a",250);
		millonario [2] = new Pregunta("3. ¿Que significan las siglas EGB?"," \n a.Educacion General Basica"," \n b. Estado General del Bienestar"," \n c. Estudio General del Balance"," \n d.Espacio General Deportivo","a",500);
		millonario [3] = new Pregunta("4. ¿De que esta hecha la horchata de Valencia?"," \n a. Pistacho"," \n b. Trufa"," \n c.Arroz"," \n d. Chufa","d",750);
		millonario [4] = new Pregunta("5. ¿Quien de estas actrices es Rachel en 'Friends'?"," \n a. Jennifer Aniston"," \n b. Courteney Cox"," \n c. Lisa Kudrow"," \n d. Reese Witherspoon","a",1500);
		millonario [5] = new Pregunta("6. ¿Quienes era los tres tenores?"," \n a. Pavarotti, Domingo y Carreras"," \n b. Pavarotti, Domingo y Bocelli"," \n c. Pavarotti, Domingo y Carusso"," \n d. Pavarotti, Domingo y Kaufmann","a",2500);
	    millonario [6] = new Pregunta("7. ","","","","","a",5000);
		millonario [7] = new Pregunta("8. ","","","","","b",10000);
		millonario [8] = new Pregunta("9. ","","","","","c",15000);
		millonario [9] = new Pregunta("10. ","","","","","a",20000);
		millonario [10] = new Pregunta("11. ","","","","","b",30000);
		millonario [11] = new Pregunta("12. ","","","","","c",50000);
		millonario [12] = new Pregunta("13. ","","","","","a",100000);
		millonario [13] = new Pregunta("14. ","","","","","b",300000);
		millonario [14] = new Pregunta("15. ","","","","","c",10000000);	
		
	}
	
	public static void pregustar(Pregunta millonario [], int acumulado) {
		int i=0;
		int n=0;
	
		boolean continua = true;
		do {
			
			String plantarse;
			String opcion;
			
			System.out.println(millonario [i].getPregunta() + " " + 
		millonario [i].getOp1() + " " + millonario [i].getOp2() + " " + millonario [i].getOp3() + " "  + millonario [i].getOp4());
			System.out.println("Elige una respuesta: ");
			opcion = sc.next();
				
				if (opcion.equals(millonario [i].getResp())){
					System.out.println("HAS ACERTADO");
					System.out.println("Usted ha llegado a la " + (i+1) + "º pregunta: " + acumulador(millonario,i,acumulado) + " €");	
					continua = true;
					
					
					if(i==4) {
						System.out.println("Hasta el momento tiene ganado " + acumulador(millonario,i,acumulado) + " €");
						System.out.println("¿Quieres plantarse en el concurso, tiene un premio de " + acumulador(millonario,i,acumulado) + "¿si o no?");
						plantarse = sc.next();
							if(plantarse.equalsIgnoreCase("NO")) {
								continua = true;
							
								System.out.println("Elije el numero de la pregunta del segundo seguro [7 - 9]:" );
								do {
								n = sc.nextInt();
								}while(n<6 || n>10);
								
								if(i==n) {
									System.out.println("Hasta el momento tiene ganado " + acumulador(millonario,i,acumulado) + " €");
									System.out.println("¿Quieres plantarse en el concurso, con un premio de " + acumulador(millonario,i,acumulado) + "¿si o no?");
									plantarse = sc.next();
										if(plantarse.equalsIgnoreCase("NO")) {
											continua = true;
										} else {
											System.out.println("Eres un crack, intentalo otra cuando quieras aun asi te has llevado " + acumulador(millonario,i,acumulado));
											System.out.println("Adios");
											continua = false;
										}
									}
								
								}
							}
					
					
					if(i==14) {
						System.out.println("Has ganado el gran premio de QUIEN QUIERE SER MILLONARIO con el premio " + acumulador(millonario,i,acumulado) + " €");
						System.out.println("EHNORABUENA");
					} 
								
				} else {
						System.out.println("Usted ha fallado, Adios al programa");
					continua = false;
				}
				
			i++;
		}while(continua && millonario.length > i); 
			
		}
		
	
		public static int acumulador(Pregunta millonario [], int i, int acumulado) {
			acumulado = millonario[i].getPremio() + acumulado;
			
			return acumulado;
		}
	
	
	
	
	
	
	}		

	

	
	
