import java.util.Scanner;

public class UlohaPole {

	public static void main(String[] args) {
		
		int[] cisla = new int[10];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < cisla.length; i++) {
			System.out.println("Zadaj cislo: ");
			cisla[i] = sc.nextInt();
		}
		
		for(int i = (cisla.length - 1); i >= 0; i--) {
			System.out.print(cisla[i] + ", ");
		}
		System.out.println();

	}

}
