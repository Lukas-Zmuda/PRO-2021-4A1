
public class UlohyOprava {

	public static void main(String[] args) {
		
		/*
		 * 1. 
		 *  - Vytvorte metodu s nazovom opacne()
		 *  - metoda ma 1 parameter - pole celych cisel
		 *  - metoda vrati pole opacne
		 *  
		 * 2. 
		 *  - Vytvorte metodu s nazvom pozdrav()
		 *  - metoda ma 2 parametre - meno, pocet
		 *  - metoda vypise napr.:
		 *  pozdrav("Lukas", 5)
		 *  1. Lukas
		 *  2. Lukas
		 *  3. Lukas
		 *  4. Lukas
		 *  5. Lukas
		 *  
		 *  3. Vytvorte metodu s nazvom statistika()
		 *   - metoda ma 1 parameter - pole realnych cisel
		 *   - metoda vypise: priemernu hodnotu prvkov, min, max
		 */

	}
	
	static void statistika(double[] pole) {
		double priemer = 0;
		double sucet = 0;
		double max = pole[0];
		double min = pole[0];
		for(int i = 0; i < pole.length; i++) {
			sucet += pole[i];
			if(pole[i] > max) {
				max = pole[i];
			}
			if(pole[i] < min) {
				min = pole[i];
			}
		}
		priemer = sucet / pole.length;
		System.out.println("Priemer: " + priemer);
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
	}
	
	static void pozdrav(String meno, int pocet) {
		for(int i = 0; i < pocet; i++) {
			System.out.println((i + 1) + ". " + meno);
		}
	}
	
	static int[] opacne(int[] pole) {
		int[] docasne = new int[pole.length];
		int j = 0;
		for(int i = pole.length - 1; i > -1; i--) {
			docasne[j] = pole[i];
		}
		return docasne;
	}

}
