import java.util.Scanner;

public class ParneNeparne {
	
	/**
	 * Program vypise pocet parnych a neparnych cisel
	 * @param args
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int pocetParnych = 0, pocetNeparnych = 0, pocet = 0;
		double cislo = 0, suma = 0;
		
		do {
			System.out.println("Zadaj cislo: ");
			cislo = sc.nextDouble();
			if(cislo % 2 == 0) {
				pocetParnych++;
			}else {
				pocetNeparnych++;
			}
			suma += cislo;
			pocet++;
		}while(cislo != 0);

		pocet--;
		System.out.println("Pocet parnych: " + pocetParnych);
		System.out.println("Pocet neparnych: " + pocetNeparnych);
		System.out.println("Priemer: " + (suma / pocet));

	}

}
