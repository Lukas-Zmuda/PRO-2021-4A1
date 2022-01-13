import java.util.Scanner;

public class UPole1 {

	public static void main(String[] args) {
		//1.
		// - nacitajte zoznam 5 mien
		// - vypisat odzadu
		// -> Lukas, Ivan, Marek
		// <- 1. Marek
		// <- 2. Ivan
		// <- 3. Lukas
		
		Scanner sc = new Scanner(System.in);
		
		String[] mena = new String[5];
		
		for(int i = 0; i < mena.length; i++) {
			System.out.println("Zadaj meno: ");
			mena[i] = sc.nextLine();
		}
		
		int j = 1;
		
		for(int i = mena.length - 1; i > -1;i--) {
			System.out.println(j + ". " + mena[i]);
			j++;
		}

		
		
		
		
		
		
	}

}
