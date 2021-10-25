import java.util.Scanner;

public class Priemer {
	
	/**
	 * Program vypocita aritmeticky priemer z n zadanych cisel
	 * @param args
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int pocet = 0;
		double cislo = 0, suma = 0;
		
		do {
			System.out.println("Zadaj cislo: ");
			cislo = sc.nextDouble();
			suma += cislo;
			pocet++;
		}while(cislo != 0);

		pocet--;
		System.out.println("Priemer: " + (suma / pocet));

	}

}
