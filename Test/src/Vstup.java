import java.util.Scanner;

public class Vstup {

	public static void main(String[] args) {
		
		int rokNarodenia = 0;
		String meno = "";
		
		//nacitanie vstupu
		Scanner vstup = new Scanner(System.in);
		System.out.println("Ako sa volas?");
		meno = vstup.nextLine();
		System.out.println("Ahoj " +meno+ ". V ktorom roku si sa narodil?");
		rokNarodenia = vstup.nextInt();
		System.out.println(meno + ", mas " + (2021 - rokNarodenia) + " rokov");

	}

}
