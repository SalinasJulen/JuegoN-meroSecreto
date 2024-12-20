import java.util.Scanner;
public class NumSecreto {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner( System.in );

		int secreto;
		int intentos = 0;
		int numPersona = -1;

		secreto = (int)Math.floor(Math.random()* 100)+1;

	
	boolean VolverJugar = true;
	
	while(VolverJugar == true) {
		System.out.println("Ecribe un número del 1 al 100");
		for(intentos = 0; numPersona != secreto ; intentos++){
			
			numPersona = scanner.nextInt();
			if(numPersona <= 0)
				System.out.println("Escribe un valor superior a 0");
			
			if(numPersona > 100)
				System.out.println("Escribe un valor inferior a 100");
			
			if(secreto > numPersona && numPersona > 0)

				System.out.println("¡¡El número es mayor, escribe otro número!!");

	

			if(secreto < numPersona && numPersona < 100)

					System.out.println("¡¡El número es menor!! , escribe otro número");

			if(secreto == numPersona) {
	
		}
		
		}
		System.out.println("¡¡Has Acertado!! , tu cantidad de intentos es " + intentos + " ¿deseas volver a jugar?, si es así, escribe una s y si no desas vovler a jugar escribe una n");
	
		
		String respuesta = scanner.next().toLowerCase();

		if(respuesta.equals("n")) {
			
			VolverJugar = false;
			
	    System.out.println("El juego ha terminado");
		
	    
		}
								
			if(VolverJugar = respuesta.equals("s")) {
				secreto = (int)Math.floor(Math.random()* 100)+1;
				intentos = 0;
				VolverJugar = true;
			}	  		
		
	}	
	}
		
	}